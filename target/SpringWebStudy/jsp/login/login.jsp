<%--
  Created by IntelliJ IDEA.
  User: dapanghailan
  Date: 2018-12-06
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form name="frmlogin" method="post" action="${pageContext.request.contextPath}/login/login">
    <table align="center" width="400" border="0">
        <tr>
            <td colspan="2" align="center" height="80">${message}</td>
        </tr>
        <tr>
            <td width="30%" align="right">账号</td>
            <td align="left"><input type="text" name="userLoginId"></td>
        </tr>
        <tr>
            <td align="right">密码</td>
            <td><input type="password" name="currentPassword"></td>
        </tr>
        <tr>
            <td align="center" colspan="2" height="20">
                <input type="submit" value="登陆">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
