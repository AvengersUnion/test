package com.jump.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jump.common.JumpResult;
import com.jump.dao.LeadMapper;
import com.jump.pojo.Lead;
import com.jump.pojo.LeadExample;
import com.jump.pojo.LeadExample.Criteria;
import com.jump.service.LeadService;

/**
 * Leaning的Service
 * @author 567
 *
 */
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadMapper leadMapper;
	
	@Override
	public List<Lead> getLeanings() {
		//获取表中的所以内容
		
		LeadExample example = new LeadExample();
		List<Lead> list = leadMapper.selectByExample(example);
		
		return list;
	}

	@Override
	public JumpResult addLeaning(Integer leadParentid, String leadName, String leadUrl) {
		
		//添加
		//查询
		LeadExample example = new LeadExample();
		Criteria criteria = example.createCriteria();
		criteria.andLeadParentidEqualTo(leadParentid);
		List<Lead> list = leadMapper.selectByExample(example);
		
		//如果是父目录最多5个
		if(leadParentid == 0){
			if(list.size()>=5){
				return JumpResult.erorr("父目录最多存在5个！");
			}
		//子目录最多10个
		}else{
			if(list.size()>=10){
				return JumpResult.erorr("子目录最多存在10个！");
			}
		}
		
		//到这里符合条件，添加
		Lead lead = new Lead();
		lead.setLeadParentid(leadParentid);
		lead.setLeadName(leadName);
		lead.setLeadUrl(leadUrl);
		leadMapper.insert(lead);
		
		return JumpResult.ok();
	}

	@Override
	public JumpResult delLeaning(Integer id) {
		
		//根据id删除
		leadMapper.deleteByPrimaryKey(id);
		
		//查看是否有子目录
		LeadExample example = new LeadExample();
		Criteria criteria = example.createCriteria();
		criteria.andLeadParentidEqualTo(id);
		List<Lead> list = leadMapper.selectByExample(example);
		
		//如果有，则删除
		if(list.size()>0){
			for(Lead lead : list){
				leadMapper.deleteByPrimaryKey(lead.getLeadId());
			}
		}
		
		return JumpResult.ok();
	}

	@Override
	public JumpResult updLeaning(Lead lead) {
		leadMapper.updateByPrimaryKey(lead);
		return JumpResult.ok();
	}

}
