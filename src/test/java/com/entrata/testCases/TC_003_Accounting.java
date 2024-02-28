package com.entrata.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.entrata.pageObject.AccountingPage;

public class TC_003_Accounting extends BaseClass {

	@Test
	public void Accounting() throws InterruptedException, IOException {

		// create a object AccountingPage
		AccountingPage ap = new AccountingPage(driver);

		ap.scrollToElement();
		ap.clickAccounting();
		logger.info("************* select Accounting *************");
		ap.clickDemoButton();
		logger.info("************* click on Demo *************");

		ap.setFirstName("Tester");
		ap.setLastName("Automation");
		ap.setCompanyName("xyz");
		ap.setUnitCount(2);
		ap.setJobTitle("QA");

		logger.info("************* proving random mail *************");
		String email = randomString() + "@gmail.com";
		ap.setEmail(email);

		String phone = randomNumber();
		ap.setPhoneNo(phone);

		logger.info("************* proving contact Details  *************");

		captureScreen(driver, "contact Information for Demo"); // Tacking Screenshot

		logger.info("************* screenshot is saved  *************");

	}

}
