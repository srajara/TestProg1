package org.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgPOM {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "A:\\javaprograms\\Jacky\\TestProg\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
