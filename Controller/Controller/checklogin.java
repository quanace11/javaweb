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

import bean.KhachHangbean;
import bo.KhachHangbo;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class checklogin
 */
@WebServlet("/checklogin")
public class checklogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checklogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		 
		
		KhachHangbo khbo = new KhachHangbo();
		ArrayList<KhachHangbean> kh = khbo.getKhachHang();
		String un = request.getParameter("txtun");
		String pass = request.getParameter("txtpass");
		//out.print(mk + "---"  + tentk);
		KhachHangbean dsDn = null;
		if (un != null && pass != null){
			dsDn = khbo.ktdn(un, pass);
			if (dsDn != null)
				request.setAttribute("kh", dsDn);
			else
				request.setAttribute("tb", "Dang nhap sai");
		}
		RequestDispatcher rd = request.getRequestDispatcher("HtsachCtroller");
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
