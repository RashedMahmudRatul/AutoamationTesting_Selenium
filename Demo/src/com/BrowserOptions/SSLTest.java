package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLTest {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\SQA\\Tools\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		FirefoxOptions obj = new FirefoxOptions();
		obj.setAcceptInsecureCerts(false);
		
		driver = new FirefoxDriver(obj);

		driver.get("https://cacert.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}
