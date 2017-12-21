package com.jump.intercepter;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jump.pojo.Admin;

/**
 * 登陆验证
 * @author 567
 *
 */
public class LoginIntercepter implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		response.setContentType("text/javascript; charset=utf-8");
		
		/*//如果访问得登陆接口就放行
		if(url.contains("login")){
			return true;
		}*/
		//如果不是，判断用户是否登陆
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		
		if(admin == null){
			PrintWriter writer = response.getWriter();
			writer.print("please login");
			writer.close();
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
