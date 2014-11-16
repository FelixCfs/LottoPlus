/**
 * 
 */
package com.maxicrop.lottery.dao;

import java.util.List;

import com.maxicrop.lottery.model.User;

/**
 * @author Apichai.T
 * 
 */
public interface UserDao {

	public List<User> findAllUsers();
	
	public User findByUserName(String username);

	public void save(User user);

	public void update(User user);

	public void delete(User user);

}
