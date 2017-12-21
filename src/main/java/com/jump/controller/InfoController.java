package com.jump.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.pojo.Information;
import com.jump.service.InfoService;
import com.jump.utils.JumpUtils;


/**
 * info的Controller
 * @author 567
 *
 */
@Controller
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	/**
	 * 获取分页数据
	 * @param pageNum 页数（从1开始）
	 * @param pageSize 页面大小
	 * @return
	 */
	@RequestMapping("/getPage")
	@ResponseBody
	public JumpPage getInfoPage(Integer pageNum, Integer pageSize) {
		return infoService.getInfoPage(pageNum, pageSize);
	}
	
	/**
	 * 增加Information
	 * @param info
	 * @param content
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/add")
	@ResponseBody
	public JumpResult addInfo(Information info, String content) throws UnsupportedEncodingException {
		byte[] decContent = content.getBytes("UTF-8");
		return infoService.addInfo(info, decContent);
	}
	
	/**
	 * 删除Information
	 * @param ids 以，分隔的id
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public JumpResult delInfo(String ids) {
		List<Integer> idList = JumpUtils.stringToList(ids);
		return infoService.delInfo(idList);
	}
	
	/**
	 * 根据id获取Information
	 * @param id
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/getOne")
	@ResponseBody
	public JumpResult getInfoById(Integer id) throws UnsupportedEncodingException {
		return infoService.getInfoById(id);
	}
	
	/**
	 * 更新Information
	 * @param info
	 * @param content
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/alter")
	@ResponseBody
	public JumpResult updInfo(Information info, String content) throws UnsupportedEncodingException {
		byte[] decContent = content.getBytes("UTF-8");
		return infoService.updInfo(info, decContent);
	}
	
	/**
	 * 设置前台的Information
	 * @param ids
	 * @param front
	 * @return
	 */
	@RequestMapping("/front")
	@ResponseBody
	public JumpResult updInfoFront(String ids, Integer front) {
		List<Integer> idList = JumpUtils.stringToList(ids);
		return infoService.updInfoFront(idList, front);
	}
	
}
