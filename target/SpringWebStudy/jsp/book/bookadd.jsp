<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<c:import url="${pageContext.request.contextPath}/jsp/book/head.jsp"></c:import>
<form name="frmbook" method="post" action="${pageContext.request.contextPath}/bookAdd" >
    <table width="60%" border="1" align="center">
        <tr>
            <td width="20" align="right">图书名称</td>
            <td><input type="text" name="name" size="30">${nameerr}</td>
        </tr>
        <tr>
            <td align="right">出版社</td>
            <td><input type="text" name="publisher" size="30">${publishererr}</td>
        </tr>
        <tr>
            <td align="right">价格</td>
            <td><input type="text" name="price">${priceerr}</td>
        </tr>

        <tr>
            <td align="right">出版日期</td>
            <td><input type="text" name="publishDate" size="30" value="">只支持"2018-12-01格式"&nbsp;${publishDateerr}</td>
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
