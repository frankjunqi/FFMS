package com.gem.ffms.dao;

import java.util.List;

import com.gem.ffms.entity.User;

public interface UserDao {
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(int user_id);
	
	public List queryAll();
	
	public User getUserByName(String username);
	
	public User queryStuById(int user_id);
}
