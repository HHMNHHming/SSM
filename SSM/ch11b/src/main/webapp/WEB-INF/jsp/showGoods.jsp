<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
    您创建的商品信息如下：<br>
    <!-- 使用EL表达式取出model的goods的信息 -->
    商品名称为: ${goods.goodsName},
    商品价格为: ${goods.goodsPrice},
    商品数量为: ${goods.goodsNumber},
    商品日期为: ${goods.goodsDate},
</body>