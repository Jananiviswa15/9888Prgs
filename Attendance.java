package ProxyPattern;

public class Attendance {

	String studentName;
	public Attendance(String studentName, boolean isPresent) {
		
		this.studentName = studentName;
		this.isPresent = isPresent;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	boolean isPresent;
}
