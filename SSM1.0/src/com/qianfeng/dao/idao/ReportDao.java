package com.qianfeng.dao.idao;

import java.util.List;

import com.qianfeng.service.dto.result.DeptInfoReport;

public interface ReportDao  {
	List<DeptInfoReport> reportDeptInfo() throws Exception;
	String reportAvgSalByYear() throws Exception;
}
