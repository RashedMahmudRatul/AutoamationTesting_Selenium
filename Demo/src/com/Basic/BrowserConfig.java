package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {

	public static void main(String[] args) {
		
		/*
		 step 1: Lunch Browser
		 Step 2: Open Test Site
		 step 3: Test
		 *Webdriver: interface
		 **driver: reference variable
		 *FirefoxDriver(): constructor of firefoxDriver Class
		 */

		//step 1
		//firefox
		
		  WebDriver driver;
		  System.setProperty("webdriver.gecko.driver",
		  "F:\\SQA\\Tools\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		 
		
		//Chrome
		/*
		 * WebDriver driver; System.setProperty("webdriver.chrome.driver",
		 * "F:\\SQA\\Tools\\chromedriver.exe"); driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 */
		
		//step 2:
		driver.get("https://www.youtube.com/");
		//driver.close();
		//driver.quit();
		
		
		
		
		
	}

}
