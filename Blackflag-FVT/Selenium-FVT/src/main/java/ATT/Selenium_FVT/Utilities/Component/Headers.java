package ATT.Selenium_FVT.Utilities.Component;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class Headers extends WebPage {
	
	// Page Object "Pricing"
	@FindBy(how = How.CLASS_NAME, using = "att-logo")
	public WebElement logo;
	
	// Page Object "Pricing"
	@FindBy(how = How.ID, using = "search")
	public WebElement searchInput;
	
	// Page Object "Stories"
	@FindBy(how = How.LINK_TEXT, using = "Stories")
	public WebElement stories;

	// Page Object "Pricing"
	@FindBy(how = How.LINK_TEXT, using = "Pricing")
	public WebElement pricing;
	
	// Page Object "APIs"
	@FindBy(how = How.LINK_TEXT, using = "APIs")
	public WebElement apis;
	
	// Page Object "Community"
	@FindBy(how = How.LINK_TEXT, using = "Community")
	public WebElement community;	
	
	// Page Object "Advertising"
	@FindBy(how = How.LINK_TEXT, using = "Advertising")
	public WebElement advertising;
	
	// Page Object "Speech"
	@FindBy(how = How.LINK_TEXT, using = "Speech")
	public WebElement speech;
		
	// Page Object "Hackathon & Evenets"
	@FindBy(how = How.LINK_TEXT, using = "Hackathons & Events")
	public WebElement hackathonsEvents;
	
	// Page Object "Search button"
	@FindBy(how = How.XPATH, using = "//*[@id='quick-search']/button")
	public WebElement searchButton;
	
	// Page Object "Forums"
	@FindBy(how = How.LINK_TEXT, using = "Forums")
	public WebElement forums;
	
	// Page Object "Forums"
	@FindBy(how = How.LINK_TEXT, using = "Blog")
	public WebElement blog;
	
	// Page Object "AdvertisingDocs"
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/div[1]/div/ul/li[1]/a[2]")
	public WebElement advertisingDocs;
	
	// Page Object "SpeechDocs"
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/div[1]/div/ul/li[2]/a[2]")
	public WebElement speechDocs;	
		
	// Page Object "InAppMessagingDocs"
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/div[1]/div/ul/li[3]/a[2]")
	public WebElement inAppMessagingDocs;	
	
	// Page Object "SMSDocs"
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/div[1]/div/ul/li[4]/a[2]")
	public WebElement sMSDocs;
	
	// Page Object "PaymentDocs"
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/div[1]/div/ul/li[5]/a[2]")
	public WebElement paymentDocs;
	
	public Headers(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	@Override
	public void openURL() {
//		PageFactory.initElements(driver,this);
		
	}
	
	/* Method to Initialize APIMLoginPage */
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}	
	
	/*Method to Verify that logo is displayed*/
	public void isLogoDisplayed(){	
		validateWebElementDisplayed(logo);	
	}	
	
	/*Method to Verify on clicking logo leads to home page*/
	public void clkLogo(){	
		logo.click();
		validatePageTitle("AT&T Developer Program | APIs, SDKs & Developer Resources | AT&T Developer");
	}	
	
	/*Method to click on header link "Stories"*/
	public void clkHackathonsEvents(){	
		Hover(community);
		hackathonsEvents.click();
		waitForPageToLoad();
		validatePageTitle("Success Stories | AT&T Developer");
	}	
	/*Method to search using search functionality */
	public void search()
	{
		searchInput.sendKeys("AT&T");
		searchButton.click();
		waitForPageToLoad();
		validatePageTitle("Search | AT&T Developer");
		
	}
	/*Method to click on header link "Forums"*/
	public void clkBlog(){	
		Hover(community);
		blog.click();
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");              
		
		if (isAlertPresent(driver)){ 

			Alert javascriptAlert = driver.switchTo().alert();
			System.out.println(javascriptAlert.getText()); // Get text on alert box
			javascriptAlert.accept();
			waitForPageToLoad();
		}
		validatePageTitle("AT&T Developer Program Blogs - Forums Blogs Events News | AT&T Developer Program");
	}	
	
	/*Method to click on header link "Forums"*/
	public void clkForums(){	
		Hover(community);
		forums.click();
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");              
		if (isAlertPresent(driver)){ 

			Alert javascriptAlert = driver.switchTo().alert();
			System.out.println(javascriptAlert.getText()); // Get text on alert box
			javascriptAlert.accept();
			waitForPageToLoad();
		}

		validatePageTitle("Forums - Forums Blogs Events News | AT&T Developer Program");
	}	
	
	/*Method to click on header link "Stories"*/
	public void clkStories(){	
		stories.click();
		waitForPageToLoad();
		validatePageTitle("Success Stories | AT&T Developer");
	}	
	
	/*Method to click on header link "Pricing"*/
	public void clkPricing(){	
		pricing.click();
		waitForPageToLoad();
		validatePageTitle("Pricing | AT&T Developer");
	}

	/*Method to click on header link "Community"*/
	public void clkCommunity(){	
		community.click();
		waitForPageToLoad();
		validatePageTitle("Community | AT&T Developer");
	}	
	
	/*Method to click on header link "Advertising Docs"*/
	public void clkAdvertisingDocs(){
		Hover(apis);
		advertisingDocs.click();
		waitForPageToLoad();
		validatePageTitle("Advertising Documentation");
	}
	
	/*Method to click on header link "Speech Docs"*/
	public void clkSpeechDocs(){
		Hover(apis);
		speechDocs.click();
		waitForPageToLoad();
		validatePageTitle("Speech Documentation");
	}
	
	/*Method to click on header link "In-app Messaging Docs"*/
	public void clkInAppMessagingDocs(){
		Hover(apis);
		inAppMessagingDocs.click();
		waitForPageToLoad();
		validatePageTitle("In-App Messaging Documentation");
	}

	/*Method to click on header link "In-app Messaging Docs"*/
	public void clkSMSDocs(){
		Hover(apis);
		sMSDocs.click();
		waitForPageToLoad();
		validatePageTitle("SMS Documentation");
	}
	
	/*Method to click on header link "Payment Docs"*/
	public void clkPaymentDocs(){
		Hover(apis);
		paymentDocs.click();
		waitForPageToLoad();
		validatePageTitle("Payment Documentation");
	}
		
	public boolean isAlertPresent(WebDriver driver) 
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		} // try 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		} // catch 
	} // isAlertPresent()


}
