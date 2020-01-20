package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NowPlanningPage {
	
	public static void nowplanning(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='pdg-card-content'][1]")).click();
		driver.findElement(By.xpath("//i[@class='tick-icon'][1]")).click();
		Thread.sleep(2000);
		
		
	}

}
