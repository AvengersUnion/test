package com.jump.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jump.common.JumpResult;
import com.jump.dao.BigadMapper;
import com.jump.pojo.Bigad;
import com.jump.pojo.BigadExample;
import com.jump.pojo.BigadExample.Criteria;
import com.jump.service.BigadService;

/**
 * 首页大图Service
 * @author 567
 *
 */
@Service
public class BigadServiceImpl implements BigadService {
	
	@Autowired
	private BigadMapper bigadMapper;

	@Override
	public List<Bigad> getBigads() {
		//查询所有，所以不设置条件
		BigadExample bigadExample = new BigadExample();
		//执行查询
		List<Bigad> bigads = bigadMapper.selectByExample(bigadExample);
		
		return bigads;
	}

	@Override
	public JumpResult addBigad(String picUrl) {
		
		//规定最多只能上传多少个
		//先查询所有
		BigadExample bigadExample = new BigadExample();
		int count = bigadMapper.countByExample(bigadExample);
		
		if(count<7){
			//补全添加信息
			Bigad bigad = new Bigad();
			bigad.setBigadPic(picUrl);
			bigad.setBigadFront(0);
			bigadMapper.insert(bigad);
			
			return JumpResult.ok();
		}else {
			return JumpResult.erorr("最多只能存在7个,请删除其他图片");
		}
	}

	@Override
	public JumpResult delBigad(List<Integer> idList) {
		//根据id删除
		BigadExample bigadExample = new BigadExample();
		Criteria criteria = bigadExample.createCriteria();
		//设置删除条件
		criteria.andBigadIdIn(idList);
		
		//执行删除语句
		bigadMapper.deleteByExample(bigadExample);
		return JumpResult.ok();
	}

	@Override
	public JumpResult updBigadFront(Integer id) {
		
		//先查询
		Bigad newBigad = bigadMapper.selectByPrimaryKey(id);
		   
		//先把原来的大图取消
		//查询出旧的大图
		BigadExample bigadExample = new BigadExample();
		Criteria criteria = bigadExample.createCriteria();
		criteria.andBigadFrontEqualTo(1);
		List<Bigad> list = bigadMapper.selectByExample(bigadExample);
		
		if(list != null && list.size() > 0){
			//设为不显示
			Bigad oldBigad = list.get(0);
			oldBigad.setBigadFront(0);
			bigadMapper.updateByPrimaryKey(oldBigad);
		}
		
		//设置新的显示大图
		newBigad.setBigadFront(1);
		bigadMapper.updateByPrimaryKey(newBigad);
				
		return JumpResult.ok();
	}

}
