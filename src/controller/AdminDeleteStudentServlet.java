package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoImplAdmin;
import dao.DaoImplStudent;



/**
 * Servlet implementation class AdminDeleteStudentServlet
 */
@WebServlet("/AdminDeleteStudentServlet")
public class AdminDeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeleteStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			
		 DaoImplStudent adminNewFacultyAdd= new DaoImplStudent();
			 RequestDispatcher rd;
			 try {
				 System.out.println(request.getParameter("student"));
				 System.out.println(request.getParameter("ValueToMatch"));

				 if(adminNewFacultyAdd.deleteStudent(request.getParameter("student"),request.getParameter("ValueToMatch")))
				 {
					 request.setAttribute("auth", "pass");
					 rd= request.getRequestDispatcher("AdminDeleteStudent.jsp");
					 rd.forward(request, response);
				 }
				 else {
					 request.setAttribute("auth", "failed");
					 rd=request.getRequestDispatcher("AdminDeleteStudent.jsp");
					 rd.forward(request, response);
				 }
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
			doGet(request, response);
		}

}
