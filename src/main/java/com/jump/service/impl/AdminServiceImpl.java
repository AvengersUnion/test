package com.jump.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.jump.common.JumpResult;
import com.jump.dao.AdminMapper;
import com.jump.pojo.Admin;
import com.jump.pojo.AdminExample;
import com.jump.pojo.AdminExample.Criteria;
import com.jump.service.AdminService;

/**
 * admin的Service
 * @author 567
 *
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public Admin checkAdmin(String username, String password) {
		
		//先根据用户名查询
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Admin> list = adminMapper.selectByExample(example);
		//如果没有查到，则返回false
		if(list == null || list.size()==0){
			return null;
		}
		
		Admin admin = list.get(0);
		//到这里用户名正确，对比密码
		String password2 = admin.getPassword();
		if(!password2.equals(DigestUtils.md5DigestAsHex(password.getBytes()))){
			return null;
		}
		return admin;
	}

	@Override
	public JumpResult updAdmin(String username, String password) {
		
		//先根据用户名查询
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Admin> list = adminMapper.selectByExample(example);
		//如果没有查到，则返回false
		if(list == null || list.size()==0){
			return JumpResult.erorr("用户名不存在");
		}

		Admin admin = list.get(0);
		//修改密码
		admin.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
		adminMapper.updateByPrimaryKey(admin);
		
		return JumpResult.ok();
	}

}
