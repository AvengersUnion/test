package com.jump.service.impl;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.common.PoAndDesc;
import com.jump.dao.BigadMapper;
import com.jump.dao.BusinessMapper;
import com.jump.dao.DescriptionMapper;
import com.jump.dao.HonorMapper;
import com.jump.dao.InformationMapper;
import com.jump.dao.LeadMapper;
import com.jump.pojo.Bigad;
import com.jump.pojo.Business;
import com.jump.pojo.BusinessExample;
import com.jump.pojo.Description;
import com.jump.pojo.Honor;
import com.jump.pojo.HonorExample;
import com.jump.pojo.Information;
import com.jump.pojo.InformationExample;
import com.jump.pojo.Lead;
import com.jump.pojo.LeadExample;
import com.jump.service.OpenService;

/**
 * 前台显示的Service
 * @author 567
 *
 */
@Service
public class OpenServiceImpl implements OpenService {

	@Autowired
	private BigadMapper bigadMapper;
	
	@Autowired
	private HonorMapper honorMapper;
	
	@Autowired
	private BusinessMapper businessMapper;
	
	@Autowired
	private InformationMapper informationMapper;
	
	@Autowired
	private DescriptionMapper descriptionMapper;
	
	@Autowired
	private LeadMapper leadMapper;
	
	
	@Override
	public JumpResult getShowData() throws Exception {
		
		//把要返回的参数全部加入集合
		List<Object> list = new ArrayList<Object>();
		
		//查询Bigad
		/*BigadExample bigadExample = new BigadExample();
		Criteria bigadCriteria = bigadExample.createCriteria();
		bigadCriteria.andBigadFrontEqualTo(1);
		List<Bigad> bigadList = bigadMapper.selectByExample(bigadExample);*/
		List<Bigad> bigadList = getObjectList(bigadMapper,Bigad.class);
		//加入返回集合
		list.add(bigadList);
		
		//查询Honor
		/*HonorExample honorExample = new HonorExample();
		com.jump.pojo.HonorExample.Criteria honorCriteria 
			= honorExample.createCriteria();
		honorCriteria.andHonorFrontEqualTo(1);
		List<Honor> honorList = honorMapper.selectByExample(honorExample);*/
		
		List<Honor> honorList = getObjectList(honorMapper,Honor.class);
		//加入返回集合
		list.add(honorList);
		
		//查询Business
		/*BusinessExample businessExample = new BusinessExample();
		com.jump.pojo.BusinessExample.Criteria businessCriteria = businessExample.createCriteria();
		businessCriteria.andBusinessFrontEqualTo(1);
		List<Business> businessList = businessMapper.selectByExample(businessExample);*/
		
		List<Business> businessList = getObjectList(businessMapper,Business.class);
		//加入返回集合
		list.add(businessList);
		
		//查询Info
		InformationExample informationExample = new InformationExample();
		com.jump.pojo.InformationExample.Criteria infoCriteria = informationExample.createCriteria();
		infoCriteria.andInfoFrontEqualTo(1);
		List<Information> infoList = informationMapper.selectByExample(informationExample);
		
		//查出详情
		List<PoAndDesc> poList = new ArrayList<PoAndDesc>();
		for(Information info : infoList){
			Description description = descriptionMapper.selectByPrimaryKey(info.getInfoDec());
			String content = new String(description.getDecContent(),"UTF-8");
			PoAndDesc poAndDesc = PoAndDesc.creat(info,content);
			poList.add(poAndDesc);
		}
		//加入返回集合
		list.add(poList);
		
		
		//查询Lead
		LeadExample leadExample = new LeadExample();
		List<Lead> leadList = leadMapper.selectByExample(leadExample);
		//加入返回集合
		list.add(leadList);
		
		//设置分页情况
		PageHelper.startPage(1, 4);
		//查询条件(查询front不为1的值)
		InformationExample informationExample2 = new InformationExample();
		com.jump.pojo.InformationExample.Criteria infoCriteria2 = informationExample2.createCriteria();
		infoCriteria2.andInfoFrontNotEqualTo(1);
		//设置排序（再根据id倒序排）
		informationExample2.setOrderByClause("info_id DESC");
		List<Information> infoList2 = informationMapper.selectByExample(informationExample2);
		//加入返回集合
		list.add(infoList2);
		
		return JumpResult.ok(list);
	}
	
