package com.Demo.pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class IntiationBrowser {
	WebDriver driver;
	private final String propertyFilePath = "./Resourses/config.properties";
	Properties properties = new Properties();


	public IntiationBrowser(WebDriver driver) throws FileNotFoundException, IOException {
	
		properties.load(new FileReader(propertyFilePath));
		
		this.driver = driver;
		String driverPath=properties.getProperty("driverPath");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(properties.getProperty("url"));
		 
         
	}
	

	
	
	
	

}
