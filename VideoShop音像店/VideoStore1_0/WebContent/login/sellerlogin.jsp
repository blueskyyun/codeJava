<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link type="text/css" rel=stylesheet href="../CSS/login.css">
<script language = "JavaScript">
function $(elementId){
	  return document.getElementById(elementId).value;
	    }
	function divId(elementId){
	  return document.getElementById(elementId);
	    }

function checkUser(){
	  var user=$("user");
	  var userId=divId("user_prompt");
	   userId.innerHTML="";    
	  var reg=/^[a-zA-Z][a-zA-Z0-9]{3,15}$/;    
	    if(reg.test(user)==false){
	       userId.innerHTML="用户名不正确";
	    return false;
	      }
	      return true;
	    }
/*密码验证*/    
function checkPwd(){
  var pwd=$("pwd");
  var pwdId=divId("pwd_prompt");
   pwdId.innerHTML="";    
  var reg=/^[a-zA-Z0-9]{4,10}$/;    
    if(reg.test(pwd)==false){
       pwdId.innerHTML="密码不能含有非法字符，长度在4-10之间";
    return false;
      }
      return true;
    }

function validate(){
    var flag = checkUser()&&checkPwd();
    if(flag == false)
        return false;
    return true;
}
</script> 

</head>

<body>
<%
	String err=(String)request.getAttribute("errorinfo");
	Boolean isTrue = (err == null || "".equals(err));
%>
<p><% 
	if(isTrue){}else{out.println("<div>用户名或密码错误</div>");}
%></p>
<table class="main" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td class="hr_1">登录</td>
 </tr>
 <tr>
    <td style="height:10px;"></td>
  </tr>
  <form method="post" action="<%=request.getContextPath()%>/loginAction!checkSellerlogin" onsubmit = "return validate()">
   <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td class="left">用户名：</td>
    <td class="center"><input id="user" type="text" name="username" class="in" onblur="checkUser()" /></td>
    <td><div id="user_prompt">用户名由英文字母和数字组成的4-16位字符，以字母开头</div></td>
  </tr>
   <tr>
    <td class="left">密码：</td>
    <td class="center"><input id="pwd" type="password" name="password" class="in"  onblur="checkPwd()"/></td>
    <td><div id="pwd_prompt">密码由英文字母和数字组成的4-10位字符</div></td>
  </tr>
  <tr>
     <td class="left">&nbsp;</td>
     <td class="center">
	     <input class="in2" name="" type=submit value="提交" />
	     <input class="in2" name="" type=button value="返回"  onClick="window.location.href='../productpage.jsp'"/>
     </td>
     <td>&nbsp;</td>
   </tr>
</table>
</td>
  </tr>
  </form>
</table>

</body>
</html>