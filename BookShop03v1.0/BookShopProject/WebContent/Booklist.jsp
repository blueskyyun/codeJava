<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.regex.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookShop</title>
<h3>BookShop</h3>

<link type="text/css" rel=stylesheet href="Booklist.css">
</head>
<%
	
  try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
    String url ="jdbc:mysql://localhost/bookshopdb?serverTimezone=GMT%2B8"; 
    Connection conn= DriverManager.getConnection(url,"root",""); 
    Statement stmt=conn.createStatement();
%>
<body>
      <br>
<table class="body">
 <%
    String sql="select * from books";
    ResultSet rs=stmt.executeQuery(sql);
    while(rs!=null && rs.next()){
    	String bookpicPath = rs.getString(4);
    	int bookid = rs.getInt(1);
    	String booknm = rs.getString(2);
    	String bookprice = rs.getString(3);
    	String bookotherinfo = rs.getString(5);
    	out.print("<tr><td><a href=\"GoodsServlet?bookid="+bookid+"\"><img src=\""+bookpicPath+"\" alt=\"书籍图片\" /></a></td>");
   
    	//获取作家名字
    	String regex="writer.*p"; 
    	Pattern ptn = Pattern.compile(regex);
    	Matcher mtch = ptn.matcher(bookotherinfo);
    	String bookWriter = "";
    	if(mtch.find()){
    		bookWriter=mtch.group();
    		bookWriter=bookWriter.substring(6, bookWriter.length()-1);
    	}
    	//获取书出版社
    	regex = "publisher.*genre";
    	ptn = Pattern.compile(regex);
    	mtch = ptn.matcher(bookotherinfo);
    	String publisher = "";
    	if(mtch.find()){
    		publisher=mtch.group();
    		publisher=publisher.substring(9, publisher.length()-5);
    	}
    	//获取书体裁
    	regex = "genre.*abs";
    	ptn = Pattern.compile(regex);
    	mtch = ptn.matcher(bookotherinfo);
    	String genre = "";
    	if(mtch.find()){
    		genre=mtch.group();
    		genre=genre.substring(5, genre.length()-3);
    	}
    	//获取书简介
    	regex = "abstract.*";
    	ptn = Pattern.compile(regex);
    	mtch = ptn.matcher(bookotherinfo);
    	String abstrct = "";
    	if(mtch.find()){
    		abstrct=mtch.group();
    		abstrct=abstrct.substring(8, abstrct.length());
    	}
    	out.print("<td class=\"brief\"><table><tr><td>名称</td><td>&nbsp;"+booknm+"</td></tr>");
    	out.print("<tr><td>作者</td><td>&nbsp;"+bookWriter+"</td></tr>");
    	out.print("<tr><td>出版社</td><td>&nbsp;"+publisher+"</td></tr>");
    	out.print("<tr><td>书籍类型</td><td>&nbsp;"+genre+"</td></tr></table></td>");
    	out.print("<td class=\"abstract\">&nbsp;&nbsp;简介："+abstrct+"</td>");
    	out.print("<td class=\"price\" align=right style= \"font-family:宋体; color:red; font-size: 20pt; width:10%\">￥"+bookprice+"</td></tr>");
	  /* String departid = new String(rs.getString("departid").getBytes("iso-8859-1"),"gb2312");
      out.print("<tr><td>"+departid+"</td>");
	  String departname = new String(rs.getString("departname").getBytes("iso-8859-1"),"gb2312");
      out.print("<td>"+departname+"</td>");
	  String departaddress = new String(rs.getString("departaddress").getBytes("iso-8859-1"),"gb2312"); 
      out.print("<td>"+departaddress+"</td>");
      out.print("<td><a href=\"departform.jsp?action=2&departid="+
          departid+"\">修改</a></td>");
      out.print("<td><a href=\"departdelete.jsp?departid="+
          departid+"\">删除</a></td></tr>"); */
    }
%>   
</table>
</body>
<%
    rs.close();
    stmt.close();
    conn.close();
  }catch(ClassNotFoundException cnfe){
  	out.print(cnfe);
  }catch(SQLException sqle){
    out.print(sqle);
  }catch(Exception e){
    out.print(e);
  }
%>
</html>