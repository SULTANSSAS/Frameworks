package com.webappsecurity.zero.TestScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFunds;
import com.webappsecurity.zero.Pages.TransferFundsConfirmation;
import com.webappsecurity.zero.Pages.TransferFundsVerify;

public class VerifyTransferFundsTest extends Base {
	
	
@Test
public void verifyTransferFunds() {
	Login lp = new Login(driver);
	AccountSummary act = new AccountSummary(driver);
	TransferFunds tf = new TransferFunds(driver);
	TransferFundsVerify tfv = new TransferFundsVerify(driver);
	TransferFundsConfirmation tfc = new  TransferFundsConfirmation(driver);
	lp.appLogin("username","password");
	act.click111();
	tf.fundTransfer("1000", "description");
	tfv.click1();
	String actualText = tfc.getConfText();
	String expectedText = "You successfully submitted your transaction.";
	Assert.assertEquals(actualText, expectedText);
			
	
}

}
