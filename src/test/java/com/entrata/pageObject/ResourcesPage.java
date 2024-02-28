package com.entrata.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entrata.utilities.waitUtils;

public class ResourcesPage {

	WebDriver driver;
	waitUtils wait;

	// Initializing the WebDriver object
	public ResourcesPage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
		wait = new waitUtils(driver);
	}

	// locate all the elements in WebElements

	@FindBy(xpath = "(//div[@class='main-nav-link'])[3]")
	@CacheLookup
	WebElement resources;

	@FindBy(xpath = "//div[@class='header-drop-nav']//a[@class='fat-nav-links'][normalize-space()='Webinars']")
	@CacheLookup
	WebElement webinars;

	// Creating a Method and do required action

	public void clickResources() {
		wait.waitForElement(resources, Duration.ofSeconds(10));
		resources.click();
	}

	public void clickWebinar() {
		wait.waitForElement(webinars, Duration.ofSeconds(10));
		webinars.click();
	}

}
