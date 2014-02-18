package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class ManagePermissionsPage extends WebPage {
	
	@FindBy(how = How.ID, using = "revoke-all")
	public WebElement revokeAll;
	
	@FindBy(how = How.LINK_TEXT, using = "Back to ATT_API_CONSOLE_4_UAT")
	public WebElement backToAuthPage;
	/**
	 * ManagePermissionsPage
	 * @param driver
	 */
	public ManagePermissionsPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Function open URL
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
}
