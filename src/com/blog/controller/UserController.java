package com.blog.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.blog.model.User;
import com.blog.service.UserServiceImpl;

@ManagedBean
@SessionScoped
public class UserController {
	private User user = new User();
	private User user2 = new User();

	private boolean chckbx1 = true;
	private boolean chckbx2 = false;

	private UserServiceImpl userService;

	public UserController() {

		userService = new UserServiceImpl();
	}

	public void registerUser() {
		userService.saveUser(user);
	}

	public void loginController() {
		System.out.println("username" + user2.getUsername());
		System.out.println("password" + user2.getPassword());
		
		System.out.println(userService.controlUser(user2));
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
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
}
