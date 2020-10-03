package testcases.MavenDemoRepo;

import org.testng.annotations.Test;

public class SeleniumTest  extends BaseTest{
	
	@Test(priority=1)
	public void validateTitleTest() {
		System.out.println("Selenium Title is present");
	}
	
	@Test(priority=2)
	public void validateHeaderTest() {
		System.out.println("Selenium Header is present");
	}
	
	@Test(priority=3)
	public void validateLogoPresenceTest() {
		System.out.println("Selenium Logo is present");
	}
}
