package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class GotoMarketExcel extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Hall of Fame: Developer Success Stories")
	public WebElement hallOfFame;
	
	@FindBy(how = How.LINK_TEXT, using = "Suggested Best Practices")
	public WebElement suggBestPractice ;
	
	@FindBy(how = How.LINK_TEXT, using = "Reach Target Markets")
	public WebElement reachTargetMarket;
	
	
	public GotoMarketExcel(WebDriver driver) {
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
	
	public void clkHallOfFame(){
		hallOfFame.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Hall of Fame: Developer Success Stories", title);		
	}	
	public void clkReachTargetMarket(){
		reachTargetMarket.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Suggested Best Practices", title);		
	}
	public void clkSuggBestPractice(){
		suggBestPractice.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Suggested Best Practices", title);		
	}
	
	
}
