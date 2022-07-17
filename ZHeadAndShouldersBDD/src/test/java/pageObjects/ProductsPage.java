package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageUi.ProductsPageUi;
import reuable.Helper;

public class ProductsPage {
	Helper help = new Helper();
	WebDriver driver;

	WebElement hoverOnShampo = help.getWebelement(ProductsPageUi.shampoo);

	public void gotoShop() {
		help.mouseOver(hoverOnShampo);
	}

	public void clickShampoo() {
		help.click(ProductsPageUi.shampooPage);
	}

}
