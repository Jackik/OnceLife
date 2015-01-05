<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>欢迎注册oncelife</title>
<script type="text/javascript">

function gotoLogin(){
	window.location.href='login.jsp';	
}
function checkEmail() {
	var mail=document.getElementById("email").value;
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	var xmlhttp;
	if (filter.test(mail)){
		//document.getElementById("div_email").innerHTML="邮箱格式正确";
		if (window.XMLHttpRequest)
		  {// code for IE7+, Firefox, Chrome, Opera, Safari
		  xmlhttp=new XMLHttpRequest();
		  }
		else
		  {// code for IE6, IE5
		  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		  }
		xmlhttp.onreadystatechange=function()
		  {
		  if (xmlhttp.readyState==4 && xmlhttp.status==200)
		    {
		    document.getElementById("div_email").innerHTML=xmlhttp.responseText;
		    }
		  }
		xmlhttp.open("GET","./person/checkEmailReg",true);
		xmlhttp.send();
		//document.getElementById("div_email").innerHTML=${message};
		}
	}
	else {
		 document.getElementById("div_email").innerHTML="邮箱格式不正确";
	 }
	
	
	}
function checkPhone(){
	var phoneNum = document.getElementById("phoneNum").value;
	var filter_phone=/^1[3|4|5|8][0-9]\d{4,8}$/;
	if(filter_phone.test(phoneNum)){
		document.getElementById("div_phone").innerHTML="手机号格式正确";
	}else{
		document.getElementById("div_phone").innerHTML="手机号格式不正确";
	}
}
function checkPwd(){
	var pwd=document.getElementById("password").value;
	var pwd2=document.getElementById("password2").value;
	if(pwd==pwd2){
		document.getElementById("div_pwd").innerHTML="密码一致，请继续";
	}else{
		document.getElementById("div_pwd").innerHTML="密码不一致，请确认后，重新输入";
	}
}
function CheckMail1() {
	var mail=document.getElementById("email").value;
	
	var password=document.getElementById("password").value;
	var password2=document.getElementById("password2").value;
	
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (filter.test(mail)&&filter_phone.test(phoneNum)&&(password==password2)){
		return true;
	}
	 else {
	 alert('您的电子邮件格式不正确或者手机号格式不正确');
	 return false;
	 }
	}
</script>
</head>
<body>
${message};
<form action="./person/addPersonAccount" onSubmit="return CheckMail()">
<table align="center">
<tr>
<td>
邮箱：
</td>
<td>
<input type="text" id="email" name="personAccount.email" onblur="checkEmail()"/>
</td>
<td><div id="div_email"></div></td>
</tr>
<tr>
<td>
密码：
</td>
<td>
<input type="password" id="password" name="personAccount.password"/>
</td>
</tr>
<tr>
<td>
确认密码：
</td>
<td>
<input type="password" id="password2" name="password2" onblur="checkPwd()"/>
</td>
<td><div id="div_pwd"></div></td>
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
<input type="text" id="phoneNum" name="personAccount.phoneNum" onblur="checkPhone()"/>
</td>
<td><div id="div_phone"></div></td>
</tr>
<tr>
<td>
&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" name="login" value="登录" onclick="gotoLogin()"/>
</td>
<td>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" name="submit" value="注册" onclick=""/>
</td>
</tr>
</table>


</form>
</body>
</html>