package pageUi;

import org.openqa.selenium.By;

public class ProductsPageUi {

	public static By shampoo=By.xpath("//a[@title='Shop Products']");
	
	public static By results=By.xpath("//h1[contains(text(),'Head & Shoulders')]");
	
	//  //a[contains(text(),'COOL')]
	public static By shampooPage=By.xpath("//a[@href='/en-in/shop-products/dandruff-shampoo']");

}
