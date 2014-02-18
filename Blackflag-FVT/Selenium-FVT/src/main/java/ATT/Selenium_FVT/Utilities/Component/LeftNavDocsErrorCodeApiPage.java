package ATT.Selenium_FVT.Utilities.Component;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class LeftNavDocsErrorCodeApiPage extends WebPage {
		
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
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T U-verse")
	public WebElement uVerse;
	
	@FindBy(how = How.ID, using = "errors")
	public WebElement errorCodes;
	
	@FindBy(how = How.LINK_TEXT, using = "Docs")
	public WebElement docs;
	
	@FindBy(how = How.LINK_TEXT, using = "APIs")
	public WebElement apis;
	
	public LeftNavDocsErrorCodeApiPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		
	}
	
	public void clkDocs(){
		docs.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("AT&T API Documentation - API Sample Code, Methods & Callbacks", title);		
	}
	public void clkApis(){
		apis.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("AT&T APIs - Find Developer APIs from AT&T", title);		
	}
	public void clkAdvertising(){
		advertising.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Advertising", title);		
		
	}
	public void clkCallManagement(){
		callManagement.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Call Management (Beta)", title);		
	}

	public void clkDeviceCap(){
		deviceCap.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Device Capabilities", title);		
	}
	
	public void clkInAppMsg(){
		inAppMsg.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("In-app Messaging from Mobile Number", title);		
	}
	public void clkLocation(){
		location.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Location", title);		
	}
	public void clkMhealth(){
		mhealth.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("AT&T mHealth", title);		
	}
	public void clkNotaryManagement(){
		notaryManagement.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Notary Management", title);		
	}
	public void clkOAuthMgmt(){
		oAuthMgmt.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("OAuth 2.0 Authentication Management", title);		
	}
	public void clkPayment(){
		payment.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Payment", title);		
	}
	public void clkSms(){
		sms.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("SMS", title);		
	}
	public void clkMms(){
		mms.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("MMS", title);	
	}
	public void clkSpeech(){
		speech.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Speech", title);		
	}
	
	public void clkUVerse(){
		uVerse.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("AT&T U-verse® Enabled SDK", title);		
	}
	public void clkErrorCode(){
		errorCodes.click();
		waitForPageToLoad();
		implicitWait(2);
		String title = driver.getTitle();
		Assert.assertEquals("Error Codes", title);		
	}
}
