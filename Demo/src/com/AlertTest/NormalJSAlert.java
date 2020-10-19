package com.AlertTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalJSAlert {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement JsAlert = driver.findElement(By.cssSelector(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)"));
		
		JsAlert.click();
		
		driver.switchTo().alert().accept();
		
		
	}

}
