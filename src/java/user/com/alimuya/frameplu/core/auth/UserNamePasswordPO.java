package com.alimuya.frameplu.core.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author alimuya
 * @date 2015年12月2日 下午10:41:52 
 */
@Entity
@Table(name="auth_username_password")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE) 
public class UserNamePasswordPO {
	@Id
	@Column(name="uid")  
	private Long  uid;
	@Column(name="username")  
	private String username;
	@Column(name="password")  
	private String password;
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
