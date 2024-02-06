package com.entrata.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.entrata.pageObject.ContactUsPage;

public class TC_001_ContactUs extends BaseClass { // use Inherit concept and access the properties of parent class

	@Test
	public void contactDetails() throws IOException, InterruptedException {

		ContactUsPage cu = new ContactUsPage(driver); // create a object of ContactUs class

		cu.clickSignIn();
		Thread.sleep(3000);
		cu.clickResidentLogin();
		cu.clickviewWebsite();
		Thread.sleep(3000);

		// scroll to particular element
		cu.scrollToElement();
		Thread.sleep(3000);
		// wait 3 second to scroll to that element

		cu.contactName("Tester");

		// passing the unique mailId everyTime
		String email = randomString() + "@gmail.com";
		cu.contactEmail(email);

		cu.propertyName("Home");
		cu.propertyUrl("property.home/teester.com");
		cu.getCategory("Design");
		cu.getMessage("Design is Good");
		Thread.sleep(3000);
		// cu.btnSubmit();

		// taking ScreenShot for see the all the fields are filled or not
		captureScreen(driver, "Contact Detains");

	}

}
