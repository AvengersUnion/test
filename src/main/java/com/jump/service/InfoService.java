package com.jump.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.pojo.Information;

public interface InfoService {

	public JumpPage getInfoPage(Integer pageNum,Integer pageSize);
	public JumpResult addInfo(Information info,byte[] decContent);
	public JumpResult delInfo(List<Integer> idList);
	public JumpResult getInfoById(Integer id) throws UnsupportedEncodingException;
	public JumpResult updInfo(Information info,byte[] decContent);
	public JumpResult updInfoFront(List<Integer> idList,Integer front);
}
