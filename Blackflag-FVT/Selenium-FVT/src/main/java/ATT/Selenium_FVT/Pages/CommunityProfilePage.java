package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;


public class CommunityProfilePage extends WebPage {

	public CommunityProfilePage(WebDriver driver) {
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
	
	
	//Page Object "Company Name" header 
	@FindBy(how=How.ID, using="text_company")
	private WebElement Company_Name;
	
	//Page Object "Job Title" header 
		@FindBy(how=How.ID, using="text_jobtitle")
		private WebElement JobTitle;
		
	//Page Object "City" header 
		@FindBy(how=How.ID, using="text_city")
		private WebElement City;
		
	//Page Object "State" header 
		@FindBy(how=How.NAME, using="state_dropdown")
		private WebElement State;
		
	//Page Object "Country" header 
		@FindBy(how=How.ID, using="country_dropdown")
		private WebElement Country;
		
	//Page Object "Name" header 
		@FindBy(how=How.ID, using="text_name")
		private WebElement Name;
		
	//Page Object "Name" header 
		@FindBy(how=How.ID, using="text_url")
		private WebElement Url;	
		
	//Page Object "Name" header 
		@FindBy(how=How.ID, using="text_area_quotes")
		private WebElement Fav_Quote;	
		
	//Page Object "Name" header 
		@FindBy(how=How.NAME, using="submit")
		private WebElement Update_Information;
		
	//Page Object "Name" header 
		@FindBy(how=How.XPATH, using="//*[@id='profile_form']/div/div/div[2]/p[2]/a")
		private WebElement ViewMyProfile;
		
	//Page Object "Name" header 
		@FindBy(how=How.XPATH, using="//*[@id='profile_page']/div[3]/div[2]/div[2]/div[2]/a")
		private WebElement MySettings;
		
		
	//Page Object "Name" header 
		@FindBy(how=How.XPATH, using="//*[@id='profile_page']/div[2]/div/div/a")
		private WebElement upgradeToPremiumAccessButtonCommunityProfilePage;
	
		
//*********************************************ROHIT***************************************		
		
		
		
		
	//method to click ViewMyProfile
		public ManageMyAcct clickViewMyProfile(){
			
			ViewMyProfile.click();
			waitForPageToLoad();
						
			return PageFactory.initElements(driver, ManageMyAcct.class);
			
		}
		
		
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@------------------------------@@@@@@@@@@@@@@@@@@@@@@@
	
	// method to manage alert pop up
	public boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	} // isAlertPresent()

	//method to click on MySettings Link
	public void clickMySettingsLink() {

		MySettings.click();
		waitForPageToLoad();
		implicitWait(10);

		while (isAlertPresent(driver)) {
			Alert javascriptAlert = driver.switchTo().alert();
			System.out.println(javascriptAlert.getText()); // Get text on alert
															// box
			javascriptAlert.accept();
			waitForPageToLoad();
		}

		String titleCaptured = driver.getTitle();
		System.out.println(titleCaptured);
		String titleActual = "My Settings - Forums Blogs Events News | AT&T Developer Program";
		if (titleCaptured.equalsIgnoreCase(titleActual)) {

			storeVerificationResults(true, "Page Title displayed");

		} else {

			storeVerificationResults(false, "Page Title not displayed");
		}

	}
		
		//method to return ApimLogin Page elements
		public APIMLoginPage apimLoginPage(){
			waitForPageToLoad();
			return PageFactory.initElements(driver, APIMLoginPage.class);
		}
		
		
		//method to return Elements of Manage My Account Page
		public ManageMyAcct managemyacct(){
			waitForPageToLoad();
			return PageFactory.initElements(driver, ManageMyAcct.class);
		}
		
		//method to validate company name field
		public void validateCompanyName(){
			
			Company_Name.sendKeys("Abbbbbccccccccwwwwwwwww1234567789087655efgtrgtrhtyhffnhtrjtyhjtyjsdsdsfrggttngh");
			Update_Information.click();
			implicitWait(5);
			waitForPageToLoad();
			
			String messageCaptured = driver.findElement(By.xpath("//*[@id='profile_form']/div/div/div[1]/div/div[1]/label[2]")).getText();
			
			String messageActual = "Company can not exceed 30 characters in length.";	
			
			if(messageCaptured.equalsIgnoreCase(messageActual)){
			 	   
		 	    storeVerificationResults(true, "Error Message is displayed");
		 	   
		 	    }else{
		 	          
		 	          storeVerificationResults(false, "Error Message is not displayed");
		 	   }
			
		}
		
		//method to validate company name field
				public void validateJobTilte(){
					
					JobTitle.sendKeys("Abbbbbccccccccwwwwwwwww1234567789087655efgtrgtrhtyhffnhtrjtyhjtyjsdsdsfrggttngh");
					Update_Information.click();
					waitForPageToLoad();
					
					String messageCaptured = driver.findElement(By.xpath("//*[@id='profile_form']/div/div/div[1]/div/div[2]/label[2]")).getText();
					String messageActual = "Job Title can not exceed 30 characters in length.";	
					
					if(messageCaptured.equalsIgnoreCase(messageActual)){
					 	   
				 	    storeVerificationResults(true, "Error Message is displayed");
				 	   
				 	    }else{
				 	          
				 	          storeVerificationResults(false, "Error Message is not displayed");
				 	   }
					
				}
				
				//method to validate "Upgrade to Premium Access" Button is displayed
				public void upgradeToPremiumAccessButtonValidation(){
					
					validateWebElementDisplayed(upgradeToPremiumAccessButtonCommunityProfilePage);
				}
}
