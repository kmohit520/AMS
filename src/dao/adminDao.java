package dao;

import java.sql.SQLException;

public interface adminDao {
	public boolean validateAdmin(String adminId, String adminPass) throws SQLException;
	
	public boolean adminCreateAttendenceReport()  throws SQLException;
	public boolean AdminOpenOrClosePortal()  throws SQLException;
	public boolean AdminGiveNoticeToFaculty()  throws SQLException;
	public boolean AdminGiveNoticeToStudent()  throws SQLException;
	
	public boolean AdminCreateNewBatch()  throws SQLException;
	public boolean AdminCreateNewBatchDetails()  throws SQLException;
	
	public boolean AdminDeleteBatch()  throws SQLException;
	public boolean AdminDeleteBatchDetails()  throws SQLException;
	
	public boolean AdminUpdateBatch()  throws SQLException;
	public boolean AdminUpdateBatchDetails()  throws SQLException;
}
