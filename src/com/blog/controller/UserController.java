package com.blog.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.blog.model.User;
import com.blog.service.UserService;
import com.blog.service.UserServiceImpl;

@ManagedBean
@SessionScoped
public class UserController {
	private User user;
	
	private boolean chckbx1  = true;
	private boolean chckbx2 = false; 
	
	private UserServiceImpl userService;
	
	public UserController() {
		
		user = new User();
		userService = new UserServiceImpl();
	}
	
	public void registerUser(){
		userService.saveUser(user);
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isChckbx1() {
		return chckbx1;
	}

	public void setChckbx1(boolean chckbx1) {
		this.chckbx1 = chckbx1;
	}

	public boolean isChckbx2() {
		return chckbx2;
	}

	public void setChckbx2(boolean chckbx2) {
		this.chckbx2 = chckbx2;
	}

	public UserServiceImpl getUserService() {
		return userService;
	}

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}
	
	
	
	
	
	
}
