package ATT.Selenium_FVT.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ATT.Selenium_FVT.Pages.AppPage;
import ATT.Selenium_FVT.Utilities.Component.Component;

public class CreateAnApp extends Component{
	
	public WebElement me;
	
	
	public CreateAnApp(WebDriver driver, WebElement newAppForm) {
		super(driver);
		me = newAppForm;
	}
	

	@Override
	public boolean isDispalyed() {
		return me.isDisplayed();
	}
	
	public void enterAppName(String appName){
		me.findElement(By.id("app_name")).sendKeys(appName);
		
	}
	
	public void enterDescription(String appDescription){
		me.findElement(By.id("app_description")).sendKeys(appDescription);
		
	}
	
	public void enterWebSite(String webSite){
		me.findElement(By.id("app_website")).sendKeys(webSite);
	}
	
	public void enterCallBackURl(String callBackUrl){
		me.findElement(By.id("app_callback_url")).sendKeys(callBackUrl);
	}
	
	public void enterSupportURL(String supportURL){
		me.findElement(By.id("app_support_url")).sendKeys(supportURL);
	}
	
	public void selectPublicCheckbox(){
		me.findElement(By.id("app_public")).click();
	}
	
	public void selectPhoneRequiredCheckbox(){
		me.findElement(By.id("app_requires_mobile_number")).click();
	}
	
	public void selectVoiceAppCheckbox(){
		me.findElement(By.id("app_voice_app")).click();
	}
	
	public void selectVoiceAppType(String appType){
		
		Select voiceAppType = new Select(me.findElement(By.id("app_voice_app_type")));
		voiceAppType.selectByValue(appType);
		
	}

	public void enterVoiceURL(String voiceUrl){
		me.findElement(By.id("app_voice_url")).sendKeys(voiceUrl);
	}
	
	public void clickCancel(){
		me.findElement(By.cssSelector("div.actions button.button")).click();
		
	}
	
	public AppPage clickRegisterApp(){
		me.findElement(By.cssSelector("div.actions input.button")).click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, AppPage.class);
		
	}
}
