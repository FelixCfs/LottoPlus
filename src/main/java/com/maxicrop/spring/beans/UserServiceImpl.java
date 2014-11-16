package com.maxicrop.spring.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxicrop.lottery.dao.UserDao;
import com.maxicrop.lottery.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}

	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	public void save(User user) {
		userDao.save(user);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void delete(User user) {
		userDao.delete(user);
	}

}