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
	
	@Test(priority=4)
	public void validateLoginTestWithValidCredentials() {
		System.out.println("User log in with valid credentials");
	}
	
	@Test(priority=5)
	public void validateLoginTestWithInValidCredentials() {
		System.out.println("User is unable to login with invalid credentials");
	}

}
