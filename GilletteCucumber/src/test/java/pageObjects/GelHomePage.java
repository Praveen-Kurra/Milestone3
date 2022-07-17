package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageUi.GelHomeUI;

public class GelHomePage  extends GelHomeUI{
	
WebDriver driver;

   public GelHomePage(WebDriver driver) {
	   
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
   }
   
   public void clickSearchIcon() {
	   
	   searchIcon.click();
   }
   
   public void enterText(String text) {
	
	   searchInput.sendKeys(text,Keys.ENTER);
}
   public String getResults() {
	   
	return searchResults.getText();
}
}
