package com.blog.dao;

import com.blog.model.User;

public interface UserDAO {
	public boolean controlUser(User user);
	public void saveUser(User user);
}
