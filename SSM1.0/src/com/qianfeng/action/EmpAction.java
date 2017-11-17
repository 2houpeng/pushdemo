package com.qianfeng.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qianfeng.dao.pojo.Emp;
import com.qianfeng.service.iservice.EmpService;

@Controller
@RequestMapping("emp")
public class EmpAction {
	@Autowired
	private EmpService empService;
	@RequestMapping(value="save.do", method=RequestMethod.POST)
	public String save(Emp emp, HttpSession session){
		System.out.println(emp);
		String msg = empService.save(emp);
		if("error".equals(msg)){
			session.setAttribute("errMsg", "员工保存失败！");
		}
		return "redirect:findAll.do";
	}
	@RequestMapping(value="delete.do", method=RequestMethod.GET)
	public String delete(int empno, HttpSession session){
		String msg = empService.delete(empno);
		if("error".equals(msg)){
			session.setAttribute("errMsg", "员工删除失败！");
			return "error";
		}
		return "redirect:findAll.do";
	}
	@RequestMapping(value="update.do", method=RequestMethod.GET)
	public String update(Emp emp, HttpSession session){
		System.out.println(emp + "=================");
		String msg = empService.update(emp);
		if("error".equals(msg)){
			session.setAttribute("errMsg", "员工修改失败");
			return "error";
		}
		return "redirect:findAll.do";
	}
	@RequestMapping(value="findAll.do", method=RequestMethod.GET)
	public String findAll(Map<String, Object> map, HttpSession session){
		List<Emp> empList = empService.findAll();
		if(empList != null && empList.size() > 0){
			map.put("empList", empList);
		}else{
			session.setAttribute("errMsg", "查询所有员工失败！");
			return "error";
		}
		return "emp_details";
	}
	@RequestMapping(value="findById.do", method=RequestMethod.GET)
	public String findById(int empno, String path, HttpSession session, Map<String, Object> map){
		Emp emp = empService.findById(empno);
		System.out.println("===========");
		System.out.println(path + "=======");
		System.out.println(emp);
		if(emp != null){
			if("update".equals(path)){
				map.put("emp", emp);
				return "emp_update";
			}else{
				List<Emp> empList = new ArrayList<>();
				empList.add(emp);
				map.put("empList", empList);
				return "emp_details";
			}
		}else {
			session.setAttribute("errMsg", "员工查找失败！");
			map.put("errMsg", "员工查找失败！");
			return "error";
		}
	}
	@RequestMapping(value="findByName.do", method=RequestMethod.POST)
	public String findByName(String ename, Map<String, Object> map, HttpSession session){
		List<Emp> empList = empService.findByName(ename);
		if(empList != null && empList.size() > 0){
			map.put("empList", empList);
			return "emp_details";
		}else{
			session.setAttribute("errMsg", "模糊查找失败！");
			return "error";
		}
	}

}
