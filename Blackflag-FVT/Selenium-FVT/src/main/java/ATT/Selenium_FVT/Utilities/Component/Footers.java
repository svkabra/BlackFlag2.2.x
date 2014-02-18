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
import ATT.Selenium_FVT.Pages.SupportOverviewPage;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class Footers extends WebPage{
	
	@FindBy(how = How.LINK_TEXT, using = "Terms of Use")
	public WebElement termConditions;

	// Page Object "Privacy Policy"
	@FindBy(how = How.LINK_TEXT, using = "Privacy Policy")
	public WebElement privacyPolicy;

	// Page Object "Log A Ticket"
	@FindBy(how = How.LINK_TEXT, using = "Submit a Ticket")
	public WebElement submitTicket;			
				
	// Page Object "Our APIs"
	@FindBy(how = How.LINK_TEXT, using ="Our APIs")
	public WebElement ourApis;
	
	// Page Object "AT&T Application Resource Optimizer"
	@FindBy(how = How.LINK_TEXT, using ="AT&T Application Resource Optimizer")
	public WebElement attAro;
		
	// Page Object "SDKs, Plugins, & More"
	@FindBy(how = How.LINK_TEXT, using ="SDKs, Plugins, & More")
	public WebElement sdk;
	
	// Page Object "AT&T Text Button"
	@FindBy(how = How.LINK_TEXT, using ="AT&T Text Button")
	public WebElement textButton;
		
	// Page Object "Contact Us"
	@FindBy(how = How.LINK_TEXT, using = "Contact Us")
	public WebElement contactUs;
	
	// Page Object "Technical Library"
	@FindBy(how = How.LINK_TEXT, using = "Technical Library")
	public WebElement techLib;
	
	// Page Object "2014 AT&T Intellectual Property"
	@FindBy(how = How.LINK_TEXT, using = "2014 AT&T Intellectual Property")
	public WebElement intProperty; 
	
	// Page Object "AT&T AppCenter for Consumer Apps"
	@FindBy(how = How.LINK_TEXT, using = "AT&T AppCenter for Consumer Apps")
	public WebElement consumerApp;
	
	// Page Object "AT&T Certified Solutions Catalog for B2B Apps"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Certified Solutions Catalog for B2B Apps")
	public WebElement b2bApp;
	
	// Page Object "Device References and Specs"
	@FindBy(how = How.LINK_TEXT, using = "Device References and Specs")
	public WebElement device;
	
	// Page Object "Device References and Specs"
	@FindBy(how = How.LINK_TEXT, using = "Support Overview")
	public WebElement supportOverview;
    
	// Page Object "Live Chat"
	@FindBy(how = How.LINK_TEXT, using = "Live Chat")
	public WebElement liveChat;
    
	// Page Object "FAQs"
	@FindBy(how = How.LINK_TEXT, using = "FAQs")
	public WebElement faqs;
    
	// Page Object "Facebook"
	@FindBy(how = How.LINK_TEXT, using = "Facebook")
	public WebElement facebook;
	
	// Page Object "Twitter"
	@FindBy(how = How.CLASS_NAME, using = "twitter")
	public WebElement twitter;
	
	// Page Object "GitHub"
	@FindBy(how = How.CLASS_NAME, using = "github")
	public WebElement github;
		
	public Footers(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	
	@Override
	public void openURL() {		
	//	PageFactory.initElements(driver,this);
	}

	/*Method to click on footer link "Facebook"*/	
	public void clkFacebookIcon(){		
		String mwh=driver.getWindowHandle(); 
		facebook.click();	
		waitForPageToLoad();
		Set s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                validatePageTitle("AT&T Developer Program | Facebook");
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}		

	}	
	/*Method to click on footer link "Twitter"*/	
	public void clkTwitterIcon(){		
		String mwh=driver.getWindowHandle(); 
		twitter.click();	
		waitForPageToLoad();
		Set s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                validatePageTitle("AT&T Dev Program (attdeveloper) on Twitter");
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}		

	}
	/*Method to click on footer link "Github"*/	
	public void clkGithubIcon(){		
		String mwh=driver.getWindowHandle(); 
		github.click();	
		waitForPageToLoad();
		Set s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                validatePageTitle("AT&T Developer Support Program · GitHub");
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}		

	}	
	/*Method to click on footer link "Terms of Use"*/	
	public void clkTermsnCondition(){		
		String mwh=driver.getWindowHandle(); 
		termConditions.click();	
		waitForPageToLoad();
		Set s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("AT&T Terms of Use", text);	
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}		

	}	
	
	/*Method to click on footer link "Privacy Policy"*/	
	public void clkPrivacynPolicy(){	
		String mwh=driver.getWindowHandle();
		privacyPolicy.click();		
		waitForPageToLoad();	
		Set s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();	
		                Assert.assertEquals("AT&T Privacy Policy", text);	
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}			
	}
	
	
	/*Method to click on footer link "Our APIs"*/	
	public void clkOurApi(){	
		ourApis.click();
		waitForPageToLoad();
		validatePageTitle("AT&T APIs | Build Speech, Messaging & Payment into your mobile app | AT&T Developer");
	}	
	
	/*Method to click on footer link "AT&T AppCenter for Consumer Apps"*/	
	public void clkConsumerApp(){	
		consumerApp.click();
		waitForPageToLoad();
		validatePageTitle("AT&T AppCenter for Consumer Apps | AT&T Developer");
	}	
	
	/*Method to click on footer link "AT&T Certified Solution Catalog for B2B Apps"*/	
	public void clkB2BApp(){	
		b2bApp.click();
		waitForPageToLoad();
		validatePageTitle("AT&T Certified Solution Catalog for B2B Apps | AT&T Developer");
	}	
	
	/*Method to click on footer link "Device References and Specs"*/	
	public void clkDevice(){	
		device.click();
		waitForPageToLoad();
		validatePageTitle("AT&T Devices: Overview, Detailed Specifications and Comparisions");
	}	
	
	/*Method to click on footer link "Support Overview"*/	
	public SupportOverviewPage clkSupportOverview(){	
		supportOverview.click();
		waitForPageToLoad();
		validatePageTitle("Support | AT&T Developer");
		return PageFactory.initElements(driver, SupportOverviewPage.class);
	}	
	
	/*Method to click on footer link "Live Chat"*/	
	public void clkLiveChat(){	
		liveChat.click();
		waitForPageToLoad();
		validatePageTitle("Chat Window");
	}	
	
	/*Method to click on footer link "FAQs"*/	
	public void clkFaqs(){	
		faqs.click();
		waitForPageToLoad();
		validatePageTitle("Frequently Asked Questions | AT&T Developer");
	}	
	
	/*Method to click on footer link "AT&T Application Resource Optimizer"*/	
	public void clkAttAro(){	
		attAro.click();
		waitForPageToLoad();
		validatePageTitle("AT&T Application Resource Optimizer (ARO) | AT&T Developer");
	}	
	
	/*Method to click on footer link "SDKs, Plugins & more"*/	
	public void clkSdkPlugin(){	
		sdk.click();
		waitForPageToLoad();
		validatePageTitle("SDKs, Plugins & Tools | AT&T Developer Program");
	}	
	
	/*Method to click on footer link "AT&T TextButton"*/	
	public void clkTextButton(){	
		textButton.click();
		waitForPageToLoad();
		validatePageTitle("AT&T Text Button | AT&T Developer");
	}	
	
	/*Method to click on footer link "Technical Library"*/	
	public void clkTechnicalLib(){	
		techLib.click();
		waitForPageToLoad();
		validatePageTitle("Technical Library | AT&T Developer");
	}	
	
	/*Method to click on footer link "AT&T AppCenter for Consumer Apps"*/	
	public void clkContactUs(){	
		consumerApp.click();
		waitForPageToLoad();
		validatePageTitle("AT&T Developer Program Contact Us Form");
	}	
	/*Method to click on footer link "2014 AT&T Intellectual Property"*/
	public void clkCopyRight(){		
		String mwh=driver.getWindowHandle();
		intProperty.click();
		waitForPageToLoad();
		Set s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		                Assert.assertEquals("AT&T Intellectual Property", text);	
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
		
	}
	
	/* Method to Initialize APIMLoginPage */
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}	
	
	/* Method to click on Submit a Ticket tab from Dev portal page */	
	public void clkLogTicket(){	
		String mwh=driver.getWindowHandle();
		submitTicket.click();		
		waitForPageToLoad();
		Set s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                validatePageTitle("Pricing");
		        		driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
		
		
		
	}		
	
	
}

