package ProxyPattern;

public class ProxyPattern {

	
	public static void main(String args[]) {
		//Student std = new StudentProxy(new Attendance("janani", true));
		DailySession std = new StudentProxy(new Attendance("janani", true));
		std.attendCLasses();
		
		//client --> requet --> proxy obj --> service (real)
	}
}
