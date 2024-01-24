<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 리스트</h2>
	<hr>
	<c:forEach items="${memberlist }" var="member">
		회원번호 : ${member.membernum} /
		
</body>
</html>