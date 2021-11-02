<%@page import="bo.Khoabo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.Khoabean"%>

<%@page import="bean.SinhVienbean"%>
<%@page import="bo.SinhVienbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hien thi sinh vien</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8") ;
    response.setCharacterEncoding("utf-8");
    SinhVienbo svbo= new SinhVienbo();
    Khoabo kbo= new Khoabo();
    String mk=request.getParameter("mk");
    String key=request.getParameter("txtTim");
    ArrayList<SinhVienbean> ds=svbo.getsv();
    if(mk!=null) ds=svbo.TimMakhoa(mk);
    else
    	if(key!=null) ds=svbo.Tim(key);
	%>
	<table align="center" cellspacing="0" width="1000" border = "1">
    <tr>
       
          <td valign="top" width="200"> 
            
            <%for(Khoabean k: kbo.getkhoa()){ %>
               <a href="hienthi11.jsp?mk=<%=k.getMakhoa() %>">  <%=k.getTenkhoa()  %> </a><br>
            <%} %>
       </td>
     
       <td valign="top" width="600">
	<table>
		<%for (SinhVienbean sv : ds) {%>
				<tr>
					<td><%=sv.getMasv()%></td>
					<td><%=sv.getHoten()%></td>
					<td><%=sv.getDiachi()%></td>
					<td><%=sv.getDtb()%></td>
					<td><%=sv.getMalop()%></td>

				</tr>
			<%}
		%>
		
	</table>
	</td>
	
	
	   <td valign="top" width="200">
		<form action=""hienthi11.jsp"" method="post" align="right">
	<input type="text" name="txtTim" />
	<input type="submit" , value = "Search", name="but1"/>
</form>
       </td>
  </table>
</body>
</html>