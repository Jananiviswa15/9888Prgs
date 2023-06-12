import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class FirsttestCase {

	String name = "janani";
	String name1 = "janani";
	String nullVal = null;
	
	@BeforeAll
	static void checkBeforeAll() {
		System.out.println(" i ll execute before all the test case only once ");
	}
	
	@BeforeEach
	void checkBeforeEach() {
		System.out.println(" i ll execute before each test case only once ");
	}
	
	
//	@Test //when ever you want to test a particuklar method
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testCheckAssertMethods() {
		assertNull(nullVal); //checks for null val
		assertNotNull(name);
	}
	
	@AfterEach
	void checkAfterEach() {
		System.out.println(" i ll execute after each test case only once ");
	}
	
	@AfterAll
	static void checkAfterAll() {
		System.out.println(" i ll execute after all the test case only once ");
	}

}
