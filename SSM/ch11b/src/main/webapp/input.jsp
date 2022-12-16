<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<form action="${pageContext.request.contextPath }/my/formatter" method="post" >
    请输入商品信息 (格式为apple,58.12,45,2000-04-14)<br>
    <input type="text" name="goodsName"/> <br>
    <input type="text" name="goodsPrice"/> <br>
    <input type="text" name="goodsNumber"/> <br>
    <input type="text" name="goodsDate"/> <br>
    <input type="submit" value="提交"/>
</form>