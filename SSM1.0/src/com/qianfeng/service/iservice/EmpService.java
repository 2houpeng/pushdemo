package com.qianfeng.service.iservice;

import java.util.List;

import com.qianfeng.dao.pojo.Emp;

public interface EmpService extends BaseService<Emp, Integer> {
	//模糊查询
	List<Emp> findByName(String ename);
}
