<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Display all profiles</h1>
	<!--  
	taglib is used when JSP wants to use some 3rd part tag libraries
	uri will give the location of the tag library and prefix is an alias for the location
	 -->
	<%@taglib uri = "jakarta.tags.core" prefix = "c" %>
	
	<c:forEach var="p" items="${profiles}">
		<p>Hello ${p.name}, your id is ${p.profileId}, dob is ${p.dob}</p>
	</c:forEach>
	
</body>
</html>