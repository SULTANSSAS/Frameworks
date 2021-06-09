package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
@Test
public void verifyInvalidLogin() throws IOException {
	String[][] data = GenericMethods.getData("E:\\Selenium\\TestData.xlsx", "Sheet2");
			Methods mtd = new Methods();
	for(int i = 1;i<data.length;i++) {
		switch(data[i][3]) {
		case "openBrowser":
		mtd.openBrowser();
		break;
		case "maxBrowser":
		mtd.maximizeBrowserWindow();
		break;
		case "impWait":
		mtd.implementImpWait();
		break;
		case "navigateToApp":
		mtd.navigateToApp(data[i][6]);
		break;
		case "enterInTextBox":
			mtd.enterInTextBox(data[i][5], data[i][6]);
			break;
		case "clickButton":
			mtd.clickOnAButton(data[i][4], data[i][5]);
			break;
		case "verifyMsg":
			String actualMsg = mtd.getMessage(data[i][4], data[i][5]);
			String expectedMsg = data[i][6];
			Assert.assertEquals(actualMsg, expectedMsg);
			break;
		case "closeApp":
			mtd.closeApplication();
			break;
			
			
	}
	
}
	
	
	
	
	
	
	

}}
