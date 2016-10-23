package com.blog.service;

import com.blog.dao.UserDAOImpl;
import com.blog.model.User;

public class UserServiceImpl  implements UserService{
	
	private UserDAOImpl userDAO;
	
	
	public UserServiceImpl() {
		userDAO = new UserDAOImpl();
	}
	
	@Override
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}
	
	
	
}
