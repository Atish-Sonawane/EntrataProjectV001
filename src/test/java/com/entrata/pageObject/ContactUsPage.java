package com.entrata.pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.entrata.utilities.waitUtils;

public class ContactUsPage {

	WebDriver driver;
	waitUtils wait;

	// Initializing the WebDriver object
	public ContactUsPage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
		wait = new waitUtils(driver);
	}

	// locate all the elements in WebElements

	@FindBy(xpath = "//a[@class='button-default outline-dark-button']")
	@CacheLookup
	WebElement buttonSignIn;

	@FindBy(xpath = "//a[@title='Resident Portal Login Button']")
	@CacheLookup
	WebElement linkResidentLogin;

	@FindBy(xpath = "//div[@class='start-button website-button']")
	@CacheLookup
	WebElement buttonViewWebsite;

	@FindBy(id = "name")
	@CacheLookup
	WebElement txtName;

	@FindBy(id = "email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "property_name")
	@CacheLookup
	WebElement txtPropertyName;

	@FindBy(id = "property_url")
	@CacheLookup
	WebElement txtPropertyUrl;

	@FindBy(id = "category")
	@CacheLookup
	WebElement ddCategory;

	@FindBy(id = "message")
	@CacheLookup
	WebElement txtMesssage;

	@FindBy(xpath = "//button[@id='contact-submit']")
	@CacheLookup
	WebElement btnSubmit;

	@FindBy(xpath = "//p[contains(text(),'If you have any questions or feedback, please fill')]")
	@CacheLookup
	WebElement yourElement;

	// Creating a Method and do required actions, passing the values through parameterization if required

	public void scrollToElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", yourElement); // Scroll to particular element
	}

	public void clickSignIn() {
		wait.waitForElement(buttonSignIn, Duration.ofSeconds(10));
		buttonSignIn.click();
	}

	public void clickResidentLogin() {
		wait.waitForElement(linkResidentLogin, Duration.ofSeconds(10));
		linkResidentLogin.click();
	}

	public void clickviewWebsite() {
		wait.waitForElement(buttonViewWebsite, Duration.ofSeconds(10));
		buttonViewWebsite.click();
	}

	public void contactName(String cname) {
		txtName.sendKeys(cname);
	}

	public void contactEmail(String caddress) {
		txtEmail.sendKeys(caddress);
	}

	public void propertyName(String pname) {
		txtPropertyName.sendKeys(pname);
	}

	public void propertyUrl(String purl) {
		txtPropertyUrl.sendKeys(purl);
	}

	public void getCategory(String valueToSelect) {
		Select dropdown = new Select(ddCategory);
		dropdown.selectByVisibleText(valueToSelect); // Select dropDown by visibleText
	}

	public void getMessage(String message) {
		txtMesssage.sendKeys(message);
	}

	public void btnSubmit() {
		btnSubmit.click();
	}

}
