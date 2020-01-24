package honeymoonDealsScenerio;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Itinerarypage {
	public static void pickyourTrial(WebDriver driver) throws InterruptedException {
		
		Set<String> s =driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		String pid=it.next();
		String cid=it.next();
		
		driver.switchTo().window(cid);
		
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.elementToBeClickable(By.
		  xpath(".//a[text()='Got It']")));
		 
		/*
		 * Actions a =new Actions(driver); a.sendKeys(Keys.ESCAPE).build().perform();
		 */
		/*
		 * Thread.sleep(2000); JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click()",
		 * driver.findElement(By.xpath(".//button[text()='Get latest cost']")));
		 *///driver.findElement(By.xpath(".//button[text()='Get latest cost']")).click();
		
		/*
		 * Thread.sleep(5000); System.err.println("element is present");
		 * 
		 * driver.switchTo().frame("_hjRemoteVarsFrame"); Thread.sleep(6000); 
		 * 
		 * driver.findElement(By.xpath("//button[text()='Get latest cost'][1]")).click()
		 * ;
		 */
	
		  WebElement gotIt=driver.findElement(By.xpath(".//a[text()='Got It']"));
			  
			 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", gotIt);
		  driver.findElement(By.xpath("//button[text()='Get latest cost'][1]")).click();
		 
		  

}
}