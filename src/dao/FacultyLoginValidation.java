package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FacultyLoginValidation {
	public boolean validateFaculty(String facultyId, String facultyPass) throws SQLException{
		Connection con=DatabaseConnection.getConnection();
		PreparedStatement pstmt= con.prepareStatement("select * from faculty");
		ResultSet rset= pstmt.executeQuery();
		while(rset.next()) {
			if((rset.getString(1).equals(facultyId)) && rset.getString(2).equals(facultyPass)) {
				return true;
			}
		}
		return false;
	}
}
