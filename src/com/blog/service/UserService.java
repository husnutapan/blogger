package com.blog.service;

import com.blog.model.User;

public interface UserService {
	public boolean controlUser(User user);
	public void saveUser(User user);
}
