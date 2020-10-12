package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
	
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String Title  = driver.getTitle();
		System.out.println(Title);
		
		/*
		 * String url = driver.getCurrentUrl(); System.out.println(url);
		 */
		
		String PageSource = driver.getPageSource();
		//System.out.println(PageSource);
		
		if(PageSource.contains(Title))
		{
			System.out.println("Test Pass");
		}
		

		
	}

}
