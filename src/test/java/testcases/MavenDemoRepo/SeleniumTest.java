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
	
	@Test(priority=4)
	public void downloadTest() {
		System.out.println("File download succesfull");
	}

	@Test(priority=5)
	public void fileUploadWithinLimitTest() {
		System.out.println("File upload within limit is  succesfull");
	}

	@Test(priority=6)
	public void fileUploadOutsideLimitTest() {
		System.out.println("File upload outside limit is succesfull");
	}
}
