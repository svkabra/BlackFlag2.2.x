package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class LaunchThroughATTPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "AT&T Onboarding: An Overview" )
	public WebElement attOnboarding;
	
	@FindBy(how = How.LINK_TEXT, using = "Working with AT&T")
	public WebElement workingWithAtt ;
	
	@FindBy(how = How.LINK_TEXT, using = "Certification, Signing, and Testing Overview")
	public WebElement certiTestingOverview;
	
	@FindBy(how = How.LINK_TEXT, using = "The AT&T Launch Center")
	public WebElement attLaunchCenter;
	
	@FindBy(how = How.LINK_TEXT, using = "Cross Carrier Efforts")
	public WebElement xCarrierEffort;
	
	@FindBy(how = How.LINK_TEXT, using = "OEM Storefronts")
	public WebElement oemStorefronts;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T Carrier Billing on Third-Party Storefronts")
	public WebElement thirdpartyStorefront;
	
	@FindBy(how = How.LINK_TEXT, using = "Working with Aggregators")
	public WebElement workingWithAgg ;
	
	
	
	public LaunchThroughATTPage(WebDriver driver) {
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
	
	public void clkAttLaunchCenter(){
		attLaunchCenter.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("The AT&T Lauch Center", title);		
	}	
	public void clkAttOnboarding(){
		attOnboarding.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Publish | AT&T Developer Program", title);		
	}
	public void clkCertiTestingOverview(){
		certiTestingOverview.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Certification, Signing, and Testing Overview | AT&T Developer Program", title);		
	}
	public void clkOemStorefronts(){
		oemStorefronts.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("OEM Storefronts", title);		 
	}
	public void clkThirdpartyStorefront(){
		thirdpartyStorefront.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T Carrier Billing on Third-Party Storefronts", title);		
	}
	public void clkWorkingWithAgg(){
		workingWithAgg.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Working with Aggregators", title);		
	}
	
	public void clkWorkingWithAtt(){
		workingWithAtt.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Working with AT&T | AT&T Developer Program", title);		
	}	
	public void clkXCarrierEffort(){
		xCarrierEffort.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Cross Carrier Efforts", title);		
	}
	
	
}
