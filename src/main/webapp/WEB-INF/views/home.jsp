<%@ page language="java" contentType="text/html; charset=UTF-8" language="java" session="false" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spittr</title></head>  
</head>
<body>
	
	<h1><s:message code="spitter.welcome" text="Welcome" /></h1>

    <s:url value="/spitter/register" var="registerUrl" />

    <a href="<s:url value="/spittles" />">Spittles</a> | 
    <a href="${registerUrl}">Register</a>
	
</body>
</html>