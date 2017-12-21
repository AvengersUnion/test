package com.jump.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jump.common.JumpResult;
import com.jump.pojo.Admin;
import com.jump.service.AdminService;

/**
 * admin的Controller
 * @author 567
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	/**
	 * 登陆
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public JumpResult login(String username, String password,
			HttpServletRequest request){
		
		Admin admin = adminService.checkAdmin(username, password);
		if(admin != null ){
			request.getSession().setAttribute("admin", admin);
			return JumpResult.ok();                                                                          
		}
		return JumpResult.erorr("用户名或者密码错误！");
		
	}
	
	/**
	 * 修改密码
	 * @param username
	 * @param password
	 * @param repassword
	 * @return
	 */
	@RequestMapping("/alter")
	@ResponseBody
	public JumpResult alterAdmin(String username,
			String password,String repassword){
		if(!password.equals(repassword)){
			return JumpResult.erorr("两次密码输入不一致");
		}
		return adminService.updAdmin(username, password);
	}
	
	@RequestMapping("/loginOut")
	@ResponseBody
	public JumpResult loginOut(HttpServletRequest request){
		request.getSession().removeAttribute("admin");
		return JumpResult.ok();
	}
	
}
