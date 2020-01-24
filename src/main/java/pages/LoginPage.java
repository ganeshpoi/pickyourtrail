package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public static void userlogin(WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Login']")).click();

}
}