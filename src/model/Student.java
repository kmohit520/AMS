package model;

public class Student {
	private String studentName;
	private int studentRoll ;
	private String studentPassword;
	private String studentEmail   ;
	private String studentContact  ;
	private String studentBranch ;
	private String studentSemester ;
	private String studentYear   ;
	private String studentSection ;
	private String batchName ;
	public Student() {
		super();
	}
	public Student(String studentName, int studentRoll, String studentPassword, String studentEmail,
			String studentContact, String studentBranch, String studentSemester, String studentYear,
			String studentSection, String batchName) {
		super();
		this.studentName = studentName;
		this.studentRoll = studentRoll;
		this.studentPassword = studentPassword;
		this.studentEmail = studentEmail;
		this.studentContact = studentContact;
		this.studentBranch = studentBranch;
		this.studentSemester = studentSemester;
		this.studentYear = studentYear;
		this.studentSection = studentSection;
		this.batchName = batchName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(String studentSemester) {
		this.studentSemester = studentSemester;
	}
	public String getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(String studentYear) {
		this.studentYear = studentYear;
	}
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

}
