package com.jump.controller;


import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.pojo.Honor;
import com.jump.service.HonorService;
import com.jump.utils.JumpUtils;

/**
 * Honor的Controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/honor")
public class HonorController {

	@Autowired
	private HonorService honorService;
	
	/**
	 * 获取Honor的分页数据(先根据优先级排序，再根据id倒序排)
	 * @param pageNum 页数（从1开始）
	 * @param pageSize 页面大小
	 * @return
	 */
	@RequestMapping("/getPage")
	@ResponseBody
	public JumpPage getHonorPage(Integer pageNum,Integer pageSize){
		
		return honorService.getHonorPage(pageNum, pageSize);
	}
	
	/**
	 * 增加Honor
	 * @param honor
	 * @param content
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/add")
	@ResponseBody
	public JumpResult addHonor(Honor honor,String content) throws UnsupportedEncodingException{
		
		byte[] decContent = content.getBytes("UTF-8");
		return honorService.addHonor(honor, decContent);
	}
	
	/**
	 * 根据id删除Honor
	 * @param ids
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public JumpResult delHonor(String ids){
		//将String的ids变成List
		List<Integer> list = JumpUtils.stringToList(ids);
		return honorService.delHonor(list);
	}
	
	/**
	 * 根据id获取Honor所有信息
	 * @param id
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/getOne")
	@ResponseBody
	public JumpResult getHonorById(Integer id) throws UnsupportedEncodingException{
		return honorService.getHonorById(id);
	}
	
	/**
	 * 修改Honor
	 * @param honor
	 * @param content
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/alter")
	@ResponseBody
	public JumpResult updHonor(Honor honor, String content) throws UnsupportedEncodingException{
		
		byte[] decContent = content.getBytes("UTF-8");
		return honorService.updHonor(honor, decContent);
	}
	
	/**
	 * 修改前台Honor
	 * @param ids
	 * @param front
	 * @return
	 */
	@RequestMapping("/front")
	@ResponseBody
	public JumpResult updHonorFront(String ids, Integer front){
		
		if(front == 0 || front == 1){
			List<Integer> idList = JumpUtils.stringToList(ids);
			return honorService.updHonorFront(idList, front);
		}
		
		return JumpResult.erorr("传入参数错误！");
	}
	
	
}
