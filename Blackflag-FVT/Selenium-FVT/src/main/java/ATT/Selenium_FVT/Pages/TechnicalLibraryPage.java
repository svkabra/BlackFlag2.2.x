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

public class TechnicalLibraryPage extends WebPage{

	// Page Object "Technical Library"
	@FindBy(how = How.LINK_TEXT, using = "Technical Library")
	public WebElement technicalLibrary;
	
	//Page Object "APN Descriptions and Characteristics" 
	@FindBy(how = How.LINK_TEXT, using = "APN Descriptions and Characteristics")
	public WebElement aPNDescriptionAndCharacterstics;
	
	//Page Object "Custom APNs"
	@FindBy(how = How.LINK_TEXT, using = "Custom APNs")
	public WebElement customAPNs;
	
	//Page Object "Certification, Signing, and Testing Overview"
	@FindBy(how = How.LINK_TEXT, using = "Certification, Signing, and Testing Overview")
	public WebElement certificationSigningTestingOverview;

	//Page Object "Certification Requirements"
	@FindBy(how = How.LINK_TEXT, using = "Certification Requirements")
	public WebElement certificationRequirements;
	
	//Page Object "Code Signing"
	@FindBy(how = How.LINK_TEXT, using = "Code Signing")
	public WebElement codeSigning;
	
	//Page Object "Java Signing Specifications"
	@FindBy(how = How.LINK_TEXT, using = "Java Signing Specifications")
	public WebElement javaSigningSpecifications;
	
	//Page Object "Working with Aggregators"
	@FindBy(how = How.LINK_TEXT, using = "Working with Aggregators")
	public WebElement workingWithAggregators;
	
	//Page Object "Biometrics"
	@FindBy(how = How.LINK_TEXT, using = "Biometrics")
	public WebElement biometrics;
	
	//Page Object "Device Detection"
	@FindBy(how = How.LINK_TEXT, using = "Device Detection")
	public WebElement deviceDetection;
	
	//Page Object "HTML5"
	@FindBy(how = How.LINK_TEXT, using = "HTML5")
	public WebElement hTML5;
	
	//Page Object "Mobile Web Fundamentals"
	@FindBy(how = How.LINK_TEXT, using = "Mobile Web Fundamentals")
	public WebElement mobileWebFundamentals;
	
	//Page Object "Mobile Web Standards (OMA, BONDI, GSMA OneAPI, HTML5)"
	@FindBy(how = How.LINK_TEXT, using = "Mobile Web Standards (OMA, BONDI, GSMA OneAPI, HTML5)")
	public WebElement mobileWebStandards;
	
	//Page Object "Native Messaging"
	@FindBy(how = How.LINK_TEXT, using = "Native Messaging")
	public WebElement nativeMessaging;
	
	//Page Object "NSG Certification"
	@FindBy(how = How.LINK_TEXT, using = "NSG Certification")
	public WebElement nSGCertification;
	
	//Page Object "NSG Developer Resources"
	@FindBy(how = How.LINK_TEXT, using = "NSG Developer Resources")
	public WebElement nSGDeveloperResources;

	//Page Object "NSG Onboarding"
	@FindBy(how = How.LINK_TEXT, using = "NSG Onboarding")
	public WebElement nSGOnboarding;
	
	//Page Object "NSG Production"
	@FindBy(how = How.LINK_TEXT, using = "NSG Production")
	public WebElement nSGProduction;
		
	//Page Object "Location-based Services (LBS)"
	@FindBy(how = How.LINK_TEXT, using = "Location-based Services (LBS)")
	public WebElement locationBasedServices;
	
	//Page Object "Long-Term Evolution (LTE)"
	@FindBy(how = How.LINK_TEXT, using = "Long-Term Evolution (LTE)")
	public WebElement longTermEvolution;
	
	//Page Object "Network Timers"
	@FindBy(how = How.LINK_TEXT, using = "Network Timers")
	public WebElement networkTimers;
	
	//Page Object "Wi-Fi"
	@FindBy(how = How.LINK_TEXT, using = "Wi-Fi")
	public WebElement wiFi;
		
