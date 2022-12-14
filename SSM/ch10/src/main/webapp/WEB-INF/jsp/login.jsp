<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>

  <head>

    <title>登录页面</title>

  </head>

  <body>

    <form action="${pageContext.request.contextPath }/user/login" method="post" name=form >

    <table>
        <tr>
            <td colspan="2"> <img src="${pageContext.request.contextPath }/images/login.gif"> </td>
        <tr>

        <tr>
             <td>账号: </td>
             <td><input type="text" name="uname" class="textSize"></td>
        </tr>
        <tr>
            <td>密码: </td>
            <td><input type="password" name="upass" class="textSize"></td>
        </tr>

        <tr>
            <td colspan="2">
<input type="image" src="${pageContext.request.contextPath }/images/ok.gif" onclick="gogo()">
<input type="image" src="${pageContext.request.contextPath }/images/cancel.gif" onclick="cancel()">
            </td>
        </tr>

    </table>
    ${messageError}
    </form>

  </body>

</html>