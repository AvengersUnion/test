package com.jump.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.common.PoAndDesc;
import com.jump.dao.DescriptionMapper;
import com.jump.dao.HonorMapper;
import com.jump.pojo.Description;
import com.jump.pojo.Honor;
import com.jump.pojo.HonorExample;
import com.jump.pojo.HonorExample.Criteria;
import com.jump.service.HonorService;

/**
 * Honor的service
 * 
 * @author 567
 *
 */
@Service
public class HonorServiceImpl implements HonorService {

	@Autowired
	private HonorMapper honorMapper;

	@Autowired
	private DescriptionMapper descriptionMapper;

	@Override
	public JumpPage getHonorPage(Integer pageNum, Integer pageSize) {
		// 设置分页信息
		PageHelper.startPage(pageNum, pageSize);

		// 设置查询条件
		HonorExample example = new HonorExample();
		// 设置排序，先根据优先显示排序，再根据id倒序排
		example.setOrderByClause("honor_front DESC,honor_id DESC");
		List<Honor> list = honorMapper.selectByExample(example);

		// 取出查询结果
		PageInfo<Honor> info = new PageInfo<Honor>(list);

		// 构建返回对象
		return JumpPage.getPage(info);
	}

	@Override
	public JumpResult addHonor(Honor honor, byte[] decContent) {

		// 插入详情
		Description desc = new Description();
		desc.setDecContent(decContent);
		descriptionMapper.insert(desc);

		// 设置在Honor中
		honor.setHonorDec(desc.getDecId());
		// 设置显示 1为优先显示，0位普通显示
		honor.setHonorFront(0);
		// 插入Honor
		honorMapper.insert(honor);

		return JumpResult.ok();
	}

	@Override
	public JumpResult delHonor(List<Integer> idList) {

		// 设置Honor条件
		HonorExample example = new HonorExample();
		Criteria criteria = example.createCriteria();
		criteria.andHonorIdIn(idList);
		List<Honor> honorList = honorMapper.selectByExample(example);

		// 删除详情
		for (Honor honor : honorList) {
			descriptionMapper.deleteByPrimaryKey(honor.getHonorDec());
		}
		
		// 删除Honor
		honorMapper.deleteByExample(example);

		return JumpResult.ok();
	}

	@Override
	public JumpResult getHonorById(Integer id) throws UnsupportedEncodingException {

		// 先查出Honor
		Honor honor = honorMapper.selectByPrimaryKey(id);
		// 查询出详情
		Description description = descriptionMapper.selectByPrimaryKey(honor.getHonorDec());
		String content = new String(description.getDecContent(), "UTF-8");

		// 设置返回对象
		PoAndDesc creat = PoAndDesc.creat(honor, content);

		return JumpResult.ok(creat);
	}

	@Override
	public JumpResult updHonor(Honor honor, byte[] decContent) {

		// 先更新honor
		honorMapper.updateByPrimaryKey(honor);

		// 再更新Description
		Description desc = new Description();
		desc.setDecId(honor.getHonorDec());
		desc.setDecContent(decContent);
		descriptionMapper.updateByPrimaryKeyWithBLOBs(desc);

		return JumpResult.ok();
	}

	@Override
	public JumpResult updHonorFront(List<Integer> idList, Integer front) {

		// 如果front为1，先查询前台显示是否已经是3个了
		if (front == 1) {

			HonorExample example = new HonorExample();
			Criteria criteria = example.createCriteria();
			criteria.andHonorFrontEqualTo(front);

			List<Honor> list = honorMapper.selectByExample(example);
			int count = list.size() + idList.size();
			
			// 超过3个则返回一个消息
			if (count > 3) {
				return JumpResult.erorr("前台显示只能设置3个，请取消后再设置!");
			}

		}
		// 根据需求设置
		for (Integer id : idList) {
			Honor honor = honorMapper.selectByPrimaryKey(id);
			honor.setHonorFront(front);
			honorMapper.updateByPrimaryKey(honor);
		}

		return JumpResult.ok();
	}

}
