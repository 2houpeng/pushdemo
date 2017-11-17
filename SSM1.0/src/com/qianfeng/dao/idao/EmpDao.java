package com.qianfeng.dao.idao;

import java.util.List;
import java.util.Map;

import com.qianfeng.dao.pojo.Emp;

public interface EmpDao extends BaseDao<Emp, Integer> {
	//模糊查询
	List<Emp> findByName(Map<String, String> name) throws Exception;
}
