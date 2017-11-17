package com.qianfeng.dao.pojo;

/**
 * @author Administrator
 *
 */
public class Login {
	private int loginId;
	private String username;
	private String password;
	private int priority;
	public Login() {
		// TODO Auto-generated constructor stub
	}
	public Login(int loginId, String username, String password, int priority) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.priority = priority;
	}
	public Login(String username, String password, int priority) {
		super();
		this.username = username;
		this.password = password;
		this.priority = priority;
	}
	
	
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + ", priority="
				+ priority + "]";
	}
	
}
