package com.jump.service;

import java.util.List;

import com.jump.common.JumpResult;
import com.jump.pojo.Lead;

public interface LeadService {

	public List<Lead> getLeanings();
	public JumpResult addLeaning(Integer leadParentid,String leadName,String leadUrl);
	public JumpResult delLeaning(Integer id);
	public JumpResult updLeaning(Lead lead);
}
