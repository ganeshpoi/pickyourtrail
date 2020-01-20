package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFunctions {

	public static WebDriver openBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\2020 Interview\\workspace\\Lib\\chromedriver.exe");
		return new ChromeDriver(options);

	}

	public static void enterURL(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://pickyourtrail.com/");
	}
}
