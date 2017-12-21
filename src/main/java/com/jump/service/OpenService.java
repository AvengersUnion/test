package com.jump.service;


import java.io.UnsupportedEncodingException;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.common.PoAndDesc;

public interface OpenService {
	
	public JumpResult getShowData() throws Exception ;
	public JumpPage getPoPage(Integer plate,Integer pageNum,Integer pageSize);
	public PoAndDesc getOne(Integer plate,Integer id) throws UnsupportedEncodingException;
}
