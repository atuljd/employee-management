package com.yash.springboot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.yash.springboot.dao.UserDao;
import com.yash.springboot.model.UserDetails;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	public List getUserDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(UserDetails.class);
		return criteria.list();
	}
}
