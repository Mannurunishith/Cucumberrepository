package mavenpakage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.TestCase;

public class cucumbercal extends TestCase {
	calculator cal;

	@BeforeTest
	public void setUp() throws Exception {
		cal=new calculator();
		//super.setUp();
	}

	@AfterTest
	public void tearDown() throws Exception {
		cal=null;
		//super.tearDown();
	}
	@Test
	public void addtwonumbers() {
		assertEquals(10,cal.add(5,5));
		System.out.println(cal.add(5, 5));
	}
	
	
	

}
