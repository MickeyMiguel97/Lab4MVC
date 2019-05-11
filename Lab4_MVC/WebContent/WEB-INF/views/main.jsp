<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${message}</h1>
	<form:form  action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute="user">
	
		<label>Ingrese un nombre: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese una marca: </label>
		<form:input type="text" name="marca" path="marca"/><br>
		<form:errors path="marca" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese una descripcion: </label>
		<form:input type="text" name="descripcion" path="descripcion"/><br>
		<form:errors path="descripcion" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese una categoria: </label>
		<form:input type="text" name="categoria" path="categoria"/><br>
		<form:errors path="categoria" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ingrese un precio: </label>
		<form:input type="text" name="precio" path="precio"/><br>
		<form:errors path="precio" cssStyle="color:#E81505;"></form:errors><br>	
		
		<label>Ingrese una frecha de vencimiento: </label>
		<form:input type="text" name="fecha" path="fecha"/><br>
		<form:errors path="fecha" cssStyle="color:#E81505;"></form:errors><br>
		
		<input type="submit" value="Agregar producto">
	</form:form>

</body>
</html>