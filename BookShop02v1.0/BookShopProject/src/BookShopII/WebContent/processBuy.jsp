<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<% 
	int bookid = Integer.parseInt(request.getParameter("bookid"));
	String username=(String)session.getAttribute("username");
	int bookCnt = Integer.parseInt(request.getParameter("bookCnt"));
	float price = Float.parseFloat(request.getParameter("price"));
	float singleSum = price*(float)bookCnt;
	  try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
	    String url ="jdbc:mysql://localhost/bookshopdb?serverTimezone=GMT%2B8"; 
	    Connection conn= DriverManager.getConnection(url,"root",""); 
	    PreparedStatement pStmt1 = conn.prepareStatement("select user_id from user_table where user_name = '" + username+"'");
	    ResultSet rs=pStmt1.executeQuery();
	    if(rs.next()){
	    	int userid = rs.getInt(1);
	    	String sql = "insert into orders (userid,bookid,count,singlesum,od_time) values(?, ?, ?,?,?)";
	    	PreparedStatement pStmt2 = conn.prepareStatement(sql);
	    	pStmt2.setInt(1, userid);
	  	  	pStmt2.setInt(2, bookid);
	  	  	pStmt2.setInt(3, bookCnt);
	  	  	pStmt2.setFloat(4, singleSum);
	  	  	long currentTimeMillis = System.currentTimeMillis();
	  	  	Timestamp timestamp = new Timestamp(currentTimeMillis);
			pStmt2.setTimestamp(5, timestamp);
	        int rst = pStmt2.executeUpdate();
	        pStmt2.close(); 
	        if (rst != 0){
	        	out.println("<script language='javascript'>alert('购买成功！');window.location.href='Booklist.jsp';</script>"); 
	        }else{
	        	out.println("<script language='javascript'>alert('购买失败！');window.location.href='Booklist.jsp';</script>"); 
	        }
	        
	    }else{
	    	out.println("<script language='javascript'>alert('购买失败！');window.location.href='Booklist.jsp';</script>"); 
		       
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
</body>
</html>