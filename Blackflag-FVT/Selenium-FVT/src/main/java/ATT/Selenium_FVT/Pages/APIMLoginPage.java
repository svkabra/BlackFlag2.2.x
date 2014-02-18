package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class APIMLoginPage extends WebPage {

	//private static final String OAUTH_URL ="https://devpgm-uat-app.eng.mobilephone.net/developer/forward.jsp?passedItemId=14100062";

	@FindBy(how = How.LINK_TEXT, using = "Support Overview")
	public WebElement Support;

	@FindBy(how = How.ID, using="g_signin_password")
	private WebElement password_Popup;

	@FindBy(how = How.ID, using ="g_signin_username")
	private WebElement userName_Popup;

	@FindBy(how = How.NAME, using ="signIn")
	private WebElement popupSignInButton;
	
	@FindBy(how = How.CLASS_NAME, using ="field_error")
	private WebElement fieldError;
	
	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement signIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/a[3]")
	public WebElement getStartedFree;
	
	@FindBy(how = How.NAME, using="signIn")
	private WebElement signInButton;

	@FindBy(id="signin_username")
	private WebElement userName;

	@FindBy(id="signin_password")
	private WebElement password;

	@FindBy(how = How.LINK_TEXT, using = "APIs & Tools")
	public WebElement APIs_Tools;

	@FindBy(how = How.LINK_TEXT, using="Submit A Ticket")
	private WebElement LogTicket;

	@FindBy(how = How.LINK_TEXT, using="Manage My Account")
	private WebElement manageMyAcct;

	@FindBy(id="signInLink")
	public WebElement signinLink;

	@FindBy(how = How.LINK_TEXT, using = "My Apps")
	public WebElement myApps;

	@FindBy(how = How.CLASS_NAME ,using="logo")
	private WebElement home;
	
	@FindBy(how = How.LINK_TEXT ,using="See more success stories")
	private WebElement successStories;
	
	@FindBy(how = How.LINK_TEXT ,using="Contact an API Expert")
	private WebElement contactExpert;
	
 	
	@FindBy(how = How.LINK_TEXT ,using="Check out Events & Hackathons")
	private WebElement checkOutHackathonEvents;
	
	/* Method to Click hackathon and events from home page */
	public void clkHackathonEventsButton(){
		checkOutHackathonEvents.click();
		waitForPageToLoad();
		validatePageTitle("Developer Events | AT&T Developer Program  | AT&T Developer");
	}
		


	public APIMLoginPage(WebDriver driver){
		super(driver);

	}

	@Override
	public void openURL() {
		driver.navigate().to(Constants.APIM_HOME_URL);
		waitForPageToLoad();
		PageFactory.initElements(driver, this);	
	}



	public void enterPasword(String pwd){
		password_Popup.sendKeys(pwd);

	}

	public void enterUserName(String usrName){
		signinLink.click();
		implicitWait(1);
		userName_Popup.sendKeys(usrName);
	}


  
	//Playground Login Method for f3 Environment 

	public void pgLogIn(){

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userName_Popup.click();
		userName_Popup.sendKeys(Constants.PG_USERNAME);
		waitForElement(password);
		password_Popup.click();
		password_Popup.sendKeys(Constants.PG_PASSWORD);
		waitForPageToLoad();
		popupSignInButton.click();


	} 
	
	//Playground Login Method for f3 Environment 

	public void pgLogInCancelDelete(){

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userName_Popup.click();
		userName_Popup.sendKeys(Constants.PG_USERNAME_CANCELDELELTE);
		waitForElement(password);
		password_Popup.click();
		password_Popup.sendKeys(Constants.PG_PASSWORD__CANCELDELELTE);
		waitForPageToLoad();
		popupSignInButton.click();


	} 
	
	//Developer Login Method for f3 Environment 

		public void devLogIn(){

			signIn.click();
			waitForPageToLoad();
			signIn.click();
			userName_Popup.click();
			userName_Popup.sendKeys(Constants.DEV_USERNAME);
			waitForElement(password);
			password_Popup.click();
			password_Popup.sendKeys(Constants.DEV_PASSWORD);
			waitForPageToLoad();
			popupSignInButton.click();


		} 
		//OPA Login Method for f3 Environment 

		public void opaLogIn(){

			signIn.click();
			waitForPageToLoad();
			signIn.click();
			userName_Popup.click();
			userName_Popup.sendKeys(Constants.OPA_USERNAME);
			waitForElement(password);
			password_Popup.click();
			password_Popup.sendKeys(Constants.OPA_PASSWORD);
			waitForPageToLoad();
			popupSignInButton.click();


		} 
		
				
		//Developer Login Method for f3 Environment for verifying account with applications- Hemant 
		public void devLogInADVWITHAPP(){
			signIn.click();
			waitForPageToLoad();
			signIn.click();
			userName_Popup.click();
			userName_Popup.sendKeys(Constants.DEV_USERNAME_ADV);
			waitForElement(password);
			password_Popup.click();
			password_Popup.sendKeys(Constants.DEV_PASSWORD_ADV);
			waitForPageToLoad();
			popupSignInButton.click();
		} 
		//OPA Login Method for f3 Environment for verifying account with applications - Hemant

		public void opaLogInADVWITAPP(){
			signIn.click();
			waitForPageToLoad();
			signIn.click();
			userName_Popup.click();
			userName_Popup.sendKeys(Constants.OPA_USERNAME_ADV);
			waitForElement(password);
			password_Popup.click();
			password_Popup.sendKeys(Constants.OPA_PASSWORD_ADV);
			waitForPageToLoad();
			popupSignInButton.click();

		} 

	    //Procedure to wait for specified milliseconds
	    public static void wait(int ms){
	           try {                             
	                  Thread.sleep(ms);
	           } catch (InterruptedException e) {

	                  e.printStackTrace();
	           }
	    }

	    
		//Developer Login Method for developer account without application- Hemant 
		public void devLogInADVWOAPP(){
			signIn.click();
			waitForPageToLoad();
			signIn.click();
			wait(2000);
			userName_Popup.click();
			userName_Popup.sendKeys(Constants.DEV_USERNAME_ADV_NO_APP);
			waitForElement(password);
			password_Popup.click();
			password_Popup.sendKeys(Constants.DEV_PASSWORD_ADV_NO_APP );
			waitForPageToLoad();
			popupSignInButton.click();
		} 
		//OPA Login Method for OPA account without application- Hemant

		public void opaLogInADVWOAPP(){
			signIn.click();
			waitForPageToLoad();
			signIn.click();
			userName_Popup.click();
			userName_Popup.sendKeys(Constants.OPA_USERNAME_ADV_NO_APP);
			waitForElement(password);
			password_Popup.click();
			password_Popup.sendKeys(Constants.OPA_PASSWORD_ADV_NO_APP );
			waitForPageToLoad();
			popupSignInButton.click();

		} 

	public MyAppsPage login(){
		signIn.click();
		waitForPageToLoad();	
		myApps.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, MyAppsPage.class);			
	}
