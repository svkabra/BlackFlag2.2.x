package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class NewAppPage extends WebPage{
	
	@FindBy(id="app_name")
	private WebElement app_Name;
	
	@FindBy(id = "app_description")
	private WebElement app_description;
	
	@FindBy(id="app_service_ids_14")
	private WebElement speech;
	
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
	
	@FindBy(id="app_service_ids_11")
	private WebElement CallManagement;
	
	@FindBy(id="app_callback_url")
	private WebElement callBackURL;
	
	@FindBy(name="commit")
	private WebElement Setup_Application;
	
	public NewAppPage(WebDriver driver) {
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
		waitForAjaxInactivity();
		}

		}catch(Exception e){
			e.printStackTrace(); 
		}		
		}
	
public void isOauthDisplayed(){
		validateWebElementDisplayed(callBackURL);

	}

public void isOauthNotDisplayed(){
	//validateWebElementNotPresent("app_callback_url","id");
	validateWebElementNotDisplayed(callBackURL);
}
	

/* Method to Publish test result*/

public void displayTestResult(){
	publishTestResult();
}

	public void setCallbackURL(String oAuthURL){
		callBackURL.sendKeys(oAuthURL);
		implicitWait(2);
	}
	
		/*Method to validate whether error message is displayed when title field is kept blank*/
	
	public void validateIfTitleisBlank(){
		String name = app_Name.getText();
		if(name.isEmpty()){
				Boolean flag = driver.findElement(By.cssSelector("small.help-inline")).isDisplayed();
			if (flag == true)
				storeVerificationResults(true, "Title field is blank and Error Message is displayed");	
			else
				storeVerificationResults(false, "Title field is not blank");	
				
			}
		else {
			storeVerificationResults(false, "Title field is not blank");
			
		}	
	}
	
	/** Method to verify that error message is displayted on Submit button */
	public void validateIfDescriptionIsBlank(){
		String name = app_description.getText();
		if(name.isEmpty()){
			Boolean flag = driver.findElement(By.cssSelector("small.help-inline")).isDisplayed();
		if (flag == true)
			storeVerificationResults(true, "Description field is blank and Error Message is displayed");	
		else
			storeVerificationResults(false, "Description field is not blank");	
			
		}
	else {
		storeVerificationResults(false, "Description field is not blank");
		
	}		
	}
	
	/** Method to click on Submit button */
	
	public AppPage submitAppDetails(){
		waitForAjaxInactivity();
		Setup_Application.click();
		waitForPageToLoad();
		implicitWait(5);
		return PageFactory.initElements(driver, AppPage.class);
		
	}
	
	
	/** Method to Validate Dev will land on New app creation page on clicking setup new app button*/
	public void validateNewAppPage(){
		WebElement element = driver.findElement(By.cssSelector("div.headingsection > span.title"));
		element.getText();
		validateText(element,"Setup New App" );
		element.getText();
		publishTestResult();
	}
	
	/** Method to click and validate Cancel app creation*/
	public void cancelAppCreation(String appName){
		WebElement cancelbtn = driver.findElement(By.className("debuttonfy"));
		cancelbtn.click();
		waitForPageToLoad();
		WebElement title = driver.findElement(By.id("location_header")).findElement(By.tagName("h1"));
		validateText(title, "My Apps");
		
		if(driver.findElements(By.linkText(appName)).size() == 0)
			storeVerificationResults(true, "App is not created");
		else
			storeVerificationResults(false, "App is created");
		publishTestResult();
	}
	

}
