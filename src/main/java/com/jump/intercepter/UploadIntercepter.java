package com.jump.intercepter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jump.common.kindEditorResult;
import com.jump.utils.JsonUtils;

/**
 * 文件上传的拦截器（拦截大小和类型）
 * 
 * @author 567
 *
 */
public class UploadIntercepter implements HandlerInterceptor {

	private long maxSize;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		/*
		 *  response.setContentType(“text/html; charset=utf-8”); html 
			response.setContentType(“text/plain; charset=utf-8”); 文本 
			response.setContentType(“text/javascript; charset=utf-8”); json数据 
			response.setContentType(“application/xml; charset=utf-8”); xml数据
		 * 
		 * */
		response.setContentType("text/javascript; charset=utf-8");

		// 判断是否是文件上传请求
		if (request != null && ServletFileUpload.isMultipartContent(request)) {

			// 判断上传类型
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			Map<String, MultipartFile> files = multipartRequest.getFileMap();
			Iterator<String> iterator = files.keySet().iterator();
			// 对多部件请求资源进行遍历
			while (iterator.hasNext()) {
				String formKey = (String) iterator.next();
				MultipartFile multipartFile = multipartRequest.getFile(formKey);
				String filename = multipartFile.getOriginalFilename();
				// 判断是否为限制文件类型
				if (!checkFile(filename)) {
					// 返回错误信息
					responseOutUploadError("只能上传图片", response);
					return false;
				}
			}

			// 判断上传大小
			ServletRequestContext ctx = new ServletRequestContext(request);
			long requestSize = ctx.contentLength();
			if (requestSize > maxSize) {
				// 写出信息
				responseOutUploadError("上传图片大小不能超过2M", response);
				return false;
			}

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

	public void setMaxSize(long maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * 检查后缀名
	 * 
	 * @param fileName
	 * @return
	 */
	private boolean checkFile(String fileName) {
		// 设置允许上传文件类型
		String suffixList = "jpg,gif,png,ico,bmp,jpeg,tif,psd,svg";

		// 获取文件后缀
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		if (suffixList.contains(suffix.trim().toLowerCase())) {
			return true;
		}
		return false;
	}

	/**
	 * 写出上传错误信息
	 * 
	 * @param msg
	 * @throws IOException
	 */
	private void responseOutUploadError(String msg, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		// 设置错误信息
		String errorJson = JsonUtils.objectToJson(kindEditorResult.error(msg));
		out.print(errorJson);
		out.close();
	}

}
