package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	WebDriver driver;
	public void openBrowser() {
		driver = new ChromeDriver();
		
	}
public void maximizeBrowserWindow() {
	driver.manage().window().maximize();	
}
public void implementImpWait()
{driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
public void navigateToApp(String url) {
	driver.get(url);
}
public void enterInTextBox(String locValue, String value) {
	driver.findElement(By.id(locValue)).sendKeys(value);
	
	
}
public void clickOnAButton(String loc, String locValue) {
	if(loc.equals("name")) {
	driver.findElement(By.name(locValue)).click();
}
	else if(loc.equals("xpath")) {
		driver.findElement(By.xpath(locValue)).click();
	}}
public String getMessage(String loc, String locValue) {
	String errorMsg = null;
	if(loc.equals("id")) {
		errorMsg = driver.findElement(By.id(locValue)).getText();}
else if(loc.equals("cssSelector")) {
	errorMsg = driver.findElement(By.cssSelector(locValue)).getText();}
	return errorMsg;
}
public void closeApplication() {
	driver.close();
	
}
}
