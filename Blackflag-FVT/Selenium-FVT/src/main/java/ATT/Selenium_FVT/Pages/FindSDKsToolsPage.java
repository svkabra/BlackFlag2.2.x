package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class FindSDKsToolsPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "AT&T Toggle" )
	public WebElement attToggle;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T U-verse® Enabled SDK")
	public WebElement uverse ;
	
	@FindBy(how = How.LINK_TEXT, using = "Android SDKs and Tools")
	public WebElement android;
	
	@FindBy(how = How.LINK_TEXT, using = "Brew MP SDK and Tools")
	public WebElement brew;
	
	@FindBy(how = How.LINK_TEXT, using = "HP webOS SDK and Tools")
	public WebElement hpWebOs;
	
	@FindBy(how = How.LINK_TEXT, using = "HTML5 UI Elements")
	public WebElement html5;
	
	@FindBy(how = How.LINK_TEXT, using = "Java SDK and Tools")
	public WebElement java;
	
	@FindBy(how = How.LINK_TEXT, using = "SOAP Parlay X")
	public WebElement soap ;
	
	@FindBy(how = How.LINK_TEXT, using = "Nokia Qt SDK")
	public WebElement nokia ;
	
	@FindBy(how = How.LINK_TEXT, using = "Blackberry (RIM) SDKs and Tools")
	public WebElement blackberry ;
	
	@FindBy(how = How.LINK_TEXT, using = "Wholesale Applications Community")
	public WebElement wholesaleApp ;
	
	@FindBy(how = How.LINK_TEXT, using = "Windows Phone SDKs and Tools")
	public WebElement windowsPh;
	
	@FindBy(how = How.LINK_TEXT, using = "Cross-Platform SDKs and Tools")
	public WebElement xPlatform;
	
	public FindSDKsToolsPage(WebDriver driver) {
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
	
	public void clkAndroid(){
		android.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Android SDKs and Tools from AT&T Developer Program", title);		
	}	
	public void clkAttToggle(){
		attToggle.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T Toggle Preferred Partner Program", title);		
	}
	public void clkBlackberry(){
		blackberry.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Blackberry (RIM) SDKs and Tools", title);		
	}
	public void clkBrew(){
		brew.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Brew MP SDK and Tools", title);		
	}
	public void clkHpWebOs(){
		hpWebOs.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("HP webOS SDK and Tools", title);		
	}
	public void clkHtml5(){
		html5.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("HTML5 UI Elements from AT&T Developer Program", title);		
	}
	
	public void clkJava(){
		java.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Java SDK and Tools", title);		
	}	
	public void clkNokia(){
		nokia.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Nokia Qt SDK", title);		
	}
	public void clkSoap(){
		soap.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("SOAP Parlay X", title);		
	}
	public void clkUverse(){
		uverse.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T U-verse Enabled SDK", title);		
	}
	public void clkWholesaleApp(){
		wholesaleApp.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Wholesale Applications Community", title);		
	}
	public void clkWindowsPh(){
		windowsPh.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Windows Phone SDKs and Tools", title);		
	}
	public void clkXPlatform(){
		xPlatform.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Cross-Platform SDKs and Tools", title);		
	}
	public MyAppsPage clickMyApps(){
//		waitForElement(btnMyApps).click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}
	
	
}
