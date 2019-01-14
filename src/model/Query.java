package model;

public class Query {
	private int studentRoll ;
	private String query ;
	private String facultyName ;
	
	public Query() {
		super();
	}
	
	public Query(int studentRoll, String query) {
		super();
		this.studentRoll = studentRoll;
		this.query = query;
	}

	public Query(int studentRoll, String query, String facultyName) {
		super();
		this.studentRoll = studentRoll;
		this.query = query;
		this.facultyName = facultyName;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
}
