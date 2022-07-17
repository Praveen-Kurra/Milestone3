package pageUi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GelHomeUI {

	@FindBy(id="searchIconId")
	protected WebElement searchIcon;
	
	@FindBy(id = "search-box-input")
	protected WebElement searchInput;
	
	@FindBy(xpath = "//h1[contains(text(),'Gillette')]")
	protected WebElement searchResults;
	
}
