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
@WebServlet("/StudentViewAttendanceServlet")
public class StudentViewAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentViewAttendanceServlet() {
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
		DaoImplStudent studentImp2 = new DaoImplStudent();
		System.out.println("Roll no is 1"+session.getAttribute("roll"));
		int roll = Integer.parseInt((String)session.getAttribute("roll"));
		try {
			List<Batch> m = studentImp2.viewAttendance(roll);
			 request.setAttribute("list", m);
			 System.out.println("Roll no is 2 "+session.getAttribute("roll"));
			 rd= request.getRequestDispatcher("studentViewAttendance.jsp");
			 rd.forward(request, response);
			 System.out.println("Roll no is 3 "+session.getAttribute("roll"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
