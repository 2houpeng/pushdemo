package com.qianfeng.dao.idao;

import com.qianfeng.dao.pojo.Detail;

public interface DetailDao extends BaseDao<Detail, Integer> {
	//注册
	boolean register(Detail detail) throws Exception;
}
