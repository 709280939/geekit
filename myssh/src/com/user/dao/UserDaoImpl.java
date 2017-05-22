package com.user.dao;

import static org.hibernate.criterion.Restrictions.eq;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository("dao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void createOnly(Object obj) {
		getSession().save(obj);
	}

	public int AddUser(User obj) {
		try{
			getSession().save(obj);
		}catch(Exception e){
			return 0;			
		}
		return 1;
	
	}

	public void updateOnly(Object obj) {
		getSession().update(obj);
	}

	public void update(Object obj) {
		getSession().update(obj);
	}

	public void saveOrUpdate(Object obj) {
		getSession().saveOrUpdate(obj);
	}

	public void saveOrUpdateAll(Collection<?> objs) {
		for (Object entity : objs) {
			getSession().saveOrUpdate(entity);
		}
	}

	public void delete(Object obj) {
		getSession().delete(obj);
	}

	public void deleteById(String id) {
		getSession().createQuery("delete from User where id='" + id + "'").executeUpdate();
	}

	@Override
	public Object get(Class<?> clazz, Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll(Collection<?> objs) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public Object get(Class<?> clazz, String idName, Object idValue) {
		Criteria cri = getSession().createCriteria(clazz).add(eq(idName, idValue));
		return cri.uniqueResult();
	}

}
