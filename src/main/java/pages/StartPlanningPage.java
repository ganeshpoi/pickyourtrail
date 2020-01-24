package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPlanningPage {
	public static void startplanning(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start Planning']")));
		
		driver.findElement(By.xpath("//button[text()='Start Planning']")).click();
	}
}
