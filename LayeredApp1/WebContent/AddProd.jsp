<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: maroon; text-align: center;">Add Products</h1>
	<form action="prodServlet" name="AddProd" align="center">
		<br> Product Id: <input type="text" name="pid"> <br>
		Product Name <input type="text" name="name"> <br> Product
		Cost: <input type="text" name="cost"> <br> Mfg Date:<input
			type="date" name="mfgDate"> <br> <input type="submit"
			value="add" name="addProd">
	</form>
	
</body>
</html>
