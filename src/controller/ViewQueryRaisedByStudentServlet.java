package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DaoImplFaculty;
import model.Query;

/**
 * Servlet implementation class ViewQueryRaisedByStudentServlet
 */
@WebServlet("/ViewQueryRaisedByStudentServlet")
public class ViewQueryRaisedByStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewQueryRaisedByStudentServlet() {
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
		RequestDispatcher rd;
		HttpSession session = request.getSession();
		String str;
		
		DaoImplFaculty dimpf =  new DaoImplFaculty();
		try {

			str = dimpf.getName(Integer.parseInt((String)session.getAttribute("Facultyid")));
			
			List<Query> a = (List<Query>)dimpf.readQueryByStudent(str);
			 request.setAttribute("list", a);
			 rd= request.getRequestDispatcher("ViewQueryRaisedByStudent.jsp");
			 rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

}
