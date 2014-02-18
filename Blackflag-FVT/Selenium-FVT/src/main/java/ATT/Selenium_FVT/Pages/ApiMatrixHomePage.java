package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class ApiMatrixHomePage extends WebPage {

	//private static final String OAUTH_URL ="https://devpgm-uat-app.eng.mobilephone.net/developer/forward.jsp?passedItemId=14100062";

	@FindBy(how = How.LINK_TEXT, using = "Support Overview")
	public WebElement Support;

	@FindBy(how = How.ID, using="g_signin_password")
	private WebElement password_Popup;

	@FindBy(how = How.ID, using ="g_signin_username")
	private WebElement userName_Popup;

	@FindBy(how = How.NAME, using ="signIn")
	private WebElement popupSignInButton;
	

//	@FindBy(how = How.CLASS_NAME, using = "login")
//	public WebElement signIn;

	@FindBy(how = How.ID, using = "mainLogInLink")
	public WebElement signIn;

	
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


	public ApiMatrixHomePage(WebDriver driver){
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

	
	
    //**************************Rohit*********************************
    
    //username header
    @FindBy(how = How.XPATH ,using="//*[@id='att-header']/nav/form/div/a")
    private WebElement userNameHeader;
    
    
    //method to click on Manage My Account link
    public ManageMyAcct clickManageMyAcctLink(){
           
           waitForElement(userNameHeader);
           Hover(userNameHeader);
           manageMyAcct.click();
           waitForPageToLoad();
           
           implicitWait(10);
           String titleCaptured = driver.getTitle();
           System.out.println(titleCaptured);
           String titleActual = "Manage My Account";
           if(titleCaptured.equalsIgnoreCase(titleActual)){
                    
               storeVerificationResults(true, "Page Title displayed");
             
               }else{
                    
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
		return PageFactory.initElements(driver, MyAppsPage.class);
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

	public APIMLoginPage apimLoginPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
