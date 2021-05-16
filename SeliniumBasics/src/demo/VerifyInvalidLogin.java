  package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvalidLogin {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.Driver", "chromedriver.exe");
	WebDriver Driver = new ChromeDriver(); 
	Driver.get("http://zero.webappsecurity.com/login.html");
	Driver.findElement(By.id("user_login")).sendKeys("Login");
	Driver.findElement(By.id("user_password")).sendKeys("Password");
	Driver.findElement(By.name("submit")).click();
	String actualText = Driver.findElement(By.cssSelector("#login_form > div.alert.alert-error")).getText();
	String expectedText = "Login and/or password are wrong.";
	if(actualText.equals(expectedText))
	{System.out.println("Test Case Passed");
}
	else {System.out.println("Test Case Failed");
	
	}
	Driver.close();
	
}
}