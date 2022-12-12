<%@ page contentType="text/html;charset=UTF-8" %>

<script language="javascript">

function on_submit()

{

  if(form1.username.value=="")

  {

     alert("用户名不能为空，请输入用户名！");

     form1.username.focus();

     return false;

  }

  if(form1.userpassword.value=="")

  {

     alert("用户确认密码不能为空，请输入密码！");

     form1.userpassword.focus;

     return false;

  }

  if(form1.userpassname.value !=form1.userpassword.value)

  {

     alert("密码与确认密码不同");

     form1.userpassword.focus;

     return false;

  }

  if(form1.email.value.length!=0)

  {

     for(i=0;i<form1.email.value.length;i++)

       if(form1.email.value.charAt(i)=="0")

          break;

     if(i==form1.email.value.length)

     {

       alert("非法Email地址！");

       form1.email.focus();

       return false;

     }

  }

  else

  {

    alert("请输入！Email");

    form1.email.focus();

    return false;

  }

}

</script>

<html>

<head>

<title>新用户注册</title>

</head>

<body>

<form method="post" action="servlet/accept" name="form1" onsubmit="return on_submit()">

  新用户注册<br>

  用户名(*):<input type="text" name="username" size="20"><br>

  密码(*):<input type="password" name="userpassword" size="20"><br>

  再输一次密码(*):<input type="password" name="reuserpassword" size="20"><br>

  性别:<input type="radio" value="男" checked name="sex">男<input type="radio" name="sex" value="女">女<br>

  出生年月:<input name="year" size="4" maxlength=4>年<select name="month">

     <option value="1" selected>1</option>

     <option value="2" selected>2</option>

     <option value="3" selected>3</option>

     <option value="4" selected>4</option>

     <option value="5" selected>5</option>

     <option value="6" selected>6</option>

     <option value="7" selected>7</option>

     <option value="8" selected>8</option>

     <option value="9" selected>9</option>

     <option value="10" selected>10</option>

     <option value="11" selected>11</option>

     <option value="12" selected>12</option>

     </select>月<input name="day" size="3" maxlength=4>日<br>

     电子邮箱(*):<input name="email" maxlength=28><br>

     家庭住址:<input type="text" name="address" size="20"><br>

     <input type="submit" value="提交" name="B1"><input type="reset" value="全部重写" name="B2"><br>

     </form>

     </body>

     </html>