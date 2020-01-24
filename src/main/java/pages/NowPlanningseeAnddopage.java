package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NowPlanningseeAnddopage {
	
	public static void NowPlanningseeAnddo(WebDriver driver) throws InterruptedException {
	//	driver.findElement(By.xpath("//a[@href ='/customize/eur/month/duration/interests/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button//span[text()='Get a Pickyourtrail itinerary']")).click();
		Thread.sleep(2000);
	}

}
