package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoImplAdmin implements adminDao {
	
	Connection con=DatabaseConnection.getConnection();

	@Override
	public boolean validateAdmin(String adminId, String adminPass) throws SQLException{
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt= con.prepareStatement("select * from admin");
		ResultSet rset= pstmt.executeQuery();
		while(rset.next()) {
			if((rset.getString(1).equals(adminId)) && rset.getString(2).equals(adminPass)) {
				return true;
			}
		}
		return false;
	}

	

	@Override
	public boolean adminCreateAttendenceReport() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminOpenOrClosePortal() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminGiveNoticeToFaculty() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminGiveNoticeToStudent() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminCreateNewBatch() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminCreateNewBatchDetails() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminDeleteBatch() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminDeleteBatchDetails() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminUpdateBatch() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminUpdateBatchDetails() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
