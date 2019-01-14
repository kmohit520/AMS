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

import dao.DaoImplStudent;
import model.Batch;

/**
 * Servlet implementation class StudentViewAttendanceServlet
 */
@WebServlet("/CheckDetainCriteriaServlet")
public class CheckDetainCriteriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckDetainCriteriaServlet() {
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
		
		 RequestDispatcher rd;
		DaoImplStudent studentImp4 = new DaoImplStudent();
		System.out.println("Roll no of detain is "+session.getAttribute("roll"));
		int roll = Integer.parseInt((String)session.getAttribute("roll"));
		try {
			List<Batch> m = studentImp4.viewAttendance(roll);
			 session.setAttribute("list", m);
			 System.out.println("Roll2 no of detain is "+session.getAttribute("roll"));
			 rd= request.getRequestDispatcher("checkDetainingCriteria.jsp");
			 rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
