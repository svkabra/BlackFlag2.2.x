package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class APIMLoginPage extends WebPage {
	
	private static final String OAUTH_URL ="https://apimatrix.tfoundry.com/user_login";
	
	
	@FindBy(how = How.ID, using ="signin_password")
	private WebElement password;
	
	@FindBy(name="signIn_dsp")
	private WebElement signIn;
	 
	//Page Object "Home"
	@FindBy(how = How.LINK_TEXT, using = "Home")
	public WebElement Home;
	
			
	//Page Object "Sign In"
	@FindBy(how = How.ID, using = "signInLink")
	public WebElement SignIn;
	
	//Page Object "Join Now"
	@FindBy(how = How.ID, using = "joinNowLink")
	public WebElement JoinNow;
	
	//Page Object "APIs & Tools
	@FindBy(how = How.LINK_TEXT, using = "APIs & Tools")
	public WebElement APIs_Tools;
	
	//Page Object "APIs"
	@FindBy(how = How.LINK_TEXT, using = "APIs")
	public WebElement API;
			
	//Page Object "SDKs & Tools"
	@FindBy(how = How.LINK_TEXT, using = "SDKs & Tools")
	public WebElement SDKsTools;
			
	//Page Object "Case Studies"
	@FindBy(how = How.LINK_TEXT, using = "Case Studies")
	public WebElement CaseStudies;

	//Page Object "Tutorials"
	@FindBy(how = How.LINK_TEXT, using = "Tutorials")
	public WebElement Tutorials;
			
	//Page Object "Sample Apps"
	@FindBy(how = How.LINK_TEXT, using = "Sample Apps")
	public WebElement SampleApps;
	
	//Page Object "Console"
	@FindBy(how = How.LINK_TEXT, using = "Console")
	public WebElement Console;
	
	//Page Object "Docs"
	@FindBy(how = How.LINK_TEXT, using = "Docs")
	public WebElement Docs;
	
	//Page Object "My Apps"
	@FindBy(how = How.LINK_TEXT, using = "My Apps")
	public WebElement MyApps;
	
	//Page Object "Pricing"
	@FindBy(how = How.LINK_TEXT, using = "Pricing")
	public WebElement Pricing;
	
	//Page Object "Program Features"
	@FindBy(how = How.LINK_TEXT, using = "Program Features")
	public WebElement ProgramFeatures;
	
	
	//Page Object "Devices"
	@FindBy(how = How.LINK_TEXT, using = "Devices")
	public WebElement Devices;
	
	//Page Object "Community"
	@FindBy(how = How.LINK_TEXT, using = "Community")
	public WebElement Community;
	
	//Page Object "Blog"
	@FindBy(how = How.LINK_TEXT, using = "Blog")
	public WebElement Blog;

	//Page Object "Events"
	@FindBy(how = How.LINK_TEXT, using = "Events")
	public WebElement Events;
	
	//Page Object "Forums"
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/center/div/div/div[2]/div[2]/div[2]/ul/li[5]/div/ul/li[2]/div/a")
	public WebElement ForumsSupport;
			
	//Page Object "Hackathons"
	@FindBy(how = How.LINK_TEXT, using = "Hackathons")
	public WebElement Hackathons;
	
	//Page Object "Learn"
	@FindBy(how = How.LINK_TEXT, using = "Learn")
	public WebElement Learn;
	
	//Page Object "Platforms & OSes"
	@FindBy(how = How.LINK_TEXT, using = "Platforms & OSes")
	public WebElement PlatformsOSes;
	
	//Page Object "Network Technologies"
	@FindBy(how = How.LINK_TEXT, using = "Network Technologies")
	public WebElement NetworkTechnologies;
			
	//Page Object "Enterprise Reference Library"
	@FindBy(how = How.LINK_TEXT, using = "Enterprise Reference Library")
	public WebElement EnterpriseReferenceLibrary;
			
	//Page Object "Enabling Technologies"
	@FindBy(how = How.LINK_TEXT, using = "Enabling Technologies")
	public WebElement EnablingTechnologies;
	
	//Page Object "Develop"
	@FindBy(how = How.LINK_TEXT, using = "Develop")
	public WebElement Develop;
	
	//Page Object "Use AT&T ARO"
	@FindBy(how = How.LINK_TEXT, using = "Use AT&T ARO")
	public WebElement UseATTARO;
			
	//Page Object "Get AT&T ARO"
	@FindBy(how = How.LINK_TEXT, using = "Get AT&T ARO")
	public WebElement GetATTARO;
			
	//Page Object "Find SDKs and Tools"
	@FindBy(how = How.LINK_TEXT, using = "Find SDKs and Tools")
	public WebElement FindSDKsandTools;
			
	//Page Object "AT&T Foundry"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Foundry")
	public WebElement ATTFoundry;
	
	//Page Object "AT&T Cloud Services"
	@FindBy(how = How.LINK_TEXT, using = "AT&T Cloud Services")
	public WebElement ATTCloudServices;
			
	//Page Object "Resources and Alerts"
	@FindBy(how = How.LINK_TEXT, using = "Resources and Alerts")
	public WebElement ResourcesandAlerts;
	
	//Page Object "Launch"
	@FindBy(how = How.LINK_TEXT, using = "Launch")
	public WebElement Launch;
			
	//Page Object "Launch Through AT&T"
	@FindBy(how = How.LINK_TEXT, using = "Launch Through AT&T")
	public WebElement LaunchThroughATT;
	
	//Page Object "Distribute Consumer Apps"
	@FindBy(how = How.LINK_TEXT, using = "Distribute Consumer Apps")
	public WebElement DistributeConsumerApps;
			
	//Page Object "Go To Market Excellence"
	@FindBy(how = How.LINK_TEXT, using = "Go To Market Excellence")
	public WebElement GoToMarketExcellence;
			
	//Page Object "Distribute Business Apps"
	@FindBy(how = How.LINK_TEXT, using = "Distribute Business Apps")
	public WebElement DistributeBusinessApps;
	
	//Page Object "Support"
	@FindBy(how = How.LINK_TEXT, using = "Support")
	public WebElement Support;
	
	//Page Object "Bug Bounty"
	@FindBy(how = How.LINK_TEXT, using = "Bug Bounty")
	public WebElement BugBounty;
			
	//Page Object "Forums"
	@FindBy(how = How.LINK_TEXT, using = "Forums")
	public WebElement Forums;
	
	//Page Object "FAQs"
	@FindBy(how = How.LINK_TEXT, using = "FAQs")
	public WebElement FAQs;
			
	//Page Object "Tech Tips"
	@FindBy(how = How.LINK_TEXT, using = "Tech Tips")
	public WebElement TechTips;
	
	//Page Object "Live Chat"
	@FindBy(how = How.LINK_TEXT, using = "Live Chat")
	public WebElement LiveChat;
	
	//Page Object "Go"
	@FindBy(how = How.LINK_TEXT, using ="Go")
	public WebElement Go;
	
	//Page Object "User name Tab on the Popup"
	@FindBy(how = How.ID, using ="g_signin_username")
	private WebElement userName_Popup;
	
	//Page Object "Password Tab on the Popup"
	@FindBy(how = How.ID, using="g_signin_password")
	private WebElement password_Popup;
	
	//Page Object "signIn button on Popup"
	@FindBy(how = How.NAME, using="signIn")
	private WebElement signIn_button;
	
	//Page Object "signOut"
	@FindBy(how = How.NAME, using="signOut")
	private WebElement signOut;
	
	//Page Object "signIn Checkbox on the sign in popup"
	@FindBy(how = How.ID, using="g_singin_checkbox_remember_username")
	private WebElement signIn_checkbox;
	
	//Page Object "Search Box"
	@FindBy(how = How.ID, using="keyword")
	private WebElement searchBox;
					
	public APIMLoginPage(WebDriver driver){
		super(driver);
		
	}

	@Override
	//public void openURL() {
		//driver.get(APIM_URL);
		//driver.navigate().to("http://devpgm-f3t-apimatrix.api-dev.mars.bf.sl.attcompute.com/");
		//waitForPageToLoad();
		//PageFactory.initElements(driver, this);
		
	//}
	
	//public void enterUserName(String usrName){
		
		//userName.sendKeys(usrName);
	//}
	
	//public void enterPasword(String pwd){
		//password.sendKeys(pwd);
		
	//}
	
	public ApiMatrixHomePage clickSignIn(){
		signIn.click();
		waitForPageToLoad();
		waitForElement(By.className("container"));
		driver.navigate().to(ApiMatrixHomePage.APIMATRIX_URL);
		waitForPageToLoad();
		return new ApiMatrixHomePage(driver);
		
		
		
	}
	
	public MyAppsPage login(){
		signIn.click();
		waitForPageToLoad();
		driver.navigate().to(MyAppsPage.MY_APPS_URL);
		waitForPageToLoad();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}


	//Login Method for f3 Environment		
	public void LogIn(String username, String pwd){
		
		SignIn.click();
		waitForPageToLoad();
		userName_Popup.sendKeys(username);
		password_Popup.sendKeys(pwd);
		waitForPageToLoad();
		signIn_button.click();
						
	}
	
	
	//Logout Method for f3 Environment
	public void LogOut(){
		
			signOut.click();
			implicitWait(3);
			waitForAjaxInactivity();
			
	}
	
	//Method to hover over a link and access the sub element
	public void clickMyApps(){
		
		Hover(APIs_Tools);
		MyApps.click();
	}
	
	//Method to click on Join Now link
		public void clickJoinNow(){
			
				JoinNow.click();
				waitForPageToLoad();				
	
		}
		
	//Method to check the checkbox on signin Pop Up
	public void click_signInCheckbox(){
		
		signIn_checkbox.click();
		waitForPageToLoad();
	}
		
	//Method to click on signIn Button on the sign In Pop Up
	public void click_signInButton(){
		
		signIn_button.click();
		waitForPageToLoad();
	}
		
	public void clickGo_button(){
		
		Go.click();
		waitForPageToLoad();
	}

	
	
	public void enterSearchText(String text){
		
		searchBox.sendKeys(text);

	}

	
	//public APIMLoginPage(WebDriver driver){
		//super(driver);
		
	//}

	//@Override
	//public void openURL() {
		//driver.get(OAUTH_URL);
		//driver.navigate().to("https://auth.tfoundry.com/sign_in");
		//waitForPageToLoad();
		//PageFactory.initElements(driver, this);
		
	//}
	
	//public void enterUserName(String usrName){
		//userName.sendKeys(usrName);
	//}
	
	//public void enterPasword(String pwd){
		//password.sendKeys(pwd);
		
//	}
	
	//public ApiMatrixHomePage clickSignIn(){
		//signIn.click();
		//waitForPageToLoad();
		//waitForElement(By.className("container"));
		//driver.navigate().to(ApiMatrixHomePage.APIMATRIX_URL);
		//waitForPageToLoad();
		//return new ApiMatrixHomePage(driver);
		
	//}
	
	//public MyAppsPage login(){
		//signIn.click();
		//waitForPageToLoad();
		//driver.navigate().to(MyAppsPage.MY_APPS_URL);
		//waitForPageToLoad();
		//return PageFactory.initElements(driver, MyAppsPage.class);
	//}

}
