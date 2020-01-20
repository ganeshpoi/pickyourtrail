package pickyourtrailIntializer;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DriverFunctions;
import pages.FindaCityPage;
import pages.HomePage;
import pages.NowPlanningPage;
import pages.NowPlanningseeAnddopage;
import pages.NowPlanninnDaysPage;
import pages.PickyourTrialPage;
import pages.PlanVactionPage;
import pages.TravelPlanPage;


public class Pickyourtrail {

	public static WebDriver driver;

	@BeforeTest
	public void lauchBrowser() {
		driver = DriverFunctions.openBrowser();
		DriverFunctions.enterURL(driver);
	}

	@Test
	public void confirmTravel() throws InterruptedException {
		HomePage.ClickStartplaning(driver);
		PlanVactionPage.planvocation(driver);
		NowPlanningPage.nowplanning(driver);
		NowPlanninnDaysPage.nowplanningdays(driver);
		NowPlanningseeAnddopage.NowPlanningseeAnddo(driver);
		FindaCityPage.findacity(driver);
		PickyourTrialPage.pickyourTrial(driver);
		TravelPlanPage.travelplan(driver);

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
