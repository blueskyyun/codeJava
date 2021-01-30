package com.videoStore.biz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.videoStore.beanEntity.Member;
import com.videoStore.beanEntity.Product;

public class loginllAction extends ActionSupport {
	private Member member;
	private Map<String, Object> session;

	/*
	 * private HttpServletRequest request;
	 * 
	 * public HttpServletRequest getRequest() { return request; }
	 */

	private boolean isErr=false;
	public String checklogin() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext context = ActionContext.getContext();
		session=context.getSession();
		String usernm=request.getParameter("username");
		String pwd=request.getParameter("password");
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		    String url ="jdbc:mysql://localhost/videostore_db?serverTimezone=GMT%2B8"; 
		    Connection conn= DriverManager.getConnection(url,"root",""); 
		    PreparedStatement pStmt = conn.prepareStatement("select * from member_t where membernm = '" + usernm + "'");
		    ResultSet rs=pStmt.executeQuery();
		    if(rs.next()){
		  	  if(pwd.equals(rs.getString("password") ) ){
		  		  request.setAttribute("errinfo", "");
		  		 isErr=false;
		  	  }else{
		  		 request.setAttribute("errinfo", "用户名或密码错误");
		  		  
		  		isErr=true;
		  	  }
		  	  
		    }else{
		    	 request.setAttribute("errinfo", "用户名或密码错误");  
		  		isErr=true;
		    }
		    rs.close();
		    pStmt.close();
		    conn.close(); 
		  }catch(ClassNotFoundException cnfe){
		  	System.out.print(cnfe);
		  }catch(SQLException sqle){
			  System.out.print(sqle);
		  }catch(Exception e){
			  System.out.print(e);
		  }finally {
			if(isErr) {
				return "faillogin";
			} else {
				session.put("username", usernm);
				return "update";
			}
		}
		
		
	}
	
	public String checkSellerlogin() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		String usernm=request.getParameter("username");
		String pwd=request.getParameter("password");
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		    String url ="jdbc:mysql://localhost/videostore_db?serverTimezone=GMT%2B8"; 
		    Connection conn= DriverManager.getConnection(url,"root",""); 
		    PreparedStatement pStmt = conn.prepareStatement("select * from staff_t where staffnm = '" + usernm + "'");
		    ResultSet rs=pStmt.executeQuery();
		    if(rs.next()){
		  	  if(pwd.equals(rs.getString("password") ) ){
		  		  request.setAttribute("errinfo", "");
		  		 isErr=false;
		  	  }else{
		  		 request.setAttribute("errinfo", "用户名或密码错误");
		  		  
		  		isErr=true;
		  	  }
		  	  
		    }else{
		    	 request.setAttribute("errinfo", "用户名或密码错误");  
		  		isErr=true;
		    }
		    rs.close();
		    pStmt.close();
		    conn.close(); 
		  }catch(ClassNotFoundException cnfe){
		  	System.out.print(cnfe);
		  }catch(SQLException sqle){
			  System.out.print(sqle);
		  }catch(Exception e){
			  System.out.print(e);
		  }finally {
			if(isErr) {
				return "failsellerlogin";
			} else {
				return "login";
			}
		}
		
		
	}
	/**
	 * checkRegister
	 * @return
	 * @throws Exception
	 */
	public String checkRegister() throws Exception{
		 HttpServletRequest request = ServletActionContext.getRequest();
		 String nm=request.getParameter("username");
		 String phone=request.getParameter("phoneno");
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		  String url ="jdbc:mysql://localhost/videostore_db?serverTimezone=GMT%2B8"; 
		  Connection conn= DriverManager.getConnection(url,"root",""); 
		  
		  PreparedStatement pStmt = conn.prepareStatement("select * from member_t where membernm = '" + nm + "' or phoneno = '"+phone+"'");
		  ResultSet rs=pStmt.executeQuery();
		  if(rs.next()){
			 isErr=true;
		  }else{
			  String pwd=request.getParameter("password");
			  int y = Integer.parseInt(request.getParameter("year"));
			  int m=Integer.parseInt(request.getParameter("month"));
			  int d=Integer.parseInt(request.getParameter("day"));
			  String sex=request.getParameter("sex");
			  String addr=request.getParameter("addr"); 
			  Date birthdate= new Date(y-1900, m-1, d);
			  String sql = "insert into member_t (membernm, password, birthdate, sex, phoneno) values(?, ?, ?, ?, ?)";
			  PreparedStatement tmt = conn.prepareStatement(sql);
			  tmt.setString(1, nm);
			  tmt.setString(2, pwd);
			  tmt.setDate(3, birthdate);
			  tmt.setString(4, sex);
			  tmt.setString(5, phone);
		      int rst = tmt.executeUpdate();
		      if (rst != 0){
		            isErr=false;
		            		
		      }else{
		        isErr=true;     
		      }
		      tmt.close();
		  }
		  rs.close();
		  pStmt.close();
		  conn.close();

		}catch(ClassNotFoundException cnfe){
			System.out.print(cnfe);
		}catch(SQLException sqle){
		  System.out.print(sqle);
		}catch(Exception e){
		  System.out.print(e);
		}finally {
			if(isErr) {
				return "failreg";
			}else {
				return "add";
			}
		}
	}
	
	/*
	 * public void setServletRequest(HttpServletRequest request) {
	 * 
	 * //1、得到request对象 this.request=request;
	 * 
	 * }
	 */

}
