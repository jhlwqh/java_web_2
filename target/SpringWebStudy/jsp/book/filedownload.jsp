<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<%@ page import="java.net.URLEncoder" %>
<html>
<head>
    <title>下载页面</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/download?filename=<%=URLEncoder.encode("1.docx","UTF-8")%>">
    中文名称下载
</a>

</body>
</html>
