<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.videoStore.beanEntity.Product, java.text.SimpleDateFormat, java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<link type="text/css" rel=stylesheet href="../CSS/xiangqing.css">
<% Product product = (Product)request.getAttribute("prd"); %>
<title><%=product.getProductName()%>详情页</title>
<script language="JavaScript">
function isLogin(){
	var u_name="<%=session.getAttribute("username")%>";
	if(u_name=="null"){
		return false;
	}else{
		return true;
	}
}
function btnIntoCart(){
	if(isLogin()){
		 document.buyOrCart.action="processIntocart.jsp?prdnm="+<%=product.getProductName()%>;
	     document.buyOrCart.submit();
	}
	else{
		alert("请先登录！！！");
		
	}
}
function btnBuy(){
	if(isLogin()){
		 document.buyOrCart.action="processBuy.jsp?prdnm="+<%=product.getProductName()%>;
	     document.buyOrCart.submit();
	}
	else{
		alert("请先登录！！！");
	}
}
</script>
</head>
<body>

<form name="buyOrCart" method="post" action="">
<table class="bdy" width="800" height="70" border="0" align="center" cellpadding="0" cellspacing="0">
  
    <tr>
      <td width="40%" align="center" bgcolor="#FFFFFF"><img src="<%=product.getPicpath()%>"/></td>
      <td width="50%" bgcolor="#FFFFFF">
      	<table class="biref" border="0" >
      			<tr><td width="10%">&nbsp;</td><td class="prdnm" width="80%"><%=product.getProductName()%></td><td width="10%">&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td class="actor">主演：<%=product.getActor() %></td><td>&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td class="place">出产：<%=product.getPlace() %></td><td>&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td  class="price">价格：￥<div><%=product.getPrice() %></div></td><td>&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td class="sale">促销价：<div>￥<%=product.getSale() %></div></td><td>&nbsp;</td></tr>
      			<tr class="bkcnt"><td style= "font-family:宋体;font-size: 12pt;">数量</td><td><input class="cnt" type="number" name="prdCnt" min="1" max="10"></td><td>&nbsp;</td></tr>
      	</table>
      </td>
    </tr>
    <tr><td>&nbsp;</td>
    <td class="buyOCart">
    <input name="price" type="hidden" value="<%=product.getSale()%>" />
    <input id="intoCart" name="" type=button value="加入购物车" onClick="btnIntoCart()"/>&nbsp;
	<input id="buyNow" name="" type=button value="立即购买"  onClick="btnBuy()"/>
    </td></tr>
</table>
</form>
<hr/>
<div class="prdContent">
<p>导演：<%=product.getDirector() %></p>
<% 
SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
String dateStr=sdf.format(product.getIssueDate());
%>

<p>发行日期：<%=dateStr %></p>

简介：<br><%=product.getDescrip()%></div>
</body>
</html>