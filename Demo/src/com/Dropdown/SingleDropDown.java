package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class SingleDropDown {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		
		Select drpdwn = new Select(dropdown);
		//drpdwn.deselectByIndex(2);
		//drpdwn.selectByValue("1");
		drpdwn.selectByVisibleText("Option 2");

	}

}
