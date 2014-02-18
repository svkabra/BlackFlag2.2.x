package ATT.Selenium_FVT.Pages;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class APIPage extends WebPage {
	
	
	// Page Object "MyApps"
	@FindBy(how = How.XPATH, using = "//td/div/a/span")
	public WebElement goToMyAppLink;
	
	// Page Object "API"
	@FindBy(how = How.LINK_TEXT, using = "APIs")
	public WebElement apis;
	
	// Page Object "SpeechAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[3]/div/a[2]")
	public WebElement speechAPIDocumentation;
	
	// Page Object "SMSAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[5]/div/a[2]")
	public WebElement sMSAPIDocumentation;
	
	// Page Object "MMSAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[6]/div/a[2]")
	public WebElement mMSAPIDocumentation;
	
	// Page Object "InAppMessagingAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[7]/div/a[2]")
	public WebElement inAppMessagingAPIDocumentation;
	
	// Page Object "PaymentAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[9]/div/a[2]")
	public WebElement paymentAPIDocumentation;	
	
	// Page Object "AdvertisingAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[10]/div/a[2]")
	public WebElement advertisingAPIDocumentation;	
	
	// Page Object "DeviceCapabiltiesAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[12]/div/a[2]")
	public WebElement deviceCapabilitiesAPIDocumentation;	
	
	// Page Object "AT&TmHealthAPIPage"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[14]/div/a[2]")
	public WebElement aTTmHealthAPIPage;
	
	// Page Object "AT&TUVerseAPIPage"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[15]/div/a[2]")
	public WebElement aTTUVerseAPIPage;

	// Page Object "AT&TM2XAPIPage"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[16]/div/a[2]")
	public WebElement aTTM2XAPIPage;
	
	// Page Object "AT&TMobileIdentityAPIToolkitAPIPage"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[17]/div/a[2]")
	public WebElement aTTMobileIdentityAPIToolkitAPIPage;

	// Page Object "AT&TSponsoredDataAPIAPIPage"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[18]/div/a[2]")
	public WebElement aTTSponsoredDataAPIAPIPage;
	
	public APIPage(WebDriver driver) {
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
	
	// Method to click Go To My Apps button
	public void clkGoToMyApp(){
		
		goToMyAppLink.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("API Matrix", title);		
	}
		
	
	/*Method to click on "Documentation" button for Speech*/
	public void clkSpeechDocumentation(){
		apis.click();
		waitForPageToLoad();
		speechAPIDocumentation.click();
		waitForPageToLoad();
		validatePageTitle("Speech Documentation");
	}
	
	/*Method to click on "Documentation" button for SMS*/
	public void clkSMSDocumentation(){
		apis.click();
		waitForPageToLoad();
		sMSAPIDocumentation.click();
		waitForPageToLoad();
		validatePageTitle("SMS Documentation");
	}
	
	/*Method to click on "Documentation" button for MMS*/
	public void clkMMSDocumentation(){
		apis.click();
		waitForPageToLoad();
		mMSAPIDocumentation.click();
		waitForPageToLoad();
		validatePageTitle("MMS Documentation");
	}

	/*Method to click on "Documentation" button for In-App Messaging*/
	public void clkInAppMessagingDocumentation(){
		apis.click();
		waitForPageToLoad();
		inAppMessagingAPIDocumentation.click();
		waitForPageToLoad();
		validatePageTitle("In-App Messaging Documentation");
	}

	/*Method to click on "Documentation" button for Payment*/
	public void clkPaymentDocumentation(){
		apis.click();
		waitForPageToLoad();
		paymentAPIDocumentation.click();
		waitForPageToLoad();
		validatePageTitle("Payment Documentation");
	}
	
	/*Method to click on "Documentation" button for Advertising*/
	public void clkAdvertisingDocumentation(){
		apis.click();
		waitForPageToLoad();
		advertisingAPIDocumentation.click();
		waitForPageToLoad();
		validatePageTitle("Advertising Documentation");
	}
	
	/*Method to click on "Documentation" button for Device Capabilities*/
	public void clkDeviceCapabilitiesDocumentation(){
		apis.click();
		waitForPageToLoad();
		deviceCapabilitiesAPIDocumentation.click();
		waitForPageToLoad();
		validatePageTitle("Device Capabilities Documentation");
	}
	
	/*Method to click on "Visit API Page" button for AT&T mHealth*/
	public void clkATTmHealthAPIPage(){
		String mwh=driver.getWindowHandle();
		apis.click();
		waitForPageToLoad();
		aTTmHealthAPIPage.click();		
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		        		Assert.assertEquals("Tour: Intro - AT&T mHealth", text);   
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
		/*Method to click on "Visit API Page" button for AT&T U-verse Enabled*/
		public void clkATTUVerseAPIPage(){
			apis.click();
			waitForPageToLoad();
			aTTUVerseAPIPage.click();
			waitForPageToLoad();
			validatePageTitle("Get AT&T U-verse® Enabled SDK");
		}
		
		/*Method to click on "Visit API Page" button for AT&T M2X(Beta)*/
		public void clkATTM2XAPIPage(){
			String mwh=driver.getWindowHandle();
			apis.click();
			waitForPageToLoad();
			aTTM2XAPIPage.click();		
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			//this method will you handle of all opened windows

			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			        		Assert.assertEquals("AT&T M2X", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
		}
		
		/*Method to click on "Visit API Page" button for AT&T Mobile Identity API Toolkit*/
		public void clkATTMobileIdentityAPIToolkitAPIPage(){
			apis.click();
			waitForPageToLoad();
			aTTMobileIdentityAPIToolkitAPIPage.click();
			waitForPageToLoad();
			validatePageTitle("AT&T Mobile Identity API Toolkit | AT&T Developer");
		}
		
		/*Method to click on "Visit API Page" button for AT&T Sponsored Data API*/
		public void clkATTSponsoredDataAPIAPIPage(){
			apis.click();
			waitForPageToLoad();
			aTTSponsoredDataAPIAPIPage.click();
			waitForPageToLoad();
			validatePageTitle("AT&T Sponsored Data API | AT&T Developer");
		}
		
}
