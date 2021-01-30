<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checklogin</title>
</head>
<body>
<%
	String user = request.getParameter("username");  
	String pwd = request.getParameter("password");  
	out.print(user+"<br>");
	out.print(pwd+"<br>");
%>
<%
try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
  String url ="jdbc:mysql://localhost/bookshopdb?serverTimezone=GMT%2B8"; 
  Connection conn= DriverManager.getConnection(url,"root",""); 
  
  PreparedStatement pStmt = conn.prepareStatement("select * from user_table where user_name = '" + user + "'");
  ResultSet rs=pStmt.executeQuery();
  if(rs.next()){
	  if(pwd.equals(rs.getString(3) ) ){
		  session.setAttribute("username", user);
		  out.println("<script language='javascript'>alert('登录成功');window.location.href='Booklist.jsp';</script>");
	  }else{
		  out.println("<script language='javascript'>alert('用户名或密码错误');window.location.href='login.jsp';</script>");
	  }
	  
  }else{
	  out.println("<script language='javascript'>alert('用户名或密码错误');window.location.href='login.jsp';</script>");
		
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
</body>
</html>