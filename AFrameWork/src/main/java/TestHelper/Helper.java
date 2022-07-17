package TestHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;

public class Helper extends BaseClass {

	public void sendkeys(By element, String text) throws Exception {
		try {
			driver.findElement(element).sendKeys(text);
			
		} catch (ElementNotInteractableException e) {
			throw new Exception(e);
		}
	}
	
	public void click(By element) throws Exception {
		try {
			driver.findElement(element).click();
			
		} catch (ElementNotInteractableException e) {
			throw new Exception(e);
		}
	}
	
}
