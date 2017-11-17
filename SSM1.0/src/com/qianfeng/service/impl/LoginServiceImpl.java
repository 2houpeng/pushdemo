
package com.qianfeng.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qianfeng.dao.idao.DetailDao;
import com.qianfeng.dao.idao.LoginDao;
import com.qianfeng.dao.pojo.Detail;
import com.qianfeng.dao.pojo.Login;
import com.qianfeng.service.dto.ov.User;
import com.qianfeng.service.iservice.LoginService;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;
	@Autowired
	private DetailDao detailDao;
	@Transactional
	@Override
	public String login(Login login) {
		String msg = "error";
		try {
			Login login1 = loginDao.login(login);
			if(login1 != null){
				msg = "success";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String registry(User user) {
		String msg = "error";
		try {
			Login login = user.getLogin();
			System.out.println(login + "=========");
			loginDao.register(login);
			System.out.println(login + "-------------");
			Detail detail = user.getDetail();
			detail.setDetailId(login.getLoginId());
			detailDao.register(detail);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

}
