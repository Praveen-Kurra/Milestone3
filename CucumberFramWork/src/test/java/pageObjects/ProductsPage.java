package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="item_4_title_link") WebElement sauceBag;
	
	@FindBy(id="item_0_title_link") WebElement sauceBikeLight;
	
	@FindBy(id="item_1_title_link") WebElement sauceTshirt;
	
	public void clickBag() {
		sauceBag.click();
	}
	public void clickBikeLight() {
		sauceBikeLight.click();
	}
	public void clickTshirt() {
		sauceTshirt.click();
	}
	
	
}
