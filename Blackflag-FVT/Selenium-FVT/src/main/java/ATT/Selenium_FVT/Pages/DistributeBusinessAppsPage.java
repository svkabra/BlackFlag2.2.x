package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class DistributeBusinessAppsPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Certified Solutions Catalog")
	public WebElement certSol;
	
	@FindBy(how = How.LINK_TEXT, using = "Small Business Catalog/S.M.A.R.T")
	public WebElement smart ;
	
	@FindBy(how = How.LINK_TEXT, using = "Certify Your App")
	public WebElement certifyApp;
	
	@FindBy(how = How.LINK_TEXT, using = "The Industry & Mobility Alliance Program (IMAP)")
	public WebElement industryMobilityAllianceProgram;
	
	@FindBy(how = How.LINK_TEXT, using = "Network Services and Messaging Aggregators")
	public WebElement netSrvcMessagingAgg;
	
	@FindBy(how = How.LINK_TEXT, using = "Working with Aggregators")
	public WebElement workingWithAgg;
	
	public DistributeBusinessAppsPage(WebDriver driver) {
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
	
	public void clkCertSol(){
		certSol.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Certified Solutions Catalog", title);		
	}	
	public void clkSmart(){
		smart.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Small Business Catalog/S.M.A.R.T", title);		
	}
	public void clkCertifyApp(){
		certifyApp.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Certify Your App", title);		
	}
	public void clkIndustryMobilityAllianceProgram(){
		industryMobilityAllianceProgram.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("The Industry & Mobility Alliance Program (IMAP)", title);		
	}
	public void clkNetSrvcMessagingAgg(){
		netSrvcMessagingAgg.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Network Services and Messaging Aggregators", title);		
	}		
	
	public void clkWorkingWithAgg(){
		workingWithAgg.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Working with Aggregators", title);		
	}
	
	
}
