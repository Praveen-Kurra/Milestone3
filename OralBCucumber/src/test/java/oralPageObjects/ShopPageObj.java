package oralPageObjects;

import oralPageUI.shopPageUI;
import reuable.Helper;

public class ShopPageObj {
	Helper help = new Helper();

	public void clickShop() {
		help.click(shopPageUI.shop);
	}

	public void clickEletricBrush() {
		help.click(shopPageUI.eletricBrush);
	}
}
