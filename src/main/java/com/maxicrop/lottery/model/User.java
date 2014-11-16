/**
 * 
 */
package com.maxicrop.lottery.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Apichai.T
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "USERS", catalog = "maxi", uniqueConstraints = {
		@UniqueConstraint(columnNames = "USER_NAME"),
		@UniqueConstraint(columnNames = "USER_PWD") })
public class User implements Serializable {

	private Long userId;
	private String userName;
	private String password;
	private boolean enabled;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);
	
	public User() {
	}
 
	public User(String username, String password, boolean enabled) {
		this.userName = username;
		this.password = password;
		this.enabled = enabled;
	}
 
	public User(String username, String password, 
		boolean enabled, Set<UserRole> userRole) {
		this.userName = username;
		this.password = password;
		this.enabled = enabled;
		this.userRole = userRole;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getUserId() {
		return userId;
	}

	@Column(name = "USER_PWD", nullable = false, length = 60)
	public String getPassword() {
		return this.password;
	}

	@Column(name = "USER_NAME", unique = true, nullable = false, length = 45)
	public String getUserName() {
		return userName;
	}

	@Column(name = "ENABLED", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRole> getUserRole() {
		return this.userRole;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
 	
}
