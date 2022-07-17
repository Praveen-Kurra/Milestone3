package com.runner;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.BbcEditorPickPage;
import com.utilities.BaseClass;

public class BbcEditorPickTest extends BaseClass {

	
	@SuppressWarnings("deprecation")
	@Test
	public void editorPickTest() {
		
		
		logger=report.createTest("My testCase");
		
		logger.assignAuthor("Praveen");
		
		BbcEditorPickPage editorPage=new BbcEditorPickPage(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		editorPage.clickTravelIcon();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(editorPage.EditorText));
		
		String result=editorPage.editorsGetText();
		
	
		if(result.equals(config.getData("TestOneResult"))) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
	}
	
	
	
}
