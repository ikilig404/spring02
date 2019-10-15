package com.dgut.spring.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository()
public class UserDaoImpl implements UserDao{
	public void add() {
		System.out.println("Add User into database.");
	}
}
