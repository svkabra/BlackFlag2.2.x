package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;


public class ManageUsersPage extends WebPage {

	public ManageUsersPage(WebDriver driver) {
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
	
	//Page Object "API Analytics"
		@FindBy(id= "addUserButton")
		public WebElement addUserButton;
	
	//Page Object "Setup New Application"
	@FindBy(how = How.XPATH, using = "//*[@id='profile_form']/div/div/div[1]/div/div[1]/label[2]")
	public WebElement status;
	
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}
	
	public ManageMyAccount managemyacct(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, ManageMyAccount.class);
	}
	
	//method to click Add Users link
			public AddUsersPage clickAddUsers(){
				
				addUserButton.click();
				waitForPageToLoad();
				return PageFactory.initElements(driver, AddUsersPage.class);
			}
	
	
	public void validateStatusOfUser(){
		
		String messageCaptured = driver.findElement(By.xpath("//*[@id='organization_manage_user_form']/div/div/div/div/div[4]/div[2]/div[4]")).getText();
		
		String messageActual = "Approved";	
		
		System.out.println(messageCaptured);
		
		if(messageCaptured.equalsIgnoreCase(messageActual)){
		 	   
	 	    storeVerificationResults(true, "Status: Approved");
	 	   
	 	    }else{
	 	          
	 	          storeVerificationResults(false, "Status: Invited");
	 	   }
	}
	
	

}
