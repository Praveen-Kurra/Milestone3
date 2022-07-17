package pageObjects;

import org.openqa.selenium.WebDriver;

import pageUi.HomePageUi;
import reuable.Helper;

public class HomePageObj {
	
Helper help=new Helper();

WebDriver driver;

public HomePageObj(WebDriver driver)
{
	this.driver=driver;
}

	public void enterText(String text ) 
	{
		
	help.enterText(HomePageUi.searchIcon, text);
	
	}
}