	public JumpPage getPoPage(Integer plate,Integer pageNum,Integer pageSize){
		
		List list = null;
		
		//设置分页
		PageHelper.startPage(pageNum, pageSize);
		//根据标识查询
		switch(plate){
			case 1:
				//为1查询Honor
				HonorExample honorExample = new HonorExample();
				com.jump.pojo.HonorExample.Criteria honorCriteria 
					= honorExample.createCriteria();
				//查询普通显示并且id倒序排列
				honorCriteria.andHonorFrontNotEqualTo(1);
				honorExample.setOrderByClause("honor_id DESC");
				//执行查询
				list = honorMapper.selectByExample(honorExample);
				break;
			case 2:
				//为2查询Business
				BusinessExample businessExample = new BusinessExample();
				com.jump.pojo.BusinessExample.Criteria businessCriteria = businessExample.createCriteria();
				//查询普通显示并且id倒序排列
				businessCriteria.andBusinessFrontNotEqualTo(1);
				businessExample.setOrderByClause("business_id DESC");
				list = businessMapper.selectByExample(businessExample);
				break;
			case 3:
				//查询条件(查询front不为1的值)
				InformationExample informationExample2 = new InformationExample();
				com.jump.pojo.InformationExample.Criteria infoCriteria2 = informationExample2.createCriteria();
				infoCriteria2.andInfoFrontNotEqualTo(1);
				//设置排序（再根据id倒序排）
				informationExample2.setOrderByClause("info_id DESC");
				
				list = informationMapper.selectByExample(informationExample2);
				break;
		}
		
		PageInfo pageInfo = new PageInfo(list);
		
		
		return JumpPage.getPage(pageInfo);
	}

	public PoAndDesc getOne(Integer plate,Integer id) throws UnsupportedEncodingException{
		
		Object obj = null;
		Long descId = null;
		
		switch(plate){
			case 1:
				//为1查询Honor
				Honor honor = honorMapper.selectByPrimaryKey(id);
				descId = honor.getHonorDec();
				obj = honor;
				break;
			case 2:
				//为2查询Business
				Business business = businessMapper.selectByPrimaryKey(id);
				descId = business.getBusinessDec();
				obj = business;
				break;
			case 3:
				//为3查询Info
				Information information = informationMapper.selectByPrimaryKey(id);
				descId = information.getInfoDec();
				obj = information;
				break;
		}
		
		//查询详情
		Description description = descriptionMapper.selectByPrimaryKey(descId);
		String content = new String(description.getDecContent(),"UTF-8");
		
		return PoAndDesc.creat(obj, content);
	}
	
	private List getObjectList(Object mapper,Class clazz) throws Exception{
		
		String name = clazz.getSimpleName();
		
		//手动拼凑Example名字
		String exampleName = "com.jump.pojo."+name+"Example";
				
		//new 出一个Example对象
		Object example = Class.forName(exampleName).newInstance();
		//拿到criteria
		Method method = example.getClass().getMethod("createCriteria");
		Object criteria = method.invoke(example);
		
		String front = "and"+name+"FrontEqualTo";
		//拿到设置条件对象
		Method setFront = criteria.getClass().getMethod(front, Integer.class);
		//设置条件
		setFront.invoke(criteria, 1);
		
		//拿到查询方法
		Method selectByExample = mapper.getClass().getMethod("selectByExample", Class.forName(exampleName));
		List object = (List)selectByExample.invoke(mapper, example);
		
		return object;
	}
	
	
	
	
	
	
	
	
	
	
	
}
