package PageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
	WebDriver driver;
	public OfferPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	By search=By.cssSelector("#search-field");  
	By productName=By.cssSelector("tr td:nth-child(1)");
	
	public void searchItem(String name) {
		driver.findElement(By.cssSelector("#search-field")).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}

}
