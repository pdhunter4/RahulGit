package testcases.MavenDemoRepo;

import org.testng.annotations.Test;

public class RestAPITest  extends BaseTest{
	
	@Test(priority=1)
	public void validateTitleTest() {
		System.out.println("Rest API Title is present");
	}
	
	@Test(priority=2)
	public void validateHeaderTest() {
		System.out.println("Rest API Header is present");
	}
	
	@Test(priority=3)
	public void validateLogoPresenceTest() {
		System.out.println("Rest API Logo is present");
	}


}
