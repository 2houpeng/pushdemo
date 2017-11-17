package com.qianfeng.service.iservice;

import java.util.List;

public interface BaseService<T, K> {
	String save(T t);
	String update(T t);
	String delete(T t);
	String delete(Integer k);
	List<T> findAll();
	T findById(K k);
}
