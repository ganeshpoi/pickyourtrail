package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PickyourTrialPage {

	public static void pickyourTrial(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Got It']")).click();
		driver.findElement(By.xpath("//*[@id=\"itinerary_page\"]/section[2]/div/div[2]/button")).click();
		Thread.sleep(2000);
	}
}
