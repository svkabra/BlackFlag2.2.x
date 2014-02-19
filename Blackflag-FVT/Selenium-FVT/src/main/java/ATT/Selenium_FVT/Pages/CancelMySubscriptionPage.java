package ATT.Selenium_FVT.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class CancelMySubscriptionPage extends WebPage {

	public CancelMySubscriptionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void openURL() {
		//driver.get(APIM_URL);
		driver.navigate().to("https://devpgm-uat-app.eng.mobilephone.net/developer/forward.jsp?passedItemId=100006");
		waitForPageToLoad();
		PageFactory.initElements(driver, this);
		
	}
	
	//method to return ApimLogin Page elements
			public APIMLoginPage apimLoginPage(){
				waitForPageToLoad();
				return PageFactory.initElements(driver, APIMLoginPage.class);
			}
			
	//method to return Elements of Manage My Account Page
			public ManageMyAccount managemyacct(){
				waitForPageToLoad();
				return PageFactory.initElements(driver, ManageMyAccount.class);
			}
	
	//Page Object "Organization Details" header 
		@FindBy(how=How.PARTIAL_LINK_TEXT, using="How can I close my AT&T Developer Program account?")
		private WebElement AccountClosureLink;
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.LINK_TEXT, using="Contact us")
		private WebElement ContactUsLink;
		
	//method to click on the Account Closure Link
		public void clickAccountClosureLink(){
			
			AccountClosureLink.click();
			waitForPageToLoad();
		}
		
	//method to click on the Account Closure Link
			public void clickContactUsLink(){
					
					ContactUsLink.click();
					waitForPageToLoad();
				}

}
