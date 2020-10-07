package testcases.MavenDemoRepo;

import org.testng.annotations.Test;

public class demo {
	
	@Test(priority=1)
	public void getTitle() {
		System.out.println("Validate the title");
	}

}
