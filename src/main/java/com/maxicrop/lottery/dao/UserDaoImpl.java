/**
 * 
 */
package com.maxicrop.lottery.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maxicrop.lottery.model.User;

/**
 * @author Apichai.T
 * 
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<User> findAllUsers() {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"FROM User");
		return query.list();
	}
	
	public User findByUserName(String username) {

		Query query = sessionFactory.getCurrentSession().createQuery(
				"FROM User WHERE USER_NAME = :user_name");
		query.setParameter("user_name", username);
		return (User) query.list().get(0);

	}

	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

}
