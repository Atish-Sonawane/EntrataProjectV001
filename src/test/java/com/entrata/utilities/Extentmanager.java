package com.entrata.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentmanager extends TestListenerAdapter {
	//This Class Used to create Extent Report for better understanding using Listeners

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void onStart() {
		
		//We adding a timeStamp to create new report without washing previous one
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String reportname = "Test-Teport" + timestamp + ".html";
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Report/myRepot");
		
        //Set the headline and theme
		htmlReporter.config().setDocumentTitle("InetBanking test project");
		htmlReporter.config().setReportName("Functional Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		
        //Give all basic and system information
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("hostname", "LocalHost");
		extent.setSystemInfo("Envirinment", "QA");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Tester Name", "Atish");
		extent.setSystemInfo("Browser", "Chrome");
	}
	
    //Invoked when a test case or a test method executed successfully
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
	}

	//Invoked when a test case or a test method fails during execution
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + result.getName() + ".png";

		File f = new File(screenshotPath);

		if (f.exists()) {
			try {
				test.fail("Screenshot is below:" + test.addScreenCaptureFromPath(screenshotPath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    
	//Invoked when a test case Skipped during execution
	public void onTestSkip(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in the report
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
	}
	
    //To ensure all test steps and information are updated in the Extent report
	public static void onFinish() {
		extent.flush();
	}

}
