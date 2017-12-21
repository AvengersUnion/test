package com.jump.common;

/**
 * 统一响应对象
 * @author 567
 *
 */
public class JumpResult {

	// 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public JumpResult(){
		
	}

	public JumpResult(Object data) {
		this.status = 200;
		this.msg = "ok";
		this.data = data;
	}
	
	public JumpResult(String msg, Object data) {
		this.status = 500;
		this.msg = msg;
		this.data = data;
	}
	
	public static JumpResult ok(){
		return new JumpResult(null);
	}
	
	public static JumpResult ok(Object data){
		return new JumpResult(data);
	}
	
	
	public static JumpResult erorr(String msg){
		return new JumpResult(msg,null);
	}
    
	public static JumpResult erorr(String msg, Object data){
		return new JumpResult(msg,data);
	}
}
