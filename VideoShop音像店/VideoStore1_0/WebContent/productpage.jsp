<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.util.regex.*, com.videoStore.beanEntity.Product, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>音像店首页</title>
<link type="text/css" rel="stylesheet" href="CSS/productpage.css" />
<%
	String username=(String)session.getAttribute("username");
	Boolean islogin = (username == null);
	List<Product> l= (List<Product>)session.getAttribute("list");
%>

<script language="JavaScript">
function linkCustomer(){
	var u_name="<%=session.getAttribute("username")%>";
	if(u_name=="null"){
		window.event.returnValue=false;
	}else{
		window.event.returnValue=true;
	}
}	    
</script>
</head>
<%
  int intPageSize=4; //一页显示的记录数,此处初始化为4 
  int intRowCount=0; //记录总数 
  int intPageCount=0; //总页数 
  int intPage; //待显示页码
  String strPage; //待显示页码字符串
  int i;

      intRowCount=l.size();//获得总记录数
      intPageCount=(intRowCount+intPageSize-1)/intPageSize;//获得页数
    
    strPage=request.getParameter("page");  
    if(strPage==null) 
      intPage=1; 
    else{
      intPage=Integer.valueOf(strPage).intValue(); 
      if(intPage<1)intPage=1;
      if(intPage>intPageCount)intPage=intPageCount; 
    }
   /*  if(intPageCount>0)
      rs.absolute((intPage-1)*intPageSize+1);  */
%>
<body>
	<div class="sn-container">
		<p id="login-info" class="sn-login-info">
      		<% 	
      			if(islogin){
      				out.print("<em>欢迎来音像店&nbsp;&nbsp;</em>");
      				out.print("<a class=\"sn-login\" href=\"login/login.jsp\">登录</a>&nbsp;&nbsp;");
      		    	out.print("<a class=\"sn-register\" href=\"login/register.jsp\">注册</a>");
      			}else{
      				
      				out.print("<div id=\"welcome\">hi,"+username+"</div>");
      			}
      		%>	
		</p>
		<ul class="sn-quick-menu">
			<li class="sn-personal">
				<a class="sn-personal-link" href="customer/customermain.jsp?unm=" onClick="linkCustomer()">个人中心</a>
			</li>
			<li class="sn-seller">
				<a class="sn-seller-link" href="login/sellerlogin.jsp">商家中心</a>
			</li>
		</ul>
	</div>
	<div id="header">
		<form name="search-top" action="" class="mallSearch-form">
			<fieldset>
				<legend>天猫搜索</legend>
					<div class="s-combobox-input-wrap">
						<input type="text" name="q" value class="s-combobox-input" placeholder="搜索 名称/导演/主演">
					</div>
					
				<button type="submit">搜索</button>
			</fieldset>
		</form>	
	</div>
	<div id="content">
		<table class="body">
 <%
 	if(l == null || l.size() < 1){
		out.print("没有数据！");
	}else{
		// 遍历图书集合中的数据
		int currentPageRowCount=0;
		i=0;
		if(intPage==intPageCount){
			currentPageRowCount=intRowCount-intPageSize*(intPageCount-1);
		}else{
			currentPageRowCount=intPageSize;
		}
		
		//for(Product product : l){
		while(i < currentPageRowCount){
			Product product=l.get(i+(intPage-1)*intPageSize);
			
			out.print("<tr><td><a href=\""+request.getContextPath()+"/mmxiangqingAction?productnm="+product.getProductName()+"\"><img src=\""+product.getPicpath()+"\" alt=\"音像图片\" /></a></td>");
			out.print("<td class=\"pnm\">"+product.getProductName()+"</td>");
			out.print("<td><p class=\"price\">¥"+product.getPrice()+"</p>");
			out.print("<p class=\"sale\">¥"+product.getSale()+"</p>");
			out.print("<p><div class=\"place\">"+product.getPlace()+"</div></p></td></tr>");
			
			i++;
		}
		
    	
	}
%>   
</table>
	</div>
	<form action="productpage.jsp" method="get">
<%
  if(intPage>1){
    out.print("<a href=\"productpage.jsp?page=1\">[首页]</a> ");
    out.print("<a href=\"productpage.jsp?page="+(intPage-1)+"\">[前一页]</a> ");
  }
  if(intPage<intPageCount){
     out.print("<a href=\"productpage.jsp?page="+(intPage+1)+"\">[后一页]</a> ");
     out.print("<a href=\"productpage.jsp?page="+intPageCount+"\">[末页]</a> ");
  }
  out.print(" 转到第:<input type=\"number\" name=\"page\" size=2>页 ");
  out.print("<input type=\"submit\" value=\"go\">");
  out.print(" 第"+intPage+"页，共"+intPageCount+"页 "); 
%>
  </form>
	<div id="footer"></div>
</body>

</html>