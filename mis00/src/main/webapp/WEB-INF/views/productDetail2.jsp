<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<span>제품명 : ${product.name }</span> <br/>
	<span>제품 가격 :<fmt:parseNumber value="${product.price }" integerOnly="true"/>원</span> <br/>
	<span>제품 사이즈 : ${product.size }</span> <br/>
	<span>제품 수량 : ${product.count }</span> <br/>
</body>
</html>