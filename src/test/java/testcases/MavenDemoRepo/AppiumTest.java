package testcases.MavenDemoRepo;

import org.testng.annotations.Test;

public class AppiumTest extends BaseTest{
	
	
	@Test(priority=1)
	public void validateTitleTest() {
		System.out.println("Appium Title is present");
	}
	
	@Test(priority=2)
	public void validateHeaderTest() {
		System.out.println("Appium Header is present");
	}
	
	@Test(priority=3)
	public void validateLogoPresenceTest() {
		System.out.println("Appium Logo is present");
	}


}
