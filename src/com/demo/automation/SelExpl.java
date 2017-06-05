package com.demo.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class SelExpl {

	@FindBy (id="email")
	WebElement username;
	
	@FindBy (id="pass")
	WebElement pass;
	
	@FindBy (id="loginbutton")
	WebElement Button;
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseURL = "https://www.facebook.com";
		driver.get(baseURL);
		//driver.getTitle();
		System.out.println("Page Title is=" + driver.getTitle());
		
	
	
		/**for email
		driver.findElement(By.id("email")).sendKeys("ruchaspatil84@yahoo.com");
		
		//for password
		driver.findElement(By.id("pass")).sendKeys("abc");
		
		//for button
		driver.findElement(By.id("loginbutton")).click();
		*/
	}
}
