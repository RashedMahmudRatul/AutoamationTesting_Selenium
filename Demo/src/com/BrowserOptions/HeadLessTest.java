package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessTest {

	public static void main(String[] args) {
		

		

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\SQA\\Tools\\geckodriver-v0.27.0-win64\\geckodriver.exe"); 
		FirefoxOptions obj = new FirefoxOptions();
		obj.setHeadless(true);
		driver = new FirefoxDriver(obj);
		
		
		
		driver.get("https://www.google.com/");
		
		String Title  = driver.getTitle();
		System.out.println(Title);
		
		String url  =  driver.getCurrentUrl();
		System.out.println(url);
		
		String PageSource = driver.getPageSource();
		//System.out.println(PageSource);
		
		if(PageSource.contains(Title))
		{
			System.out.println("Test Pass");
		}
		
		
	}

}
