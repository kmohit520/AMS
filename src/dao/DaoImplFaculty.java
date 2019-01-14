package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Batch;
import model.Query;

public class DaoImplFaculty implements facultyDao {
	Connection con=DatabaseConnection.getConnection();
	public boolean validateFaculty(String facultyId, String facultyPass) throws SQLException{
		PreparedStatement pstmt= con.prepareStatement("select * from faculty");
		ResultSet rset= pstmt.executeQuery();
		while(rset.next()) {
			if((rset.getString(1).equals(facultyId)) && rset.getString(2).equals(facultyPass)) {
				return true;
			}
		}
		return false;
	}


	@Override
	public List<Batch> viewBatchDataToMarkAttendance(String batchName, String yearName, String studentSection, String studentBranch) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt= con.prepareStatement("select * from batch where batchName = ? and studentYear = ? and studentSection = ? and studentBranch = ?");
		pstmt.setString(1, batchName);
		pstmt.setString(2, yearName);
		pstmt.setString(3, studentSection);
		pstmt.setString(4, studentBranch);

		ArrayList<Batch> l = new ArrayList<Batch>();
		ResultSet rset = pstmt.executeQuery();

		Iterator<Batch> it=l.iterator();
		Batch bc;
		while(it.hasNext())
		{
			bc=it.next();
			System.out.println(bc.getDAY1());
			System.out.println(bc.getDAY2());
			System.out.println(bc.getDAY3());
			System.out.println(bc.getDAY4());
			System.out.println(bc.getDAY5());
		}
		

