<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="${pageContext.request.contextPath }/my/converter" method="post" >

    请输入商品信息 (格式为apple,58.12,45)
    <input type="text" name="goods"/> <br>
    <input type="submit" value="提交"/>

</form>