package ProxyPattern;

public class StudentProxy extends Student{

	public StudentProxy(Attendance attendance) {
		super(attendance);
	}
	
	
	@Override
	public void attendCLasses() {
		if(super.getAttendance().isPresent())
					super.attendCLasses();
		else {
			throw new RuntimeException("student is not allowed");
		}
	}

}
