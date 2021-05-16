package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertBox {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.Driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); 
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://the-internet.herokuapp.com/");
		Driver.findElement(By.linkText("JavaScript Alerts")).click();
		Driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		Driver.switchTo().alert().getText();
		
		
	}

}
