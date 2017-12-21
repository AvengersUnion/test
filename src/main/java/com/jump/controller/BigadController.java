package com.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jump.common.JumpResult;
import com.jump.pojo.Bigad;
import com.jump.service.BigadService;
import com.jump.utils.JumpUtils;

/**
 * Bigad的Controller
 * @author 567
 *
 */
@Controller
@RequestMapping("/bigad")
public class BigadController {

	@Autowired
	private BigadService bigadService;

	/**
	 * 获取bigad的所有图片
	 * 
	 * @return 所有信息
	 */
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Bigad> getBigads() {
		return bigadService.getBigads();
	}

	/**
	 * 根据id删除bigad
	 * 
	 * @param ids
	 *            要删除得id，根据,分割
	 * @return 消息
	 */
	@RequestMapping("/del")
	@ResponseBody
	public JumpResult delBigad(String ids) {
		
		//将String的ids变成List
		List<Integer> list = JumpUtils.stringToList(ids);
		return bigadService.delBigad(list);

	}

	/**
	 * 传入图片url，添加bigad
	 * 
	 * @param picUrl
	 *            图片url
	 * @return 消息
	 */
	@RequestMapping("/add")
	@ResponseBody
	public JumpResult addBigad(String picUrl) {
		return bigadService.addBigad(picUrl);
	}

	/**
	 * 根据id设置首页大图
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/front")
	@ResponseBody
	public JumpResult setBigadFront(Integer id) {
		
		return bigadService.updBigadFront(id);
	}

}
