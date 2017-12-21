package com.jump.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jump.common.JumpPage;
import com.jump.common.JumpResult;
import com.jump.pojo.Business;
import com.jump.service.BusinessService;
import com.jump.utils.JumpUtils;

/**
 * Business的Controller
 * @author 567
 *
 */
@Controller
@RequestMapping("/busy")
public class BusinessController {

	@Autowired
	private BusinessService businessService;
	
	/**
	 * 获取Business的分页数据(先根据优先级排序，再根据id倒序排)
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/getPage")
	@ResponseBody
	public JumpPage getBusinessPage(Integer pageNum, Integer pageSize) {
		return businessService.getBusinessPage(pageNum, pageSize);
	}
	
	/**
	 * 添加Business和详情
	 * @param business
	 * @param content
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/add")
	@ResponseBody
	public JumpResult addBusiness(Business business, String content) throws UnsupportedEncodingException{
		byte[] decContent = content.getBytes("UTF-8");
		return businessService.addBusiness(business, decContent);
	}
	
	/**
	 * 根据id删除
	 * @param ids 以，分割的字符串
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public JumpResult delBusiness(String ids) {
		
		List<Integer> idList = JumpUtils.stringToList(ids);
		return businessService.delBusiness(idList);
	}
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/getOne")
	@ResponseBody
	public JumpResult getBusinessById(Integer id) throws UnsupportedEncodingException {
		return businessService.getBusinessById(id);
	}
	
	/**
	 * 修改Business
	 * @param business
	 * @param content
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping("/alter")
	@ResponseBody
	public JumpResult updBusiness(Business business, String content) throws UnsupportedEncodingException {
	
		byte[] decContent = content.getBytes("UTF-8");
		return businessService.updBusiness(business, decContent);
	}
	
	/**
	 * 设置前台的Business
	 * @param ids
	 * @param front
	 * @return
	 */
	@RequestMapping("/front")
	@ResponseBody
	public JumpResult updBusinessFront(String ids, Integer front) {
		
		//先检查参数是否正确
		if(front == 0 || front == 1){                       
			List<Integer> idList = JumpUtils.stringToList(ids);
			return businessService.updBusinessFront(idList, front);
		}
		return JumpResult.erorr("传入参数错误！");
	}
	
}
