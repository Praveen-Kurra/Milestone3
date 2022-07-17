package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsClick {
	WebDriver driver;

	public ProductsClick(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "item_4_title_link") WebElement sauce_bag;

	@FindBy(id = "item_1_title_link")	WebElement sauce_tshirt;

	@FindBy(id = "item_5_title_link")	WebElement sauce_Jackcet;

	@FindBy(id = "item_2_title_link") WebElement sauce_onsine;

	public void clickBag() {
		
		sauce_bag.click();
	}

	public void clickTshirt() {
		
		sauce_tshirt.click();
	}

	public void clickJacket() {
		
		sauce_Jackcet.click();
	}

	public void clickOnsine() {
		
		sauce_onsine.click();
	}
}
