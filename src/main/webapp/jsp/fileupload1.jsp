<%--
  Created by IntelliJ IDEA.
  User: dapanghailan
  Date: 2019-02-28
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>文件上传</title>
    <script>
        //判断是否填写上传人并已选择上传文件
        function check1() {
            var name = document.getElementById("name").value;
            var file = document.getElementById("file").value;
            if(name == ""){
                alert("填写上传人");
                return false;
            }
            if(file.length == 0 || file == ""){
                alert("请选择上传文件");
                return false;
            }
            document.frmupload.action="${pageContext.request.contextPath}/fileUpload1";
            document.frmupload.submit();
        }
    </script>
</head>
<body>
<form name="frmupload" action="" method="post" enctype="multipart/form-data">
     上传人:<input id="name" type="text" name="name"/><br/>
    请选择文件:<input id="file" type="file" name="uploadfile"/><br/>
    <input type="submit" value="基于commons-fileupload上传" onclick="check1()"/>
</form>
</body>
</html>
