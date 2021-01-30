package com.videoStore.biz;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.videoStore.beanEntity.Product;
public class mainPageAction extends ActionSupport {
	private Map<String, Object> session;
	//对此对象访问结束，此对象是否会被释放？ |此对象在程序中什么时候会被释放
	public mainPageAction() {
		// TODO Auto-generated constructor stub
		ActionContext context = ActionContext.getContext();
		session = (Map<String, Object>) context.getSession();
	}

	@Override
	public String execute() throws Exception {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		    String url ="jdbc:mysql://localhost/videostore_db?serverTimezone=GMT%2B8"; 
		    Connection conn= DriverManager.getConnection(url,"root",""); 
		    Statement stmt=conn.createStatement();
		    String sql="select * from product_t";
		    ResultSet rs=stmt.executeQuery(sql);
		    List<Product> productList=new ArrayList<Product>();
		    while(rs!=null && rs.next()){
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
		    	productList.add(product);
		    }
		   
		    session.put("list",productList);
		    rs.close();
		    stmt.close();
		    conn.close();
		  }catch(ClassNotFoundException cnfe){
		  	System.out.print(cnfe);
		  }catch(SQLException sqle){
			  System.out.print(sqle);
		  }catch(Exception e){
			  System.out.print(e);
		  }
		return SUCCESS;
	}
}
