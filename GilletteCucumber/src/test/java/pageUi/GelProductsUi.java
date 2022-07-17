package pageUi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GelProductsUi {

	
	@FindBy(xpath = "//span[text()='Products']")
	protected WebElement products;
	
	@FindBy(xpath = "(//a[@title='All Products'])[1]")
	protected WebElement allProducts;
	
	@FindBy(id = "tabItem-facet_product_type_styler")
	protected WebElement stylerIcon;
}
