package model;

public class Faculty {
	private int facultyId ;
	private String facultyPassword ;
	private String facultyName ;
	private int facultyContact;
	private String facultyEmail ;
	private String batchName ;
	
	public Faculty() {
		super();
	}
	public Faculty(int facultyId, String facultyPassword, String facultyName, int facultyContact, String facultyEmail,
			String batchName) {
		super();
		this.facultyId = facultyId;
		this.facultyPassword = facultyPassword;
		this.facultyName = facultyName;
		this.facultyContact = facultyContact;
		this.facultyEmail = facultyEmail;
		this.batchName = batchName;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyPassword() {
		return facultyPassword;
	}
	public void setFacultyPassword(String facultyPassword) {
		this.facultyPassword = facultyPassword;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public int getFacultyContact() {
		return facultyContact;
	}
	public void setFacultyContact(int facultyContact) {
		this.facultyContact = facultyContact;
	}
	public String getFacultyEmail() {
		return facultyEmail;
	}
	public void setFacultyEmail(String facultyEmail) {
		this.facultyEmail = facultyEmail;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	
	
}
