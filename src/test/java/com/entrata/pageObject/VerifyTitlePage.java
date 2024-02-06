package com.entrata.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyTitlePage {
	WebDriver driver;

	// Initializing the WebDriver object
	public VerifyTitlePage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(idriver, this);
	}
	
	// locator of all require element
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement product;

	@FindBy(xpath = "//div[@class='nav-group']//a[@class='fat-nav-links'][normalize-space()='Digital Marketing Services']")
	@CacheLookup
	WebElement services;
	
	

	public void clickProduct() {
		product.click();
	}

	public void clickService() {
		services.click();
	}
	

	
	
}
