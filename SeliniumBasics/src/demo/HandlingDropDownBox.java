package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandlingDropDownBox {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.Driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); 
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		Driver.findElement(By.partialLinkText("Create New")).click();
		WebElement dayDD = Driver.findElement(By.id("day"));
		Select dd = new Select(dayDD);
		dd.selectByIndex(10);
		
		

}
}
