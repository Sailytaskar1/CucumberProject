package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;

	}

	By linkText = By.linkText("Top Deals");
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() {

		return driver.findElement(productName).getText().split("-")[0].trim();

	}

	public void productIncrement(int quantity) {
		for (int i = 0; i <= quantity; i++) {
			driver.findElement(increment).click();
		}
	}

	public void addToCart() {
		driver.findElement(addToCart).click();
	}

	public void SelectTopDeals() {
		driver.findElement(linkText).click();
	}

	public String getTitleOfthePage() {
		return driver.getTitle();
	}
}
