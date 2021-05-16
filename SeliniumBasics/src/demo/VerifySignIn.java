package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class VerifySignIn {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.Driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); 
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Driver.switchTo().frame("classFrame");
		Driver.findElement(By.linkText("HELP")).click();
		Driver.switchTo().defaultContent();
		Driver.switchTo().frame("packageFrame");
		Driver.close();
		
		
		
		
		
		
		

}
}