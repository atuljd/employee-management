package com.yash.springboot.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.springboot.dao.UserDao;
import com.yash.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public List getUserDetails() {
		return userDao.getUserDetails();
	}
}
