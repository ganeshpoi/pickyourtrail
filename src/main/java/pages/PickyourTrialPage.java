package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PickyourTrialPage {

	public static void pickyourTrial(WebDriver driver) throws InterruptedException, IOException {
	
		
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Got It']")));
		 
		
		WebElement gotIt=driver.findElement(By.xpath("//a[text()='Got It']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", gotIt);
		
		driver.findElement(By.xpath("//button[text()='Get trip cost'][1]")).click();
		Thread.sleep(2000);
		WebElement edit=driver.findElement(By.xpath("//h1[@id='title_editable']"));
		js.executeScript("arguments[0].click()", edit);
		
		String m=edit.getText();
		for(int i=0;i<m.length();i++) {
		edit.sendKeys(Keys.BACK_SPACE);
		}
		edit.sendKeys(Initializer.getData("EditItinerary"));
		//driver.findElement(By.xpath("//h1[@id='title_editable']")).clear();
	}
}
	