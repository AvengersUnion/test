package com.jump.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.pojo.Honor;

public interface HonorService {

	public JumpPage getHonorPage(Integer pageNum,Integer pageSize);
	public JumpResult addHonor(Honor honor,byte[] decContent);
	public JumpResult delHonor(List<Integer> idList);
	public JumpResult getHonorById(Integer id)throws UnsupportedEncodingException;
	public JumpResult updHonor(Honor honor,byte[] decContent);
	public JumpResult updHonorFront(List<Integer> idList,Integer front);
}
