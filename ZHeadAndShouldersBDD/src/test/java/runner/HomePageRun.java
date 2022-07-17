package runner;




import org.testng.annotations.Test;

import pageObjects.HomePageObj;
import pageObjects.ProductsPage;
import reuable.BaseClass;
import reuable.Browser;

public class HomePageRun extends BaseClass {
	

	
	@Test
	public void textone() throws InterruptedException {
		initialize();
		HomePageObj home=new HomePageObj(driver);
		home.enterText("Hello");
		Thread.sleep(5000);
		Browser.quitBrowser(driver);
	
	}
	
	@Test
	public void secondTest() throws InterruptedException {
		initialize();
		ProductsPage product=new ProductsPage();
		
		product.gotoShop();
		
		product.clickShampoo();
	
		
		Browser.quitBrowser(driver);
	}
	
}
