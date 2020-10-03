package testcases.MavenDemoRepo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Base{
	

	@BeforeMethod
	public void browserInitialization() {
		readPropertyFile();
		intializeBrowser();
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}
	
	@AfterSuite
	public void triggerTestReports() {
		showTestReports();
	}
}