	//Page Object "Application Privacy Guidelines"
	@FindBy(how = How.LINK_TEXT, using = "Wi-Fi")
	public WebElement applicationPrivacyGuidlines;
	
	//Page Object "Downloading DRM Content in Android"
	@FindBy(how = How.LINK_TEXT, using = "Downloading DRM Content in Android")
	public WebElement downloadingDRMContentInAndroid;
	
	//Page Object "IPv6"
	@FindBy(how = How.LINK_TEXT, using = "IPv6")
	public WebElement iPv6;
	
	//Page Object "Likelihood of a Successful Attack"
	@FindBy(how = How.LINK_TEXT, using = "Likelihood of a Successful Attack")
	public WebElement likelihoodOfASuccessfulAttack;
	
	//Page Object "Messaging Privacy"
	@FindBy(how = How.LINK_TEXT, using = "Messaging Privacy")
	public WebElement messagingPrivacy;
	
	//Page Object "AT&T Certified Solutions Catalog"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Certified Solutions Catalog")
	public WebElement aTTCertifiedSolutionsCatalog;
	
	//Page Object "AT&T Cloud Architect"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Cloud Architect")
	public WebElement aTTCloudArchitect;
	
	//Page Object "AT&T Cloud Services"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Cloud Services")
	public WebElement aTTCloudServices;
	
	//Page Object "AT&T Emerging Devices"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Emerging Devices")
	public WebElement aTTEmergingDevices;
	
	//Page Object "AT&T Foundry"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Foundry")
	public WebElement aTTFoundry;
	
	//Page Object "Check Box for Android"
	@FindBy(how = How.LINK_TEXT, using = "Check Box for Android")
	public WebElement checkBoxForAndroid;
	
	//Page Object "Image Button for Android"
	@FindBy(how = How.LINK_TEXT, using = "Image Button for Android")
	public WebElement imageButtonForAndroid;
	
	//Page Object "HTML5 Checkboxes"
	@FindBy(how = How.LINK_TEXT, using = "HTML5 Checkboxes")
	public WebElement hTML5Checkboxes;
	
	//Page Object "HTML5 Image Button"
	@FindBy(how = How.LINK_TEXT, using = "HTML5 Image Button")
	public WebElement hTML5ImageButton;
	
	//Page Object "Common Errors around Creating Mobile User Experiences"
	@FindBy(how = How.LINK_TEXT, using = "Common Errors around Creating Mobile User Experiences")
	public WebElement commonEACMobUserExp;
	
	//Page Object "Best Practices for 3G and 4G App Development"
	@FindBy(how = How.LINK_TEXT, using = "Best Practices for 3G and 4G App Development")
	public WebElement bPF3GAnd4GAppDev;
	
	//Page Object "Can Prosidy Inform Sentiment Analysis? Experiments on Short Spoken Reviews"
	@FindBy(how = How.LINK_TEXT, using = "Can Prosidy Inform Sentiment Analysis? Experiments on Short Spoken Reviews")
	public WebElement cPISAExpOnSSReviews;
	
	//Page Object "Content Provider Speeds Application Development"
	@FindBy(how = How.LINK_TEXT, using = "Content Provider Speeds Application Development")
	public WebElement cPSAppDev;
	
	//Page Object "The Developer's Guide to APIs"
	@FindBy(how = How.LINK_TEXT, using = "The Developer's Guide to APIs")
	public WebElement tDevGuideToAPIs;
	
