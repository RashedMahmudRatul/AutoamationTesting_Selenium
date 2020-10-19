package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestNG_XML {
	
	WebDriver driver;

	@BeforeMethod
	  public void OpenTestURL() {
		  
		driver.get("https://demo.opencart.com/index.php?route=account/login");		  
	  }
	
	@AfterMethod
	  public void CloseTestTab() {	  
	   driver.close();
		  
	  } 
	

	  @BeforeTest
	  public void BrowserConfig() {
			System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
			driver = new ChromeDriver(); 
	  }
  
	  @Test(description = "Invalid Email and Pass")
	  public void Login() {

			WebElement Email = driver.findElement(By.id("input-email"));
			WebElement Password = driver.findElement(By.name("password"));
			WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
	  
			String ExcptPostCond = " Warning: No match for E-Mail Address and/or Password."; 
			Email.sendKeys("ratul@mail.com");
			Password.sendKeys("12846");
			LoginBtn.click();
			
			String ActualText1= driver.findElement(By.cssSelector("#account-login > div.alert.alert-danger.alert-dismissible")).getText();
			
			if(ExcptPostCond.contains(ActualText1))
			{
				System.out.println("Test Case passed");
			}
			else {
				System.out.println("Failed");
			}
	  }
	  
	  @AfterTest
	  public void closeTest() {
		
		  driver.quit();

	  }
	}
