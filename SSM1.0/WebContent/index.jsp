<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

	<head>
		<title>测试</title>
		<meta charset="utf-8"/>
	</head>

	<body>
		<form action="${pageContext.request.contextPath }/user/login" method="post">
			<table>
				<tr>
					<td>username:</td>
					<td><input type="text" name="username" id="username" value="root" /></td>
				</tr>
				<tr>
					<td>password:</td>
					<td><input type="password" name="password" id="password" value="root" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录" /></td>
					<td><a href="${pageContext.request.contextPath }/router/userRegister">注册</a></td>
				</tr>
			</table>
		</form>
	</body>

</html>