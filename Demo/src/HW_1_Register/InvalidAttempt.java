package HW_1_Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  WebDriver driver;
		  System.setProperty("webdriver.gecko.driver", "F:\\SQA\\Tools\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		  driver = new  FirefoxDriver();
	      driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		
		WebElement FName = driver.findElement(By.id("input-firstname"));
		WebElement LName = driver.findElement(By.name("lastname"));
		WebElement Email = driver.findElement(By.cssSelector("#input-email"));
		WebElement Telephone = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
		WebElement Password = driver.findElement(By.id("input-password"));
		WebElement CPassword = driver.findElement(By.id("input-confirm"));
		WebElement Radiobtn = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1)"));
		WebElement PPolicy   = driver.findElement(By.name("agree"));
		WebElement Continue = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
		
		
		String Epc = "Password confirmation does not match password!";
		//String Epc2= "Warning: E-Mail Address is already registered!";
		FName.sendKeys("Rashed Mahmud");
		LName.sendKeys("Ratul");
		Email.sendKeys("rashed234@mail.com");
		Telephone.sendKeys("A01945578818");
		Password.sendKeys("123456");
		CPassword.sendKeys("1234567");
		Radiobtn.click();
		PPolicy.click();
		Continue.click();
		
		String ActualCond = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(2) > div.form-group.required.has-error > div > div")).getText();
		//String ActualCond2 = driver.findElement(By.cssSelector("#account-register > div.alert.alert-danger.alert-dismissible")).getText();
		
		
		if(Epc.contains(ActualCond)) {
			
			System.out.println("Test Sucessful");
		}
		
		//else if( Epc2.contains(ActualCond2)) {
			//System.out.println("Test Sucessful");
			
		//}
		
		
		
		else {
			System.out.println("Test Failed");
		}
		
		
		

	}

}
