package com.dgut.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dgut.spring.annotation.service.UserService;

@Controller(value="userController")
public class UserController {
	@Autowired
	private UserService service;
	public void add() {
		
		System.out.println("User Controller : Add");
		service.addUserService();
	}
}
