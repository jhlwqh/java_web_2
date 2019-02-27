<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
<c:import url="${pageContext.request.contextPath}/jsp/book/head.jsp"></c:import>
<form name="frmbook" method="post" action="">
    <table width="60%" border="0" align="center">
        <tr>
            <td align="left">
                图书列表&nbsp;&nbsp;&nbsp;
                <input type="button" name="btnadd" value="添加" onclick="bookadd()">
                <input type="button" name="btnedit" value="修改" onclick="bookedit()">
                <input type="button" name="btndelete" value="删除" onclick="bookdelete()">
            </td>
        </tr>
    </table>
    <table width="60%" border="1" align="center">
        <tr>
            <td width="10" align="center">选择</td>
            <td width="40" align="left">图书名称</td>
            <td width="30" align="left">出版社</td>
            <td width="20" align="right">价格</td>
        </tr>
        <c:forEach var="book" items="${booklist}">
            <tr>
                <td align="center">
                    <input type="radio" name="id" value="${book.id}">
                </td>
                <td>${book.name}</td>
                <td>${book.publisher}</td>
                <td align="right">${book.price}</td>
            </tr>
        </c:forEach>
    </table>
</form>
<script language="JavaScript">
    function bookdelete() {
        var id=document.getElementsByName("id");
        var isSelected = false;
        for(i=0;i<id.length;i++){
            if(id[i].checked){
                isSelected = true;
            }
        }
        if(isSelected){
            if(confirm("确认选择该用户吗？")){
                document.frmbook.action="${pageContext.request.contextPath}/toBookDelete";
                document.frmbook.submit();
            }
        }
    }
    function bookadd() {
        document.location.replace("${pageContext.request.contextPath}/toBookAdd");
    }
    function bookedit() {
        document.frmbook.action="${pageContext.request.contextPath}/toBookEdit";
        document.frmbook.submit();
    }

</script>
</body>
</html>
