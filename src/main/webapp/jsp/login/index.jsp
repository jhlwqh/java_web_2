<%--
  Created by IntelliJ IDEA.
  User: dapanghailan
  Date: 2018-12-06
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
</head>
<body>
<c:import url="${pageContext.request.contextPath}/jsp/book/head.jsp"></c:import>
<c:redirect url="/login/home"/>
</body>
</html>
