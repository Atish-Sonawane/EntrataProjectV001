package com.entrata.testCases;

import org.testng.annotations.Test;

import com.entrata.pageObject.AccountingPage;

public class TC_003_Accounting extends BaseClass {
	@Test
	public void Accounting() throws InterruptedException {

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
		ap.setUnitCount(1);
		ap.setJobTitle("QA");
		// ap.clickScheduleDemo();
		Thread.sleep(5000);
	}

}
