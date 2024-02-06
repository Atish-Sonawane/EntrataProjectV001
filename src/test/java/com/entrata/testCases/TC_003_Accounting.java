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
		Thread.sleep(3000);

		ap.clickAccounting();
		Thread.sleep(3000);
		ap.clickDemoButton();
		Thread.sleep(3000);
		ap.setFirstName("Tester");
		ap.setLastName("Automation");

		String email = randomString() + "@gmail.com";
		ap.setEmail(email);
		Thread.sleep(3000);
		ap.setCompanyName("xyz");
		ap.setPhoneNo("2343456789");
		Thread.sleep(3000);
		ap.setUnitCount(2);
		Thread.sleep(3000);
		ap.setJobTitle("QA");
		// ap.clickScheduleDemo();
		Thread.sleep(5000);

		// get the screen shot of the Demo Details
		captureScreen(driver, "contact Information for Demo");
	}

}
