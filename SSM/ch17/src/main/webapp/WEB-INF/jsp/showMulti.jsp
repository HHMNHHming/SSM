<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- Taglib 指令是定义一个标签库以及其自定义标签的前缀 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Traditional//EN"
"html://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传的文件</title>
</head>
<body>
       <table>
            <tr>
                <td>详情</td><td>文件名</td>
            </tr>
            <c:forEach items="${multiFileDomain.description }" var="description" varStatus="loop">
                <tr>
                    <td>des:${description}</td>
                    <td>${multiFileDomain.files[loop.count-1].originalFilename}</td>
                </tr>
                        <!-- ${multiFileDomain.files[0].originalFilename} -->
                        <!--${multiFileDomain.files[1].originalFilename} -->
                        <!--${multiFileDomain.files[2].originalFilename} -->
            </c:forEach>
       </table>
</body>
</html>