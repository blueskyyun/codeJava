package com.videoStore.biz;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.videoStore.beanEntity.Product;

public class xiangqingAction extends ActionSupport {

	
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		ActionContext context = ActionContext.getContext();
		String pnm=request.getParameter("productnm");
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		  String url ="jdbc:mysql://localhost/videostore_db?serverTimezone=GMT%2B8"; 
		  Connection conn= DriverManager.getConnection(url,"root",""); 
		  
		  PreparedStatement pStmt = conn.prepareStatement("select * from product_t where productnm = '" + pnm+"'");
		  ResultSet rs=pStmt.executeQuery();
		  if(rs.next()){
			  Product product = new Product();
		    	
		    	int pid = rs.getInt(1);
		    	String picPath = rs.getString("picpath");
		    	String productNm = rs.getString("productnm");
		    	float price = rs.getFloat("price");
		    	float sale = rs.getFloat("sale");
		    	String place=rs.getString("place");
		    	String director= rs.getString("director");
		    	String actor= rs.getString("actor");
		    	Date issuedate=rs.getDate("issuedate");
		    	String descrip=rs.getString("descrip");
		    	product.setActor(actor);
		    	product.setDescrip(descrip);
		    	product.setDirector(director);
		    	product.setIssueDate(issuedate);
		    	product.setPicpath(picPath);
		    	product.setPlace(place);
		    	product.setPrice(price);
		    	product.setProductName(productNm);
		    	product.setSale(sale);
		    	request.setAttribute("prd", product);
		  }
			
		  rs.close();
		  pStmt.close();
		  conn.close();
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe);
		}catch(SQLException sqle){
		  System.out.println(sqle);
		}catch(Exception e){
		  System.out.println(e);
		}
		// TODO Auto-generated method stub
		return SUCCESS;
	}
}
