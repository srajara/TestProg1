package org.project;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base {
	
	public static WebDriver driver;
	public static WebDriver getdriver() {
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
	element.click();
	}
	public static void quitbrowser() {
	driver.quit();
	}
	
}




