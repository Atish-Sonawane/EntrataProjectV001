package com.entrata.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage {
	
	WebDriver driver;

	// Initializing the WebDriver object
	public ResourcesPage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(idriver, this);
	}
	
	@FindBy(xpath = "//a[@class='main-nav-link']")
	@CacheLookup
	WebElement resources;

	@FindBy(xpath = "//div[@class='tab-nav-item guides-tab']")
	@CacheLookup
	WebElement guide;
	
	@FindBy(xpath = "//div[@class='tab-nav-item webinars-tab']")
	@CacheLookup
	WebElement webinars;

	
	

	public void clicResources() {
		resources.click();
	}

	public void clickGuide() {
		guide.click();
	}
	
	public void clickWebinar() {
		webinars.click();
	}


}
