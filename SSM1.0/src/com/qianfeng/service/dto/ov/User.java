package com.qianfeng.service.dto.ov;

import com.qianfeng.dao.pojo.Detail;
import com.qianfeng.dao.pojo.Login;

public class User {
	private Login login;
	private Detail detail;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Login login, Detail detail) {
		super();
		this.login = login;
		this.detail = detail;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", detail=" + detail + "]";
	}
	
}
