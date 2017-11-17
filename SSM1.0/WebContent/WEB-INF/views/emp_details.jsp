<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>员工展示页面</title>
<meta charset="utf-8"/>
</head>
<body>
	<a href="${pageContext.request.contextPath }/router/report.do?path=report">查看报表</a>
	<table style="border: 1px solid black">
		<tr align="center">
			<td>员工编号</td>
			<td>员工姓名</td>
			<td>员工职位</td>
			<td>领导编号</td>
			<td>入职日期</td>
			<td>员工工资</td>
			<td>员工奖金</td>
			<td>部门编号</td>
			<td>员工操作</td>
		</tr>
		<c:forEach items="${empList }" var="emp">
			<tr>
				<td>${emp.empno }</td>
				<td>${emp.ename }</td>
				<td>${emp.job }</td>
				<td>${emp.mgr }</td>
				<td>${emp.hiredate }</td>
				<td>${emp.sal }</td>
				<td>${emp.comm }</td>
				<td>${emp.deptno }</td>
				<td>
					<a href="${pageContext.request.contextPath }/emp/delete.do?empno=${emp.empno }">删除</a>
					<a href="${pageContext.request.contextPath }/emp/findById.do?path=update&empno=${emp.empno }">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<hr />
	<a href="${pageContext.request.contextPath }/router/save.do?path=save">添加员工</a>
	<hr />
	<form action="${pageContext.request.contextPath }/emp/findById.do" method="get">
		<input type="text" name="empno" id="empno" value="1" />
		<input type="submit" value="精确查询" />
	</form>
	<c:if test="${!empty emp1 }" >
	<table style="border: 1px solid black">
		<tr>
			<td>${emp1.empno }</td>
			<td>${emp1.ename }</td>
			<td>${emp1.job }</td>
			<td>${emp1.mgr }</td>
			<td>${emp1.hiredate }</td>
			<td>${emp1.sal }</td>
			<td>${emp1.comm }</td>
			<td>${emp1.deptno }</td>
		</tr>
	</table>
	</c:if>
	<hr />
	<form action="${pageContext.request.contextPath }/emp/findByName.do" method="post">
		<input type="text" name="ename" id="ename" value="何" />
		<input type="submit" value="模糊查询"/>
	</form>
	<c:if test="${!empty list }">
		<table style="border: 1px solid black">
			<tr align="center">
				<td>员工编号</td>
				<td>员工姓名</td>
				<td>员工职位</td>
				<td>领导编号</td>
				<td>入职日期</td>
				<td>员工工资</td>
				<td>员工奖金</td>
				<td>部门编号</td>
				<td>员工操作</td>
			</tr>
			<c:forEach items="${list }" var="emp1">
				<tr>
					<td>${emp1.empno }</td>
					<td>${emp1.ename }</td>
					<td>${emp1.job }</td>
					<td>${emp1.mgr }</td>
					<td>${emp1.hiredate }</td>
					<td>${emp1.sal }</td>
					<td>${emp1.comm }</td>
					<td>${emp1.deptno }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>