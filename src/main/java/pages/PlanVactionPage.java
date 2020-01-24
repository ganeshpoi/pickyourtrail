package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PlanVactionPage {
	
	public static void planvocation(WebDriver driver) throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@placeholder='Search from over 3000 cities']")).sendKeys(Initializer.getData("SearchboxInput"),Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		
	}

}
