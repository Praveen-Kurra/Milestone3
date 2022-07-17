package com.mindtree.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestCase {

	WebDriver driver;

	@Test
	public void WebPageAccess() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
	}

	@Test
	public void MouseOver() {
		WebElement h = driver
				.findElement(By.xpath("//li[@class='menu_l1  sub_nav']//a[@title='Personal Finance']//span"));

		Actions a = new Actions(driver);

		a.moveToElement(h).perform();
	}

	@Test
	public void PersonalFinance() {
		driver.findElement(By.xpath("//a[@title='Home Loan Calculator']")).click();

	}

	@Test
	public void Calculator() {
		driver.findElement(By.id("carhome_loan")).clear();

		driver.findElement(By.id("carhome_loan")).sendKeys("3000000");

		driver.findElement(By.id("loan_period")).clear();

		driver.findElement(By.id("loan_period")).sendKeys("20");

		driver.findElement(By.id("interest_rate")).clear();
		driver.findElement(By.id("interest_rate")).sendKeys("10");

		WebElement ele = driver.findElement(By.id("emi_start_from"));
		Select s = new Select(ele);

		s.selectByValue("0");

		driver.findElement(By.id("upfront_charges")).clear();

		driver.findElement(By.id("upfront_charges")).sendKeys("10000");

		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();

	}
	@Test
	public void Displaypayment() throws InterruptedException {
		
		String totalPayment = driver.findElement(By.xpath("//span[@id='total_payment']")).getText();

		String emi = driver.findElement(By.xpath("//span[@id='emi']")).getText();

		String seventh_year_emi = driver.findElement(By.xpath("//table[@id='emi_table']//tbody//tr[7]//td[3]"))
				.getText();

		String seventh_year_intrest = driver.findElement(By.xpath("//table[@id='emi_table']//tbody//tr[7]//td[4]"))
				.getText();

		String seventh_year_principal = driver.findElement(By.xpath("//table[@id='emi_table']//tbody//tr[7]//td[5]"))
				.getText();

		String fifth_year_outstanding = driver.findElement(By.xpath("//table[@id='emi_table']//tbody//tr[5]//td[2]"))

				.getText();
		System.out.println("Total Payment :" + totalPayment);

		System.out.println(" EMI :" + emi);

		System.out.println("seventh year Principal  :" + seventh_year_principal);

		System.out.println("seventh year EMI :" + seventh_year_emi);
		System.out.println("seventh year INTREST :" + seventh_year_intrest);

		System.out.println("Fifth year Outstanding :" + fifth_year_outstanding);
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
