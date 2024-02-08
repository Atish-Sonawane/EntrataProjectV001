package com.entrata.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entrata.utilities.waitUtils;

public class VerifyTitlePage {
	
	WebDriver driver;
	waitUtils wait;

	// Initializing the WebDriver object
	public VerifyTitlePage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
		wait = new waitUtils(driver);
	}
	
	// locate all the elements in WebElements
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement product;

	@FindBy(xpath = "//div[@class='nav-group']//a[@class='fat-nav-links'][normalize-space()='Digital Marketing Services']")
	@CacheLookup
	WebElement services;
	
	// Creating a Method and do required actions, pass the values through parameterization if required

	public void clickProduct() {
		wait.waitForElement(product, Duration.ofSeconds(10));
		product.click();
	}

	public void clickService() {
		wait.waitForElement(services, Duration.ofSeconds(10));
		services.click();
	}
	

	
	
}
