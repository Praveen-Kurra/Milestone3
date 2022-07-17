package oralPageObjects;

import oralPageUI.ElectricBrushUi;
import reuable.Helper;

public class ElectricBrushPageObj {
	
	Helper help=new Helper();
	
	
	public void clickOnDropDown()
	{
		help.click(ElectricBrushUi.dropDown);
	}
	
   public void clickElectricBrush() {
	   
	help.click(ElectricBrushUi.eletricBush);
  }
	public void clickProseriesBrush()
	{
		help.click(ElectricBrushUi.eletricBush);
	}
	
	public String getResults() {
		return help.getText(ElectricBrushUi.results);
	}

   public void clckBuyNow() {
	help.click(ElectricBrushUi.buyNow);
}
}
