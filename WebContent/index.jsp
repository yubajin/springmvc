<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <a href="springmvc/testParamsAndHeaders?username=programmer&age=10">Test ParamsAndHeaders</a>
	<form action="springmvc/testMethod" method="POST">
		<input type="submit" value="submit"/>
	</form>
	<a href="helloworld">Hello world</a></br>
	<a href="springmvc/testRequestMapping">TestRequestMapping</a>
</body>
</html>