package com.qianfeng.action;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qianfeng.dao.pojo.Login;
import com.qianfeng.service.dto.ov.User;
import com.qianfeng.service.iservice.LoginService;
@Controller
@RequestMapping("user")
public class UserAction {
	@Autowired
	private LoginService loginService;
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(String username, String password, HttpSession session){
		System.out.println(username + password + "=========");
		String msg = loginService.login(new Login(username, password));
		if("error".equals(msg)){
			session.setAttribute("errMsg", "登录失败！");
			return "error";
		}
		return "redirect:/emp/findAll.do";
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String registry(User user, HttpSession session){
		String msg = loginService.registry(user);
		if("error".equals(msg)){
			session.setAttribute("errMsg", "注册失败！");	
			return "error";
		}
		return "redirect:/index.jsp";
	}
}
