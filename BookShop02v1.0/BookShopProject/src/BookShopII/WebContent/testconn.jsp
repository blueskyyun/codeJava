<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>数据库连接</title>
</head>
<body>
<%
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://localhost/bookshopdb?serverTimezone=GMT%2B8";
		Connection conn= DriverManager.getConnection(url, "root", "");
		if(conn != null)
			out.print("<h3>数据库连接成功，恭喜你</h3>");
		Statement stmt=conn.createStatement();
		String sql = "select user(), now()";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			out.print("当前数据库用户为："+rs.getString(1)+"<br>");
			out.print("当前时间为："+rs.getString(2)+"<br>");
		}
		rs.close();
		stmt.close();
		conn.close();
	}catch(Exception e){
		out.print(e);
	}
%>
</body>
</html>