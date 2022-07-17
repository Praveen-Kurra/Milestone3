package runner;




import org.testng.annotations.Test;

import pageObjects.OlayHomePageObj;

import reusable.BaseClass;

public class sampleTest extends BaseClass {

	@Test
	public void test() throws Exception {

		initialize();

		driver.get("https://olay.co.uk/");

		OlayHomePageObj olay = new OlayHomePageObj();

		olay.clickTermsAndConditions();
		
		
		
     Thread.sleep(5000);

	driver.quit();
	}

}
