package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class EditAppPage extends WebPage{
	
	@FindBy(id="app_name")
	private WebElement app_Name;
	
	@FindBy(id="app_service_ids_14")
	private WebElement speech;
	
	@FindBy(id = "app_description")
	private WebElement app_description;

	@FindBy(id = "app_service_ids_21")
	private WebElement STTC;
	
	@FindBy(id = "app_service_ids_1")
	private WebElement MMS;
	
	@FindBy(id = "app_service_ids_25")
	private WebElement STT;
	
	@FindBy(id = "app_service_ids_23")
	private WebElement MIM;
	
	@FindBy(id = "app_service_ids_12")
	private WebElement SMS;
	
	@FindBy(id = "app_service_ids_20")
	private WebElement TTS;
	
	@FindBy(id = "app_service_ids_6")
	private WebElement oAuth;
	
	@FindBy(id = "app_service_ids_5")
	private WebElement ADS;
	
	@FindBy(id = "app_service_ids_2")
	private WebElement Notary;
	
	@FindBy(id="app_service_ids_15")
	private WebElement MOBO;
	
	@FindBy(id = "app_service_ids_3")
	private WebElement TL;
	
	@FindBy(id="app_service_ids_7")
	private WebElement DC;
	
	@FindBy(id = "app_service_ids_4")
	private WebElement Payment;
	
	@FindBy(id="app_service_ids_29")
	private WebElement STTA;
	
	@FindBy(id="app_callback_url")
	private WebElement callBackURL;
	
	@FindBy(name="commit")
	private WebElement Setup_Application;
	
	public EditAppPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		// TODO Auto-generated method stub
		
	}
	
	public void enterAppName(String appName){
		app_Name.sendKeys(appName);
	}
	
	public void enterDescription(String appDescription){
		app_description.sendKeys(appDescription);
	}
	
	/* Method to Select an API */
	public void selectAPI(String api){
	
		String strAPIX = "//label[contains(text()," + "\'" + api + "\'" + ")]";	
		
			
		String strForPropOfAPI = driver.findElement(By.xpath(strAPIX)).getAttribute("for");
	//	System.out.println(strForPropOfAPI );
		try{
		if (!(driver.findElement(By.id(strForPropOfAPI)).getAttribute("checked") == "checked")){
			
		driver.findElement(By.id(strForPropOfAPI)).click();
		}

		}catch(Exception e){
			e.printStackTrace(); 
		}		
		}
	
public void isOauthDisplayed(){
		
		//validateWebElementPresent("app_callback_url","id");
		validateWebElementDisplayed(callBackURL);
		publishTestResult();
	}
	
public void isOauthNotDisplayed(){
	//validateWebElementNotPresent("app_callback_url","id");
	validateWebElementNotDisplayed(callBackURL);
	publishTestResult();
}
	
	public void selectAllServices(){
		MIM.click();
		MMS.click();
		implicitWait(1);
		MOBO.click();
		SMS.click();
		STT.click();
		STTC.click();
		STTA.click();
		DC.click();
		TL.click();
		speech.click();
		implicitWait(2);
		oAuth.click();
		TTS.click();
		Payment.click();
		ADS.click();
		Notary.click();
		implicitWait(2);
	}
	
	
	public void setCallbackURL(String oAuthURL){
		callBackURL.sendKeys(oAuthURL);
		implicitWait(2);
	}
	
	public AppPage submitAppDetails(){
		waitForAjaxInactivity();
		Setup_Application.click();
		implicitWait(5);
		waitForPageToLoad();
		return PageFactory.initElements(driver, AppPage.class);
		
	}
	
	public AppPage clickOrCancel(){
		waitForAjaxInactivity();
		driver.findElement(By.linkText("or Cancel")).click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, AppPage.class);
		
	}
	

}
