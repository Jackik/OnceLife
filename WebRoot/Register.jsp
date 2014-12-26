<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎注册oncelife</title>
</head>
<body>
<form action="./personAccount/addPersonAccount">
<table align="center">
<tr>
<td>
邮箱：
</td>
<td>
<input type="text" name="personAccount.email"/>请输入注册邮箱
</td>
</tr>
<tr>
<td>
密码：
</td>
<td>
<input type="password" name="personAccount.password"/>
</td>
</tr>
<tr>
<td>
确认密码：
</td>
<td>
<input type="password" name="repassword"/>
</td>
</tr>
<tr>
<td>
用户名：
</td>
<td>
<input type="text" name="personAccount.userName"/>
</td>
</tr>
<tr>
<td>
密保手机：
</td>
<td>
<input type="text" name="personAccount.phoneNum"/>
</td>
</tr>
<tr>
<td>
&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" name="login" value="登录" onclick=""/>
</td>
<td>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" name="login" value="注册" onclick=""/>
</td>
</tr>
</table>


</form>
</body>
</html>