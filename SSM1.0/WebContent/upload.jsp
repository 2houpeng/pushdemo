<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Insert title here</title>
<meta charset="utf-8"/>
</head>
<body>
	<form action="${pageContext.request.contextPath }/upload/fileUpload.do" method="post" enctype="multipart/form-data">
		<input type="file" name="upload" id="upload" />
		<input type="submit" value="文件上传"/>
	</form>
</body>
</html>