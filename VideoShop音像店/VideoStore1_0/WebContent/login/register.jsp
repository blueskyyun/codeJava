<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
<h4><a href="../productpage.jsp">音像店主页</a></h4>
<link type="text/css" rel=stylesheet href="../CSS/login.css">

<script src="checkRegister.js">
</script>
<%
	String err=(String)request.getAttribute("errorinfo");
	Boolean isTrue = (err == null || "".equals(err));
%>

</head>

<body>
<p><% 
	if(isTrue){}else{out.println("<div>用户名或密码错误</div>");}
%></p>
<table class="main" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td class="hr_1">新用户注册</td>
 </tr>
 <tr>
    <td style="height:10px;"></td>
  </tr>
  <form method="post" action="<%=request.getContextPath()%>/loginAction!checkRegister" onsubmit = "return validate()">
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
    <td class="left">确认密码：</td>
    <td class="center"><input id="repwd" type="password" class="in"  onblur="checkRepwd()"/></td>
    <td><div id="repwd_prompt"></div></td>
  </tr>
  <tr>
      <td class="left">出生日期：</td>
      <td class="center">
      <script type="text/javascript" src="birthdate.js"></script>
		<select id="selYear" name="year"></select>年
		<select id="selMonth" name="month"></select>月
		<select id="selDay" name="day"></select>日
		<!--完成出生日期的选择--需写在</body>前-->
		<script type="text/javascript">
		var selYear = window.document.getElementById("selYear");
		var selMonth = window.document.getElementById("selMonth");
		var selDay = window.document.getElementById("selDay");
		// 新建一个DateSelector类的实例，将三个select对象传进去
		new DateSelector(selYear, selMonth, selDay, 1995, 1, 17);
		</script>
      </td>
      <td><div id="birthdate_prompt"></div></td>   
  </tr> 
     <tr>
      <td class="left">性别：</td>
      <td class="center"><input type="radio" name="sex" value="male">男<br>
		<input type="radio" name="sex" value="female">女</td>
      <td><div id="email_prompt"></div></td>   
  </tr>
  <tr>     
  	<td class="left">电话号码：</td>     
  	<td class="center"><input id="mobile" type="text" name="phoneno" class="in" onblur="checkMobile()" /></td>     
  	<td><div id="mobile_prompt"></div></td>   
  </tr>
  <tr>
    <td class="left">收货地址：</td>
    <td class="center"><input id="user" type="text" name="addr" class="in" onblur="checkUser()" /></td>
    <td><div id="user_prompt">省市区/镇/乡/村 详细地址（小区单元门牌号）</div></td>
  </tr>
  <tr>
     <td class="left">&nbsp;</td>
     <td class="center"><input class="in2" name="" type=submit value="提交" /></td>
     <td>&nbsp;</td>
   </tr>
</table>
</td>
  </tr>
  </form>
</table>
  
  
  

</body>
</html>