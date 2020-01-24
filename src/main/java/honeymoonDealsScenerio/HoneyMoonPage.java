package honeymoonDealsScenerio;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.Initializer;

public class HoneyMoonPage {
	public static void selecthoneymoonpackage(WebDriver driver) throws IOException, InterruptedException {
		
		//driver.findElement(By.xpath("//div//p[text()='Norway']")).click();
		 Thread.sleep(4000);
		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//div/p[text()='Norway']"));
		 * ((JavascriptExecutor)driver).executeScript(
		 * "arguments[0].scrollIntoView(true)", element); //element.click();
		 * ((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		 * 
		 * 
		 */
		 
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");

			int iframe=driver.findElements(By.tagName("iframe")).size();
			System.err.println(iframe);

			int frame=driver.findElements(By.tagName("frame")).size();
			System.out.println(frame);
			
			int frameset=driver.findElements(By.tagName("frameset")).size();
			System.out.println(frameset);
			
			
			//driver.switchTo().frame(1);
			Thread.sleep(2000);

		List<WebElement> l= driver.findElements(By.xpath(".//span[contains(text(),'Person')]"));

		System.out.println(l.size());
	
			WebElement w=l.get(2);
			
			
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", w);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", w);
			
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[1]/section[2]/div[3]/div[1]/div/a/figure")).click();
		
}
}


