package com.entrata.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.entrata.utilities.Extentmanager;
import com.entrata.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	// public String br = readconfig.getBrowserName();
	public String baseURL = readconfig.getApplicationURL();

	public static WebDriver driver;

	@BeforeSuite // Run before suite
	public void Beforesuite() {
		Extentmanager.onStart();
	}

	@AfterSuite // Run after suite
	public void Aftersuite() {
		Extentmanager.onFinish();
	}

	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome") String browser) throws InterruptedException {

		// Invoke the browser as per mentioned in config.properties file
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(baseURL); // Opening url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // use implicitWait for wait

		
		// Handling cookies pop-up getting when fetch the URL
		try {

			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/div[2]/button[2]"));
			if (element.isDisplayed()) {
				element.click();
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("Accept cooikies");
		Thread.sleep(3000);
	}
	
	

	// Run after every class and close the opening browser
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	// create a screenShot Method and will used when need in testCases.
	public void captureScreen(WebDriver driver, String screenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshot/" + screenshotName + ".png");
		FileUtils.copyFile(src, target);
		System.out.println("Screenshot tacken");
	}

	// getting random String for getting unique ID
	public String randomString() {
		String geneateString = RandomStringUtils.randomAlphabetic(7);
		return geneateString;
	}

	// getting random number for getting unique ID
	public String randomNumber() {
		String geneateNumber = RandomStringUtils.randomNumeric(10);
		return geneateNumber;
	}

	// use to check alert is present or not
	public boolean isAlertPresent() // user defined method created to check alert is present or not
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

}
