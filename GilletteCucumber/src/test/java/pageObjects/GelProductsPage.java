package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageUi.GelProductsUi;

public class GelProductsPage extends GelProductsUi {
	WebDriver driver;
	
	public GelProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void gotoProducts() {
		
		Actions action=new Actions(driver);
		
		action.moveToElement(products).perform();
	}
	
	public void clickOnAllProducts() {
		allProducts.click();
	}
	public void getResults() {
	 stylerIcon.click();
	}
}
