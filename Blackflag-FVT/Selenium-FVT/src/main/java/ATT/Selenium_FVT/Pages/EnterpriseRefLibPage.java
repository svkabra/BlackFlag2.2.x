package ATT.Selenium_FVT.Pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class EnterpriseRefLibPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Mobile Application Development Best Practices" )
	public WebElement mobileAppDev;
	
	@FindBy(how = How.LINK_TEXT, using = "Mobile Middleware Overview")
	public WebElement mobileMiddleware ;
	
	@FindBy(how = How.LINK_TEXT, using = "Wireless Application Lifecycle")
	public WebElement wirelessAppLifecycle;
	
	@FindBy(how = How.LINK_TEXT, using = "Users and Devices")
	public WebElement usersDevices;
	
	@FindBy(how = How.LINK_TEXT, using = "Wireless Network")
	public WebElement wirelessNet;
	
	@FindBy(how = How.LINK_TEXT, using = "Infrastructure Enablers")
	public WebElement infraEnablers;
	
	@FindBy(how = How.LINK_TEXT, using = "Wireless Application Security")
	public WebElement wirelessAppSec ;
	
	@FindBy(how = How.LINK_TEXT, using = "Glossary")
	public WebElement glossary ;
	
	@FindBy(how = How.LINK_TEXT, using = "Smart Grid Wireless Architecture & Security")
	public WebElement smartGrid ;
	
	@FindBy(how = How.LINK_TEXT, using = "HTML 5")
	public WebElement html5 ;
	
	@FindBy(how = How.LINK_TEXT, using = "Multi Thread Coding in Android")
	public WebElement multithreadedAndroid;

	
	public EnterpriseRefLibPage(WebDriver driver) {
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
	
	public void clkMobileAppDev(){
		mobileAppDev.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Business APP Best Practices | AT&T Developer Program", title);		
	}	
	public void clkMobileMiddleware(){
		mobileMiddleware.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Mobile Middleware Overview", title);		
	}
	public void clkWirelessAppLifecycle(){
		wirelessAppLifecycle.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Wireless Application Lifecycle", title);		
	}
	public void clkUsersDevices(){
		usersDevices.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Users and Devices", title);		
	}
	public void clkWirelessNet(){
		wirelessNet.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Wireless Network", title);		
	}
	public void clkInfraEnablers(){
		infraEnablers.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Infrastructure Enablers", title);		
	}
	
	public void clkWirelessAppSec(){
		wirelessAppSec.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Wireless Application Security", title);		
	}	
	public void clkGlossary(){
		glossary.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Glossary", title);		
	}
	public void clkSmartGrid(){
		smartGrid.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Smart Grid Wireless Architecture & Security", title);		
	}
	public void clkHtml5(){
		html5.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("HTML 5", title);		
	}
	public void clkMultithreadedAndroid(){
		multithreadedAndroid.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Multi Thread Coding in Android", title);		
	}
	
	public MyAppsPage clickMyApps(){
//		waitForElement(btnMyApps).click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}
	
	
}
