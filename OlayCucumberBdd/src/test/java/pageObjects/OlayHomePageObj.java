package pageObjects;

import org.junit.Assert;

import pageUi.OlayHomeUi;
import reusable.Helper;

public class OlayHomePageObj {

	Helper help = new Helper();

	public void clickSearchIcon() {

		help.click(OlayHomeUi.searchIcon);
		
	}

	public void clickDropDown() {
		help.click(OlayHomeUi.dropdown);
	}

	public void clickProduct() {
		help.click(OlayHomeUi.nightCream);
		
	}

  public void clickTermsAndConditions() {
	  help.click(OlayHomeUi.termsAndConditions);
  }
	
}
