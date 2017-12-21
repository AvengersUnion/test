package com.jump.common;

/**
 * 存放实体类和详情
 * @author 567
 *
 */
public class PoAndDesc {

	private Object po;
	private String content;
	public Object getPo() {
		return po;
	}
	public void setPo(Object po) {
		this.po = po;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public PoAndDesc(Object po,String content){
		this.po = po;
		this.content = content;
	}
	
	public PoAndDesc(){
		
	}
	
	public static PoAndDesc creat(Object po,String content){
		return new PoAndDesc(po, content);
	}
	
		
}
