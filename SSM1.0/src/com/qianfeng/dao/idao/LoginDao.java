package com.qianfeng.dao.idao;

import com.qianfeng.dao.pojo.Login;

public interface LoginDao extends BaseDao<Login, Integer> {
	//登录
	Login login(Login login) throws Exception;
	//注册
	boolean register(Login login) throws Exception;
}
