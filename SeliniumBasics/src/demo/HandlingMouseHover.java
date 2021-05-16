package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.Driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); 
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://www.amazon.com/");
		WebElement accSignIn = Driver.findElement(By.id("nav-link-accountList"));
		Actions hover = new Actions(Driver);
		hover.moveToElement(accSignIn).perform();
		Driver.findElement(By.linkText("Account")).click();
		

}
}
