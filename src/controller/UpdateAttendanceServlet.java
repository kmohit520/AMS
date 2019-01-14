package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoImplFaculty;

/**
 * Servlet implementation class UpdateAttendanceServlet
 */
@WebServlet("/UpdateAttendanceServlet")
public class UpdateAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateAttendanceServlet() {
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

		DaoImplFaculty updateStudentAttendance = new DaoImplFaculty();

		try {
			RequestDispatcher rd;
System.out.println("Update Servlet!!!");
			String stdIds=request.getParameter("StudentId");
			System.out.println(stdIds);
			/*
			String []  D1=request.getParameterValues("D1");
			String []  D2=request.getParameterValues("D2");
			String []  D3=request.getParameterValues("D3");
			String []  D4=request.getParameterValues("D4");
			String []  D5=request.getParameterValues("D5");
			String []  D6=request.getParameterValues("D6");
			String []  D7=request.getParameterValues("D7");
			String []  D8=request.getParameterValues("D8");
			String []  D9=request.getParameterValues("D9");
			String []  D10=request.getParameterValues("D10");
			
			String []  D11=request.getParameterValues("D11");
			String []  D12=request.getParameterValues("D12");
			String []  D13=request.getParameterValues("D13");
			String []  D14=request.getParameterValues("D14");
			String []  D15=request.getParameterValues("D15");
			String []  D16=request.getParameterValues("D16");
			String []  D17=request.getParameterValues("D17");
			String []  D18=request.getParameterValues("D18");
			String []  D19=request.getParameterValues("D19");
			String []  D20=request.getParameterValues("D20");
			
			String []  D21=request.getParameterValues("D21");
			String []  D22=request.getParameterValues("D22");
			String []  D23=request.getParameterValues("D23");
			String []  D24=request.getParameterValues("D24");
			String []  D25=request.getParameterValues("D25");
			String []  D26=request.getParameterValues("D26");
			String []  D27=request.getParameterValues("D27");
			String []  D28=request.getParameterValues("D28");
			String []  D29=request.getParameterValues("D29");
			String []  D30=request.getParameterValues("D30");
			
			String []  D31=request.getParameterValues("D31");
			

//			System.out.println(request.getParameter("SubjectName") );
//			System.out.println(request.getParameter("BatchName"));
//			System.out.println(request.getParameter("StudentSection"));
//			System.out.println(request.getParameter("StudentBranch"));
//			System.out.println(request.getParameter("StudentYear"));
//			System.out.println(request.getParameter("D1"));
System.out.println(stdIds[0]);
System.out.println(stdIds[1]);
System.out.println(D1[0]);
System.out.println(D1[1]);
			for(int i=0;i<stdIds.length;i++) {
				int id= Integer.parseInt(stdIds[i]);
				String d1=D1[i];
				String d2=D2[i];
				String d3=D3[i];
				String d4=D4[i];
				String d5=D5[i];
				String d6=D6[i];
				String d7=D7[i];
				String d8=D8[i];
				String d9=D9[i];
				String d10=D10[i];
				
				String d11=D11[i];
				String d12=D12[i];
				String d13=D13[i];
				String d14=D14[i];
				String d15=D15[i];
				String d16=D16[i];
				String d17=D17[i];
				String d18=D18[i];
				String d19=D19[i];
				String d20=D20[i];
				
				String d21=D21[i];
				String d22=D22[i];
				String d23=D23[i];
				String d24=D24[i];
				String d25=D25[i];
				String d26=D26[i];
				String d27=D27[i];
				String d28=D28[i];
				String d29=D29[i];
				String d30=D30[i];
				
				String d31=D31[i];
				
				
				
				if(updateStudentAttendance.updateAttendance(
						 
						id,
						
						d1,
						d2,
						d3,
						d4,
						d5,
						d6,
						d7,
						d8,
						d9,
						d10,
						
						d11,
						d12,
						d13,
						d14,
						d15,
						d16,
						d17,
						d18,
						d19,
						d20,
						
						d21,
						d22,
						d23,
						d24,
						d25,
						d26,
						d27,
						d28,
						d29,
						d30,
						
						d31
						
						)) {
					rd= request.getRequestDispatcher("FacultyHome.jsp");
					rd.forward(request, response);
				}
				else {
					request.setAttribute("auth", "failed");
					rd=request.getRequestDispatcher("MarkAttendance.jsp");
					rd.forward(request, response);
				}
			}
			*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
