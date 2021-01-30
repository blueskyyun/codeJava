<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookCart</title>
<h4>购物车<h4>
<link type="text/css" rel=stylesheet href="CSS/bookCart.css">
</head>
<body>
<table class="bookCartBody">
<% 
	
	String username=(String)session.getAttribute("username");
	  try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	    String url ="jdbc:mysql://localhost/bookshopdb?serverTimezone=GMT%2B8"; 
	    Connection conn= DriverManager.getConnection(url,"root",""); 
	    String sql_userid="select user_id from user_table where user_name = '" + username+"'";
	    String sql_cart_bookid = "select books.bookid,books.bookname,books.price,bookpic_loc,bkcount from books, bookcart where books.bookid=bookcart.bookid and bookcart.userid=("+sql_userid+")";
	    PreparedStatement pStmt1 = conn.prepareStatement(sql_cart_bookid);
	    ResultSet rs=pStmt1.executeQuery();
	    while(rs!=null && rs.next()){
	    	int bookid = rs.getInt(1);
	    	String booknm = rs.getString(2);
	    	String bookprice = rs.getString(3);
	    	String bookpicPath = rs.getString(4);
	    	int bookCnt = rs.getInt(5);
	    	out.print("<tr><td class=\"pic\"><a href=\"xiangqing.jsp?bookid="+bookid+"\"><img src=\""+bookpicPath+"\" alt=\"书籍图片\" /></a></td>");
	    	out.print("<td class=\"brief\"><table class=\"II\"><tr class=\"bookname\"><td>&nbsp;"+booknm+"</td></tr>");
	    	out.print("<tr class=\"cnt\"><td>&nbsp;"+bookCnt+"本</td></tr></table></td>");
	    	out.print("<td class=\"price\">单价￥"+bookprice+"</td></tr>");
	    }	
	    rs.close();
	    pStmt1.close();
	    conn.close();
	  }catch(ClassNotFoundException cnfe){
	  	out.print(cnfe);
	  }catch(SQLException sqle){
	    out.print(sqle);
	  }catch(Exception e){
	    out.print(e);
	  }  
%>
</table>
</body>
</html>