	//Page Object "Getting Started With Web Applications"
	@FindBy(how = How.LINK_TEXT, using = "Getting Started With Web Applications")
	public WebElement gSWWebApplications;
	
	
	public TechnicalLibraryPage(WebDriver driver) {
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
	
	/*Method to click on links under Access Point Names*/
	public void clkTechnicalLibraryLink(){
		technicalLibrary.click();
		waitForPageToLoad();
	}
	
	/*Method to click on links under Access Point Names*/
	public void clkAccessPointNamesLink(){
		clkTechnicalLibraryLink();
		aPNDescriptionAndCharacterstics.click();
		waitForPageToLoad();
		validatePageTitle("APN Descriptions and Characteristics | AT&T Developer");
		clkTechnicalLibraryLink();
		customAPNs.click();
		waitForPageToLoad();
		validatePageTitle("Custom APNs | AT&T Developer");
	}
	
	/*Method to click on links under Application Certification Policies*/
	public void clkApplicationCertificationPoliciesLink(){
		clkTechnicalLibraryLink();
		certificationSigningTestingOverview.click();
		waitForPageToLoad();
		validatePageTitle("Certification, Signing, and Testing Overview | AT&T Developer");
		clkTechnicalLibraryLink();
		certificationRequirements.click();
		waitForPageToLoad();
		validatePageTitle("Certification Requirements | AT&T Developer");
		clkTechnicalLibraryLink();
		codeSigning.click();
		waitForPageToLoad();
		validatePageTitle("Code Signing | AT&T Developer");
		clkTechnicalLibraryLink();
		javaSigningSpecifications.click();
		waitForPageToLoad();
		validatePageTitle("Java Signing Specifications | AT&T Developer");
		clkTechnicalLibraryLink();
		workingWithAggregators.click();
		waitForPageToLoad();
		validatePageTitle("Working with Aggregators | AT&T Developer");
	}
	
	/*Method to click on links under Device Technologies*/
	public void clkDeviceTechnologiesLink(){
		clkTechnicalLibraryLink();
		biometrics.click();
		waitForPageToLoad();
		validatePageTitle("Biometrics | AT&T Developer");
		clkTechnicalLibraryLink();
		deviceDetection.click();
		waitForPageToLoad();
		validatePageTitle("Device Detection | AT&T Developer");
		clkTechnicalLibraryLink();
		hTML5.click();
		waitForPageToLoad();
		validatePageTitle("HTML5 | AT&T Developer");
		clkTechnicalLibraryLink();
		mobileWebFundamentals.click();
		waitForPageToLoad();
		validatePageTitle("Mobile Web Fundamentals | AT&T Developer");
		clkTechnicalLibraryLink();
		mobileWebStandards.click();
		waitForPageToLoad();
		validatePageTitle("Mobile Web Standards | AT&T Developer");
	}	
	
	
	/*Method to click on links under External Access Gateway*/
	public void clkExternalAccessGatewayLink(){
		clkTechnicalLibraryLink();
		nativeMessaging.click();
		waitForPageToLoad();
		validatePageTitle("Native Messaging | AT&T Developer");
		clkTechnicalLibraryLink();
		nSGCertification.click();
		waitForPageToLoad();
		validatePageTitle("NSG Certification | AT&T Developer");
		clkTechnicalLibraryLink();
		nSGDeveloperResources.click();
		waitForPageToLoad();
		validatePageTitle("NSG Developer Resources | AT&T Developer");
		clkTechnicalLibraryLink();
		nSGOnboarding.click();
		waitForPageToLoad();
		validatePageTitle("NSG Onboarding | AT&T Developer");
		nSGProduction.click();
		waitForPageToLoad();
		validatePageTitle("NSG Production | AT&T Developer");
	}
	
	/*Method to click on links under Network Technologies*/
	public void clkNetworkTechnologiesLink(){
		clkTechnicalLibraryLink();
		locationBasedServices.click();
		waitForPageToLoad();
		validatePageTitle("Location-based Services (LBS) | AT&T Developer");
		clkTechnicalLibraryLink();
		longTermEvolution.click();
		waitForPageToLoad();
		validatePageTitle("Long Term Evolution (LTE) | AT&T Developer");
		clkTechnicalLibraryLink();
		networkTimers.click();
		waitForPageToLoad();
		validatePageTitle("Network Timers | AT&T Developer");
		clkTechnicalLibraryLink();
		wiFi.click();
		waitForPageToLoad();
		validatePageTitle("Wi-Fi | AT&T Developer");
	}
	
	/*Method to click on links under Security And Privacy*/
	public void clkSecurityAndPrivacyLink(){
		clkTechnicalLibraryLink();
		applicationPrivacyGuidlines.click();
		waitForPageToLoad();
		validatePageTitle("Application Privacy Guidelines | AT&T Developer");
		clkTechnicalLibraryLink();
		downloadingDRMContentInAndroid.click();
		waitForPageToLoad();
		validatePageTitle("Downloading DRM content in Android | AT&T Developer");
		clkTechnicalLibraryLink();
		iPv6.click();
		waitForPageToLoad();
		validatePageTitle("IPv6 | AT&T Developer");
		clkTechnicalLibraryLink();
		likelihoodOfASuccessfulAttack.click();
		waitForPageToLoad();
		validatePageTitle("Likelihood of a Successful Attack | AT&T Developer");
		clkTechnicalLibraryLink();
		messagingPrivacy.click();
		waitForPageToLoad();
		validatePageTitle("Messaging Privacy | AT&T Developer");
	}	
	
	/*Method to click on links under Other AT&T Websites*/
	public void clkOtherATTWebsitesLink(){
			
		String mwh1=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		aTTCertifiedSolutionsCatalog.click();
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
		                Assert.assertEquals("AT&T Developer Program Home | Certified Solutions Catalog | Home", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh1);
		    }
		}
		String mwh2=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		aTTCloudArchitect.click();
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
		                Assert.assertEquals("AT&T Cloud Architect, AT&T cloud architect, cloud architecture & development-small business & developers", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh2);
		    }
		}
		
		String mwh3=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		aTTCloudServices.click();
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
		                Assert.assertEquals("Cloud Services, AT&T Cloud-based Solutions, Enterprise Cloud Services", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh3);
		    }
		}
		
		String mwh4=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		aTTEmergingDevices.click();
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
		                Assert.assertEquals("Emerging Devices", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh4);
		    }
		}
		
		String mwh5=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		aTTFoundry.click();
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
		                Assert.assertEquals("AT&T Foundry Innovation Centers to Accelerate Technology | AT&T", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh5);
		    }
		}
	}	
	
	/*Method to click on links under UI Elements*/
	public void clkUIElementsLink(){
		clkTechnicalLibraryLink();
		checkBoxForAndroid.click();
		waitForPageToLoad();
		validatePageTitle("Check Box for Android | AT&T Developer");
		clkTechnicalLibraryLink();
		imageButtonForAndroid.click();
		waitForPageToLoad();
		validatePageTitle("Image Button for Android | AT&T Developer");
		clkTechnicalLibraryLink();
		hTML5Checkboxes.click();
		waitForPageToLoad();
		validatePageTitle("HTML5 Checkboxes | AT&T Developer");
		clkTechnicalLibraryLink();
		hTML5ImageButton.click();
		waitForPageToLoad();
		validatePageTitle("HTML5 Image Button | AT&T Developer");	
		technicalLibrary.click();
		waitForPageToLoad();
		String mwh=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		commonEACMobUserExp.click();
		waitForPageToLoad();
		Iterator<String> ite=s.iterator();
		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("Seven Common Errors Around Creating Mobile User Experience - Forums Blogs Events News | AT&T Developer Program", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
		
	
	/*Method to click on links under White PApers*/
	public void clkWhitePApersLink(){

		String mwh1=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		bPF3GAnd4GAppDev.click();
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
		                Assert.assertEquals("best-practices-3g-4g-app-development.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh1);
		    }
		}
		String mwh2=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		cPISAExpOnSSReviews.click();
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
		                Assert.assertEquals("difabbrizio-icassp2012.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh2);
		    }
		}
		
		String mwh3=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		cPSAppDev.click();
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
		                Assert.assertEquals("att-drop-in-media-case-study.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh3);
		    }
		}
		
		tDevGuideToAPIs.click();
		waitForPageToLoad();
		validatePageTitle("The Developer's Guide to APIs | AT&T Developer");
		
		String mwh4=driver.getWindowHandle();
		technicalLibrary.click();
		waitForPageToLoad();
		gSWWebApplications.click();
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
		                Assert.assertEquals("getting-started-with-web-applications.pdf", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh4);
		    }
		}
			
		}
	
}
