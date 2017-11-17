<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<html>
<head>
<title>用户注册</title>
<meta charset="utf-8" />
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/register" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="login.username" id="username" value="haha" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="login.password" id="password" value="123456" /></td>
			</tr>
			<tr>
				<td>角色：</td>
				<td>
					<select name="login.priority">
						<option value="1" selected>1</option>
						<option value="2" >2</option>
						<option value="3" >3</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>真实姓名：</td>
				<td><input type="text" name="detail.realName" id="realname" value="张三" /></td>
			</tr>
			<tr>
				<td>出生日期：</td>
				<td><input type="date" name="detail.birthday" id="birthday" value="2000-12-12" /></td>
			</tr>
			<tr>
				<td>账户余额：</td>
				<td><input type="number" name="detail.balance" id="balance" value="2000" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="" id="" value="注册" /></td>
				<td><input type="reset" name="" id="" value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>