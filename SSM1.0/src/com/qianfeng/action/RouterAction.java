package com.qianfeng.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("router")
public class RouterAction {
	@RequestMapping(value="report.do",method=RequestMethod.GET)
	public String router(String path){
		if("report".equals(path)){
			return "forward:/WEB-INF/views/report.html";
		}
		return "error";
	}
	@RequestMapping(value="save.do", method=RequestMethod.GET)
	public String router1(String path){
		if("save".equals(path)){
			return "emp_save";
		}else {
			return "error";
		}
	}
	@RequestMapping(value="userRegister", method=RequestMethod.GET)
	public String router2(){
		return "registry";
	}
}
