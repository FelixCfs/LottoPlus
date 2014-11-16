package com.maxicrop.spring.beans;

import java.util.List;

import com.maxicrop.lottery.model.User;

public interface UserService {
	
	public List<User> findAllUsers();

	public User findByUserName(String username);

	public void save(User user);

	public void update(User user);

	public void delete(User user);
	
}
