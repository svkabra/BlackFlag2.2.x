package ATT.Selenium_FVT.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class ManageLegalAgreementPage extends WebPage {

	//Page Object "Organization Details" header 
	@FindBy(how=How.XPATH, using="//*[@id='content-sections']/div[1]/div[2]/div/div/div/div/div[3]/div/div[5]/a")
	private WebElement DownloadLink;

	public ManageLegalAgreementPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		//driver.get(APIM_URL);
		//driver.navigate().to("https://devpgm-uat-app.eng.mobilephone.net/developer/forward.jsp?passedItemId=100006");
		//waitForPageToLoad();
		PageFactory.initElements(driver, this);
		
	}
			
	//method to click Download link
			public void clickDownloadLink(){
				
				DownloadLink.click();
				waitForPageToLoad();
			}
}
