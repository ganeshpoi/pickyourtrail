package reportGenerartor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ScreenshotGenerator {

	public static void generateScreenshot(ITestResult it,ExtentTest log, WebDriver driver, ExtentReports reports) throws IOException {
		if(it.isSuccess())
   	 {
   	 String path=takeScreenshot(it.getName(), driver);
   	 
   	 log.log(LogStatus.PASS, "testcase pass", log.addScreenCapture(path));
   	 }else 
   	 {
       	 String path=takeScreenshot(it.getName(), driver);
       	 log.log(LogStatus.FAIL, "Test Case failed", log.addScreenCapture(path));
         }
   	 reports.endTest(log);
   	 reports.flush();
	}

	public static String takeScreenshot(String name, WebDriver driver) throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst=new File("screenshot/"+name+".jpg");
		FileHandler.copy(src, dst);
		return dst.toString();	
	}

}
