package com.reusable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenShots {

	
	public static String CaptureScreenShot(WebDriver driver) {
		
	    File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("./ScreenShots/"+GetDateTime.getDatetimeFormat()+".png");
	    
	    //new File("./ScreenShots/"+getDatetime()+".png")
	    
	    try {
	    	FileUtils.copyFile(src, dest);
//			org.openqa.selenium.io.FileHandler.copy(src,dest);
		} catch (IOException e) {
			System.out.println("unable to Caputure ScreenShot");
		}
	return  dest.getAbsolutePath();
	}
	
}
