<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Traditional//EN"
"html://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<mata http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>单文件上传</title>
</head>
<body>
<form action="${PageContext.request.contentPath  }/ch17/onefile" method="post"
    enctype="multipart/form-data">
    选择文件:<input type="file" name="file"/><br>
    文件描述:<input type="text" name="description"/><br>
   <input type="submit" value="提交"/>
</form>
</body>
</html>