package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class ResourcesAlertsPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Suggested Best Practices" )
	public WebElement bestPractices;
	
	@FindBy(how = How.LINK_TEXT, using = "Developer Alerts")
	public WebElement devAlert;
	
	@FindBy(how = How.LINK_TEXT, using = "Podcasts")
	public WebElement podcasts;
	
	@FindBy(how = How.LINK_TEXT, using = "Webcasts On-Demand")
	public WebElement webcastOnDemand;
	
	@FindBy(how = How.LINK_TEXT, using = "White Papers")
	public WebElement whitePaper;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T and Junior Achievement Arduino")
	public WebElement juniorAchievement;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T Network Services Gateway")
	public WebElement netSrvsGateway;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T Developer Program Newsletters")
	public WebElement devProgram;
	
	public ResourcesAlertsPage(WebDriver driver) {
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
	
	public void clkBestPractices(){
		bestPractices.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Suggested Best Practices", title);		
	}	
	public void clkDevAlert(){
		devAlert.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Developer Alerts", title);		
	}
	public void clkDevProgram(){
		devProgram.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T Developer Program Newsletters", title);		
	}
	public void clkJuniorAchievement(){
		juniorAchievement.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T and Junior Achievement Arduino", title);		
	}	
	public void clkNetSrvsGateway(){
		netSrvsGateway.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T Network Services Gateway", title);		
	}
	public void clkPodcasts(){
		podcasts.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Podcasts", title);		
	}
	public void clkWebcastOnDemand(){
		webcastOnDemand.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Webcasts On-Demand", title);		
	}	
	public void clkWhitePaper(){
		whitePaper.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("White Papers", title);		
	}
	
}
