package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoImplAdmin;
import dao.DaoImplFaculty;

/**
 * Servlet implementation class AdminCreateNewFaculityServlet
 */
@WebServlet("/AdminCreateNewFaculityServlet")
public class AdminCreateNewFaculityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCreateNewFaculityServlet() {
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
		System.out.println(request.getParameter("FacId"));
		System.out.println(request.getParameter("FacPass"));
		System.out.println(request.getParameter("FacName"));
		System.out.println(request.getParameter("FacContactNo"));
		System.out.println(request.getParameter("FacEmail"));
		System.out.println(request.getParameter("FacBatchName"));
		
		DaoImplFaculty adminNewFacultyAdd= new DaoImplFaculty();
		 RequestDispatcher rd;
		 try {
			 if(adminNewFacultyAdd.addFaculty(
					 request.getParameter("FacId"),
					 request.getParameter("FacPass"),
					 request.getParameter("FacName"), 
					 request.getParameter("FacContactNo"),
					 request.getParameter("FacEmail"),
					 request.getParameter("FacBatchName")
					 )
				)
			 {
				 request.setAttribute("auth", "pass");
				 rd= request.getRequestDispatcher("AdminCreateNewFaculity.jsp");
				 rd.forward(request, response);
			 }
			 else {
				 request.setAttribute("auth", "failed");
				 rd=request.getRequestDispatcher("AdminCreateNewFaculity.jsp");
				 rd.forward(request, response);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		doGet(request, response);
	}

}
