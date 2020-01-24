package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

	public static void enterURL(WebDriver driver) throws IOException {
		driver.manage().window().maximize();
		driver.get(Initializer.getData("URL"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
