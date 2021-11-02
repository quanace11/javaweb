package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import bean.KhachHangbean;
import bean.loaibean;
import bean.sachbean;
import bo.GioHangbo;
import bo.KhachHangbo;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class HtsachCtroller
 */
@WebServlet("/HtsachCtroller")
public class HtsachCtroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HtsachCtroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Lay ve all sach, cac thong tin client
		 
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		sachbo sbo = new sachbo();
		loaibo lbo = new loaibo();
		ArrayList<loaibean> dl = lbo.getloai(); 
		ArrayList<sachbean> ds = sbo.getsach();
	    request.setAttribute("dl", dl);
		String ml = request.getParameter("ml");
		String key = request.getParameter("txttk");
//		if (ml != null) {
//			ds = sbo.TimLoai(ml);
//
//			RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
//			rd.forward(request, response);
//			
//		}
//			
//		else { if (key != null) {
//			ds = sbo.TimLoai(key);
//
//			
//			RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
//			rd.forward(request, response);
//			
//		}
//			
//		else{
//			request.setAttribute("dsloai", dl);
//			request.setAttribute("dssach", ds);
//			RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
//			rd.forward(request, response);
//		}
//	}
		if(ml != null){
			ds = sbo.TimLoai(ml);
			request.setAttribute("dssach", ds);
			
		}else{
			if(key != null) 
			ds = sbo.Tim(key);
			request.setAttribute("dssach", ds);
		
		}
		RequestDispatcher rd = request.getRequestDispatcher("menu.jsp");
		rd.forward(request, response);
	

	}
		
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}