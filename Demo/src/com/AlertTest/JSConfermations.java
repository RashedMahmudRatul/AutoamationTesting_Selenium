package com.AlertTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSConfermations {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		
		WebElement jsConfbtn = driver.findElement(By.cssSelector(".example > ul:nth-child(3) > li:nth-child(2) > button:nth-child(1)"));
		jsConfbtn.click();
		
		
		//option 1
		//driver.switchTo().alert().dismiss();
		
		//option 2
		Alert alt = driver.switchTo().alert();
		
		String Alertmsg = alt.getText();
		System.out.println(Alertmsg);

		alt.dismiss();
		
		
		
		
		
		
	}

}
