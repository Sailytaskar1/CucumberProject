package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SwitchToChildWindow() {
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String ParentWindow=it.next();
		String Childwindow=it.next();
		driver.switchTo().window(Childwindow);
	}

}
