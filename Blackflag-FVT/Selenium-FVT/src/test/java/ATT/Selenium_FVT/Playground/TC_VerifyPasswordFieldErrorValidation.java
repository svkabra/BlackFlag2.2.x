package ATT.Selenium_FVT.Playground;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.AccountSettingsPage;
import ATT.Selenium_FVT.Pages.ManageMyAcct;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;
import cucumber.annotation.After;

public class TC_VerifyPasswordFieldErrorValidation extends TestUtil{

	@Test
	public void verifyPasswordFieldErrorValidation_test() {

		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		
		//method to load the URL
		apimLoginPage.openURL();
		
		//method to log into Dev Portal as an OPA
		apimLoginPage.pgLogIn();
		
		//method to click on Manage My Account Link
		ManageMyAcct manageMyAcct = apimLoginPage.clickManageMyAcctLink();
		
			
		//method to click on Account Settings link
		AccountSettingsPage accountSettingsPage = manageMyAcct.clickAccountSettings();
		
		//method to validate Verify New Password field
		accountSettingsPage.validateVerifyPasswordField();
		
		//method to publish test result
		accountSettingsPage.publishTestResult();
	}
	
	@After

	public void takeScreenShot() {

	// take the screenshot at the end of every test

	File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);

	// now save the screenshot to a file some place

	try {

	FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_VerifyPasswordFieldErrorValidation.png"));

	} catch (IOException e) {

	// TODO Auto-generated catch block

	e.printStackTrace();

	}

	} 


}
