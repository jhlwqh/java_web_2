<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
    <title>修改图书信息</title>
</head>
<body>
<c:import url="${pageContext.request.contextPath}/jsp/book/head.jsp"></c:import>
<form name="frmbook" method="post" action="${pageContext.request.contextPath}/bookEdit" >
<input type="hidden" name="id" value="${book.id}">
<table width="60%" border="1" align="center">
    <tr>
        <td width="20" align="right">图书名称</td>
        <td><input type="text" name="name" size="30" value="${book.name}"></td>
    </tr>
    <tr>
        <td align="right">出版社</td>
        <td><input type="text" name="publisher" size="30" value="${book.publisher}"></td>
    </tr>
    <tr>
        <td align="right">价格</td>
        <td><input type="text" name="price" value="${book.price}"></td>
    </tr>

    <tr>
        <td align="right">出版日期</td>
        <td><input type="text" name="publishDate"  value='<fmt:formatDate value="${book.publishDate}" pattern="yyyy-MM-dd"/>'>
        只支持"2018-12-10"格式
        </td>
    </tr>

    <tr>
        <td colspan="2">&nbsp;</td>
    </tr>

    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="保存">
        </td>
    </tr>
</table>
</form>
</body>
</html>
