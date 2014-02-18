package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class EnablingTechnologiesPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Emerging" )
	public WebElement emerging;
	
	@FindBy(how = How.LINK_TEXT, using = "Primary")
	public WebElement primary ;
	
	@FindBy(how = How.LINK_TEXT, using = "Secondary")
	public WebElement secondary;
	
	
	public EnablingTechnologiesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public void openURL() {
		// TODO Auto-generated method stub
		driver.get("");
		
	}
	
	public void openURL(String URL){
		implicitWait(2);
		driver.get(URL);
		waitForPageToLoad();
		waitForAjaxInactivity();
	}
	
	public void clkEmerging(){
		emerging.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Emerging", title);		
	}	
	public void clkPrimary(){
		primary.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("primay", title);		
	}
	public void clkSecondary(){
		secondary.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Secondary", title);		
	}
	
	
}
