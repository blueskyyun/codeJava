<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.BookBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
 <%
   BookBean book=(BookBean)request.getAttribute("book");
   if(book!=null){
	   out.println("<p>您选择的书籍是"+book.getBookname()+"<br>"); 
	   out.println("价格是"+book.getPrice()+"元</p>");
	  
   }
   %>
</body>
</html>