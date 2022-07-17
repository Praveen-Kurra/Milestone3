package com.DataProvider.InTest;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilites {
	 static String ScreenShotFolder;
	
	public static void TakeScreenShot(WebDriver driver,String FileName)  {
		
//		if(ScreenShotFolder==null) {
//		LocalDateTime myDateObj = LocalDateTime.now();
//	
//	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHH:mm:ss");
//
//	    ScreenShotFolder = myDateObj.format(myFormatObj);
//	
//		}
//		
//		String folderFile=ScreenShotFolder+"/"+FileName;
//		System.out.println(folderFile);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
	
			try {
				FileUtils.copyFile(file, new File("./ScreenShots/"+FileName));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("ScreenShot Sucessfully");
	
		
	}

}
