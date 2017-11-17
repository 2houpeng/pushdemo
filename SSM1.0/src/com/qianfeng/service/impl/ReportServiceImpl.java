package com.qianfeng.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qianfeng.dao.idao.ReportDao;
import com.qianfeng.service.dto.result.DeptInfoReport;
import com.qianfeng.service.iservice.ReportService;
@Service("reportService")
public class ReportServiceImpl implements ReportService {
	@Autowired
	private ReportDao reportDao;
	@Transactional
	@Override
	public String reportDeptInfo() {
		String json = "";
		try {
			List<DeptInfoReport> list = reportDao.reportDeptInfo();
			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writeValueAsString(list);
			System.out.println(json + "=============");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	@Override
	public String reportAvgSalByYear() {
		// TODO Auto-generated method stub
		return null;
	}

}
