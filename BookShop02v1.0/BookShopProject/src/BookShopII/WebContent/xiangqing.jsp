<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, java.util.regex.*" %>
<!DOCTYPE html>
<html>
<head>
<h4><a href="Booklist.jsp">书籍主页</a></h4>
<link type="text/css" rel=stylesheet href="CSS/xiangqing.css">
<meta charset="UTF-8">
<% int bookid = Integer.parseInt( request.getParameter("bookid") ); %>
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
		 document.buyOrCart.action="processIntocart.jsp?bookid="+<%=bookid%>;
	     document.buyOrCart.submit();
	}
	else{
		alert("请先登录！！！");
		
	}
}
function btnBuy(){
	if(isLogin()){
		 document.buyOrCart.action="processBuy.jsp?bookid="+<%=bookid%>;
	     document.buyOrCart.submit();
	}
	else{
		alert("请先登录！！！");
	}
}
</script>
<%
	
	String bookpicPath="";
	String booknm ="";
	String bookprice = "";
	String bookWriter = "";
	String publisher = "";
	String genre = "";
	String abstrct = "";
try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
  String url ="jdbc:mysql://localhost/bookshopdb?serverTimezone=GMT%2B8"; 
  Connection conn= DriverManager.getConnection(url,"root",""); 
  
  PreparedStatement pStmt = conn.prepareStatement("select * from books where bookid = " + bookid);
  ResultSet rs=pStmt.executeQuery();
  if(rs.next()){
	bookpicPath = rs.getString(4);
  	booknm = rs.getString(2);
  	bookprice = rs.getString(3);
  	String bookotherinfo = rs.getString(5);
  	
  	//获取作家名字
  	String regex="writer.*p"; 
  	Pattern ptn = Pattern.compile(regex);
  	Matcher mtch = ptn.matcher(bookotherinfo);
  	
  	if(mtch.find()){
  		bookWriter=mtch.group();
  		bookWriter=bookWriter.substring(6, bookWriter.length()-1);
  	}
  	//获取书出版社
  	regex = "publisher.*genre";
  	ptn = Pattern.compile(regex);
  	mtch = ptn.matcher(bookotherinfo);
  	
  	if(mtch.find()){
  		publisher=mtch.group();
  		publisher=publisher.substring(9, publisher.length()-5);
  	}
  	//获取书体裁
  	regex = "genre.*abs";
  	ptn = Pattern.compile(regex);
  	mtch = ptn.matcher(bookotherinfo);
  	
  	if(mtch.find()){
  		genre=mtch.group();
  		genre=genre.substring(5, genre.length()-3);
  	}
  	//获取书简介
  	regex = "abstract.*";
  	ptn = Pattern.compile(regex);
  	mtch = ptn.matcher(bookotherinfo);
  	
  	if(mtch.find()){
  		abstrct=mtch.group();
  		abstrct=abstrct.substring(8, abstrct.length());
  	}
  }else{
	  out.println("<script language='javascript'>alert('无法获取该书本的详细信息');window.location.href='Booklist.jsp';</script>");
  }
  rs.close();
  pStmt.close();
  conn.close();
}catch(ClassNotFoundException cnfe){
	out.print(cnfe);
}catch(SQLException sqle){
  out.print(sqle);
}catch(Exception e){
  out.print(e);
}

%>
  	
<title><%=booknm%></title>
</head>
<body>

<form name="buyOrCart" method="post" action="">
<table class="bdy" width="800" height="70" border="0" align="center" cellpadding="0" cellspacing="0">
  
    <tr>
      <td width="50%" align="center" bgcolor="#FFFFFF"><img src="<%=bookpicPath%>"/></td>
      <td width="50%" bgcolor="#FFFFFF">
      	<table class="biref" border="0" >
      			<tr><td width="10%">&nbsp;</td><td class="bknm" width="80%"><%=booknm%></td><td width="10%">&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td class="info">作者：<%=bookWriter %></td><td>&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td  class="info">出版社：<%=publisher %></td><td>&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td class="info">体裁：<%=genre %></td><td>&nbsp;</td></tr>
      			<tr><td>&nbsp;</td><td class="price">￥<%=bookprice%></td><td>&nbsp;</td></tr>
      			<tr class="bkcnt"><td style= "font-family:宋体;font-size: 12pt;">数量</td><td><input class="cnt" type="number" name="bookCnt" min="1" max="100"></td><td>&nbsp;</td></tr>
      	</table>
      </td>
    </tr>
    <tr><td>&nbsp;</td>
    <td class="buyOCart">
    <input name="price" type="hidden" value="<%=bookprice%>" />
    <input id="intoCart" name="" type=button value="加入购物车" onClick="btnIntoCart()"/>&nbsp;
	<input id="buyNow" name="" type=button value="立即购买"  onClick="btnBuy()"/>
    </td></tr>
</table>
<hr/>
<div class="bookContent">书籍简介：<br><%=abstrct%></div>
</form>
</body>
</html>