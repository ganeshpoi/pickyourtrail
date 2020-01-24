package honeymoonDealsScenerio;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.Initializer;

public class HMTravelPlanPage {
	public static void travelplan(WebDriver driver) throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@placeholder='Departing from']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search cities']")).sendKeys(Initializer.getData("DepartingFrom"),Keys.ENTER);
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='departure-date-get-cost']")).click();
	}
	
		public static void picDate(WebDriver driver, String d) throws InterruptedException {
			Thread.sleep(3000);
			List<WebElement> date=driver.findElements(By.xpath(".//div[@role='option']"));
		for (int i =0;i<date.size();i++) {
			String cd=date.get(i).getText();
			if (cd.trim().equals(d.trim())) {
				date.get(i).click();
				break;
			}
		}
		
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Departing on']")).click();
		//WebElement date=driver.findElement(By.xpath("//input[@placeholder='Departing on']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='27/01/2020'", date);
		//driver.findElement(By.xpath("//button[@class='sc-gZMcBi sc-likbZx gLhnyj']")).click();
		
		
		/*
		 * Actions a =new Actions(driver); a.sendKeys(Keys.ESCAPE).build().perform();
		 */
		
		
}
		public static void submit(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		/*
		 * WebElement gotIt=driver.findElement(By.xpath("//button[text()='Get Cost']"));
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click()", gotIt);
		 */
		
	

		//driver.navigate().refresh();
		//Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']"))
	//driver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.btn-block.tracker-get-cost-modal-update-cost")).sendKeys(Keys.ENTER);	

		driver.findElement(By.xpath("//button[text()='Get Cost']")).click();
		}
}


