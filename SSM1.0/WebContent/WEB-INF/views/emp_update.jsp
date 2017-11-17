<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Insert title here</title>
<meta charset="utf-8"/>
</head>
<body>
	<form action="${pageContext.request.contextPath }/emp/update.do" method="get">
		<table>
			<tr hidden="hidden">
				<td>员工编号：</td>
				<td><input type="text" name="empno" id="empno" value="${emp.empno}" /></td>
			</tr>
			<tr>
				<td>员工姓名：</td>
				<td><input type="text" name="ename" id="ename" value="${emp.ename }" /></td>
			</tr>
			<tr>
				<td>员工职位：</td>
				<td><input type="text" name="job" id="job" value="${emp.job }" /></td>
			</tr>
			<tr>
				<td>领导编号：</td>
				<td><input type="text" name="mgr" id="mgr" value="${emp.mgr }" /></td>
			</tr>
			<tr>
				<td>入职日期：</td>
				<td><input type="date" name="hiredate" id="hiredate" value="${emp.hiredate }" /></td>
			</tr>
			<tr>
				<td>员工工资：</td>
				<td><input type="number" name="sal" id="sal" value="${emp.sal }" /></td>
			</tr>
			<tr>
				<td>员工奖金：</td>
				<td><input type="number" name="comm" id="comm" value="${emp.comm }" /></td>
			</tr>
			<tr>
				<td>部门编号：</td>
				<td>
					<input type="text" name="deptno" id="deptno" value="${emp.deptno }"/>
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="" id="" value="修改" /></td>
				<td><input type="reset" name="" id="" value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>