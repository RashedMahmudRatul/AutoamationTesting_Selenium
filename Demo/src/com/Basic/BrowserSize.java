package com.Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSize {
	
	
	/** Set Specific screen size 
	 * ex: width=100;
	 * hight=500
	 * 
	 * 
	 * 
	 * */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  WebDriver driver;
		  System.setProperty("webdriver.gecko.driver", "F:\\SQA\\Tools\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		  driver = new  FirefoxDriver();
		  
		//Set Specific Window Size
		  driver.manage().window().setSize(new Dimension(1000,500));
		  
		//get Size
		  int Width= driver.manage().window().getSize().getWidth(); 
		  int Height = driver.manage().window().getSize().getHeight();
		  		  
		  System.out.println("Default Width:"+Width);
		  System.out.println("Defult Height:"+Height);
		  
		
		                                   
		//driver.close();

	}

}
