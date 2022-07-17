package reuable;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public void initialize() {
		driver=Browser.startBrwser(driver, "Chrome");
	}
	
}
