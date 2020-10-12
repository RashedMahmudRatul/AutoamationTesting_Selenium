package com.BrowserOptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserVeersionTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\SQA\\Tools\\geckodriver-v0.27.0-win64\\geckodriver.exe"); 
		
		FirefoxOptions obj = new FirefoxOptions();
		
		//driver = new FirefoxDriver(obj);
		obj.setBinary(new FirefoxBinary(new File("F:\\SQA\\Firefox78\\firefox.exe")));
		driver = new FirefoxDriver(obj);
		driver.get("https://www.google.com/");

	}

}
