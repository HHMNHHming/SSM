<%@ page contentType="text/html;charset=UTF-8" %>

<html>

<head>

<title>新用户注册</title>

</head>

<body>

<form method="post" action="${pageContext.request.contextPath }/user/register" name="registForm" onsubmit="return on_submit()">
        <table border=1 bgcolor="lightblue" align="center">
            <tr>
                <td>姓名:</td>
                <td>
                    <input class="textSize" type="text" name="uname" value="${uname}" />
                </td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input class="textSize" type="password" maxlength="20" name="upass"/></td>
            </tr>
            <tr>
                <td>确认密码: </td>
                <td><input class="textSize" type="password" maxlength="20" name="reupass"/></td>
            </tr>
    <td colspan="2" align="center"><input  value="注册" type="submit"/></td>

        <table>
     </form>

     </body>

     </html>