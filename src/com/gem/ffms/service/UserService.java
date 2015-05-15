package com.gem.ffms.service;

import java.util.List;

import com.gem.ffms.dao.UserDao;
import com.gem.ffms.entity.User;
import com.gem.ffms.impl.UserDaoImpl;
/**
 * 赵庆静
 * service层用来封装
 * 实现UserDao的接口
 * 提高代码的安全性
 * */
public class UserService {
//private UserDao ud=new UserDaoImpl();
	private UserDao ud;
	public UserService() {
		ud = new UserDaoImpl();
	}
	
	public void updateUser(User user)
	{
		ud.updateUser(user);
	}
	public void saveUser(User user)
	{
		ud.saveUser(user);
	}
	public void deleteUser(int user_id)
	{
		ud.deleteUser(user_id);
	}
	public List queryAll()
	{
		return ud.queryAll();
	}

	public User getUserByName(String username) {
		return ud.getUserByName(username);
		
	}
	public User queryStuById(int user_id)
	{
		return ud.queryStuById(user_id);
	}
}
