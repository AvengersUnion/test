package com.jump.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.pojo.Business;

public interface BusinessService {

	public JumpPage getBusinessPage(Integer pageNum,Integer pageSize);
	public JumpResult addBusiness(Business business,byte[] decContent);
	public JumpResult delBusiness(List<Integer> idList);
	public JumpResult getBusinessById(Integer id)throws UnsupportedEncodingException;
	public JumpResult updBusiness(Business business,byte[] decContent);
	public JumpResult updBusinessFront(List<Integer> idList,Integer front);
	
}
