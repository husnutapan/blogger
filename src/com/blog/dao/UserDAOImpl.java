package com.blog.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.blog.model.User;
import com.blog.utility.EntityManagerUtility;

public class UserDAOImpl implements UserDAO {

	private EntityManager entityManager;

	public UserDAOImpl() {
		EntityManagerFactory entityManagerFactory = EntityManagerUtility.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
	}
	

	@Override
	public void saveUser(User user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
	}

	@Override
	public boolean controlUser(User user) {
		Query queryForUser = entityManager.createNamedQuery("user.getUserList");
		queryForUser.setParameter("username", user.getUsername());
		queryForUser.setParameter("password", user.getPassword());
		Collection userList = queryForUser.getResultList();
		
		if (userList.size() == 0) {
			return false;
		}
		return true;
	}

}
