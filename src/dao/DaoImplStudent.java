package dao;
import model.Batch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoImplStudent implements studentDao{
	Connection con=DatabaseConnection.getConnection();
	
	
	public boolean validateStudent(String studentRN, String studentPass) throws SQLException
	{
		PreparedStatement pstmt= con.prepareStatement("select * from student");
		ResultSet rset= pstmt.executeQuery();
		while(rset.next()) {
			
			if((rset.getString(2).equals(studentRN)) && rset.getString(3).equals(studentPass)) {
				return true;
			}
		}
		return false;	
	}
	
	@Override
	public boolean addStudent(String F1,String F2,String F3,String F4,String F5,String F6,String F7,String F8,String F9,String F10) throws Exception {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt= con.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1, F1);
		int rollNo=Integer.parseInt(F2);
		pstmt.setInt(2, rollNo);
		pstmt.setString(3, F3);
		pstmt.setString(4, F4);
		pstmt.setString(5, F5);
		pstmt.setString(6, F6);
		pstmt.setString(7, F7);
		pstmt.setString(8, F8);
		pstmt.setString(9, F9);
		pstmt.setString(10, F10);
		
		int runQuery =pstmt.executeUpdate();
		con.commit();
		return (runQuery==1) ? true :false;
	}

	

	@Override
	public boolean deleteStudent(String deleteData, String MatchData) throws SQLException{
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt;
		int runQuery;
		
		if(deleteData.equals("studentName")) {
			pstmt= con.prepareStatement("delete from student where studentName = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentRoll")) {
			int matchData= Integer.parseInt(MatchData);
			pstmt= con.prepareStatement("delete from student where studentRoll = ?");
			pstmt.setInt(1, matchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentPassword")) {
			pstmt= con.prepareStatement("delete from student where studentPassword = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentEmail")) {
			pstmt= con.prepareStatement("delete from student where studentEmail = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentContact")) {
			pstmt= con.prepareStatement("delete from student where studentContact = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentBranch")) {
			pstmt= con.prepareStatement("delete from student where studentBranch = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentSemester")) {
			pstmt= con.prepareStatement("delete from student where studentSemester = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentYear")) {
			pstmt= con.prepareStatement("delete from student where studentYear = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("studentSection")) {
			pstmt= con.prepareStatement("delete from student where studentSection = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("batchName")) {
			pstmt= con.prepareStatement("delete from student where batchName = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		
		else {
			return false;
		}
	}



	@Override
	public boolean updateStudent(String columnInWhichColumFound, String oldDataToMatch, String UpdatableColumnName,
			String NewDataToUpdate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	@Override
	public boolean updateAttendance(List<Batch> l) throws SQLException {
		
		
		
		return false;
	}
	
	public List<Batch> viewAttendance(int sroll) throws SQLException
	{   
        ArrayList<Batch> l = new ArrayList<Batch>();
		PreparedStatement pstmt= con.prepareStatement("select * from batch where StudentId = ?");
		 pstmt.setInt(1, sroll);
		 ResultSet rset = pstmt.executeQuery();
		 while(rset.next())
		 {
			l.add(new Batch(rset.getString(1),rset.getString(2),rset.getString(3),rset.getInt(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getString(8),rset.getString(9),rset.getString(10),
					rset.getString(11),rset.getString(12),rset.getString(13),rset.getString(14),rset.getString(15),rset.getString(16),rset.getString(17),rset.getString(18),rset.getString(19),rset.getString(20),rset.getString(21),rset.getString(22),
					rset.getString(23),rset.getString(24),rset.getString(25),rset.getString(26),rset.getString(27),rset.getString(28),rset.getString(29),rset.getString(30),rset.getString(31),rset.getString(32),rset.getString(33),rset.getString(34),rset.getString(35),rset.getString(36),rset.getString(37),rset.getString(38)));
		 }
		return l;
		
	}
	
	public boolean raiseQuery(int roll , String FacultyName , String Query) throws SQLException
	{
		
		PreparedStatement pstmt= con.prepareStatement("insert into query values (?,?,?)");
        pstmt.setInt(1, roll);
        pstmt.setString(2, Query);
        pstmt.setString(3, FacultyName);
          
		if(pstmt.executeUpdate() == 1)
		{   
			con.commit();  
			return true;
		}
		
        else
        	return false;
		
	}

}
