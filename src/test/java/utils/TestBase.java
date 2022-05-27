package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.Timeout;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\My Stuff\\Saily Course\\Selenium\\Study Material\\Selenium_Rahul\\Rahul_Workspace\\CucumberFramework\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		return driver;
	}
}
