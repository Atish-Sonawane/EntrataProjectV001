package com.entrata.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.entrata.pageObject.ResourcesPage;

public class TC_002_Resourses extends BaseClass {

	@Test
	public void ReadResources() throws IOException, InterruptedException {
		
		// create a object ResourcesPage
		ResourcesPage rp = new ResourcesPage(driver);
		
		//click on Resources link
		rp.clicResources();
		Thread.sleep(3000);
		//click on Guide link
		rp.clickGuide();
		Thread.sleep(3000);
		//click on Webinars link
		rp.clickWebinar();
		// get the screen shot of webinars
		captureScreen(driver, "Wibinars present");
		
	}
	
	
	
	
}
