import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class MainRunnerFile {

	
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(FirsttestCase.class);
		//pick up the test claass file and run it
		
		for(Failure fails : result.getFailures())
			System.out.println(fails.getMessage());
		
		System.out.println(result.getFailureCount());
		System.out.println(result.wasSuccessful());
	}
}
