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
	<span>��ǰ�� : ${product.name }</span> <br/>
	<span>��ǰ ���� :<fmt:parseNumber value="${product.price }" integerOnly="true"/>��</span> <br/>
	<span>��ǰ ������ : ${product.size }</span> <br/>
	<span>��ǰ ���� : ${product.count }</span> <br/>
</body>
</html>