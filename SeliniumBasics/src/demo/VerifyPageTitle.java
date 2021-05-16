package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {
public static void main(String[] args) {
	System.setProperty("webDriver.chrome.Driver", "chromedriver.exe");
	WebDriver Driver = new ChromeDriver(); 
	Driver.manage().window().maximize();
	Driver.get("https://www.facebook.com/");
	String actualTitle = Driver.getTitle();
	String expectedTitle = "Facebook - Log In or Sign Up";
	if(actualTitle.equals(expectedTitle))
	{System.out.println("Test Case is Passed");
	}
	else {System.out.println("Test Case is Failed");
	}
	Driver.close();
}
}
