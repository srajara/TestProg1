package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class FacebookTestNG extends Base{
	@BeforeMethod
	public void launchbrowser() {
		
		 driver = getdriver();
		loadurl("https://www.facebook.com");
	}
	
	@Test
	public  void test() {
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
	@AfterMethod
	public void quit() {
		quitbrowser();

	}
	

}
