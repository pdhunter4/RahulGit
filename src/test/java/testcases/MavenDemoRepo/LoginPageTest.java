package testcases.MavenDemoRepo;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void validateLoginPageTitleTest() {
		System.out.println("Selenium Title is present");
	}
	
	@Test(priority=2)
	public void validateLoginPageHeaderTest() {
		System.out.println("Selenium Header is present");
	}
	
	@Test(priority=3)
	public void validateLoginPageLogoPresenceTest() {
		System.out.println("Selenium Logo is present");
	}

}
