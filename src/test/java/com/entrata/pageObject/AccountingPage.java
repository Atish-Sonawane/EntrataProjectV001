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

public class AccountingPage {

	WebDriver driver;
    waitUtils wait;

	// Initializing the WebDriver object
	public AccountingPage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(idriver, this);
		wait = new waitUtils(driver);
	}

	// locate all the elements in WebElements

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div[3]/div/div[2]/div/a[3]")
	@CacheLookup
	WebElement lnkAccounting;

	@FindBy(xpath = "//a[normalize-space()='Request Demo']")
	@CacheLookup
	WebElement btnDemo;

	@FindBy(id = "FirstName")
	@CacheLookup
	WebElement txtfirstName;

	@FindBy(id = "LastName")
	@CacheLookup
	WebElement txtlastName;

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Company")
	@CacheLookup
	WebElement txtcompanyName;

	@FindBy(id = "Phone")
	@CacheLookup
	WebElement txtphoneNo;

	@FindBy(id = "Unit_Count__c")
	@CacheLookup
	WebElement txtunitCount;

	@FindBy(id = "Title")
	@CacheLookup
	WebElement txtjobTitle;

	@FindBy(xpath = "//button[normalize-space()='Schedule Demo']")
	@CacheLookup
	WebElement btnScheduleDemo;

	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div[3]/div/div[2]/div/a[3]")
	@CacheLookup
	WebElement yourElement;

	// Creating a Method and do required actions, passing the values through parameterization if required

	public void scrollToElement() {
		wait.waitForElement(yourElement, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", yourElement); // Scroll to particular element
	}

	public void clickAccounting() throws InterruptedException {
		wait.waitForElement(lnkAccounting, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", lnkAccounting);
	}

	public void clickDemoButton() throws InterruptedException {
		wait.waitForElement(btnDemo, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btnDemo);
	}

	public void setFirstName(String fname) {
		wait.waitvisibleElement(txtfirstName, Duration.ofSeconds(20));
		txtfirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		wait.waitvisibleElement(txtlastName, Duration.ofSeconds(20));
		txtlastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		wait.waitvisibleElement(txtEmail, Duration.ofSeconds(20));
		txtEmail.sendKeys(email);
	}

	public void setCompanyName(String cname) {
		wait.waitvisibleElement(txtcompanyName, Duration.ofSeconds(20));
		txtcompanyName.sendKeys(cname);
	}

	public void setPhoneNo(String phno) {
		wait.waitvisibleElement(txtphoneNo, Duration.ofSeconds(20));
		txtphoneNo.sendKeys(phno);
	}

	public void setUnitCount(int num) {
		wait.waitvisibleElement(txtunitCount, Duration.ofSeconds(20));
		Select dropdown = new Select(txtunitCount);
		dropdown.selectByIndex(num); // Select dropDown by Index
	}

	public void setJobTitle(String jtitle) {
		wait.waitvisibleElement(txtjobTitle, Duration.ofSeconds(20));
		wait.waitvisibleElement(txtjobTitle, Duration.ofSeconds(20));
		txtjobTitle.sendKeys(jtitle);
	}

	public void clickScheduleDemo() {
		btnScheduleDemo.click();
	}

}
