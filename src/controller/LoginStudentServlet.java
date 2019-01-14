package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoImplStudent;


@WebServlet("/LoginStudentServlet")
public class LoginStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginStudentServlet() {
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
		System.out.println(request.getParameter("studentRollNo"));
		System.out.println(request.getParameter("studentPassword"));
		DaoImplStudent studentimpl= new DaoImplStudent();
		 RequestDispatcher rd;
		 try {
			 if(studentimpl.validateStudent(request.getParameter("studentRollNo"), request.getParameter("studentPassword"))) {
				 request.setAttribute("roll", request.getParameter("studentRollNo"));
				 rd= request.getRequestDispatcher("StudentHome.jsp");
				 rd.forward(request, response);
				 
				 				 
			 }
			 else {
				 request.setAttribute("auth", "failed");
				 rd=request.getRequestDispatcher("studentLoginPageJSP.jsp");
				 rd.forward(request, response);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		doGet(request, response);
	}

}
