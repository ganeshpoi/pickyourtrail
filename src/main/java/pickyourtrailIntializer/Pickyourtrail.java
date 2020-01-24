package pickyourtrailIntializer;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sun.org.apache.xpath.internal.operations.Equals;

import pages.DriverFunctions;
import pages.FindaCityPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NowPlanningPage;
import pages.NowPlanningseeAnddopage;
import pages.NowPlanninnDaysPage;
import pages.PickyourTrialPage;
import pages.PlanVactionPage;
import pages.StartPlanningPage;
import pages.TravelPlanPage;
import pages.pickyourTrialWelcomePage;
import reportGenerartor.ScreenshotGenerator;


public class Pickyourtrail {

	ExtentReports reports;
	ExtentTest log;
	public static WebDriver driver;

	@BeforeTest
	public void lauchBrowser() throws IOException {
		reports=new ExtentReports("report/pickyourtrail.html");
		log=reports.startTest("validate pick your trail scenario");
		
		driver = DriverFunctions.openBrowser();
		DriverFunctions.enterURL(driver);
	}

	@Test
	public void validatePickyourTrail() throws InterruptedException, IOException {
		LoginPage.userlogin(driver);
		Thread.sleep(2000);
		pickyourTrialWelcomePage.userfilldetails(driver);
		Thread.sleep(2000);
		StartPlanningPage.startplanning(driver);
		Thread.sleep(2000);
		//HomePage.ClickStartplaning(driver);
		PlanVactionPage.planvocation(driver);
		 NowPlanningPage.nowplanning(driver);
		  NowPlanninnDaysPage.nowplanningdays(driver);
		  NowPlanningseeAnddopage.NowPlanningseeAnddo(driver);
		  //FindaCityPage.findacity(driver); 
		  PickyourTrialPage.pickyourTrial(driver);
		  //Print given Title
		  TravelPlanPage.travelplan(driver);
		  Thread.sleep(2000);		
		  TravelPlanPage. picDate(driver,"25");
		  TravelPlanPage.submit(driver);
		  
	}
	
	
	 @AfterMethod
     public void teardown(ITestResult it) throws IOException{
    	 
	ScreenshotGenerator.generateScreenshot(it, log, driver, reports);
     }
	}
	
	/*@AfterTest
	public void tearDown() {
		driver.close();
	*/
	
