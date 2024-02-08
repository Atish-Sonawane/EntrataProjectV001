package com.entrata.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.entrata.pageObject.ContactUsPage;

public class TC_001_ContactUs extends BaseClass { // use Inherit concept and access the properties of parent class

	@Test
	public void contactDetails() throws IOException, InterruptedException {

		ContactUsPage cu = new ContactUsPage(driver); // create a object of ContactUs class

		cu.clickSignIn();
		cu.clickResidentLogin();
		cu.clickviewWebsite();
		cu.scrollToElement();
		
		logger.info("************* scroll to contact-us  *************");

		cu.contactName("Tester");
		cu.propertyName("Home");
		cu.propertyUrl("property.home/teester.com");
		cu.getCategory("Design");
		cu.getMessage("Design is Good");

		String email = randomString() + "@gmail.com";  // getting unique emailId
		cu.contactEmail(email);
		
		logger.info("************* providing the contact details *************");

		captureScreen(driver, "Contact Details");      // Tacking Screenshot
		
		logger.info("************* screenshot saved *************");

	}

}
