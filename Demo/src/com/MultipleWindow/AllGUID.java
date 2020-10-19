package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllGUID {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		//for Headless
		ChromeOptions obj = new ChromeOptions();
		obj.setHeadless(true);
		driver = new ChromeDriver(obj);
		
		//driver = new ChromeDriver();
		
		
		driver.get("http://the-internet.herokuapp.com/windows");
		
		WebElement newWinbtn = driver.findElement(By.linkText("Click Here"));
		
		newWinbtn.click();
		//newWinbtn.click();
		//newWinbtn.click();
		//newWinbtn.click();
		
		
		//Get all GUID
		Set<String> allGUID = driver.getWindowHandles();
		System.out.println(allGUID);
		
		//number of GUID
		System.out.println(allGUID.size());
		
	}

}
