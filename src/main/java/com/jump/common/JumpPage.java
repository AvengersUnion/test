package com.jump.common;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * 分页查询返回对象
 * @author 567
 *
 */
public class JumpPage {

	private long total;
	private List body;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getBody() {
		return body;
	}
	public void setBody(List body) {
		this.body = body;
	}
	
	public static JumpPage getPage(PageInfo info){
		JumpPage page = new JumpPage();
		page.setTotal(info.getTotal());
		page.setBody(info.getList());
		
		return page;
	}
}
