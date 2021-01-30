<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkRegister</title>
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
	  out.println("<script language='javascript'>alert('该用户已存在，请重新注册！');window.location.href='register.jsp';</script>");
  }else{
	  Statement stmt=conn.createStatement();
	  String sql="select count(*) from user_table";
	  ResultSet rsCnt=stmt.executeQuery(sql);
	  int lastUserId = -1;
	  if(rsCnt.next()){
		  lastUserId=rsCnt.getInt(1);
	  }
	  rsCnt.close();
	  stmt.close();
	  
	  lastUserId++;
	  sql = "insert into user_table values(?, ?, ?)";
	  PreparedStatement tmt = conn.prepareStatement(sql);
	  tmt.setInt(1, lastUserId);
	  tmt.setString(2, user);
	  tmt.setString(3, pwd);
      int rst = tmt.executeUpdate();
      if (rst != 0){
            out.println("<script language='javascript'>alert('用户注册成功！');window.location.href='Booklist.jsp';</script>");  
      }else{
         out.println("<script language='javascript'>alert('用户注册失败！');window.location.href='register.jsp';</script>");  
      }
      tmt.close();
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