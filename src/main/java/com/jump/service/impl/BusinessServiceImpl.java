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
import com.jump.dao.BusinessMapper;
import com.jump.dao.DescriptionMapper;
import com.jump.pojo.Business;
import com.jump.pojo.BusinessExample;
import com.jump.pojo.BusinessExample.Criteria;
import com.jump.pojo.Description;
import com.jump.service.BusinessService;

/**
 * Business的Service
 * 
 * @author Administrator
 *
 */
@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessMapper businessMapper;

	@Autowired
	private DescriptionMapper descriptionMapper;

	@Override
	public JumpPage getBusinessPage(Integer pageNum, Integer pageSize) {

		// 设置分页信息
		PageHelper.startPage(pageNum, pageSize);

		// 设置查询条件
		BusinessExample example = new BusinessExample();
		// 设置排序(先根据优先显示排，再根据id倒序排)
		example.setOrderByClause("business_front DESC,business_id DESC");
		// 执行查询
		List<Business> list = businessMapper.selectByExample(example);

		// 取出结果
		PageInfo<Business> info = new PageInfo<Business>(list);

		return JumpPage.getPage(info);
	}

	@Override
	public JumpResult addBusiness(Business business, byte[] decContent) {

		// 插入详情
		Description desc = new Description();
		desc.setDecContent(decContent);
		descriptionMapper.insert(desc);

		// 设置在Business中
		business.setBusinessDec(desc.getDecId());
		// 设置显示 1为优先显示，0位普通显示
		business.setBusinessFront(0);

		// 插入Business
		businessMapper.insert(business);

		return JumpResult.ok();
	}

	@Override
	public JumpResult delBusiness(List<Integer> idList) {

		// 先查询出Business
		BusinessExample example = new BusinessExample();
		Criteria criteria = example.createCriteria();
		criteria.andBusinessIdIn(idList);

		List<Business> businessList = businessMapper.selectByExample(example);

		// 删除详情
		for (Business business : businessList) {
			descriptionMapper.deleteByPrimaryKey(business.getBusinessDec());
		}

		// 删除Business
		businessMapper.deleteByExample(example);

		return JumpResult.ok();
	}

	@Override
	public JumpResult getBusinessById(Integer id) throws UnsupportedEncodingException {

		// 先查出Business
		Business business = businessMapper.selectByPrimaryKey(id);

		// 再查出详情
		Description description = descriptionMapper.selectByPrimaryKey(business.getBusinessDec());
		// 变成字符串
		String content = new String(description.getDecContent(), "UTF-8");

		// 返回对象
		PoAndDesc creat = PoAndDesc.creat(business, content);

		return JumpResult.ok(creat);
	}

	@Override
	public JumpResult updBusiness(Business business, byte[] decContent) {

		// 先修改Business
		businessMapper.updateByPrimaryKey(business);

		// 再修改详情
		Description desc = new Description();
		desc.setDecId(business.getBusinessDec());
		desc.setDecContent(decContent);
		descriptionMapper.updateByPrimaryKeyWithBLOBs(desc);

		return JumpResult.ok();
	}

	@Override
	public JumpResult updBusinessFront(List<Integer> idList, Integer front) {

		// 如果front为1，检查前台设置是否满了
		if (front == 1) {
			
			BusinessExample example = new BusinessExample();
			Criteria criteria = example.createCriteria();
			criteria.andBusinessFrontEqualTo(front);

			List<Business> list = businessMapper.selectByExample(example);
			int count = list.size() + idList.size();

			// 如果大于，就返回错误消息
			if (count > 4) {
				return JumpResult.erorr("前台显示只能设置4个，请取消后再设置!");
			}
		}
		
		//根据需求设置
		for (Integer id : idList) {
			Business business = businessMapper.selectByPrimaryKey(id);
			business.setBusinessFront(front);
			businessMapper.updateByPrimaryKey(business);
		}

		return JumpResult.ok();
	}

}
