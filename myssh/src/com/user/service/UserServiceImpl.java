package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDao;
import com.user.entity.User;



@Service("service")
public class UserServiceImpl implements com.user.service.UserService{
	
	@Autowired
	public UserDao dao;

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
	return	dao.AddUser(user);
		
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return (User) dao.get(User.class,"id",id);
	}

	@Override
	public void deleteUser(String id) {
		dao.deleteById(id);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		dao.update(user);
	}

}
