package com.qianfeng.service.dto.result;

import java.util.Date;

public class AvgSalByYear {
	private Date time;
	private double sal;
	public AvgSalByYear() {
		// TODO Auto-generated constructor stub
	}
	public AvgSalByYear(Date time, double sal) {
		super();
		this.time = time;
		this.sal = sal;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "AvgSalByYear [time=" + time + ", sal=" + sal + "]";
	}
	
	
}
