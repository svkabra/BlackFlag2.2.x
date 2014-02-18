package ATT.Selenium_FVT.Pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class AccountSettingsPage extends WebPage{

	public AccountSettingsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void openURL() {
		//driver.get(APIM_URL);
		driver.navigate().to("https://developer.att.com");
		waitForPageToLoad();
		PageFactory.initElements(driver, this);
		
	}
	
	//Page Object "Organization Details" header 
		@FindBy(how=How.CLASS_NAME, using="field_error")
		private WebElement fieldError;
			
	//Page Object "Organization Details" header 
		@FindBy(how=How.ID, using="text_email")
		private WebElement Email;
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.ID, using="text_verify_email")
		private WebElement VerifyEmail;
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.ID, using="text_company")
		private WebElement Company;
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.NAME, using="job_function_dropdown")
		private WebElement JobFunction;		
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.NAME, using="industry_dropdown")
		private WebElement Industry;	
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.ID, using="text_current_password")
		private WebElement Password;	
		
	
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.ID, using="text_new_password")
		private WebElement NewPassword;	
		
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.NAME, using="updateButton")
		private WebElement UpdateButton;
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.NAME, using="text_verify_password")
		private WebElement VerifyNewPassword;
		
	//Page Object "Organization Details" header 
		@FindBy(how=How.XPATH, using="//*[@id='account_page']/div[2]/div/div/a")
		private WebElement upgradeToPremiumAccessButtonAccoutsPage;
		
		
	//************************Rohit******************************************************************************	
		
		
	//method to validate password field
		public void validatePasswordField(){
			
			Password.sendKeys("aaaaaaaaa123456789012345");
			UpdateButton.click();
			waitForPageToLoad();
			
		//	String messageCaptured = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[3]/div[3]/form/div[11]/div/div[3]/label[2]")).toString();
			
			String messageActual = "Current Password\nCurrent Password can not exceed 14 characters in length.";	
			
			if(messageActual.equals(fieldError.getText())){
			 	   
		 	    storeVerificationResults(true, "Element is displayed");
		 	   
		 	    }else{
		 	          
		 	          storeVerificationResults(false, "Element is not displayed");
		 	   }
			
		}
		
		
		
	//method to validate password field
			public void validateVerifyPasswordField(){
				
				Password.sendKeys("Abcd1234");
				implicitWait(1);
				NewPassword.sendKeys("ABcd1234");
				implicitWait(1);
				VerifyNewPassword.sendKeys("AAAAA4666456356AAAA");
				implicitWait(1);
				UpdateButton.click();
				waitForPageToLoad();
					
			//	String messageCaptured = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[3]/div[3]/form/div[5]/div/div[8]/label[2]")).toString();
					
				String messageActual = "Verify New Password\nVerify Password can not exceed 14 characters in length.";	
				
				if(messageActual.equals(fieldError.getText())){
				 	   
			 	    storeVerificationResults(true, "Element is displayed");
			 	   
			 	    }else{
			 	          
			 	          storeVerificationResults(false, "Element is not displayed");
			 	   }
				
				}
			
		//method to validate "Upgrade to Premium Access" Button is displayed
		public void upgradeToPremiumAccessButtonValidation(){
			
			validateWebElementDisplayed(upgradeToPremiumAccessButtonAccoutsPage);
		}
			
			
	//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$-------------------------------------------$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$		
	
	//method to validate Job Function Dropdown
		public void validateJobFunction(){
			
			validateWebElementDisplayed(JobFunction);
			validateWebElementEnabled(JobFunction);
		}
		
	//method to validate Industry Dropdown
		public void validateIndustry(){
			
			validateWebElementDisplayed(Industry);
			validateWebElementEnabled(Industry);
			
			
			
		}
	
		//method to validate company name
		public void validateCompanyName(){
			
			validateWebElementDisplayed(Company);
			
			validateWebElementPrepopulated(Company);
			
			validateWebElementDisabled(Company);
			
			publishTestResult();
		}
		
	//method to validate email field is pre populated
		public void emailvalidation(){
			
			validateWebElementPrepopulated(Email);
			validateWebElementEnabled(Email);
			
			validateWebElementPrepopulated(VerifyEmail);
			validateWebElementEnabled(VerifyEmail);
			
			publishTestResult();
		}
		
		public APIMLoginPage apimLoginPage(){
			waitForPageToLoad();
			return PageFactory.initElements(driver, APIMLoginPage.class);
		}
		
		public ManageMyAcct managemyacct(){
			waitForPageToLoad();
			return PageFactory.initElements(driver, ManageMyAcct.class);
		}
		
		//method to publish test result
		public void testResult(String tc){
			
		//	createTestResultFile(tc);
		}
		
		
		//##########To Be Deleted########

}
