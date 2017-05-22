package com.user.service;

import com.user.entity.User;

public interface UserService {
	
	public int addUser(User user);
	
	public User findById(String id);
	
	public void deleteUser(String id);
	
	public void updateUser(User user);

}
