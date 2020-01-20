package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TravelPlanPage {

	public static void travelplan(WebDriver driver) {
		driver.findElement(By.xpath("//input[@placeholder='Departing from']")).click();
		driver.findElement(By.xpath("//li//span[text()='MAA']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Departing on']")).click();
		WebElement date=driver.findElement(By.xpath("//input[@placeholder='Departing on']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='27/01/2020'", date);
		Actions a =new Actions(driver);
		a.sendKeys(Keys.ESCAPE).build().perform();
		
		
}
}
