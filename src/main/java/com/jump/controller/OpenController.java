package com.jump.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.common.PoAndDesc;
import com.jump.service.OpenService;

/**
 * 前台显示的Controller
 * @author 567
 *
 */
@Controller
@RequestMapping("/open")
public class OpenController {

	@Autowired
	private OpenService openService;
	
	/**
	 * 前台显示获取数据
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/show")
	@ResponseBody
	public JumpResult getShowData() throws Exception{
		return openService.getShowData();
	}
	
	/**
	 * 前台显示的分页数据
	 * @param plate
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/page")
	@ResponseBody
	public JumpPage getPoPage(Integer plate,Integer pageNum,Integer pageSize){
		return openService.getPoPage(plate, pageNum, pageSize);
	}
	
	@RequestMapping("/one")
	@ResponseBody
	public PoAndDesc getOne(Integer plate,Integer id) throws UnsupportedEncodingException{
		return openService.getOne(plate, id);
	}
}
