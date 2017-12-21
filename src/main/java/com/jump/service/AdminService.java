package com.jump.service;

import com.jump.common.JumpResult;
import com.jump.pojo.Admin;

public interface AdminService {
	
	public Admin checkAdmin(String username,String password);
	public JumpResult updAdmin(String username,String password);

}
