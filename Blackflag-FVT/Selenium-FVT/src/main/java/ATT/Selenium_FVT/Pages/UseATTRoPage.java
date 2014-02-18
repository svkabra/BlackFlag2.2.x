package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class UseATTRoPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Testing")
	public WebElement testing;
	
	@FindBy(how = How.LINK_TEXT, using = "Analysis")
	public WebElement analysis ;
	
	@FindBy(how = How.LINK_TEXT, using = "Optimization")
	public WebElement optimization;
	
	
	public UseATTRoPage(WebDriver driver) {
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
	
	public void clkanalysis(){
		analysis.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Analysis", title);		
	}	
	public void clkTesting(){
		testing.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Testing", title);		
	}
	public void clkOptimization(){
		optimization.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Optimization", title);		
	}
	
	
}
