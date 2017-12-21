package com.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jump.common.JumpResult;
import com.jump.pojo.Lead;
import com.jump.service.LeadService;

/**
 * Leaning的Controller
 * @author 567
 *
 */
@Controller
@RequestMapping("/lead")
public class LeadController {

	@Autowired
	private LeadService leaningService;
	
	/**
	 * 获取所有的leaning
	 * @return
	 */
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Lead> getLeads() {
		return leaningService.getLeanings();
	}
	
	/**
	 * 增加Leaning
	 * @param leadParentid
	 * @param leadName
	 * @param leadUrl
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public JumpResult addLead(
			@RequestParam(defaultValue="0")Integer leadParentid, 
			String leadName, String leadUrl) {
		return leaningService.addLeaning(leadParentid, leadName, leadUrl);
	}
	
	/**
	 * 根据id删除Leaning
	 * @param id
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public JumpResult delLead(Integer id) {
		return leaningService.delLeaning(id);
	}
	
	/**
	 * 修改Leaning
	 * @param leaning
	 * @return
	 */
	@RequestMapping("/alter")
	@ResponseBody
	public JumpResult updLead(Lead lead) {
		return leaningService.updLeaning(lead);
	}
}
