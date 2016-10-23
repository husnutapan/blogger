package com.blog.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.blog.model.User;
import com.blog.utility.EntityManagerUtility;


public class UserDAOImpl implements UserDAO{
	
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

}
