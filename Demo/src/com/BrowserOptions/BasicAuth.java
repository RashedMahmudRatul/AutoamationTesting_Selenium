package com.BrowserOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasicAuth {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\SQA\\Tools\\geckodriver-v0.27.0-win64\\geckodriver.exe"); 
		 FirefoxOptions opt= new FirefoxOptions();
		 opt.setHeadless(true);
		
		driver = new FirefoxDriver(opt);

		//formula: Protocol://username:password@url
		
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		String precont = "Basic Auth";
		String postc =driver.findElement(By.cssSelector(".example > h3:nth-child(1)")).getText();
		
		if(precont.contains(postc))
		{
			System.out.println("Test pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		
		

	}

}
