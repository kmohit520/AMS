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
 * Servlet implementation class AdminCreateNewStudentServlet
 */
@WebServlet("/AdminCreateNewStudentServlet")
public class AdminCreateNewStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCreateNewStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("studentName"));
		System.out.println(request.getParameter("studentRoll"));
		System.out.println(request.getParameter("studentPassword"));
		System.out.println(request.getParameter("studentEmail"));
		System.out.println(request.getParameter("studentContact"));
		System.out.println(request.getParameter("studentBranch"));
		System.out.println(request.getParameter("studentSemester"));
		System.out.println(request.getParameter("studentYear"));
		System.out.println(request.getParameter("studentSection"));
		System.out.println(request.getParameter("batchName"));
		
		DaoImplStudent adminNewStudentAdd= new DaoImplStudent();
		 RequestDispatcher rd;
		 try {
			 if(adminNewStudentAdd.addStudent(
					 request.getParameter("studentName"),
					 request.getParameter("studentRoll"),
					 request.getParameter("studentPassword"), 
					 request.getParameter("studentEmail"),
					 request.getParameter("studentContact"),
					 request.getParameter("studentBranch"),
					 request.getParameter("studentSemester"),
					 request.getParameter("studentYear"),
					 request.getParameter("studentSection"),
					 request.getParameter("batchName")
					 )
				)
			 {
				 request.setAttribute("auth", "pass");
				 rd= request.getRequestDispatcher("AdminCreateNewStudent.jsp");
				 rd.forward(request, response);
			 }
			 else {
				 request.setAttribute("auth", "failed");
				 rd= request.getRequestDispatcher("AdminCreateNewStudent.jsp");
				 rd.forward(request, response);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		doGet(request, response);
	}


}
