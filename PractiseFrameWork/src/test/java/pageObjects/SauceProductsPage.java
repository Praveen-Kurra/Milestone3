package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import uistore.SauceProductsUi;

public class SauceProductsPage extends SauceProductsUi{
 WebDriver driver;
	public SauceProductsPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickBackpack() {
		
		sauceBackPack.click();
	}
	public void clickTshirt() {
		sauceTshirt.click();
	}
	public void clickJacket() {
		sauceJacket.click();
	}
}
