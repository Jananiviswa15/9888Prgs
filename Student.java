package ProxyPattern;

public class Student implements DailySession {

	private Attendance attendance;
	public Student(Attendance attendance) {
		this.setAttendance(attendance);
	}
	public Attendance getAttendance() {
		return attendance;
	}
	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}
	@Override
	public void attendCLasses() {
		System.out.println("attend the classes");

	}

}
