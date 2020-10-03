package testcases.MavenDemoRepo;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{
	
	@Test(priority=1)
	public void validateRegistrationPageTitleTest() {
		System.out.println("Selenium Title is present");
	}
	
	@Test(priority=2)
	public void validateRegistrationPageHeaderTest() {
		System.out.println("Selenium Header is present");
	}
	
	@Test(priority=3)
	public void validateRegistrationPageLogoPresenceTest() {
		System.out.println("Selenium Logo is present");
	}

}
