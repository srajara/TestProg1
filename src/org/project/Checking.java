package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checking {
	
	public static WebDriver driver;
	@BeforeClass
	public static WebDriver getdriver() {
		System.out.println("@BeforeClass method executed");
	System.setProperty("webdriver.chrome.driver","A:\\javaprograms\\somasundaram\\Locators\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
return driver;
	}
	public static void loadurl(String name) {
		driver.get(name);
	}
	public static void type(WebElement element,String name) {
	element.sendKeys(name);
}
	
	public static void btnclk(WebElement element) {
		System.out.println("@AfterMethod executed");
	element.click();
	}
	public static void quitbrowser() {
	driver.quit();
	}
	@BeforeMethod
	public void launchbrowser() {
		System.out.println("@BeforeMethod executed");
		
		 driver = getdriver();
		loadurl("https://www.facebook.com");
	}
	
	@Test
	public  void test() {
		System.out.println("test method executed");
		WebElement firstName= driver.findElement(By.id("u_0_j"));
		type(firstName, "somu");
		WebElement sureName= driver.findElement(By.id("u_0_l"));
		type(sureName, "jacky");
		WebElement mobNum= driver.findElement(By.id("u_0_o"));
		type(mobNum, "9688943932");
		WebElement passWord= driver.findElement(By.id("u_0_v"));
		type(passWord, "jacky");
		Actions a = new Actions(driver);
		WebElement daysele = driver.findElement(By.id("day"));
		a.moveToElement(daysele).perform();
		WebElement daydate = driver.findElement(By.xpath("(//option[@value='1'])[1]"));
		daydate.click();
		WebElement mothsele = driver.findElement(By.id("month"));
		a.moveToElement(mothsele).perform();
		WebElement monthNo = driver.findElement(By.xpath("(//option[@value='1'])[2]"));
		monthNo.click();
		WebElement yearsele = driver.findElement(By.id("year"));
		a.moveToElement(yearsele).perform();
		WebElement yearval = driver.findElement(By.xpath("//option[@value='2019']"));
		yearval.click();
		WebElement genderBtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		genderBtn.click();
		WebElement signUp = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		signUp.click();
	}
	@AfterClass
	public void quit() {
		System.out.println("after class method executed");
		quitbrowser();

	}
	

		

	
	

}
