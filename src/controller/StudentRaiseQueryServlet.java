package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DaoImplStudent;

/**
 * Servlet implementation class StudentRaiseQueryServlet
 */
@WebServlet("/StudentRaiseQueryServlet")
public class StudentRaiseQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentRaiseQueryServlet() {
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
		//doGet(request, response);
		HttpSession session = request.getSession();
		System.out.println("Roll no is 1"+session.getAttribute("roll2"));
		System.out.println("Roll no is 1"+request.getParameter("FacultyName"));
		System.out.println("Roll no is 1"+request.getParameter("query"));

		int rollStudent=Integer.parseInt((String)session.getAttribute("roll2")); 
		DaoImplStudent StudentImp3 = new DaoImplStudent();
		try {
			RequestDispatcher rd;
			if(StudentImp3.raiseQuery(rollStudent ,request.getParameter("FacultyName") , request.getParameter("query"))) {
					 request.setAttribute("auth", "pass");
					 rd= request.getRequestDispatcher("studentRaiseQuery.jsp");
					 rd.forward(request, response);
				 }
				 else {
					 request.setAttribute("auth", "failed");
					 rd=request.getRequestDispatcher("studentRaiseQuery.jsp");
					 rd.forward(request, response);
				 }
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
