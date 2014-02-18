package ATT.Selenium_FVT.Utilities.Component;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class FootersDocs extends WebPage{

	// Page Object "AT&T Application Resource Optimizer"
	@FindBy(how = How.LINK_TEXT, using ="AT&T Application Resource Optimizer")
	public WebElement attAro;
	
	// Page Object "AT&T Application Resource Optimizer Documentation"
	@FindBy(how = How.LINK_TEXT, using = "Documentation")
	public WebElement aRODocumentation;
	
	// Page Object "SDKs, Plugins, & More"
	@FindBy(how = How.LINK_TEXT, using = "SDKs, Plugins, & More")
	public WebElement sDKPluginsMore;
	
	// Page Object "Microsoft SDK View"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[4]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement microsoftSDKDocView;
		
	// Page Object "Advertising SDK for Android View"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[5]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement advertisingSDKForAndroidDocView;
	
	// Page Object "Advertising SDK for iOS View"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[6]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement advertisingSDKForIOSDocView;
	
	// Page Object "Speech SDK for Android View"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[7]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement speechSDKForAndroidDocView;
	
	// Page Object "Speech SDK for iOS View"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[8]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement speechSDKForIOSDocView;
	
	//Page Object "AT&T API SDK  for Adobe® PhoneGap® View"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[9]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement aTTAPISDKForAdobePhoneGapDocView;
	
	//Page Object "AT&T API Module for Appcelerator® Titanium®" View
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[10]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement aTTAPIModuleForAppceleratorTitaniumDocView;
	
	//Page Object "AT&T API SDKs for Windows®" View
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[11]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement aTTAPISDKsForWindowsDocView;
	
	//Page Object "AT&T Toolkit for Salesforce® Platform" View
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[12]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement aTTToolkitForSalesforcePlatformDocView;
	
	//Page Object "AT&T API Adapters for IBM® Worklight®" View
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[13]/div/div/table/tbody/tr/td[4]/span/a[2]/img")
	public WebElement aTTAPIAdaptersForIBMWorklightDocView;
	
	//Page Object "DeviceAnywhere Virtual Developer Lab" View
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[15]/div/div/table/tbody/tr/td[4]/span/a/img")
	public WebElement deviceAnywhereVirtualDeveloperLabDocView;
	
	//Page Object "Sencha Touch" View
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section[20]/div/div/table/tbody/tr/td[4]/span/a/img")
	public WebElement senchaTouchDocView;
	
	//Page Object "AT&T Certified Solutions catalog for B2B Apps" 
	@FindBy(how = How.LINK_TEXT, using = "AT&T Certified Solutions Catalog for B2B Apps")
	public WebElement aTTCerSolCatForB2BApps;
	
	//Page Object "Testing Criteria for Android Applications"
	@FindBy(how = How.LINK_TEXT, using = "Testing Criteria for Android Applications")
	public WebElement testingCriForAndroidApps;
	
	//Page Object "AT&T AppCenter for Consumer Apps"
	@FindBy(how = How.LINK_TEXT, using = "AT&T AppCenter for Consumer Apps")
	public WebElement aTTAppCenterForConApps;
	
	//Page Object "Content Submission and Approval Steps for AT&T AppCenter"
	@FindBy(how = How.LINK_TEXT, using = "Content Submission and Approval Steps for AT&T AppCenter")
	public WebElement conSubAndAppStepsForATTAppCenter;

	//Page Object "Qualcomm Overview of AT&T AppCenter"
	@FindBy(how = How.LINK_TEXT, using = "Qualcomm Overview of AT&T AppCenter")
	public WebElement qualcommOverviewOfATTAppCenter;

	//Page Object "Brew Application Value Billing"
	@FindBy(how = How.LINK_TEXT, using = "Brew Application Value Billing")
	public WebElement brewAppValBilling;

	//Page Object "AT&T and Brew Mobile Platform Developer Playbook"
	@FindBy(how = How.LINK_TEXT, using = "AT&T and Brew Mobile Platform Developer Playbook")
	public WebElement aTTAndBrewMobPtformDevPlaybk;

	//Page Object "Deeplinking (CMShop) Instructions for Developers"
	@FindBy(how = How.LINK_TEXT, using = "Deeplinking (CMShop) Instructions for Developers")
	public WebElement deeplinkingInstForDev;

	
	public FootersDocs(WebDriver driver) {
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
	
	/*Method to click on a Documentation button for AT&T Application Resource Optimizer (ARO) */
	public void clkARODocumentation(){
		attAro.click();
		waitForPageToLoad();
		aRODocumentation.click();
		waitForPageToLoad();
		validatePageTitle("AT&T Application Resource Optimizer (ARO) Documentation | AT&T Developer");
	}
	
	/*Method to click on a View Button for Microsoft SDK*/
	public void clkMicrosoftSDKView(){
		String mwh=driver.getWindowHandle();
		sDKPluginsMore.click();
		waitForPageToLoad();
		microsoftSDKDocView.click();
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		        		Assert.assertEquals("AT&T API Platform SDK for Microsoft: Main Page", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
	
	/*Method to click on a View Button for Advertising SDK for Android*/
	public void clkAdvertisingSDKForAndroidView(){
		String mwh=driver.getWindowHandle();
		sDKPluginsMore.click();
		waitForPageToLoad();
		advertisingSDKForAndroidDocView.click();
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		        		Assert.assertEquals("Advertising SDK for Android", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
	
	/*Method to click on a View Button for Advertising SDK for iOS*/
	public void clkAdvertisingSDKForIOSView(){
		String mwh=driver.getWindowHandle();
		sDKPluginsMore.click();
		waitForPageToLoad();
		advertisingSDKForIOSDocView.click();
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                
		        		Assert.assertEquals("API_AdvertisingSDKiOS.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
	
	
	/*Method to click on a View Button for Speech SDK for Android*/
	public void clkSpeechSDKForAndroidView(){
		String mwh=driver.getWindowHandle();
		sDKPluginsMore.click();
		waitForPageToLoad();
		speechSDKForAndroidDocView.click();
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                
		        		Assert.assertEquals("Speech SDK for Android", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
	
	/*Method to click on a View Button for Speech SDK for Android*/
	public void clkSpeechSDKForIOSView(){
		String mwh=driver.getWindowHandle();
		sDKPluginsMore.click();
		waitForPageToLoad();
		speechSDKForIOSDocView.click();
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                
		        		Assert.assertEquals("ATT_Speech_SDK_Developer_Guide_for_iOS.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
	
	/*Method to click on a View Button for AT&T API SDK  for Adobe® PhoneGap®*/
	public void clkATTAPISDKForAdobePhoneGapView(){
		String mwh=driver.getWindowHandle();
		sDKPluginsMore.click();
		waitForPageToLoad();
		aTTAPISDKForAdobePhoneGapDocView.click();
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                
		        		Assert.assertEquals("AT&T API SDK for Adobe® PhoneGap®", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
		
		/*Method to click on a View Button for AT&T API Module for Appcelerator® Titanium®*/
		public void clkATTAPIModuleForAppceleratorTitaniumView(){
			String mwh=driver.getWindowHandle();
			sDKPluginsMore.click();
			waitForPageToLoad();
			aTTAPIModuleForAppceleratorTitaniumDocView.click();
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			                
			        		Assert.assertEquals("AT&T API Module for Appcelerator® Titanium®", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
	}
		
		/*Method to click on a View Button for AT&T API SDKs for Windows®*/
		public void clkATTAPISDKsForWindowsView(){
			String mwh=driver.getWindowHandle();
			sDKPluginsMore.click();
			waitForPageToLoad();
			aTTAPISDKsForWindowsDocView.click();
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			                
			        		Assert.assertEquals("AT&T API SDKs for Windows", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
	}	
		
		/*Method to click on a View Button for AT&T Toolkit for Salesforce® Platform*/
		public void clkATTToolkitForSalesforcePlatformView(){
			String mwh=driver.getWindowHandle();
			sDKPluginsMore.click();
			waitForPageToLoad();
			aTTToolkitForSalesforcePlatformDocView.click();
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			                
			        		Assert.assertEquals("AT&T Toolkit for Salesforce® Platform", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
	}	
		
		
		/*Method to click on a View Button for AT&T API Adapters for IBM® Worklight®*/
		public void clkATTAPIAdaptersForIBMWorklightView(){
			String mwh=driver.getWindowHandle();
			sDKPluginsMore.click();
			waitForPageToLoad();
			aTTAPIAdaptersForIBMWorklightDocView.click();
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			                
			        		Assert.assertEquals("AT&T API Adapters for IBM<sup>®</sup> Worklight<sup>®</sup> | AT&T Developer", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
	}
		
		/*Method to click on a View Button for DeviceAnywhere Virtual Developer Lab*/
		public void clkDeviceAnywhereVirtualDeveloperLabView(){
			String mwh=driver.getWindowHandle();
			sDKPluginsMore.click();
			waitForPageToLoad();
			deviceAnywhereVirtualDeveloperLabDocView.click();
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			                
			        		Assert.assertEquals("Keynote DeviceAnywhere - AT&T VDL Virtual Developer Lab Signup", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
	}
		
		
		/*Method to click on a View Button for Sencha Touch*/
		public void clkSenchaTouchView(){
			String mwh=driver.getWindowHandle();
			sDKPluginsMore.click();
			waitForPageToLoad();
			senchaTouchDocView.click();
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			                Assert.assertEquals("Mobile App Development Framework. JavaScript and HTML5. Download Sencha Touch Free. | Sencha Touch | Products | Sencha", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
	}
		
		/*Method to View Document for "Testing Criteria for Android Applications" under Human Resources */
		public void clkTestingCriForAndroidApps(){
			String mwh=driver.getWindowHandle();
			aTTCerSolCatForB2BApps.click();
			waitForPageToLoad();
			testingCriForAndroidApps.click();
			waitForPageToLoad();
			Set<String> s=driver.getWindowHandles();
			Iterator<String> ite=s.iterator();

			while(ite.hasNext())
			{
			    String popupHandle=ite.next().toString();
			    if(!popupHandle.contains(mwh))
			    {
			                driver.switchTo().window(popupHandle);
			                /*here you can perform operation in pop-up window**/
			                String text = driver.getTitle();
			                Assert.assertEquals("AQuA_testing_criteria_for_Android_for_v1.4 final 7_feb_2013.pdf", text);  
			                System.out.println(text);
			                driver.close();
			                driver.switchTo().window(mwh);
			    }
			}
	}
		
	
		/*Method to View Document for "AppCenter & Brew MP Developer Resources" under Human Resources */
		public void clkAppCenBrewMPDevResourcesLink(){
			
		String mwh1=driver.getWindowHandle();
		aTTAppCenterForConApps.click();
		waitForPageToLoad();
		conSubAndAppStepsForATTAppCenter.click();
		waitForPageToLoad();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> ite1=s1.iterator();

		while(ite1.hasNext())
		{
		    String popupHandle=ite1.next().toString();
		    if(!popupHandle.contains(mwh1))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("User-Guide-for-Content-Providers.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh1);
		    }
		}
		String mwh2=driver.getWindowHandle();
		aTTAppCenterForConApps.click();
		waitForPageToLoad();
		qualcommOverviewOfATTAppCenter.click();
		waitForPageToLoad();
		Set<String> s2=driver.getWindowHandles();
		Iterator<String> ite2=s2.iterator();

		while(ite2.hasNext())
		{
		    String popupHandle=ite2.next().toString();
		    if(!popupHandle.contains(mwh2))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("AT&T | Brew MP Developer", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh2);
		    }
		}
		
		String mwh3=driver.getWindowHandle();
		aTTAppCenterForConApps.click();
		waitForPageToLoad();
		brewAppValBilling.click();
		waitForPageToLoad();
		Set<String> s3=driver.getWindowHandles();
		Iterator<String> ite3=s3.iterator();

		while(ite3.hasNext())
		{
		    String popupHandle=ite3.next().toString();
		    if(!popupHandle.contains(mwh3))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("ATT-Application-Value-Billing-Developer-Guidelines-for-Brew-AVB.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh3);
		    }
		}
		
		String mwh4=driver.getWindowHandle();
		aTTAppCenterForConApps.click();
		waitForPageToLoad();
		aTTAndBrewMobPtformDevPlaybk.click();
		waitForPageToLoad();
		Set<String> s4=driver.getWindowHandles();
		Iterator<String> ite4=s4.iterator();

		while(ite4.hasNext())
		{
		    String popupHandle=ite4.next().toString();
		    if(!popupHandle.contains(mwh4))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("BrewMP-Playbook-v1.4.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh4);
		    }
		}
		
		String mwh5=driver.getWindowHandle();
		aTTAppCenterForConApps.click();
		waitForPageToLoad();
		deeplinkingInstForDev.click();
		waitForPageToLoad();
		Set<String> s5=driver.getWindowHandles();
		Iterator<String> ite5=s5.iterator();

		while(ite5.hasNext())
		{
		    String popupHandle=ite5.next().toString();
		    if(!popupHandle.contains(mwh5))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("Dcmshop-Reference-Guide-ATT.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh5);
		    }
		}
	}
		
	
		
}
