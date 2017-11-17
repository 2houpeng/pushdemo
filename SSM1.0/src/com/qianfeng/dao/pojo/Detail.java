package com.qianfeng.dao.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Detail {
	private int detailId;
	private String realName;
	private @DateTimeFormat(pattern="yyyy-MM-dd")
	Date birthday;
	private double balance;
	public Detail() {
		// TODO Auto-generated constructor stub
	}
	
	public Detail(int detailId, String realName, Date birthday, double balance) {
		super();
		this.detailId = detailId;
		this.realName = realName;
		this.birthday = birthday;
		this.balance = balance;
	}
	
	public Detail(String realName, Date birthday, double balance) {
		super();
		this.realName = realName;
		this.birthday = birthday;
		this.balance = balance;
	}

	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Detail [detailId=" + detailId + ", realName=" + realName + ", birthday=" + birthday + ", balance="
				+ balance + "]";
	}

}
