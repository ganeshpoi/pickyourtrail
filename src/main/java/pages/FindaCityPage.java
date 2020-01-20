package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindaCityPage {
	public static void findacity(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//h5[contains(text(), 'Lisbon')]")).click();
		driver.findElement(By.xpath("//span[@class='btn-txt']")).click();
		Thread.sleep(5000);
	}

}
