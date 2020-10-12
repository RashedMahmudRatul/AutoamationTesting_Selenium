package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		//Identify Email Input Field
		
		WebElement Email = driver.findElement(By.id("input-email"));
		
		//Identify Email Input Field
		WebElement Password = driver.findElement(By.name("password"));
		
		//Identify Login Button
		
		WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		
		//Test Case for valid Email and password:
		
				/*String ExpectedPostCondition="My Order";
				Email.sendKeys("mail22@mail.com");
				Password.sendKeys("1234567");
				LoginBtn.click();
				
			    String Actualtext=	driver.findElement(By.cssSelector("#content > h2:nth-child(3)")).getText();
				
				if(ExpectedPostCondition.equals(Actualtext)) {
					
					System.out.println("Login Sucessfull");
					
				}
				else {
					System.out.println("Failed. Bug Found");
				}*/
				
			
				
				
				
				
		//Test case for invalid input
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

}
