package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class ContactUsPage extends WebPage {

	public ContactUsPage(WebDriver driver) {
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
			@FindBy(how=How.ID, using="contactFromButton")
			private WebElement SubmitButton;
			
	//Page Object "Organization Details" header 
			@FindBy(how=How.XPATH, using="/html/body/div[5]/div[2]/div/div[2]/div/div/form/fieldset/div[12]/span[2]/a")
			private WebElement TicketLink;
			
	//method to click the ticket link
			public void clickTicketLink(){
				
				TicketLink.click();
				waitForPageToLoad();
			}
			
	//method to click submit button
			public void clickSubmitButton(){
				
				SubmitButton.click();
				waitForPageToLoad();
			}
			
	//method to validate the error messages for mandatory fields
			public void errorMessaegValidation(){
				
				String error_message1 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div/form/fieldset/div[7]/label[2]")).toString();
				
				error_message1.compareTo("Please select a topic.");	
				
				
				String error_message2 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div/form/fieldset/div[8]/label[2]")).toString();
				
				error_message2.compareTo("Please enter a comment.");	
				
				String error_message3 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div/form/fieldset/div[10]/label[2]")).toString();
				
				error_message3.compareTo("Please enter captcha code.");	
				
				
			}

}
