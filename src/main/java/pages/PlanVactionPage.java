package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PlanVactionPage {
	
	public static void planvocation(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("landing-search-input")).sendKeys("Europe", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);
		
	}

}
