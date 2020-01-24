package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pickyourTrialWelcomePage {
	public static void userfilldetails(WebDriver driver) throws IOException, InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(Initializer.getData("MobileNumber"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Initializer.getData("Password"));
		driver.findElement(By.xpath("//button[text()='Login']")).click();
}
}