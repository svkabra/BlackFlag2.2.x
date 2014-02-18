package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class JoinNowPage extends WebPage{
	@FindBy(how = How.ID ,using="text_email")
	private WebElement email;
	
	@FindBy(how = How.ID ,using="submitButton")
	private WebElement joinNow;
	
	@FindBy(how = How.ID ,using="email_validity_output")
	private WebElement emailValidity;
	public JoinNowPage(WebDriver driver){
		super(driver);

	}

	@Override
	public void openURL() {
		driver.navigate().to(Constants.APIM_HOME_URL);
		waitForPageToLoad();
		PageFactory.initElements(driver, this);	
	}

	public void enterEmailID(){
		email.sendKeys("testdev937@gmail.com");
	}
	public void emailValidation(){
		String emailStr = emailValidity.getText();
		String errMsg = "Email in use.";
		if(emailStr.contains(errMsg)){
			storeVerificationResults(true, "Email in use");
		}
		else{
			storeVerificationResults(false, "User able to reuse email id");
		}
	}
	public void signInFromErrorMsg(){
		emailValidity.findElement(By.linkText("Sign In")).click();
		validatePageTitle("AT&T Developer Program");
	}
	public void resetPwdFromErrorMsg(){
		emailValidity.findElement(By.linkText("Reset Your Password")).click();
		validatePageTitle("AT&T Developer Program");
	}
	public void clkJoinNow(){
		joinNow.click();
		waitForPageToLoad();
	}
}
