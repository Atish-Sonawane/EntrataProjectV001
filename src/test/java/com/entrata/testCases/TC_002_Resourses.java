package com.entrata.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.entrata.pageObject.ResourcesPage;

public class TC_002_Resourses extends BaseClass {

	@Test
	public void ReadResources() throws IOException, InterruptedException {

		// create a object ResourcesPage
		ResourcesPage rp = new ResourcesPage(driver);

		rp.clickResources();
		
		if (isAlertPresent() == true) {            // handle the alert if present
			driver.switchTo().alert().dismiss();   // close alert
			driver.switchTo().defaultContent();
			
			logger.info("************* alert is present *************");

		} else {
			System.out.println("Alert is not present");
			
			logger.info("************* alert is not present *************");
		}
		
		rp.clickWebinar();
		
		captureScreen(driver, "Wibinars present");  // Tacking Screenshot
		
		logger.info("************* screenshot saved *************");

	}

}
