package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoImplFaculty;
import dao.FacultyLoginValidation;
@WebServlet("/LoginFacultyServlet")
public class LoginFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFacultyServlet() {
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
		System.out.println(request.getParameter("facultyId"));
		System.out.println(request.getParameter("facultyPassword"));
		DaoImplFaculty facultyVal= new DaoImplFaculty();
		 RequestDispatcher rd;
		 try {
			 if(facultyVal.validateFaculty(request.getParameter("facultyId"), request.getParameter("facultyPassword"))) {
				 rd= request.getRequestDispatcher("FacultyHome.jsp");
				 rd.forward(request, response);
			 }
			 else {
				 request.setAttribute("auth", "failed");
				 rd=request.getRequestDispatcher("facultyLoginPageJSP.jsp");
				 rd.forward(request, response);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		doGet(request, response);
	}

}
