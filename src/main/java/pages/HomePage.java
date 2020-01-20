package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static void ClickStartplaning(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/div/a/i")).click();

	}
}
