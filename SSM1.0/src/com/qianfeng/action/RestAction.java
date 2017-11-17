package com.qianfeng.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("rest")
public class RestAction {
	@RequestMapping(value = "testRest/{id}", method = RequestMethod.GET)
	public String testRest(@PathVariable int id){
		System.out.println(id);
		return "error";
	}
	@RequestMapping(value = "testPost", method = RequestMethod.POST)
	public String testRest1(String id, String username){
		System.out.println(id + "==" + username);
		return "error";
	}
	@RequestMapping(value = "testDelete/{id}", method = RequestMethod.PUT)
	public String testRest2(@PathVariable int id){
		System.out.println(id + "=======");
		return "redirect:/restfor.jsp";
	}
}
