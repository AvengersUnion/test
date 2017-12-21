package com.jump.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.common.PoAndDesc;
import com.jump.dao.DescriptionMapper;
import com.jump.dao.InformationMapper;
import com.jump.pojo.Description;
import com.jump.pojo.Information;
import com.jump.pojo.InformationExample;
import com.jump.pojo.InformationExample.Criteria;
import com.jump.service.InfoService;

/**
 * Info的Service
 * @author 567
 *
 */
@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InformationMapper informationMapper;
	
	@Autowired
	private DescriptionMapper descriptionMapper;
	
	@Override
	public JumpPage getInfoPage(Integer pageNum, Integer pageSize) {
		//设置分页情况
		PageHelper.startPage(pageNum, pageSize);
		//查询条件(不设置 则查询有)
		InformationExample example = new InformationExample();
		
		//设置排序（先根据优先显示排，再根据id倒序排）
		example.setOrderByClause("info_front DESC,info_id DESC");
		
		//执行查询
		List<Information> list = informationMapper.selectByExample(example);
		
		//包装结果
		PageInfo<Information> info = new PageInfo<Information>(list);
		
		return JumpPage.getPage(info);
	}

	@Override
	public JumpResult addInfo(Information info, byte[] decContent) {
		
		//先插入详情
		Description description = new Description();
		description.setDecContent(decContent);
		//会返回id并保存再对象中
		descriptionMapper.insert(description);
		
		//补全Information的属性
		info.setInfoDec(description.getDecId());
		//普通显示
		info.setInfoFront(0);
		//创建时间
		info.setInfoCreateTime(String.valueOf(new Date().getTime()));
		
		//插入Information
		informationMapper.insert(info);
		
		return JumpResult.ok();
	}

	@Override
	public JumpResult delInfo(List<Integer> idList) {
		
		//需要删除Information和详情
		
		//先查询出来
		InformationExample example = new InformationExample();
		Criteria criteria = example.createCriteria();
		criteria.andInfoIdIn(idList);
		List<Information> infoList = informationMapper.selectByExample(example);
		
		//删除详情
		for(Information info : infoList){
			descriptionMapper.deleteByPrimaryKey(info.getInfoDec());
		}
		
		//删除Information
		informationMapper.deleteByExample(example);
		
		return JumpResult.ok();
	}

	@Override
	public JumpResult getInfoById(Integer id) throws UnsupportedEncodingException {
		
		//需要获取Information和详情
		
		//先查询Information
		Information information = informationMapper.selectByPrimaryKey(id);
		
		//查询出详情
		Description description = descriptionMapper.selectByPrimaryKey(information.getInfoDec());
		
		//转成字符串
		String content = new String(description.getDecContent(),"UTF-8");
		
		//返回Information和详情
		PoAndDesc poAndDesc = PoAndDesc.creat(information, content);
		
		return JumpResult.ok(poAndDesc);
	}

	@Override
	public JumpResult updInfo(Information info, byte[] decContent) {
		
		//需要修改Information和详情
		
		//先查询
		Information oldInfo = informationMapper.selectByPrimaryKey(info.getInfoId());
		//补全创建时间
		info.setInfoCreateTime(oldInfo.getInfoCreateTime());
		
		//更新
		informationMapper.updateByPrimaryKey(info);
		
		//再修改详情
		Description description = new Description();
		description.setDecContent(decContent);
		description.setDecId(info.getInfoDec());
		descriptionMapper.updateByPrimaryKeyWithBLOBs(description);
		
		return JumpResult.ok();
	}

	@Override
	public JumpResult updInfoFront(List<Integer> idList, Integer front) {
		
		//如果front为1，则检查前台显示是否满了 3个
		if(front == 1){
			InformationExample example = new InformationExample();
			Criteria criteria = example.createCriteria();
			criteria.andInfoFrontEqualTo(front);
			
			List<Information> list = informationMapper.selectByExample(example);
			
			int count = idList.size() + list.size();
			//满了3个，则提示
			if(count>3){
				return JumpResult.erorr("前台显示只能设置3个，请取消后再设置!");
			}
		}
		
		//根据需求设置
		for(Integer id : idList){
			Information information = informationMapper.selectByPrimaryKey(id);
			information.setInfoFront(front);
			informationMapper.updateByPrimaryKey(information);
		}
		
		return JumpResult.ok();
	}

}
