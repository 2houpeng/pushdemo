package com.qianfeng.dao.util;


public class UUIDUtil {
	public static int getUUID() {
		String id = String.format("%s", System.currentTimeMillis());
		return Integer.parseInt(id.substring(5));
	}
}
