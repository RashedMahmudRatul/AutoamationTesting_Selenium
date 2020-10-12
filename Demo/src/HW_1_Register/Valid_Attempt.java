package HW_1_Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Valid_Attempt {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\SQA\\Tools\\chromedriver.exe");
		driver = new ChromeDriver();
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
		
		
		String Epc = "Your Account Has Been Created!";
	//	String Epc2= "Warning: E-Mail Address is already registered!";
		FName.sendKeys("Rashed Mahmud");
		LName.sendKeys("Ratul");
		Email.sendKeys("mima4@mail.com");
		Telephone.sendKeys("01945578818");
		Password.sendKeys("123456");
		CPassword.sendKeys("123456");
		Radiobtn.click();
		PPolicy.click();
		Continue.click();
		
		String ActualCond = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		//String ActualCond2 = driver.findElement(By.cssSelector("#account-register > div.alert.alert-danger.alert-dismissible")).getText();
		
		
		if(Epc.equals(ActualCond))
		{
			
			System.out.println("Test Sucessful");
		}
		
		else {
			System.out.println("Test Failed");
		}
		
		
		
		

	}

}
