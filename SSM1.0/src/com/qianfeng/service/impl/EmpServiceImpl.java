package com.qianfeng.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qianfeng.dao.idao.EmpDao;
import com.qianfeng.dao.pojo.Emp;
import com.qianfeng.service.iservice.EmpService;
@Service("empService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao empDao;
	@Transactional
	@Override
	public String save(Emp t) {
		String msg = "error";
		try {
			empDao.save(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String update(Emp t) {
		String msg = "error";
		try {
			empDao.update(t);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String delete(Emp t) {
		String msg = "error";
		try {
			empDao.delete(t.getEmpno());
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public String delete(Integer k) {
		String msg = "error";
		try {
			empDao.delete(k);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	@Transactional
	@Override
	public List<Emp> findAll() {
		List<Emp> list = null;
		try {
			list = empDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Transactional
	@Override
	public Emp findById(Integer k) {
		Emp emp = null;
		try {
			emp = empDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	@Transactional
	@Override
	public List<Emp> findByName(String ename) {
		List<Emp> list = null;
		try {
			Map<String, String> map = new HashMap<>();
			map.put("ename", ename);
			list = empDao.findByName(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
