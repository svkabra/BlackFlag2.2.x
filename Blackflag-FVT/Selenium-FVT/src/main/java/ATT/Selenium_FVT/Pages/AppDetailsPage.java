package ATT.Selenium_FVT.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class AppDetailsPage extends WebPage{

	// Page Object "My Apps"
	@FindBy(how = How.LINK_TEXT, using ="My Apps")
	public WebElement myAppsLink;
	
    //Page Object "0001_TestAPIs" 
	@FindBy(how = How.LINK_TEXT, using="0001_TestAPIs")
	public WebElement testAIPsApp;
	
	//Page Object "Advertising"
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[1]/div/span[2]")
	public WebElement advertising;
	
	//Page Object "DeviceCapabilities"
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[2]/div/span[2]")
	public WebElement deviceCapabilities;

	//Page Object " InAppMessagingIMMN"
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[3]/div/span[2]")
	public WebElement inAppMessagingIMMN;

	//Page Object "InAppMessagingMIM"
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[4]/div/span[2]")
	public WebElement inAppMessagingMIM;

	//Page Object "MultimediaMessagingService(MMS)"
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[5]/div/span[2]")
	public WebElement multimediaMessagingService;

	//Page Object " Payment "
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[6]/div/span[2]")
	public WebElement payment;

	//Page Object " ShortMessagingService(SMS) "
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[7]/div/span[2]")
	public WebElement shortMessagingService;

	//Page Object " Speech To Text Custom (STTC) "
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[8]/div/span[2]")
	public WebElement speechTTextCustomSTTC;

	//Page Object " Speech To Text (SPEECH) "
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[9]/div/span[2]")
	public WebElement speechToTextSpeech;

	//Page Object " Terminal Location "
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[10]/div/span[2]")
	public WebElement terminalLocation;

	//Page Object " Text to Speech (TTS) "
	@FindBy(xpath="//*[@id='content']/div/div[3]/div[2]/div[2]/div[2]/span[2]/a[11]/div/span[2]")
	public WebElement textToSpeechTTS;

	//Page Object "Advertising"
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[1]/div/span[2]")
	public WebElement myAppAdvertising;
	
	//Page Object "DeviceCapabilities"
	//@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[2]/div/span[2]")
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[2]/div/span[2]")
	public WebElement myAppDeviceCapabilities;

	//Page Object " InAppMessagingIMMN"
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[3]/div/span[2]")
	public WebElement myAppInAppMessagingIMMN;

	//Page Object "InAppMessagingMIM"
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[4]/div/span[2]")
	public WebElement myAppInAppMessagingMIM;

	//Page Object "Notification"
	@FindBy(linkText="Notifications")
	public WebElement notifications;

	//Page Object "MultimediaMessagingService(MMS)"
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[5]/div/span[2]")
	public WebElement myAppMultimediaMessagingService;

	//Page Object " Payment "
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[6]/div/span[2]")
	public WebElement myAppPayment;
	
	//Page Object "NotaryDocumentation"
	@FindBy(linkText="Notary Documentation")
	public WebElement notaryDocumentation;

	//Page Object " ShortMessagingService(SMS) "
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[7]/div/span[2]")
	public WebElement myAppShortMessagingService;

	//Page Object " Speech To Text Custom (STTC) "
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[8]/div/span[2]")
	public WebElement myAppSpeechTTextCustomSTTC;

	//Page Object " Speech To Text (SPEECH) "
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[9]/div/span[2]")
	public WebElement myAppSpeechToTextSpeech;

	//Page Object " Terminal Location "
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[10]/div/span[2]")
	public WebElement myAppTerminalLocation;

	//Page Object " Text to Speech (TTS) "
	@FindBy(xpath="//*[@id='app-list']/div[2]/div[1]/div[4]/a[11]/div/span[2]")
	public WebElement myAppTextToSpeechTTS;

	public AppDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	/* Method to Initialize APIMLoginPage */
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}	
	
	@Override
	public void openURL() {		
	//	PageFactory.initElements(driver,this);
	}
	
	//Function to click on Advertising API doc icon on App Details page
	public void clkAdvertisingAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        advertising.click();
	        waitForPageToLoad();
	        validatePageTitle("Advertising Documentation");
	  }
	
	//Function to click on Device Capabilities API doc icon on App Details page
	public void clkDeviceCapabilitiesAPIDocumentation() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
    	testAIPsApp.click();
        waitForPageToLoad();
        deviceCapabilities.click();
        waitForPageToLoad();
        validatePageTitle("AT&T Device Capabilities API  | AT&T Developer");		
	}
	
	//Function to click on In app Messaging IMMN API doc icon on App Details page
	public void clkInAppMessagingIMMNAPIDocumentation() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
    	testAIPsApp.click();
        waitForPageToLoad();
        inAppMessagingIMMN.click();
        waitForPageToLoad();
        validatePageTitle("In-App Messaging Documentation");		
	}
	
	//Function to click on In ap Messaging MIM API doc icon on App Details page
	public void clkInAppMessagingMIMAPIDocumentation() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
    	testAIPsApp.click();
        waitForPageToLoad();
        inAppMessagingMIM.click();
        waitForPageToLoad();
        validatePageTitle("In-App Messaging Documentation");		
	}
	
	//Function to click on MMS API doc icon on App Details page
	public void clkMMSAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        multimediaMessagingService.click();
	        waitForPageToLoad();
	        validatePageTitle("MMS Documentation");
	  }
	
	//Function to click on Payment API doc icon on App Details page
	public void clkPaymentAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        payment.click();
	        waitForPageToLoad();
	        validatePageTitle("Payment Documentation");
	  }
	
	//Function to click on SMS API doc icon on App Details page
	public void clkSMSAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        shortMessagingService.click();
	        waitForPageToLoad();
	        validatePageTitle("SMS Documentation");
	  }
	//Function to click on Speech To Text Custom STTC API doc icon on App Details page
	public void clkSpeechToTextCustomAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        speechTTextCustomSTTC.click();
	        waitForPageToLoad();
	        validatePageTitle("Speech Documentation");
	  }
	//Function to click on Speech To Text (speech) API doc icon on App Details page
	public void clkSpeechToTextAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        speechToTextSpeech.click();
	        waitForPageToLoad();
	        validatePageTitle("Speech Documentation");
	  }
	//Function to click on Terminal Location API doc icon on App Details page
	public void clkTerminalLocationAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        terminalLocation.click();
	        waitForPageToLoad();
	        validatePageTitle("AT&T APIs | Build Speech, Messaging, & Payment into your mobile app | AT&T Developer");
	  }
	//Function to click on Text To Speech API doc icon on App Details page
	public void clkTextToSpeechAPIDocumentation()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	    	testAIPsApp.click();
	        waitForPageToLoad();
	        textToSpeechTTS.click();
	        waitForPageToLoad();
	        validatePageTitle("Speech Documentation");
	  }
	
	
	//Function to click on Advertising API doc icon on My Apps page
	public void clkAdvertisingAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	        myAppAdvertising.click();
	        waitForPageToLoad();
	        validatePageTitle("Advertising Documentation");
	  }
	
	//Function to click on Device Capabilities API doc icon on My Apps page
	public void clkDeviceCapabilitiesAPIDocumentationMyApps() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
	  	myAppDeviceCapabilities.click();
        waitForPageToLoad();
        validatePageTitle("AT&T Device Capabilities API  | AT&T Developer");		
	}
	
	//Function to click on In app Messaging IMMN API doc icon on My Apps page
	public void clkInAppMessagingIMMNAPIDocumentationMyApps() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
	  	myAppInAppMessagingIMMN.click();
        waitForPageToLoad();
        validatePageTitle("In-App Messaging Documentation");		
	}
	
	//Function to click on Notification on In app Messaging IMMN API doc
	public void clkInAppMessagingIMMNAPIDocNotification() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
	  	myAppInAppMessagingIMMN.click();
        waitForPageToLoad();
        validatePageTitle("In-App Messaging Documentation");
        String mwh=driver.getWindowHandle();
		notifications.click();		
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();

		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                validatePageTitle("in-app-messaging.pdf");
		        		driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
		
	}
	
	//Function to click on In app Messaging MIM API doc icon on My Apps page
	public void clkInAppMessagingMIMAPIDocumentationMyApps() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
        myAppInAppMessagingMIM.click();
        waitForPageToLoad();
        validatePageTitle("In-App Messaging Documentation");		
	}
	
	//Function to click on Notification on In app Messaging MIM API doc
	public void clkInAppMessagingMIMAPIDocNotification() {
		
		myAppsLink.click();
	  	waitForPageToLoad();
	  	validatePageTitle("API Matrix");
        myAppInAppMessagingMIM.click();
        waitForPageToLoad();
        validatePageTitle("In-App Messaging Documentation");
        String mwh=driver.getWindowHandle();
		notifications.click();		
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();

		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                validatePageTitle("in-app-messaging.pdf");
		        		driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
	
	//Function to click on MMS API doc icon on My Apps page
	public void clkMMSAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
		  	myAppMultimediaMessagingService.click();
	        waitForPageToLoad();
	        validatePageTitle("MMS Documentation");
	  }
	
	//Function to click on Payment API doc icon on My Apps page
	public void clkPaymentAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
		  	myAppPayment.click();
	        waitForPageToLoad();
	        validatePageTitle("Payment Documentation");
	  }
	
	//Function to click on Notary Documentation icon on Payment API doc
	public void clkPaymentAPIDocNotaryDoc()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
		  	myAppPayment.click();
	        waitForPageToLoad();
	        validatePageTitle("Payment Documentation");
	        notaryDocumentation.click();
	        waitForPageToLoad();
	        validatePageTitle("Notary Management API v1");
	        
	  }
	
	//Function to click on SMS API doc icon on My Apps page
	public void clkSMSAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
		  	myAppShortMessagingService.click();
	        waitForPageToLoad();
	        validatePageTitle("SMS Documentation");
	  }
	//Function to click on Speech To Text Custom STTC API doc icon on My Apps page
	public void clkSpeechToTextCustomAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
		  	myAppSpeechTTextCustomSTTC.click();
	        waitForPageToLoad();
	        validatePageTitle("Speech Documentation");
	  }
	//Function to click on Speech To Text (speech) API doc icon on My Apps page
	public void clkSpeechToTextAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
		  	myAppSpeechToTextSpeech.click();
	        waitForPageToLoad();
	        validatePageTitle("Speech Documentation");
	  }
	//Function to click on Terminal Location API doc icon on My Apps page
	public void clkTerminalLocationAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
		  	myAppTerminalLocation.click();
	        waitForPageToLoad();
	        validatePageTitle("AT&T APIs | Build Speech, Messaging, & Payment into your mobile app | AT&T Developer");
	  }
	//Function to click on Text To Speech API doc icon on My Apps page
	public void clkTextToSpeechAPIDocumentationMyApps()
	    {
		  	myAppsLink.click();
		  	waitForPageToLoad();
		  	validatePageTitle("API Matrix");
	        myAppTextToSpeechTTS.click();
	        waitForPageToLoad();
	        validatePageTitle("Speech Documentation");
	  }
}
