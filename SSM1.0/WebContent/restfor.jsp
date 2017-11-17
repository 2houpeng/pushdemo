<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<a href="${pageContext.request.contextPath }/rest/testRest/1">get</a>
    	
    	<form action="${pageContext.request.contextPath }/rest/testPost" method="post">
    		<input type="hidden" name="_method" value="PUT" >
    		<input type="text"  name="id" value="12">
    		<input type="submit" value="提交">
    	</form>
 	</body>
</html>