/* Method for Testing login functionality */
	public void testLogIn(String uname, String pwd){

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userName_Popup.click();
		userName_Popup.sendKeys(uname);
		waitForElement(password);
		password_Popup.click();
		password_Popup.sendKeys(pwd);
		waitForPageToLoad();
		popupSignInButton.click();
		int size= driver.findElements(By.className("field_error")).size();
		if (size!=0){
			if(fieldError.isDisplayed()){
				validateWebElementDisplayed(fieldError);
			}
			else{
				validatePageTitle("AT&T Developer Program | APIs, SDKs, & Developer Resources | AT&T Developer");
			}
		}
	}
	 
	/* Method to open join now page */
	public JoinNowPage clkGetStartedFree(){
		getStartedFree.click();
		waitForPageToLoad();
		driver.findElement(By.linkText("close")).click();
		waitForPageToLoad();
		validatePageTitle("Get Free Basic Access and Join the AT&T Developer Program");
		return PageFactory.initElements(driver, JoinNowPage.class);	
	}
    //**************************Rohit*********************************
    
    //username header
    @FindBy(how = How.XPATH ,using="//*[@id='att-header']/nav/form/div/a")
    private WebElement userNameHeader;
    
    public void logout(){
    	waitForElement(userNameHeader);
        Hover(userNameHeader);
		driver.findElement(By.id("logOut")).click();
		waitForAjaxInactivity();
		validateWebElementDisplayed(driver.findElement(By.linkText("Sign In")));
	}
    
	// method to manage alert pop up
	public boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	} // isAlertPresent()
	
    //method to click on Manage My Account link
	public ManageMyAcct clickManageMyAcctLink() {

		waitForElement(userNameHeader);
		Hover(userNameHeader);
		manageMyAcct.click();
		waitForPageToLoad();
		implicitWait(10);

		while (isAlertPresent(driver)) {

			Alert javascriptAlert = driver.switchTo().alert();
			System.out.println(javascriptAlert.getText()); // Get text on alert
															// box
			javascriptAlert.accept();
			waitForPageToLoad();
		}

		String titleCaptured = driver.getTitle();
		System.out.println(titleCaptured);
		String titleActual = "Manage My Account";
		if (titleCaptured.equalsIgnoreCase(titleActual)) {

			storeVerificationResults(true, "Page Title displayed");

		} else {

			storeVerificationResults(false, "Page Title not displayed");
		}

		return PageFactory.initElements(driver, ManageMyAcct.class);
	}
    
    
    //@@@@@@@@@@@@@@@@@@@@@@---------------------------@@@@@@@@@@@@@@@@@@

	//Method to hover over a link and access the sub element
	public MyAppsPage clickMyApps(){
		waitForElement(myApps);
		myApps.click();
		waitForPageToLoad();
		implicitWait(5);
		validatePageTitle("API Matrix");
		return PageFactory.initElements(driver, MyAppsPage.class);
	}

	/*Method to click on See more Success Stories page */
		public void clkSeeMoreSuccessStories(){
			successStories.click();
			waitForPageToLoad();
			validatePageTitle("Success Stories | AT&T Developer");
		}

	public MyAppsPage LogIn_Link(String username, String pwd){

		signIn.click();
		waitForPageToLoad();
		userName_Popup.sendKeys(username);
		password_Popup.sendKeys(pwd);
		waitForPageToLoad();
		popupSignInButton.click();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}

	//method to click on Log A Ticket link
	public void clickLogTicket(){

		implicitWait(2);
		Hover(Support);
		implicitWait(2);
		LogTicket.click();

	}

}
