<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page import="bo.sachbo"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.KhachHangbo"%>
<%@page import="bean.loaibean"%>
<%@page import="bean.sachbean"%>
<%@page import="bean.KhachHangbean"%>

<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<title>Demo</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/thuviencss.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><a href="HtsachCtroller">Trang chủ</a></li>
				<li><a href="#">Mua hàng</a></li>
				<li><a href="#">Thanh toán</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>Đăng
						ký</a></li>
				<li>		
				<%
	    	    KhachHangbean Kh = (KhachHangbean)request.getAttribute("kh");
	    	    if( Kh!= null) {%>
	    		<a>Xin chao: <%=Kh.getHoten()%></a>
	    		<%} else { %> 
	    		<a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a>
	    		<%if(session.getAttribute("tb") != null) {
	    			out.print("<script>alert('"+request.getAttribute("tb")+"');</script>" );
	    			}
	    		} %>
	    		</li>
			</ul>
		</div>
	</nav>
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Đăng nhập</h4>
				</div>
				<div class="modal-body">
					<form method="post" action="checklogin">
						Tên đăng nhập: <input type="text" name="txtun"class="form-control"> <br> 
						Mật khẩu: <input type="password" name="txtpass" class="form-control"> <br>
						<input type="submit" name="button1" value="Đăng nhập"
							class="btn-primary">
					</form>
				</div>
			</div>
		</div>
	</div>

	
	<%
	//Lay ve all sach, cac thong tin client
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	ArrayList<sachbean> ds= (ArrayList<sachbean>) request.getAttribute("dssach");
	ArrayList<loaibean> dl=(ArrayList<loaibean>) request.getAttribute("dl");
 	%>
	

	<table align="center" cellspacing="0" width="1200" border="1">
	
		<tr>
			
		
			<td valign="top" width="200">

				
				<table class="table table-hover">

					<%
					for (loaibean loai : dl) {
					%>
					<tr>
						<td><a href="HtsachCtroller?ml=<%=loai.getMaloai()%>"> <%=loai.getTenloai()%>
						</a></td>
					</tr>
					<%
					}
					%>
				</table>
			</td>
			
			<td valign="top" width="600">
				<table class="table table-hover" border="1">
					<%
					
					int n = ds.size();
					if(ds!= null){
					for (int i = 0; i < n; i++) {
						sachbean s = ds.get(i);
					%>
					<tr>
						<td>
							<img src=image_sach/<%=s.getAnh() %>><br>
                        <a href="HtgioController?ms=<%=s.getMasach()%>&anh=<%=s.getAnh() %>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>">
                             <img src="buynow.jpg">
                         </a> 
                             <br>
                             <%=s.getTensach() %> <br>
                             <%=s.getTacgia()%> <br>
                             <%=s.getGia()%> <br>
						</td>
						<%
						i++;
						if (i < n) {
							s = ds.get(i);
						%>
						<td><img src=image_sach/<%=s.getAnh() %>><br>
                        <a href="HtgioController?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>">
                             <img src="buynow.jpg">
                         </a> 
                             <br>
                             <%=s.getTensach() %> <br>
                             <%=s.getTacgia()%> <br>
                             <%=s.getGia()%> <br>
						</td>
						<%
						}
						%>
						<%
						i++;
						if (i < n) {
							s = ds.get(i);
						%>
						<td><img src=image_sach/<%=s.getAnh() %>><br>
                        <a href="HtgioController?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>">
                             <img src="buynow.jpg">
                         </a> 
                             <br>
                             <%=s.getTensach() %> <br>
                             <%=s.getTacgia()%> <br>
                             <%=s.getGia()%> <br>
						</td>
						<%
						}
						%>
					</tr>
					<%
					}
					%>
					<%}else{ %>
					<h1> DS NULL</h1>
					<%} %>
				</table>
			</td>

			<td valign="top" width="500">
				<form action="HtsachCtroller" method="post" align="right">
					<input type="text" name="txttk" /> <input type="submit"
						value="Search" name="but1" />
				</form>
			</td>
			
		</tr>
	</table>
</body>
</html>