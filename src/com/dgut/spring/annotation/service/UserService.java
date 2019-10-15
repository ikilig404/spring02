package com.dgut.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dgut.spring.annotation.dao.UserDao;

@Service
public class UserService {
	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao userDao;
	public void addUserService() {
		
		System.out.println("Add User Service.");
		userDao.add();
	}
}
