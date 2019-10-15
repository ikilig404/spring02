package com.dgut.spring.annotation.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dgut.spring.annotation.controller.UserController;

class AnnotationTest {

	@Test
	public void testAutoware() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController controller = context.getBean("userController", UserController.class);
		controller.add();
		((ConfigurableApplicationContext)context).close();
	}

}
