package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class PricingPage extends WebPage {
	
	
	// Page Object "APIs"
	@FindBy(how = How.LINK_TEXT, using = "Go to My Apps")
	public WebElement goToMyAppLink;
	
	// Page Object "Pricing"
	@FindBy(how = How.LINK_TEXT, using = "Pricing")
	public WebElement pricing;
	
	// Page Object "SpeechPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[1]/ul/li[2]/a")
	public WebElement speechPricingInformation;

	// Page Object "DeviceCapabilitiesPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[2]/ul/li[2]/a")
	public WebElement deviceCapabilitiesPricingInformation;

	// Page Object "InAppMessagingPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[3]/ul/li[2]/a")
	public WebElement inAppMessagingPricingInformation;

	// Page Object "SMSMMSPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[4]/ul/li[2]/a")
	public WebElement sMSMMSPricingInformation;

	// Page Object "AdvertisingPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[5]/ul/li[2]/a")
	public WebElement advertisingPricingInformation;

	// Page Object "PaymentPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[6]/ul/li[2]/a")
	public WebElement paymentPricingInformation;

	// Page Object "ATTmHealthPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[7]/ul/li[2]/a")
	public WebElement aTTmHealthPricingInformation;

	// Page Object "ATTM2XPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[8]/ul/li[2]/a")
	public WebElement aTTM2XPricingInformation;

	// Page Object "ATTUverseEnabledPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[9]/ul/li[2]/a")
	public WebElement aTTUverseEnabledPricingInformation;
	
	// Page Object "ATTAROPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[10]/ul/li[2]/a")
	public WebElement aTTAROPricingInformation;
	
	// Page Object "MobileIdentityAPIToolkitPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[11]/ul/li[2]/a")
	public WebElement mobIdAPITlktPricingInformation;

	// Page Object "ATTSponsoredDataPricingInformation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[2]/ul/li[12]/ul/li[2]/a")
	public WebElement aTTSponsoredDataPricingInformation;


	
	
	public PricingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		// TODO Auto-generated method stub
		
	}
	
	/* Method to Initialize APIMLoginPage */
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}
	
	public void clkGoToMyApp(){
		
		goToMyAppLink.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("API Matrix", title);		
	}

	/*Method to click on Pricing Information for Speech*/
	public void clkSpeechPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		speechPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}	
	
	/*Method to click on Pricing Information for Device Capabilities*/
	public void clkDeviceCapabilitiesPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		deviceCapabilitiesPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for In-App Messaging*/
	public void clkInAppMessagingPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		inAppMessagingPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for SMS/MMS*/
	public void clkSMSMMSPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		sMSMMSPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for Payment*/
	public void clkPaymentPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		paymentPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for Advertising*/
	public void clkAdvertisingPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		advertisingPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for AT&T mHealth*/
	public void clkATTmHealthPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		aTTmHealthPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}

	/*Method to click on Pricing Information for AT&T M2X*/
	public void clkATTM2XPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		aTTM2XPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for AT&T U-verse Enabled*/
	public void clkATTUverseEnabledPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		aTTUverseEnabledPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for AT&T ARO*/
	public void clkATTAROPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		aTTAROPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for Mobile Identity Toolkit*/
	public void clkMobIdTlktPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		mobIdAPITlktPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
	
	/*Method to click on Pricing Information for AT&T Sponsored Data*/
	public void clkATTSponsoredDataPricingInformation(){	
		pricing.click();
		waitForPageToLoad();
		aTTSponsoredDataPricingInformation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T API Platform Pricing Details | AT&T Developer");
	}
}
