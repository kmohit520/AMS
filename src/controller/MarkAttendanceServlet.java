package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoImplFaculty;
import model.Batch;

/**
 * Servlet implementation class MarkAttendanceServlet
 */
@WebServlet("/MarkAttendanceServlet")
public class MarkAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarkAttendanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DaoImplFaculty dif=new DaoImplFaculty();

		
		String SelectedYear= request.getParameter("year");
		String SelectedBranch= request.getParameter("branch");
		String SelectedSection= request.getParameter("section");
		String SelectedBatch= request.getParameter("batch");
		
		try {
			//List<Batch> l=dif.viewBatchDataToMarkAttendance("CS-DS", "fourth", "B", "CSE");
			List<Batch> l=dif.viewBatchDataToMarkAttendance(SelectedBatch, SelectedYear, SelectedSection, SelectedBranch);
			request.setAttribute("listFetched", l);
			RequestDispatcher rd=request.getRequestDispatcher("MarkAttendance.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
