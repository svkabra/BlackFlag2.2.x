package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class PlatformNOses extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Android" )
	public WebElement android;
	
	@FindBy(how = How.LINK_TEXT, using = "Brew Mobile Platform")
	public WebElement brewMobilePlatform ;
	
	@FindBy(how = How.LINK_TEXT, using = "HP webOS")
	public WebElement hpWebOS;
	
	@FindBy(how = How.LINK_TEXT, using = "Java ME")
	public WebElement javaME;
	
	@FindBy(how = How.LINK_TEXT, using = "BlackBerry (RIM)")
	public WebElement blackberry;
	
	@FindBy(how = How.LINK_TEXT, using = "Symbian OS")
	public WebElement symbianOS;
	
	@FindBy(how = How.LINK_TEXT, using = "Microsoft Windows Phone OS")
	public WebElement microsoftWinphOS ;
	
	public PlatformNOses(WebDriver driver) {
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
		Assert.assertEquals("Android", title);	
		
	}	
	public void clkBrewMobile(){
		brewMobilePlatform.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Brew Mobile Platform", title);		
	}
	public void clkJavaME(){
		javaME.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Java ME", title);		
	}
	public void clkBlackberry(){
		blackberry.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Blackberry (RIM)", title);		
	}
	public void clkSymbianOS(){
		symbianOS.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Symbian OS", title);		
	}
	public void clkHPWebOs(){
		microsoftWinphOS.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Microsoft Windows Phone OS", title);		
	}
	public MyAppsPage clickMyApps(){
//		waitForElement(btnMyApps).click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}
	
	
	
}
