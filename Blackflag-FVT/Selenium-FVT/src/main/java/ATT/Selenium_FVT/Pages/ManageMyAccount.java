package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import ATT.Selenium_FVT.Components.OrganizationDetails;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class ManageMyAccount extends WebPage {

	// Page Object "ManageMyAcct" link
	@FindBy(how = How.LINK_TEXT, using = "Manage My Account")
	private WebElement manageMyAcct;

	// Page Object "Account Settings" link
	@FindBy(how = How.LINK_TEXT, using = "Account Settings")
	private WebElement acctSettings;

	// Page Object "Organization Details" link
	@FindBy(how = How.LINK_TEXT, using = "Organization Details")
	private WebElement orgDetails;

	// Page Object "Organization Details" link
	@FindBy(how = How.LINK_TEXT, using = "Edit Organization Details")
	private WebElement editOrgDetails;

	// Page Object "Manage Legal Agreements" link
	@FindBy(how = How.LINK_TEXT, using = "Manage Legal Agreements")
	private WebElement legalAgreements;

	// Page Object "Setup Merchant Account" link
	@FindBy(how = How.LINK_TEXT, using = "Setup Merchant Account")
	private WebElement setupMerAcct;

	// Page Object "Community Profile" link
	@FindBy(how = How.LINK_TEXT, using = "Community Profile")
	private WebElement communityProfile;

	// Page Object "Manage Users" link
	@FindBy(how = How.LINK_TEXT, using = "Manage Users")
	private WebElement manageUsers;

	// Page Object "Add Users" link
	@FindBy(how = How.LINK_TEXT, using = "Add Users")
	private WebElement addUsers;

	// Page Object "Add Users" link
	@FindBy(how = How.LINK_TEXT, using = "Edit Merchant Details")
	private WebElement editMerchantDetails;

	// Page Object "My Apps" link
	@FindBy(how = How.LINK_TEXT, using = "My Apps")
	private WebElement myApps;

	// Page Object "Subscription Details" link
	@FindBy(how = How.LINK_TEXT, using = "Subscription Details")
	private WebElement subscriptionDetails;

	// Page Object "Purchase Points" link
	@FindBy(how = How.LINK_TEXT, using = "Purchase Points")
	private WebElement purchasePoints;

	// Page Object "Transaction Usage" link
	@FindBy(how = How.LINK_TEXT, using = "Transaction Usage")
	private WebElement transactionUsage;

	// Page Object "Manage Credit Card" link
	@FindBy(how = How.LINK_TEXT, using = "Manage Credit Card")
	private WebElement manageCreditCard;

	// Page Object "Cancel My Subscription" link
	@FindBy(how = How.LINK_TEXT, using = "Cancel My Subscription")
	private WebElement cancelMySubscription;

	// Page Object "Cancel My Subscription" link
	@FindBy(how = How.ID, using = "cancelButton")
	private WebElement cancelButton;

	// Page Object "Upgrade My Subscription Now" link
	 @FindBy(how = How.XPATH, using = "//button[@type='button'][2]")
	private WebElement updateMySubscriptionNowButton;

	// Page Object "Name" header
	 @FindBy(how=How.CSS, using="css=div.floatRight.manageAccountItemCall > a.button > span")
	private WebElement upgradeToPremiumAccessButtonEditMErchantDetailsPage;

	// Page Object "Cancel My Subscription" link
	@FindBy(how = How.LINK_TEXT, using = "Contact Us")
	private WebElement contactUsLink;

	/*
	 * ManageMyAcct constructor
	 */
	public ManageMyAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		// driver.get(APIM_URL);
		// driver.navigate().to("APIM_HOME_URL");
		// waitForPageToLoad();
		PageFactory.initElements(driver, this);

	}

	/*
	 * Method to click on a link
	 */
	public ContactUsPage clickContactUsLink() {

		contactUsLink.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, ContactUsPage.class);

	}

	/*
	 * Method to click on "Account Settings" link
	 */
	public AccountSettingsPage clickAccountSettings() {

		acctSettings.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_SHORT);
		return PageFactory.initElements(driver, AccountSettingsPage.class);
	}

	/*
	 * method to validate user navigates to Account Setting page on clicking
	 * Account Settings link
	 */
	public boolean validateAccountSettingsPage() {
		String titleExpected = "Manage My Account | AT&T Developer Program";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Manage My Account Page is displayed");

		} else {

			storeVerificationResults(false,
					"Manage My Account Page is not displayed");

		}
		return result;
	}

	/*
	 * Method to click on "Edit Merchant Details Link"
	 */
	public void clickEditMerchantDetailsLink() {
		editMerchantDetails.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_SHORT);
	}

	/*
	 * method to validate user navigates to Edit Merchant Details page on
	 * clicking Edit Merchant Details link
	 */
	public boolean validateEditMerchantDetailsPage() {

		String titleExpected = "Edit Merchant Details";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Edit Merchant Details Page is displayed");
		} else {

			storeVerificationResults(false,
					"Edit Merchant Details Page is not displayed");

		}
		return result;
	}

	/*
	 * Method to click on "My Apps"
	 */
	public MyAppsPage clickMyAppsLink() {
		myApps.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_LONG);
		return PageFactory.initElements(driver, MyAppsPage.class);
	}

	/*
	 * method to validate user navigates to My Apps page on clicking My Apps
	 * link
	 */
	public boolean validateMyAppsPage() {

		String titleExpected = "API Matrix";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true, "My Apps Page is displayed");

		} else {

			storeVerificationResults(false, "My Apps Page is  not displayed");
		}
		return result;
	}

	/*
	 * Method to click on "Manage Legal Agreements"
	 */
	public ManageLegalAgreementPage clickManageLegalAgreements() {

		legalAgreements.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, ManageLegalAgreementPage.class);
	}

	/*
	 * Method to click on Org Details link
	 */
	public OrganizationDetailsPage clickOrgDetails() {
		orgDetails.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, OrganizationDetailsPage.class);

	}

	/*
	 * method to validate user navigates to Organization Details page on
	 * clicking Organization Details link
	 */
	public boolean validateOrgDetailsPage() {

		String titleExpected = "Organization Details";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Organization Details Page is displayed");

		} else {

			storeVerificationResults(false,
					"Organization Details Page is not displayed");
		}
		return result;
	}

	/*
	 * Method to click on Edit Organization Details link
	 */
	public void clickEditOrgDetails() {
		orgDetails.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_SHORT);
	}

	/*
	 * method to validate user navigates to Edit Organization Details page on
	 * clicking Edit Organization Details link
	 */
	public boolean validateEditOrgDetailsPage() {

		String titleExpected = "Edit Organization Details";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Edit Organization Detail page is displayed");

		} else {

			storeVerificationResults(false,
					"Edit Organization Detail page is not displayed");
		}
		return result;
	}

	/*
	 * method to click Add Users link
	 */
	public AddUsersPage clickAddUsers() {

		addUsers.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, AddUsersPage.class);
	}

	/*
	 * method to click Community Profile link
	 */
	public CommunityProfilePage clickCommunityProfile() {
		communityProfile.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_SHORT);
		return PageFactory.initElements(driver, CommunityProfilePage.class);
	}

	/*
	 * method to validate user navigates to Community Profile page on clicking
	 * Community Profile link
	 */
	public boolean validateCommunityProfilePage() {

		String titleExpected = "Community Profile Information at AT&T Developer Program";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Community Profile Page is displayed");

		} else {

			storeVerificationResults(false,
					"Community Profile Page is not displayed");
		}
		return result;
	}

	/*
	 * method to click Manage User Link
	 */
	public ManageUsersPage clickManageUsersLink() {

		manageUsers.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, ManageUsersPage.class);
	}

	/*
	 * method to click Cancel My Subscription Link
	 */
	public CancelMySubscriptionPage clickCancelMySubscriptionLink() {

		cancelMySubscription.click();
		waitForPageToLoad();
		implicitWait(2);
		return PageFactory.initElements(driver, CancelMySubscriptionPage.class);
	}

	/*
	 * method to validate user navigates to Cancel My Subscription page on
	 * clicking Cancel My Subscription link
	 */
	public boolean validateCancelMySubscriptionPage() {

		String titleExpected = "API Platform & Developer Program FAQ | AT&T Developer";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Cancel My Subscription Page is displayed");

		} else {

			storeVerificationResults(false,
					"Cancel My Subscription Page is not displayed");
		}
		return result;
	}

	/*
	 * method to click Transaction Usage Link
	 */
	public void clickTransactionUsageLink() {
		transactionUsage.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_LONG);
	}

	/*
	 * method to validate user navigates to Transaction Usage page on clicking
	 * Transaction Usage Link
	 */
	public boolean validateTransactionUsagePage() {

		String titleExpected = "Transaction Usage";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Transaction Usage Page is displayed");

		} else {

			storeVerificationResults(false,
					"Transaction Usage Page is not displayed");
		}
		return result;
	}

	/*
	 * method to click Purchase Points Link
	 */
	public void clickPurchasePointsLink() {
		purchasePoints.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_LONG);
	}

	/*
	 * method to validate user navigates to Purchase Point page on clicking
	 * Purchase Point Link
	 */
	public boolean validatePurchasePointsPage() {

		String titleExpected = "Purchase Points";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true, "Purchase Points Page is displayed");

		} else {

			storeVerificationResults(false,
					"Purchase Points Page is not displayed");
		}
		return result;
	}

	/*
	 * method to click Subscription Details Link
	 */
	public void clickSubscriptionDetailsLink() {
		subscriptionDetails.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_LONG);
	}

	/*
	 * method to validate user navigates to Subscription Details Page on
	 * clicking Subscription Details link
	 */
	public boolean validateSubscriptionDetailsPage() {

		String titleExpected = "Subscription Details";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Subscription Details page is displayed");

		} else {

			storeVerificationResults(false,
					"Subscription Details page is not displayed");
		}
		return result;
	}

	/*
	 * method to click Setup Merchant Account Link
	 */
	public void clickSetupMerchantAccountLink() {

		setupMerAcct.click();
		waitForPageToLoad();
	}

	/*
	 * method to click Setup Manage My Credit Card Link
	 */
	public void clickManageMyCreditCardLink() {
		manageCreditCard.click();
		waitForPageToLoad();
		updateMySubscriptionNowButton.click();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_LONG);
	}

	/*
	 * method to validate user navigates to ManageMyCreditCard Page on clicking
	 * ManageMyCreditCard link
	 */
	public boolean validateManageMyCreditCardPage() {

		String titleExpected = "New Subscription Confirmation";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Manage My Credit Card Page is displayed");

		} else {

			storeVerificationResults(false,
					"Manage My Credit Card Page is not displayed");
		}
		return result;
	}

	/*
	 * method on cancel button on Update My Subscription Page
	 */
	public void clickCancelButtonUpdateMySubscriptionPage() {
		cancelButton.click();
		waitForPageToLoad();
		implicitWait(Constants.PAGE_WAIT_INTRA_SYSTEM_LONG);
	}

	/*
	 * method to validate user navigates to Manage My Account page on clicking
	 * cancel button on Update My Subscription Page
	 */
	public boolean validateCancelButtonUpdateMySubscriptionPage() {

		String titleExpected = "Manage My Account";
		boolean result = validatePageTitle(titleExpected);
		if (result) {

			storeVerificationResults(true,
					"Manage My Account Page is displayed");

		} else {

			storeVerificationResults(false,
					"Manage My Account Page is not displayed");
		}
		return result;
	}

	/*
	 * method to validate "Upgrade to Premium Access" Button is displayed
	 */
	public void upgradeToPremiumAccessButtonValidation() {

		validateWebElementDisplayed(upgradeToPremiumAccessButtonEditMErchantDetailsPage);
	}

}
