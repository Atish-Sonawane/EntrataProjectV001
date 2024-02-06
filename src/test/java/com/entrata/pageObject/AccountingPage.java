package com.entrata.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountingPage {

	WebDriver driver;

	// Initializing the WebDriver object
	public AccountingPage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(idriver, this);
	}
	
	@FindBy(xpath = "//h3[normalize-space()='Accounting']")
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
	
	@FindBy(xpath = "//h3[normalize-space()='Accounting']")
	@CacheLookup
	WebElement yourElement;

	// Do the required actions and pass the value through parameterization if
	
	public void scrollToElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", yourElement);
	}
	

	public void clickAccounting() {
		lnkAccounting.click();
	}

	public void clickDemoButton() {
		btnDemo.click();
	}
	
	public void setFirstName(String fname) {
		txtfirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtlastName.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setCompanyName(String cname) {
		txtcompanyName.sendKeys(cname);
	}
	
	public void setPhoneNo(String phno) {
		txtphoneNo.sendKeys(phno);
	}
	
	public void setUnitCount(int num) {
		Select dropdown = new Select(txtunitCount);
		dropdown.deselectByIndex(num);
	}
	
	public void setJobTitle(String jtitle) {
		txtjobTitle.sendKeys(jtitle);
	}
	
	public void clickScheduleDemo() {
		btnScheduleDemo.click();
	}
	
	


}
