package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By cartBag=By.cssSelector("img[alt='Cart']");
	By cartProceedbtn=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn=By.cssSelector(".promoBtn");
	By orderBtn=By.xpath("//button[contains(text(),'Place Order')]");
	
    public void CheckoutItems() {
    	driver.findElement(cartBag).click();
    	driver.findElement(cartProceedbtn).click();
    }
    
    public Boolean VerifyPromobutton()
    {
    	return driver.findElement(promoBtn).isDisplayed();
    }
    
    public Boolean VerifyPlaceOrderButton()
    {
    	return driver.findElement(orderBtn).isDisplayed();
    }
    
 
	
	
}
