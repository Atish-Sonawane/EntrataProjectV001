package com.entrata.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.entrata.pageObject.VerifyTitlePage;

public class TC_004_VerifyTitleOfPage extends BaseClass {
	@Test
	public void verifyTitle() throws IOException, InterruptedException {
		VerifyTitlePage vtp = new VerifyTitlePage(driver);
		
		vtp.clickProduct();
		vtp.clickService();
		String actualtitle = driver.getTitle();
		
		logger.info("************* get actual title  *************");
		
		System.out.println(actualtitle);
		
		String expectedtitle = "Property Management Software | Entrata";
		
		Assert.assertEquals(actualtitle, expectedtitle);               // use Assert Equals

		
		
		if (actualtitle.equals("Property Management Software | Entrata")) {
			Assert.assertTrue(true);                                    // use Assert True

			logger.info("************* Testing pass *************");

		} else {
			captureScreen(driver, "verifyTitle");
			Assert.assertFalse(false);                                  // Use Assert False

			logger.info("************* Testing fail *************");
		}

	}

}
