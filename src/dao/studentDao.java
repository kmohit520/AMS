package dao;
import model.Batch;
import java.sql.SQLException;
import java.util.List;

public interface studentDao {
  
	public boolean addStudent(String F1,String F2,String F3,String F4,String F5,String F6,String F7,String F8,String F9,String F10) throws Exception;
	public boolean deleteStudent(String deleteData, String MatchData) throws SQLException;
	public boolean updateStudent( String columnInWhichColumFound,String oldDataToMatch,String UpdatableColumnName,String NewDataToUpdate) throws SQLException;
	
	public List<Batch> viewAttendance(int sroll) throws SQLException;
	public boolean validateStudent(String studentRN, String studentPass) throws SQLException;
	public boolean raiseQuery(int roll , String FacultyName , String Query) throws SQLException;
	public boolean updateAttendance(List <Batch> l) throws SQLException;

	
	
 }
