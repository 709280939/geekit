package com.user.dao;

import java.util.Collection;

import org.hibernate.Session;

import com.user.entity.User;

public interface UserDao {
	public Session getCurrentSession();

	public Object get(Class<?> clazz, Object id);

	public void createOnly(Object obj);

	public int AddUser(User obj);

	public void updateOnly(Object obj);

	public void update(Object obj);

	public void saveOrUpdate(Object obj);

	public void saveOrUpdateAll(Collection<?> objs);

	public void delete(Object obj);

	public void deleteAll(Collection<?> objs);
	
	public void deleteById(String id);

	public Object get(Class<?> clazz, String idName, Object idValue);
}
