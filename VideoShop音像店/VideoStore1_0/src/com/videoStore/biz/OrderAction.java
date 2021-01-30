package com.videoStore.biz;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.videoStore.beanEntity.Order;

public class OrderAction extends ActionSupport{
	private Boolean isSuc=false;
	private Map<String, Object> session;
	
	private Order order;
	public String add() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getParameter("username");
//		Date date = new Date();
//		String nowTime = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss").format(date);
//		Timestamp goodsC_date =Timestamp.valueOf(nowTime);
		
		ActionContext context = ActionContext.getContext();
		session=context.getSession();
		
		String username=(String)session.get("username");
		
		String pnm=request.getParameter("prdnm");
		int prdCnt = Integer.parseInt(request.getParameter("prdCnt"));
		float price = Float.parseFloat(request.getParameter("price"));
		float singleSum = price*(float)prdCnt;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		    String url ="jdbc:mysql://localhost/videostore_db?serverTimezone=GMT%2B8"; 
		    Connection conn= DriverManager.getConnection(url,"root",""); 
		    PreparedStatement pStmt1 = conn.prepareStatement("select memberid from member_t where membernm = '" + username+"'");
		    ResultSet rs=pStmt1.executeQuery();
		    PreparedStatement pStmt2 = conn.prepareStatement("select productid from product_t where productnm = '" + pnm+"'");
		    ResultSet rs2=pStmt2.executeQuery();
		    if(rs.next()&&rs2.next()){
		    	System.out.println("yes");
		    	int userid = rs.getInt(1);
		    	int pid=rs2.getInt(1);
		    	String sql = "insert into order_t (productid,memberid,gdate,price,count) values(?, ?, ?,?,?)";
		    	PreparedStatement pStmt3 = conn.prepareStatement(sql);
		    	pStmt2.setInt(1, pid);
		  	  	pStmt2.setInt(2, userid);
		  	  	pStmt2.setInt(5, prdCnt);
		  	  	pStmt2.setFloat(4, singleSum);
		  	  	long currentTimeMillis = System.currentTimeMillis();
		  	  	Timestamp timestamp = new Timestamp(currentTimeMillis);
				pStmt2.setTimestamp(3, timestamp);
		        int rst = pStmt3.executeUpdate();
		        pStmt3.close(); 
		        if (rst != 0){
		        	isSuc = true;
		        }else{
		        	isSuc=false;
		        }
		        
		    }else{
		    	isSuc=false;
			       
		    }
		    rs.close();
		    pStmt1.close();
		    conn.close();
		  }catch(ClassNotFoundException cnfe){
		  	System.out.print(cnfe);
		  }catch(SQLException sqle){
			  System.out.print(sqle);
		  }catch(Exception e){
			  System.out.print(e);
		  }finally {
			if(isSuc) {
				return "add";
			}else {
				return "failadd";
			}
		} 
		
	}
}
