package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;
import ATT.Selenium_FVT.Utilities.Component.LeftNavDocsErrorCodeApiPage;

public class DocPage extends WebPage {
	
	
	// Page Object "APIs"
	@FindBy(how = How.LINK_TEXT, using = "Go to My Apps")
	public WebElement goToMyAppLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Error Codes")
	public WebElement errorCode;

	@FindBy(how = How.LINK_TEXT, using = "API Platform Release Notes")
	public WebElement releaseNotes;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='pageSectionAssetId10700095']/ul/li[7]/ul/li[1]/a")
	public WebElement apis;
	
	@FindBy(how = How.LINK_TEXT, using = "FAQs")
	public WebElement faqs;
	
	@FindBy(how = How.LINK_TEXT, using = "API Platform Quick Start Guide")
	public WebElement quickStart;
	
	@FindBy(how = How.CSS, using = "p > a")
	public WebElement gettingStarted;
	
	@FindBy(how = How.LINK_TEXT, using = "Advertising")
	public WebElement advertising;
	
	@FindBy(how = How.LINK_TEXT, using = "Call Management (Beta)")
	public WebElement callManagement;
	
	@FindBy(how = How.LINK_TEXT, using = "Device Capabilities")
	public WebElement deviceCap;
	
	@FindBy(how = How.LINK_TEXT, using = "In-app Messaging from Mobile Number")
	public WebElement inAppMsg;
	
	@FindBy(how = How.LINK_TEXT, using = "Location")
	public WebElement location;
	
	@FindBy(how = How.LINK_TEXT, using = "Notary Management")
	public WebElement notaryManagement;
	
	@FindBy(how = How.LINK_TEXT, using = "OAuth 2.0 Authentication Management")
	public WebElement oAuthMgmt;
	
	@FindBy(how = How.LINK_TEXT, using = "Payment")
	public WebElement payment;
	
	@FindBy(how = How.LINK_TEXT, using = "SMS")
	public WebElement sms;
	
	@FindBy(how = How.LINK_TEXT, using = "MMS")
	public WebElement mms;
	
	@FindBy(how = How.LINK_TEXT, using = "Speech")
	public WebElement speech;
	
	@FindBy(how = How.LINK_TEXT, using = "mHealth Platform")
	public WebElement mhealth;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T U-verse® Enabled")
	public WebElement uVerse;
	
	@FindBy(how = How.ID, using = "errors")
	public WebElement errorCodes;
	
	@FindBy(how = How.LINK_TEXT, using = "Docs")
	public WebElement docs;
	
	/**
	 *	 clkAdvertising - clicks on advertising
	 */
	public void clkAdvertising(){
		advertising.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Advertising", title);		
		
	}
	/**
	 * clkCallManagement - Clicks on call management
	 */
	public void clkCallManagement(){
		callManagement.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Call Management (Beta)", title);		
	}
	/**
	 * clkDeviceCap - Clicks on device Capabilities
	 */
	public void clkDeviceCap(){
		deviceCap.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Device Capabilities", title);		
	}
	/**
	 * clkInAppMsg - Clicks on In app messaging
	 */
	public void clkInAppMsg(){
		inAppMsg.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("In-app Messaging from Mobile Number", title);		
	}
	/**
	 * clkLocation - Clicks on location
	 */
	public void clkLocation(){
		location.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Location", title);		
	}
	/**
	 * clkMhealth - Clicks on mHealth
	 */
	public void clkMhealth(){
		mhealth.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("AT&T mHealth", title);		
	}
	/**
	 * clkNotaryManagement - Clicks on notary management
	 */
	public void clkNotaryManagement(){
		notaryManagement.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Notary Management", title);		
	}
	/**
	 * clkOAuthMgmt - Clicks on OAuth Management
	 */
	public void clkOAuthMgmt(){
		oAuthMgmt.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("OAuth 2.0 Authentication Management", title);		
	}
	/**
	 * clkPayment - Clicks on Payment
	 */
	public void clkPayment(){
		payment.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Payment", title);		
	}
	/**
	 * clkSms - Clicks on SMS
	 */
	public void clkSms(){
		sms.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("SMS", title);		
	}
	/**
	 * clkMms - Clicks on MMS
	 */
	public void clkMms(){
		mms.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("MMS", title);	
	}
	/**
	 * clkSpeech - Clicks on Speech
	 */
	public void clkSpeech(){
		speech.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Speech", title);		
	}
	/**
	 * clkUVerse - Clicks on U-Verse
	 */
	public void clkUVerse(){
		uVerse.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("AT&T U-verse Enabled APIs", title);		
	}
	/**
	 * DocPage
	 * @param driver
	 */
	public DocPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	/**
	 * openURL
	 */
	@Override
	public void openURL() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 	clkGoToMyApp - Clicks on go to my app
	 */
	public void clkGoToMyApp(){	
		goToMyAppLink.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("API Matrix", title);		
	}
	/**
	 * clkErrorCodes
	 * @return ErrorCodePage
	 */
	public ErrorCodePage clkErrorCodes(){	
		errorCode.click();
		waitForPageToLoad();
		implicitWait(5);
		String title = driver.getTitle();
		Assert.assertEquals("Error Codes", title);
		return PageFactory.initElements(driver, ErrorCodePage.class);
	}
	/**
	 * clkReleaseNotes
	 */
	public void clkReleaseNotes(){	
		releaseNotes.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Release Notes", title);		
	}
	/**
	 * clkAPIs
	 * @return LeftNavDocsErrorCodeApiPage
	 */
	public LeftNavDocsErrorCodeApiPage clkAPIs(){	
		apis.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Advertising", title);	
		return PageFactory.initElements(driver, LeftNavDocsErrorCodeApiPage.class);
	}
	/**
	 * clkFAQs
	 */
	public void clkFAQs(){	
		faqs.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T API FAQs", title);		
	}
	/**
	 * clkQuickStart
	 */
	public void clkQuickStart(){	
		quickStart.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("API Platform Quick Start Guide", title);		
	}
	/**
	 * clkGettingStarted
	 */
	public void clkGettingStarted(){	
		gettingStarted.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("API Platform Quick Start Guide", title);		
	}
}