		while(rset.next())
		{
			l.add(new Batch(rset.getString(1),rset.getString(2),rset.getString(3),rset.getInt(4),rset.getString(5),rset.getString(6),rset.getString(7),rset.getString(8),rset.getString(9),rset.getString(10),
					rset.getString(11),rset.getString(12),rset.getString(13),rset.getString(14),rset.getString(15),rset.getString(16),rset.getString(17),rset.getString(18),rset.getString(19),rset.getString(20),rset.getString(21),rset.getString(22),
					rset.getString(23),rset.getString(24),rset.getString(25),rset.getString(26),rset.getString(27),rset.getString(28),rset.getString(29),rset.getString(30),rset.getString(31),rset.getString(32),rset.getString(33),rset.getString(34),rset.getString(35),rset.getString(36),rset.getString(37),rset.getString(38)));
		}
		return l;
	}


	@Override
	public boolean addFaculty(String F1,String F2,String F3,String F4,String F5,String F6) throws Exception {
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt= con.prepareStatement("insert into faculty values (?,?,?,?,?,?)");
		int id=Integer.parseInt(F1);
		pstmt.setInt(1, id);
		pstmt.setString(2, F2);
		pstmt.setString(3, F3);
		pstmt.setString(4, F4);
		pstmt.setString(5, F5);
		pstmt.setString(6, F6);

		int runQuery =pstmt.executeUpdate();
		con.commit();
		return (runQuery==1) ? true :false;
	}

	@Override
	public boolean deleteFaculty(String deleteData, String MatchData) throws SQLException{
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt;
		int runQuery;
		if(deleteData.equals("FacId")) {
			int matchData= Integer.parseInt(MatchData);
			pstmt= con.prepareStatement("delete from faculty where FACULTYID = ?");
			pstmt.setInt(1, matchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("FacPass")) {
			pstmt= con.prepareStatement("delete from faculty where FACULTYPASSWORD = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("FacName")) {
			pstmt= con.prepareStatement("delete from faculty where FACULTYNAME = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("FacContactNo")) {
			pstmt= con.prepareStatement("delete from faculty where FACULTYCONTACT = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("FacEmail")) {
			pstmt= con.prepareStatement("delete from faculty where FACULTYEMAIL = ?");
			pstmt.setString(1, MatchData);
			runQuery=pstmt.executeUpdate();
			con.commit();
			return (runQuery==1) ? true :false;
		}
		else if(deleteData.equals("FacBatchName")) {
			pstmt= con.prepareStatement("delete from faculty where BATCHNAME = ?");
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
	public boolean updateFaculty( String columnInWhichColumFound,String oldDataToMatch,String UpdatableColumnName,String NewDataToUpdate) throws SQLException{

		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt;
		int runQuery;

		//1
		if(columnInWhichColumFound.equals("FacId")) {

			if(UpdatableColumnName.equals("newFacId")) {
				int matchData= Integer.parseInt(oldDataToMatch);
				int newData= Integer.parseInt(NewDataToUpdate);
				pstmt= con.prepareStatement("update faculty set facultyId=?  where FACULTYID = ?");
				pstmt.setInt(1, newData);
				pstmt.setInt(2, matchData);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacPass")) {
				int matchData= Integer.parseInt(oldDataToMatch);
				pstmt= con.prepareStatement("update faculty set facultyPassword=?  where FACULTYID = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setInt(2, matchData);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacName")) {
				int matchData= Integer.parseInt(oldDataToMatch);
				pstmt= con.prepareStatement("update faculty set facultyName=?  where FACULTYID = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setInt(2, matchData);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacContactNo")) {
				int matchData= Integer.parseInt(oldDataToMatch);
				pstmt= con.prepareStatement("update faculty set facultyContact=?  where FACULTYID = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setInt(2, matchData);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacEmail")) {
				int matchData= Integer.parseInt(oldDataToMatch);
				pstmt= con.prepareStatement("update faculty set facultyEmail=?  where FACULTYID = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setInt(2, matchData);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacBatchName")) {
				int matchData= Integer.parseInt(oldDataToMatch);
				pstmt= con.prepareStatement("update faculty set batchName=?  where FACULTYID = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setInt(2, matchData);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

		}
		//2
		else if(columnInWhichColumFound.equals("FacPass")) {

			if(UpdatableColumnName.equals("newFacId")) {
				int newData= Integer.parseInt(NewDataToUpdate);
				pstmt= con.prepareStatement("update faculty set facultyId=?  where facultyPassword = ?");
				pstmt.setInt(1, newData);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacPass")) {
				pstmt= con.prepareStatement("update faculty set facultyPassword=?  where facultyPassword = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacName")) {
				pstmt= con.prepareStatement("update faculty set facultyName=?  where facultyPassword = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacContactNo")) {
				pstmt= con.prepareStatement("update faculty set facultyContact=?  where facultyPassword = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacEmail")) {
				pstmt= con.prepareStatement("update faculty set facultyEmail=?  where facultyPassword = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacBatchName")) {
				pstmt= con.prepareStatement("update faculty set batchName=?  where facultyPassword = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}
		}
		//3
		else if(columnInWhichColumFound.equals("FacName")) {

			if(UpdatableColumnName.equals("newFacId")) {
				int newData= Integer.parseInt(NewDataToUpdate);
				pstmt= con.prepareStatement("update faculty set facultyId=?  where facultyName = ?");
				pstmt.setInt(1, newData);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacPass")) {
				pstmt= con.prepareStatement("update faculty set facultyPassword=?  where facultyName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacName")) {
				pstmt= con.prepareStatement("update faculty set facultyName=?  where facultyName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacContactNo")) {
				pstmt= con.prepareStatement("update faculty set facultyContact=?  where facultyName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacEmail")) {
				pstmt= con.prepareStatement("update faculty set facultyEmail=?  where facultyName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacBatchName")) {
				pstmt= con.prepareStatement("update faculty set batchName=?  where facultyName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}
		}		
		//4		
		else if(columnInWhichColumFound.equals("FacContactNo")) {

			if(UpdatableColumnName.equals("newFacId")) {
				int newData= Integer.parseInt(NewDataToUpdate);
				pstmt= con.prepareStatement("update faculty set facultyId=?  where facultyContact = ?");
				pstmt.setInt(1, newData);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacPass")) {
				pstmt= con.prepareStatement("update faculty set facultyPassword=?  where facultyContact = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacName")) {
				pstmt= con.prepareStatement("update faculty set facultyName=?  where facultyContact = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacContactNo")) {
				pstmt= con.prepareStatement("update faculty set facultyContact=?  where facultyContact = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacEmail")) {
				pstmt= con.prepareStatement("update faculty set facultyEmail=?  where facultyContact = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacBatchName")) {
				pstmt= con.prepareStatement("update faculty set batchName=?  where facultyContact = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}
		}		
		//5
		else if(columnInWhichColumFound.equals("FacEmail")) {

			if(UpdatableColumnName.equals("newFacId")) {
				int newData= Integer.parseInt(NewDataToUpdate);
				pstmt= con.prepareStatement("update faculty set facultyId=?  where facultyEmail = ?");
				pstmt.setInt(1, newData);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacPass")) {
				pstmt= con.prepareStatement("update faculty set facultyPassword=?  where facultyEmail = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacName")) {
				pstmt= con.prepareStatement("update faculty set facultyName=?  where facultyEmail = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacContactNo")) {
				pstmt= con.prepareStatement("update faculty set facultyContact=?  where facultyEmail = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacEmail")) {
				pstmt= con.prepareStatement("update faculty set facultyEmail=?  where facultyEmail = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacBatchName")) {
				pstmt= con.prepareStatement("update faculty set batchName=?  where facultyEmail = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}
		}		
		//6
		else if(columnInWhichColumFound.equals("FacBatchName")) {

			if(UpdatableColumnName.equals("newFacId")) {
				int newData= Integer.parseInt(NewDataToUpdate);
				pstmt= con.prepareStatement("update faculty set facultyId=?  where batchName = ?");
				pstmt.setInt(1, newData);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacPass")) {
				pstmt= con.prepareStatement("update faculty set facultyPassword=?  where batchName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacName")) {
				pstmt= con.prepareStatement("update faculty set facultyName=?  where batchName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacContactNo")) {
				pstmt= con.prepareStatement("update faculty set facultyContact=?  where batchName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacEmail")) {
				pstmt= con.prepareStatement("update faculty set facultyEmail=?  where batchName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}

			if(UpdatableColumnName.equals("newFacBatchName")) {
				pstmt= con.prepareStatement("update faculty set batchName=?  where batchName = ?");
				pstmt.setString(1, NewDataToUpdate);
				pstmt.setString(2, oldDataToMatch);
				runQuery=pstmt.executeUpdate();
				con.commit();
				return (runQuery==1) ? true :false;
			}
		}

		else {
			return false;
		}
		return false;
	}


	@Override
	public boolean updateAttendance(int F02,
			String F1, String F2, String F3, String F4, String F5, String F6, String F7, String F8, String F9,
			String F10, String F11, String F12, String F13, String F14, String F15, String F16, String F17, String F18,
			String F19, String F20, String F21, String F22, String F23, String F24, String F25, String F26, String F27,
			String F28, String F29, String F30, String F31) throws SQLException {
		
		PreparedStatement pstmt= con.prepareStatement("update batch set Day1=?, Day2=?, Day3=?, Day4=?, Day5=?, Day6=?, Day7=?, Day8=?, Day9=?, Day10=?, Day11=?, Day12=?, Day13=?, Day14=?, Day15=?, Day16=?, Day17=?, Day18=?, Day19=?, Day20=?, Day21=?, Day22=?, Day23=?, Day24=?, Day25=?, Day26=?, Day27=?, Day28=?, Day29=?, Day30=?, Day31=? where studentId= ? ");
		pstmt.setString (1,F1);
		pstmt.setString (2,F2);
		pstmt.setString (3,F3);
		pstmt.setString (4,F4);
		pstmt.setString (5,F5);
		pstmt.setString (6,F6);
		pstmt.setString (7,F7);
		pstmt.setString (8,F8);
		pstmt.setString (9,F9);
		pstmt.setString (10,F10);
		
		pstmt.setString (11,F11);
		pstmt.setString (12,F12);
		pstmt.setString (13,F13);
		pstmt.setString (14,F14);
		pstmt.setString (15,F15);
		pstmt.setString (16,F16);
		pstmt.setString (17,F17);
		pstmt.setString (18,F18);
		pstmt.setString (19,F19);
		pstmt.setString (20,F20);
		
		pstmt.setString (21,F21);
		pstmt.setString (22,F22);
		pstmt.setString (23,F23);
		pstmt.setString (24,F24);
		pstmt.setString (25,F25);
		pstmt.setString (26,F26);
		pstmt.setString (27,F27);
		pstmt.setString (28,F28);
		pstmt.setString (29,F29);
		pstmt.setString (30,F30);
		
		pstmt.setString (31,F31);
		
		
		
		pstmt.setInt (32,F02);
		
		int i=pstmt.executeUpdate();
		if(i==1)
			return true;
		else
			return false;
	}
	
	public String getName(int id) throws SQLException
	{
		PreparedStatement pstmt;
		String str;
		try {
			pstmt = con.prepareStatement("select * from faculty where facultyId = ? ");
			pstmt.setInt(1, id);
			
			ResultSet rset = pstmt.executeQuery();
			 while(rset.next())
			 {
				str=rset.getString(3);
				return (str);
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	public List<Query>readQueryByStudent(String facultyName) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt= con.prepareStatement("select * from query where facultyName = ? ");
		pstmt.setString(1, facultyName);
		
		
		ArrayList<Query> l = new ArrayList<Query>();
		 ResultSet rset = pstmt.executeQuery();
		 while(rset.next())
		 {
			l.add(new Query(rset.getInt(1),rset.getString(2)));
		 }
		return l;
	}

}
