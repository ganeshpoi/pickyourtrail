package honeymoonDealsScenerio;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.DriverFunctions;
import pages.LoginPage;
import pages.pickyourTrialWelcomePage;
import reportGenerartor.ScreenshotGenerator;

public class HoneyMoonDeal {
	
	
	ExtentReports reports;
	ExtentTest log;
	public static WebDriver driver;

	@BeforeTest
	public void lauchBrowser() throws IOException {
		reports=new ExtentReports("report/honeyMoonDeal.html");
		log=reports.startTest("validate Honeymoon deal scenario");
		
		driver = BrowserOpen.openBrowser();
		BrowserOpen.enterURL(driver);
	}

	@Test
	public void vaidateHoneyMoonTravel() throws InterruptedException, IOException {
		LoginPage.userlogin(driver);
		Thread.sleep(2000);
		pickyourTrialWelcomePage.userfilldetails(driver);
		Thread.sleep(2000);
		HoneyMoonPage.selecthoneymoonpackage(driver);
		Itinerarypage.pickyourTrial(driver);
		HMTravelPlanPage.travelplan(driver);

	
}
	
	 @AfterMethod
     public void teardown(ITestResult it) throws IOException{
    	 
	ScreenshotGenerator.generateScreenshot(it, log, driver, reports);
     }
		
}
