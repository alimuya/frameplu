package com.alimuya.frameplu.core.auth;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author alimuya
 * @date 2015年12月2日 下午10:41:48 
 */
class UserNamePasswordAuthentication implements IAuthentication{
	@Autowired
	private UserNamePasswordDao namePasswordDao;
	private String username;
	private String password;

	UserNamePasswordAuthentication(String username,String password){
		this.username=username;
		this.password=password;
	}
	
	@Override
	public String auth() {
		// TODO Auto-generated method stub
		return null;
	}

}
