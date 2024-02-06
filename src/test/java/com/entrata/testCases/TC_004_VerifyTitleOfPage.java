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
		Thread.sleep(3000);
		vtp.clickService();
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "Property Management Software | Entrata";
		
		Assert.assertEquals(actualtitle, expectedtitle);               // use Assert Equals

		
		Thread.sleep(3000);
		
		if (actualtitle.equals("Property Management Software | Entrata")) {
			Assert.assertTrue(true);                                    // use Assert True

			System.out.println("Test pass");

		} else {
			captureScreen(driver, "verifyTitle");
			Assert.assertFalse(false);                                  // Use Assert False

			System.out.println("Test fail");
		}

	}

}
