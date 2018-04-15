<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="springmvc/testPojo" method="post">
		username:<input type="text" name="username"/><br>
		password:<input type="password" name="password"/><br>
		email:<input type="text" name="email"/><br>
		province:<input type="text" name="address.province"/><br>
		city:<input type="text" name="address.city"/><br>
		<input type="submit" value="submit"/>
	</form>
	<br><br>
	
	<a href="springmvc/testHeader">Test Header</a>
	<br><br>
	
	<a href="springmvc/testRequestParam?username=programmer&age=11">Test RequestParam</a>
	<br><br>
	
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT" />
		<input type="submit" value="TestRest PUT"> 
	</form>
	<br><br>
	
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE" />
		<input type="submit" value="TestRest DELETE"> 
	</form>
	<br><br>
	
	<form action="springmvc/testRest" method="post">
		<input type="submit" value="TestRest POST"> 
	</form>
	<br><br>
	
	<a href="springmvc/testRest/1">Test Get</a>
	<br><br>
	
	<a href="springmvc/testPathVariable/101">Test PathVariable</a></br>
	<a href="springmvc/testAntPath/yayaya/abc">Test AntPath</a></br>
    <a href="springmvc/testParamsAndHeaders?username=programmer&age=10">Test ParamsAndHeaders</a>
	<form action="springmvc/testMethod" method="POST">
		<input type="submit" value="submit"/>
	</form>
	<a href="helloworld">Hello world</a></br>
	<a href="springmvc/testRequestMapping">Test RequestMapping</a>
</body>
</html>