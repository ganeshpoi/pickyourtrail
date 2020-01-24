package honeymoonDealsScenerio;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.Initializer;

public class PickYourTrialWelcomePage {
	public static void userfilldetails(WebDriver driver) throws IOException {
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(Initializer.getData("MobileNumber"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Initializer.getData("Password"));
		driver.findElement(By.xpath("//button[text()='Login']")).click();
}
}