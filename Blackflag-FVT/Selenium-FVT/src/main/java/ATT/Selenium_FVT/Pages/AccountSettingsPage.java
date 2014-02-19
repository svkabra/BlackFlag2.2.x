package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class AccountSettingsPage extends WebPage {

	// Page Object "Organization Details" header
	@FindBy(how = How.CLASS_NAME, using = "field_error")
	private WebElement fieldError;

	// Page Object "Organization Details" header
	@FindBy(how = How.ID, using = "text_email")
	private WebElement Email;

	// Page Object "Organization Details" header
	@FindBy(how = How.ID, using = "text_verify_email")
	private WebElement VerifyEmail;

	// Page Object "Organization Details" header
	@FindBy(how = How.ID, using = "text_company")
	private WebElement Company;

	// Page Object "Organization Details" header
	@FindBy(how = How.NAME, using = "job_function_dropdown")
	private WebElement JobFunction;

	// Page Object "Organization Details" header
	@FindBy(how = How.NAME, using = "industry_dropdown")
	private WebElement Industry;

	// Page Object "Organization Details" header
	@FindBy(how = How.ID, using = "text_current_password")
	private WebElement Password;

	// Page Object "Organization Details" header
	@FindBy(how = How.ID, using = "text_new_password")
	private WebElement NewPassword;

	// Page Object "Organization Details" header
	@FindBy(how = How.NAME, using = "updateButton")
	private WebElement UpdateButton;

	// Page Object "Organization Details" header
	@FindBy(how = How.NAME, using = "text_verify_password")
	private WebElement VerifyNewPassword;

	// Page Object "Organization Details" header
	 @FindBy(how=How.CSS, using="div.floatRight.manageAccountItemCall > a.button > span")
	 private WebElement upgradeToPremiumAccessButtonAccoutsPage;

	/*
	 * AccountSettings constructor
	 */
	public AccountSettingsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		// driver.get(APIM_URL);
		//driver.navigate().to(Constants.APIM_HOME_URL);
		waitForPageToLoad();
		PageFactory.initElements(driver, this);

	}
	
	/*
	 * method to enter wrong password
	 */
	public AccountSettingsPage enterWrongPassword(){
		Password.sendKeys("aaaaaaaaa123456789012345");
		UpdateButton.click();
		waitForPageToLoad();
		return this;
	}
	

	/*
	 *  method to validate password field 
	 */
	public boolean validatePasswordField() {

		String messageActual = "Current Password\nCurrent Password can not exceed 14 characters in length.";
		
		boolean result = messageActual.equals(fieldError.getText());
		if (result) {

			storeVerificationResults(true, "Error Message is displayed");

		} else {

			storeVerificationResults(false, "Error Message is not displayed");
		}
		
		return result;
	}
	
	/*
	 * method to enter wrong Verify New Password
	 */
	
	public AccountSettingsPage enterWrongVerifyPassword(){
		Password.sendKeys("Abcd1234");
		implicitWait(1);
		NewPassword.sendKeys("ABcd1234");
		implicitWait(1);
		VerifyNewPassword.sendKeys("AAAAA4666456356AAAA");
		implicitWait(1);
		UpdateButton.click();
		waitForPageToLoad();
		
		return this;
	}

	/*
	 * method to validate password field
	 */
	public boolean validateVerifyPasswordField() {

			
		String messageActual = "Verify New Password\nVerify Password can not exceed 14 characters in length.";

		boolean result = messageActual.equals(fieldError.getText());
		if (result) {

			storeVerificationResults(true, "Error Message is displayed");

		} else {

			storeVerificationResults(false, "Error Message is not displayed");
		}
		
		return result;
	}

	/*
	 * method to validate "Upgrade to Premium Access" Button is displayed
	 */
	public void upgradeToPremiumAccessButtonValidation() {

		validateWebElementDisplayed(upgradeToPremiumAccessButtonAccoutsPage);
	}

	
	/*
	 * method to validate Job Function Dropdown
	 */
	public void validateJobFunction() {

		validateWebElementDisplayed(JobFunction);
		validateWebElementEnabled(JobFunction);
	}

	/*
	 * method to validate Industry Dropdown
	 */
	public void validateIndustry() {

		validateWebElementDisplayed(Industry);
		validateWebElementEnabled(Industry);

	}

	/*
	 * method to validate company name
	 */
	public void validateCompanyName() {

		validateWebElementDisplayed(Company);

		validateWebElementPrepopulated(Company);

		validateWebElementDisabled(Company);
		
	}

	/*
	 * method to validate email field is pre populated
	 */
	public void emailvalidation() {

		validateWebElementPrepopulated(Email);
		validateWebElementEnabled(Email);

		validateWebElementPrepopulated(VerifyEmail);
		validateWebElementEnabled(VerifyEmail);
		
	}

}
