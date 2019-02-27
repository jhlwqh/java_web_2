<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="userLogin" value="${sessionScope.get('USER_SESSION')}"/>
<form name="frmLogout" method="post">
    <table align="center" width="800" border="0" cellpadding="0" cellspacing="0" >
        <tr>
            <td width="20%" height="25" align="center">
                <a href="${pageContext.request.contextPath}/toBookList">图书管理</a>
            </td>
            <td height="25" align="right">
                <c:if test="${userLogin !=nll}" >
                    <c:out value="欢迎您:${userLogin.userLoginId}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="登出" onclick="logout()">
                </c:if>
            </td>
        </tr>
    </table>
</form>
<script language="JavaScript">
    function logout(){
        document.frmLogout.action="${pageContext.request.contextPath}/logout";
        document.frmLogout.submit();
    }
</script>