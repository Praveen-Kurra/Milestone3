package TestHelper;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test
	public void testLogin() throws Exception {
		
		LoginPage lp=new LoginPage(driver);
		driver.get("https://www.saucedemo.com/");
		lp.sendUserName("standard_user");
		lp.sendPassword("secret_sauce");
		lp.clickSubmit();
	}

}
