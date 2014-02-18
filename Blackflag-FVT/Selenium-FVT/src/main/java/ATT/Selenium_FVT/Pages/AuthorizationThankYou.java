package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;
//import ATT.Selenium_FVT.Components.OrganizationDetails;


public class AuthorizationThankYou extends WebPage {

	@FindBy(how = How.LINK_TEXT, using = "Manage Permissions")
	public WebElement managePermissions; 
	
	@FindBy(how = How.LINK_TEXT, using = "Back to ATT_API_CONSOLE_4_UAT")
	public WebElement backToAuthPage;
	
	/**
	 * AuthorizationThankYou
	 * @param driver
	 */
	public AuthorizationThankYou(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Function openURL - to open the URL
	 */
	@Override
	public void openURL() {
		//driver.get(APIM_URL);
		//driver.navigate().to("http://devpgm-f3t-apimatrix.api-dev.mars.bf.sl.attcompute.com/");
		waitForPageToLoad();
		PageFactory.initElements(driver, this);
		
	}
	/**
	 * backToConsentPage
	 * @return ConsentPage
	 */
	public ConsentPage backToConsentPage()
	{
		backToAuthPage.click();
		waitForPageToLoad();
		implicitWait(2);
		return PageFactory.initElements(driver, ConsentPage.class);
	}
	/**
	 * navigateToManagePermission
	 * @return ManagePermissionsPage
	 */
	public ManagePermissionsPage navigateToManagePermission()
	{
		managePermissions.click();
		waitForPageToLoad();
		implicitWait(2);
		return PageFactory.initElements(driver, ManagePermissionsPage.class);
	}
		
}