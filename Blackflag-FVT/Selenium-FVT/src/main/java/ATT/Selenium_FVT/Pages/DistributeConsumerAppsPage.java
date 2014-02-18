package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class DistributeConsumerAppsPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "AT&T AppCenter")
	public WebElement appCenter;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T U-verse® Enabled Marketing")
	public WebElement uverseMarketing ;
	
	@FindBy(how = How.LINK_TEXT, using = "att.net Overview and Search")
	public WebElement attNetOverview;
	
	@FindBy(how = How.LINK_TEXT, using = "Feature Your Apps on AT&T")
	public WebElement featureApp;
	
	@FindBy(how = How.LINK_TEXT, using = "Mobile Purchases and Downloads (Carrier Billing)")
	public WebElement mobilePurchaseDwnld;
	
	@FindBy(how = How.LINK_TEXT, using = "Network Services and Messaging Aggregators ")
	public WebElement netSrvMsgAgg;
	
	@FindBy(how = How.LINK_TEXT, using = "PlayPhone")
	public WebElement playphone ;
	
	@FindBy(how = How.LINK_TEXT, using = "Working with Aggregators")
	public WebElement workingWithAgg;
	
	@FindBy(how = How.LINK_TEXT, using = "Appnique™App Store SEO")
	public WebElement appStoreSeo;
	
	public DistributeConsumerAppsPage(WebDriver driver) {
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
	
	public void clkNetSrvMsgAgg(){
		netSrvMsgAgg.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Network Services and Messaging Aggregators", title);		
	}	
	public void clkAppCenter(){
		appCenter.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T AppCenter: Storefront for Apps and Games", title);		
	}	
	public void clkAppStoreSeo(){
		appStoreSeo.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T U-verse® Enabled Marketing", title);		
	}
	public void clkAttNetOverview(){
		attNetOverview.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("att.net Overview and Search", title);		
	}
	public void clkMobilePurchaseDwnld(){
		mobilePurchaseDwnld.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Mobile Purchases and Downloads (Carrier Billing)", title);		
	}
	public void clkPlayphone(){
		playphone.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Playphone", title);		
	}
	public void clkUverseMarketing(){
		uverseMarketing.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Appnique™App Store SEO", title);		
	}
	public void clkWorkingWithAgg(){
		workingWithAgg.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Working with Aggregators", title);		
	}
	public void clkFeatureApp(){
		featureApp.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Feature Your Apps on AT&T", title);		
	}
	
}
