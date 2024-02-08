package com.entrata.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public String baseURL = readconfig.getApplicationURL(); // store URL in baseURL

	public static WebDriver driver;
	public static Logger logger;

	@BeforeSuite // Run before suite
	public void Beforesuite() {
		Extentmanager.onStart();
	}

	@AfterSuite // Run after suite
	public void Aftersuite() {
		Extentmanager.onFinish();
	}

	@Parameters("browser") // Parameterize the browser
	@BeforeClass
	public void setup(@Optional("chrome") String browser) throws InterruptedException {
		
		logger = Logger.getLogger("entrata");
		PropertyConfigurator.configure("Log4j.properties");

		// Invoke the browser as per mentioned in testng.xml file
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize(); // maximize the window
		driver.get(baseURL); // Opening url
		

		//use try catch for handle cookies
		try {

			// Set up an explicit wait with a maximum timeout of 10 seconds
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Use the explicit wait to wait until the element is present on the page
			WebElement element = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div[3]/div[2]/button[2]")));

			// Perform actions with the element after it becomes present
			element.click();
		} catch (Exception e) {
			// Handle exceptions if the element is not found within the specified timeout
			e.printStackTrace();
		}
		
		System.out.println("Cookies Accepted");
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
	public boolean isAlertPresent() 
	{
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}

}
