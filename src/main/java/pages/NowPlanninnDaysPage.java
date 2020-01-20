package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NowPlanninnDaysPage {
	
	public static void nowplanningdays(WebDriver driver) {
		driver.findElement(By.xpath("//label//span[@class='img int-img-1']")).click();
	}

}
