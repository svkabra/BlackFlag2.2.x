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

	// Page Object "Support Oevrview"
	@FindBy(how = How.LINK_TEXT, using = "Support Overview")
	public WebElement support;

	// Page Object "Password Popup"
	@FindBy(how = How.ID, using = "g_signin_password")
	private WebElement passwordPopup;

	// Page Object "Username Popup"
	@FindBy(how = How.ID, using = "g_signin_username")
	private WebElement userNamePopup;

	// Page Object "Popup Signin button"
	@FindBy(how = How.NAME, using = "signIn")
	private WebElement popupSignInButton;

	// Page Object "Field Error"
	@FindBy(how = How.CLASS_NAME, using = "field_error")
	private WebElement fieldError;

	// Page Object "Sign In"
	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement signIn;

	// Page Object "Get Started Free"
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/a[3]")
	public WebElement getStartedFree;

	// Page Object "Sign In" Button
	@FindBy(how = How.NAME, using = "signIn")
	private WebElement signInButton;

	// Page Object "Username"
	@FindBy(id = "signin_username")
	private WebElement userName;

	// Page Object "Password"
	@FindBy(id = "signin_password")
	private WebElement password;

	// Page Object "APIs & Tools" link
	@FindBy(how = How.LINK_TEXT, using = "APIs & Tools")
	public WebElement aPIsTools;

	// Page Object "Submit A Ticket" link
	@FindBy(how = How.LINK_TEXT, using = "Submit A Ticket")
	private WebElement logTicket;

	// Page Object "Manage My Account" link
	@FindBy(how = How.LINK_TEXT, using = "Manage My Account")
	private WebElement manageMyAcct;

	// Page Object "Sign In"
	@FindBy(id = "signInLink")
	public WebElement signinLink;

	// Page Object "May Apps" button
	@FindBy(how = How.LINK_TEXT, using = "My Apps")
	public WebElement myApps;

	// Page Object "Logo"
	@FindBy(how = How.CLASS_NAME, using = "logo")
	private WebElement home;

	// Page Object "See more success stories" link
	@FindBy(how = How.LINK_TEXT, using = "See more success stories")
	private WebElement successStories;

	// Page Object "Contact an API Expert"
	@FindBy(how = How.LINK_TEXT, using = "Contact an API Expert")
	private WebElement contactExpert;

	// Page Object "Check out Events & Hackathons" Link
	@FindBy(how = How.LINK_TEXT, using = "Check out Events & Hackathons")
	private WebElement checkOutHackathonEvents;

	// Page Object "username" header
	@FindBy(how = How.XPATH, using = "//*[@id='att-header']/nav/form/div/a")
	private WebElement userNameHeader;

	/* Parameterized Constructor */
	public APIMLoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openURL() {
		driver.navigate().to(Constants.APIM_HOME_URL);
		waitForPageToLoad();
		PageFactory.initElements(driver, this);
	}

	/* Method to Click hackathon and events from home page */
	public void clickHackathonEventsButton() {
		checkOutHackathonEvents.click();
		waitForPageToLoad();
	}

	/* Method to enter password in the popup */
	public void enterPassword(String pwd) {
		passwordPopup.sendKeys(pwd);

	}

	/* Method to enter username in the popup */
	public void enterUserName(String userName) {
		signinLink.click();
		implicitWait(Constants.PAGE_WAIT_AJAX);
		userNamePopup.sendKeys(userName);
	}

	/* Playground Login Method for f3 Environment */
	public void playGroundLogIn() {

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.PG_USERNAME);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.PG_PASSWORD);
		waitForPageToLoad();
		popupSignInButton.click();

	}

	/* Playground Login Method for f3 Environment */
	public void playGroundLogInCancelDelete() {

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.PG_USERNAME_CANCELDELELTE);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.PG_PASSWORD__CANCELDELELTE);
		waitForPageToLoad();
		popupSignInButton.click();

	}

	/* Developer Login Method for f3 Environment */
	public void developerLogin() {

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.DEV_USERNAME);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.DEV_PASSWORD);
		waitForPageToLoad();
		popupSignInButton.click();

	}

	/* OPA Login Method for f3 Environment */
	public void opaLogin() {

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.OPA_USERNAME);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.OPA_PASSWORD);
		waitForPageToLoad();
		popupSignInButton.click();

	}

	/*
	 * Developer Login Method for f3 Environment for verifying account with
	 * applications- Hemant
	 */
	public void devLogInADVWITHAPP() {
		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.DEV_USERNAME_ADV);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.DEV_PASSWORD_ADV);
		waitForPageToLoad();
		popupSignInButton.click();
	}

	/*
	 * OPA Login Method for f3 Environment for verifying account with
	 * applications - Hemant
	 */
	public void opaLogInADVWITAPP() {
		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.OPA_USERNAME_ADV);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.OPA_PASSWORD_ADV);
		waitForPageToLoad();
		popupSignInButton.click();

	}


	/* Developer Login Method for developer account without application- Hemant */
	public void devLogInADVWOAPP() {
		signIn.click();
		waitForPageToLoad();
		signIn.click();
		implicitWait(Constants.PAGE_WAIT_AJAX);
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.DEV_USERNAME_ADV_NO_APP);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.DEV_PASSWORD_ADV_NO_APP);
		waitForPageToLoad();
		popupSignInButton.click();
	}

	/* OPA Login Method for OPA account without application- Hemant */
	public void opaLogInADVWOAPP() {
		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(Constants.OPA_USERNAME_ADV_NO_APP);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(Constants.OPA_PASSWORD_ADV_NO_APP);
		waitForPageToLoad();
		popupSignInButton.click();

	}

	/* Method to go to My Apps Page */
	public MyAppsPage login() {
		signIn.click();
		waitForPageToLoad();
		myApps.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}

	/* Method for Testing login functionality */
	public void testLogIn(String aUsername, String aPassword) {

		signIn.click();
		waitForPageToLoad();
		signIn.click();
		userNamePopup.click();
		userNamePopup.sendKeys(aUsername);
		waitForElement(password);
		passwordPopup.click();
		passwordPopup.sendKeys(aPassword);
		waitForPageToLoad();
		popupSignInButton.click();
	}

	/* Method to open join now page */
	public JoinNowPage clickGetStartedFree() {
		getStartedFree.click();
		waitForPageToLoad();
		driver.findElement(By.linkText("close")).click();
		waitForPageToLoad();
		validateGetStartedFree();
		return PageFactory.initElements(driver, JoinNowPage.class);
	}

	/* Method to logout */
	public void logout() {
		waitForElement(userNameHeader);
		Hover(userNameHeader);
		driver.findElement(By.id("logOut")).click();
		waitForAjaxInactivity();
		validateLogout();
		
	}



	/* Method to check if alert pop up occurs */
	public boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException Ex) {
			return false;
		}
	}

	/* Method to click on Manage My Account link */
	public ManageMyAccount clickManageMyAcctLink() {

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
		validateManageMyAccountPage();
		return PageFactory.initElements(driver, ManageMyAccount.class);
	}

	/* Method to go to "API Matrix" Page */
	public MyAppsPage clickMyApps() {
		waitForElement(myApps);
		myApps.click();
		waitForPageToLoad();
		implicitWait(5);
		validateMyAppsPage();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}

	/* Method to click on See more Success Stories page */
	public void clkSeeMoreSuccessStories() {
		successStories.click();
		waitForPageToLoad();
		validateSuccessStoriesPage();
	}

	/* Method to login */
	public MyAppsPage logInLink(String username, String pwd) {

		signIn.click();
		waitForPageToLoad();
		userNamePopup.sendKeys(username);
		passwordPopup.sendKeys(pwd);
		waitForPageToLoad();
		popupSignInButton.click();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}

	/* Method to click on Log A Ticket link */
	public void clickLogTicket() {

		implicitWait(2);
		Hover(support);
		implicitWait(2);
		logTicket.click();

	}

	/************ Validation Methods ***********/

	/* Method to validate Hackathon Events Page */
	public Boolean validateHackathonEventsPage() {

		String titleExpected = "Developer Events | AT&T Developer Program  | AT&T Developer";
		Boolean result=validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true, "Page Title displayed");

		} else {

			storeVerificationResults(false, "Page Title not displayed");

		}
		
		return result;
	}

	/* Method to validate LogIn Page */
	public boolean validateLogin() {
		boolean result=false;
		String titleExpected = "Developer Events | AT&T Developer Program  | AT&T Developer";
		int size = driver.findElements(By.className("field_error")).size();
		if (size != 0) {
			if (fieldError.isDisplayed()) {
				validateWebElementDisplayed(fieldError);
			} else {
				if (validatePageTitle(titleExpected)) {

					storeVerificationResults(true, "Page Title displayed api");
					result=true;
				} else {

					storeVerificationResults(false, "Page Title not displayed");

				}
			}
		}
		return result;

	}

	/* Method to validate Get Started Free */
	public boolean validateGetStartedFree() {
		String titleExpected = "Get Free Basic Access and Join the AT&T Developer Program";
		
		boolean result=validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true, "Page Title displayed");

		} else {

			storeVerificationResults(false, "Page Title not displayed");

		}
		
		return result;
	}

	/* Method to validate Manage My Account Page */
	public void validateManageMyAccountPage() {
		String titleExpected = "Manage My Account";
		if (validatePageTitle(titleExpected)) {

			storeVerificationResults(true, "Page Title displayed");

		} else {

			storeVerificationResults(false, "Page Title not displayed");
		}

	}

	/* Method to validate My Apps Page */
	public void validateMyAppsPage() {
		String titleExpected = "API Matrix";
		if (validatePageTitle(titleExpected)) {

			storeVerificationResults(true, "Page Title displayed");

		} else {

			storeVerificationResults(false, "Page Title not displayed");
		}

	}

	/* Method to validate Success Stories Page */
	public void validateSuccessStoriesPage() {
		String titleExpected = "Success Stories | AT&T Developer";
		if (validatePageTitle(titleExpected)) {

			storeVerificationResults(true, "Page Title displayed");

		} else {

			storeVerificationResults(false, "Page Title not displayed");
		}

	}
	
	/*Method to validate Logout*/
	public boolean validateLogout() {
		
		boolean result=validateWebElementDisplayed(driver.findElement(By.linkText("Sign In")));
		return result;
	}

}
