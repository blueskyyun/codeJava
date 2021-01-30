package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import beans.BookBean;

public class GoodsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookid=req.getParameter("bookid");
		int bookID = Integer.parseInt(bookid);
		String queryStr="select * from books where bookid="+bookID;
		   Connection conn=null;
		   PreparedStatement pstmt=null;
		   ResultSet rs=null;
		   try{
		   conn=getConnection();
		   pstmt=conn.prepareStatement(queryStr);
		   rs=pstmt.executeQuery();
		   BookBean book = new BookBean();
			   if(rs!=null && rs.next()){
				   
				   book.setBookid(rs.getInt("bookid"));
				   book.setBookname(rs.getString("bookname"));
				   book.setPrice(rs.getFloat("price"));
				   book.setBookpic_loc(rs.getString("bookpic_loc"));
				   book.setBookotherinfo(rs.getString("bookotherinfo"));
				   book.setAmount(rs.getInt("amount"));
				  
				   
			   }
			   req.setAttribute("book", book);
		   }catch(SQLException e){
			   e.printStackTrace();
		   }finally{
			 closeResultSet(rs);
	         closePstmt(pstmt);
	         closeConnection(conn);
		   }
			req.getRequestDispatcher("showInfo.jsp").forward(req, resp);
		
		   
	
	}
	public Connection getConnection() {
		   Connection connection=null;
		   String driver="com.mysql.jdbc.Driver";//默认驱动程序为jdbc驱动；
	   String jdbcurl="jdbc:mysql://localhost/bookshopdb?serverTimezone=GMT%2B8";//jdbcurl
	   try{
		     Class.forName(driver);//注册驱动程序;	   
		     connection=DriverManager.getConnection(jdbcurl,"root","");//建立连接；   
			   }catch(ClassNotFoundException e1){
				   e1.printStackTrace();
			   }catch(SQLException e2){
				   e2.printStackTrace();
			   }		
		   return connection;
	}   
	public void closeConnection(Connection connection){//关闭连接；
		   try{
			   if(connection!=null)
				   connection.close();
			   connection=null;
		   }catch(SQLException e3){
			   e3.printStackTrace();
		   }
	}
	public void closePstmt(PreparedStatement pstmt){//关闭执行语句；
		   try{
			   if(pstmt!=null)
				   pstmt.close();
			   pstmt=null;
		   }catch(SQLException e){
			   e.printStackTrace();
		   }
	}
	public void closeResultSet(ResultSet rs){//关闭结果集语句；
		   try{
			   if(rs!=null)
				   rs.close();
			   rs=null;
		   }catch(SQLException e){
			   e.printStackTrace();
		   }
	}

}
