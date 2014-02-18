package ATT.Selenium_FVT.Utilities.Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ATT.Selenium_FVT.Utilities.Browser.PageSupport;

public abstract class Component extends PageSupport {
	
	public  abstract boolean isDispalyed();

	public Component(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void logout(){
		driver.findElement(By.className("signout")).click();
		implicitWait(3);
		waitForAjaxInactivity();
	}
}
