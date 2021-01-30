<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>发表评论</title>
<h4><a href="Booklist.jsp">返回书籍主页</a></h4>
<link rel="stylesheet" href="CSS/style.css">
<script language="javascript">
function addElement() {
	//创建TextNode节点
	var person = document.createTextNode(form1.person.value);
	var content = document.createTextNode(form1.content.value);	
	//创建td类型的Element节点
	var td_person = document.createElement("td"); 
	var td_content = document.createElement("td");	
	var tr = document.createElement("tr"); //创建一个tr类型的Element节点
	var tbody = document.createElement("tbody"); //创建一个tbody类型的Element节点
	//将TextNode节点加入到td类型的节点中
	td_person.appendChild(person);
	td_content.appendChild(content);	
	//将td类型的节点添加到tr节点中
	tr.appendChild(td_person);
	tr.appendChild(td_content);	
	tbody.appendChild(tr); //将tr节点加入tbody中
	var tComment = document.getElementById("comment"); //获取table对象
	tComment.appendChild(tbody); //将节点tbody加入节点尾部
	form1.person.value="";	//清空评论人文本框
	form1.content.value="";		//清空评论内容文本框
}
//删除第一条评论
function deleteFirstE(){
	var tComment = document.getElementById("comment"); //获取table对象
	if(tComment.rows.length>1){
		tComment.deleteRow(1);		//删除表格的第二行，即第一条评论，
	}
}
//删除最后一条评论
function deleteLastE(){
	var tComment = document.getElementById("comment"); //获取table对象
	if(tComment.rows.length>1){
		tComment.deleteRow(tComment.rows.length-1);	//删除表格的最后一行，即最后一条评论
	}
}
</script>
</head>
<body>
<!-- 标题栏 -->
<table width="600" height="70" border="0" align="center" cellpadding="0" cellspacing="0" bordercolorlight="#FF9933" bordercolordark="#FFFFFF" bgcolor="#666666">
  <thead>
    <tr>
      <td width="8%" align="center" bgcolor="#FFFFFF"><img src="picture/head.jpg" width="46" height="49"></td>
      <td width="92%" align="left" bgcolor="#FFFFFF">书籍内容怎么样呢？在这里评论吧.....</td>
    </tr>
  </thead>
</table>
<br>
<!-- 表头栏 -->
<table width="600" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bordercolorlight="#666666" bordercolordark="#FFFFFF" id="comment">
  <tr>
	<td width="18%" height="27" align="center" bgcolor="#E5BB93">评论人</td>
	<td width="82%" align="center" bgcolor="#E5BB93">评论内容</td>
  </tr>
</table>
<!-- 评论发布区 -->
<form name="form1" method="post" action="">
	<table width="600" height="122" border="0" align="center" cellpadding="0" cellspacing="0">
	<tr>
      <td width="119" height="14">&nbsp;</td>
      <td width="481">&nbsp;</td>
    </tr>
    <tr>
      <td height="27" align="center">评 论 人：</td>
      <td>
        <input name="person" type="text" id="person" size="40">
      </td>
    </tr>
    <tr>
      <td align="center">评论内容：</td>
      <td><textarea name="content" cols="60" rows="6" id="content"></textarea></td>
    </tr>
    <tr>
      <td height="40">&nbsp;</td>
      <td><input name="Button" type="button" class="btn_grey" value="发表" onClick="addElement()">
      &nbsp;
      <input name="Reset" type="reset" class="btn_grey" value="重置">
      &nbsp;
      <input name="Button" type="button" class="btn_grey" value="删除第一条评论" onClick="deleteFirstE()">
      &nbsp;
      <input name="Button" type="button" class="btn_grey" value="删除最后一条评论" onClick="deleteLastE()"></td>
    </tr>
  </table>
  </form>

</body>
</html>