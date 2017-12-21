package com.jump.exception;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.jump.common.JumpResult;
import com.jump.utils.JsonUtils;
/**
 * 全局的异常处理
 * @author 567
 *
 */
public class AllHandlerException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception e) {
		try {

			if (e instanceof NumberFormatException) {
				responseOutUploadError("传入参数错误！",response);
			}else if (e instanceof NullPointerException) {
				responseOutUploadError("数据异常，请刷新！",response);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;
	}
	
	/**
	 * 写出异常错误信息
	 * 
	 * @param msg
	 * @throws IOException
	 */
	private void responseOutUploadError(String msg, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		// 设置错误信息
		String errorJson = JsonUtils.objectToJson(JumpResult.erorr(msg));
		out.print(errorJson);
		out.close();
	}

}
