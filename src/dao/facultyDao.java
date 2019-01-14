package dao;

import java.sql.SQLException;
import java.util.List;

import model.Batch;
import model.Query;

public interface facultyDao {
	public boolean validateFaculty(String facultyId, String facultyPass) throws SQLException;
	
	public boolean addFaculty(String F1,String F2,String F3,String F4,String F5,String F6) throws Exception ;
	
	public boolean deleteFaculty(String deleteData, String MatchData) throws SQLException;
	public boolean updateFaculty( String columnInWhichColumFound,String oldDataToMatch,String UpdatableColumnName,String NewDataToUpdate) throws SQLException;
	
	public List<Batch> viewBatchDataToMarkAttendance(String batchName , String yearName , String studentSection , String studentBrach) throws SQLException;
	
	public boolean updateAttendance (
			int F02,
			String F1,String F2,String F3,String F4,String F5,
			String F6,String F7, String F8,String F9,String F10,
			String F11,String F12,String F13,String F14,String F15,
			String F16,String F17,String F18,String F19,String F20,
			String F21,String F22,String F23,String F24,String F25,
			String F26,String F27,String F28,String F29,String F30, String F31 ) throws SQLException;
	
	public String getName(int id) throws SQLException;
	public List<Query>readQueryByStudent(String facultyName) throws SQLException ;
	
}
