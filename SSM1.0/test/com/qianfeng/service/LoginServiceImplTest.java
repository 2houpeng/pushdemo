package com.qianfeng.service;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qianfeng.dao.pojo.Detail;
import com.qianfeng.dao.pojo.Login;
import com.qianfeng.service.dto.ov.User;
import com.qianfeng.service.iservice.LoginService;

public class LoginServiceImplTest {
	private ApplicationContext ctx;
	private LoginService loginService;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		loginService = (LoginService) ctx.getBean("loginService");
		
	}

	@After
	public void tearDown() throws Exception {
		ctx = null;
	}

	@Test
	public void testLogin() {
		Login login = new Login("root", "root");
		String msg = loginService.login(login);
		System.out.println(msg);
	}

	@Test
	public void testRegistry() {
		Login login = new Login("root12", "root", 0);
		Detail detail = new Detail("小李13", new Date(), 1000);
		User user = new User(login, detail);
		loginService.registry(user);
	}

}
