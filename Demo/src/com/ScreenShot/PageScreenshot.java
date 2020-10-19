package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageScreenshot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		//for Headless
		//ChromeOptions obj = new ChromeOptions();
		//obj.setHeadless(true);
		//driver = new ChromeDriver(obj);
		
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/windows");
		
	//take Screenshot
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//saving shot
	
	FileUtils.copyFile(srcFile, new File("F:\\SQA\\SShot\\page2.png"),true);
	
	driver.close();
	
	}

}
