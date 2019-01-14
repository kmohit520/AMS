package model;

public class BatchDetails {
	private String batchName ; 
	private String facultyName ; 
	private String subjectName ;
	
	
	
	public BatchDetails() {
		super();
	}
	public BatchDetails(String batchName, String facultyName, String subjectName) {
		super();
		this.batchName = batchName;
		this.facultyName = facultyName;
		this.subjectName = subjectName;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
}
