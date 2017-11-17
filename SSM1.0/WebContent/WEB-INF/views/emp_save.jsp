<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>员工注册</title>
<meta charset="utf-8"/>
</head>
<body>
	<form action="${pageContext.request.contextPath }/emp/save.do" method="post">
		<table>
			<tr>
				<td>员工姓名：</td>
				<td><input type="text" name="ename" id="ename" value="小李" /></td>
			</tr>
			<tr>
				<td>员工职位：</td>
				<td><input type="text" name="job" id="job" value="mgr" /></td>
			</tr>
			<tr>
				<td>领导编号：</td>
				<td><input type="text" name="mgr" id="mgr" value="4" /></td>
			</tr>
			<tr>
				<td>入职日期：</td>
				<td><input type="date" name="hiredate" id="hiredate" value="2000-10-10" /></td>
			</tr>
			<tr>
				<td>员工工资：</td>
				<td><input type="number" name="sal" id="sal" value="2000.5" /></td>
			</tr>
			<tr>
				<td>员工奖金：</td>
				<td><input type="number" name="comm" id="comm" value="0.0" /></td>
			</tr>
			<tr>
				<td>部门编号：</td>
				<td>
					<select name="deptno">
						<option value="1" selected>1</option>
						<option value="2" >2</option>
						<option value="3" >3</option>
						<option value="4" >4</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="" id="" value="注册" /></td>
				<td><input type="reset" name="" id="" value="重置" /></td>
			</tr>
		</table>
		
	</form>
</body>
</html>