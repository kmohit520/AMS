package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoImplAdmin;
@WebServlet("/LoginAdminServlet")
public class LoginAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdminServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("adminId"));
		System.out.println(request.getParameter("adminPassword"));
		DaoImplAdmin adminVal= new DaoImplAdmin();
		 RequestDispatcher rd;
		 try {
			 if(adminVal.validateAdmin(request.getParameter("adminId"), request.getParameter("adminPassword"))) {
				 rd= request.getRequestDispatcher("AdminHome.jsp");
				 rd.forward(request, response);
			 }
			 else {
				 request.setAttribute("auth", "failed");
				 rd=request.getRequestDispatcher("adminLoginPageJSP.jsp");
				 rd.forward(request, response);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		doGet(request, response);
	}
}
