package com.qianfeng.service.iservice;

import com.qianfeng.dao.pojo.Login;
import com.qianfeng.service.dto.ov.User;

public interface LoginService {
	//登录
	String login(Login login);
	//注册
	String registry(User user);
}