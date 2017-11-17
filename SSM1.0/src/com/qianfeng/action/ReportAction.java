package com.qianfeng.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qianfeng.service.iservice.ReportService;
@Controller
@RequestMapping("report")
public class ReportAction {
	@Autowired
	private ReportService reportService;
	@RequestMapping(value="repostDeptInfo.do",method=RequestMethod.GET)
	@ResponseBody
	public String reportDeptInfo(){
		String json = reportService.reportDeptInfo();
		System.out.println(json + "json");
		return json;
	}
}
