package com.jump.service;


import java.util.List;

import com.jump.common.JumpResult;
import com.jump.pojo.Bigad;

public interface BigadService {
	
	public List<Bigad> getBigads();
	public JumpResult addBigad(String picUrl);
	public JumpResult delBigad(List<Integer> idList);
	public JumpResult updBigadFront(Integer id);
}
