package com.dgut.spring.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoJdbcImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("Add User into database by JDBC.");

	}

}
