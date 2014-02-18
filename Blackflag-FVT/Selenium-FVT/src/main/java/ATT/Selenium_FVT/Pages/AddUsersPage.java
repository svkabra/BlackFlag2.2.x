package ATT.Selenium_FVT.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class AddUsersPage extends WebPage {

	public AddUsersPage(WebDriver driver) {
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
	
	//Page Object "Organization Details" header 
	@FindBy(how=How.ID, using="emailAddresses_0")
	private WebElement EmailId;
	
	//Page Object "Organization Details" header 
		@FindBy(how=How.ID, using="submitButton")
		private WebElement Submit;
		

	//Page Object "Organization Details" header 
		@FindBy(how=How.ID, using="cancelButton")
		private WebElement cancelButton;
		
	
		int i = 0;
	//method to send an email invite
	 public void sendInvite(){
		
		EmailId.click();
		String text;
		
		while(i<1000){
		
		text = "user" +i+ "@att.com";
		EmailId.sendKeys(text);			
		Submit.click();
		break;
		
		}
		i++;
	}
	 
	//method to send an email invite
		 public void cancelInvite(){
			
			EmailId.click();
			String text;
			
			while(i<1000){
			
			text = "user" +i+ "@att.com";
			EmailId.sendKeys(text);			
			cancelButton.click();
			break;
			
			}
			i++;
		}
		 
		 
	//method to validate cancel button
	public void validateCancelButton(){
		
		String titleCaptured = driver.getTitle();
		System.out.println(titleCaptured);
		String titleActual = "Manage Users";
		if(titleCaptured.equalsIgnoreCase(titleActual)){
		 	   
	 	    storeVerificationResults(true, "Page Title displayed");
	 	   
	 	    }else{
	 	          
	 	          storeVerificationResults(false, "Page Title not displayed");
	 	   }
	}
	//****************************************************Rohit******************************************************
	 
	 
	 
	//Page Object "Organization Details" header 
			@FindBy(how=How.XPATH, using="//*[@id='standardBody']/div[11]/div[11]/div/button[1]")
			private WebElement Yes_Button;
	 
			
			
			
			
	 
	 //$$$$$$$$$$$$$$$$$$-----------------------------------------------------------------------------$$$$$$$$$$$$$$$
	 
	//method to click Yes button
	public void clickYes(){
		
		Yes_Button.click();
		waitForPageToLoad();
	}
	
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}
	
	 
	//method to return Elements of Manage My Account Page
	public ManageMyAcct managemyacct(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, ManageMyAcct.class);
	}
	
	
	//method to validate error message on invalid email id
	public void validateEmailIdErrorMesaage(){
		
		String error_message = driver.findElement(By.id("label0")).toString();
		
		error_message.compareTo("Must contain a valid e-mail.");	
	}
}
