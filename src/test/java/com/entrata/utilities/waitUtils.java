package com.entrata.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtils {

	public WebDriver driver;

	public waitUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void waitForElement(WebElement element, Duration timeOutInSecond) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSecond);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitvisibleElement(WebElement element, Duration timeOutInSecond) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
