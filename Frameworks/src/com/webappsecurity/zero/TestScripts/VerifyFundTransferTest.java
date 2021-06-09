package com.webappsecurity.zero.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFunds;
import com.webappsecurity.zero.Pages.TransferFundsConfirmation;
import com.webappsecurity.zero.Pages.TransferFundsVerify;

import utils.GenericMethods;

public class VerifyFundTransferTest extends Base {
	@Test

	public void verifyFundTransfer() throws IOException {
		Login lp = new Login(driver);
		AccountSummary act = new AccountSummary(driver);
		TransferFunds tf = new TransferFunds(driver);
		TransferFundsVerify tfv = new TransferFundsVerify(driver);
		TransferFundsConfirmation tfc = new  TransferFundsConfirmation(driver);
		String[][] data = GenericMethods.getData("E:\\SelApl18\\TestData.xlsx", "Sheet1");
		for(int i = 1;i<data.length;i++) {
		
		lp.appLogin(data[i][0],data[i][1]);
		act.click111();
		tf.fundTransfer(data[i][2], data[i][3]);
		tfv.click1();
		String actualText = tfc.getConfText();
		String expectedText = data[i][4];
		Assert.assertEquals(actualText, expectedText);
		tfc.appLogout();
		
		driver.get("http://zero.webappsecurity.com/login.html");
		
	}
	
	
	
	}}
