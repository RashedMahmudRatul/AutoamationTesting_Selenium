package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchMultipleWindow {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		//for Headless
		//ChromeOptions obj = new ChromeOptions();
		//obj.setHeadless(true);
		//driver = new ChromeDriver(obj);
		
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/windows");
		
		String ParentGUID = driver.getWindowHandle();
		
		WebElement newWinBtn = driver.findElement(By.linkText("Click Here"));
		newWinBtn.click();
		
		//Thread.sleep(5000);
		
		Set<String> allGUID = driver.getWindowHandles();

		System.out.println(allGUID);
		System.out.println(allGUID.size());
		
		
		//child GUID and Window
		for(String childGUID: allGUID)
		{
			if(!childGUID.equals(ParentGUID))
			{
			driver.switchTo().window(childGUID);	
			//System.out.println(childGUID);
			System.out.println("Child Title:" +driver.getTitle());
			
			break;
			
			
			}
			
		}
		
		//focus parent Window
		
		for	(String childGUID: allGUID) {
			
			if(!childGUID.equals(ParentGUID))
			{
				driver.switchTo().window(ParentGUID);
				System.out.println("Parent GUID: "+driver.getTitle());
				break;
				
				
			}
			//driver.switchTo().window(childGUID);
			//System.out.println("Parent GUID: "+driver.getTitle());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
