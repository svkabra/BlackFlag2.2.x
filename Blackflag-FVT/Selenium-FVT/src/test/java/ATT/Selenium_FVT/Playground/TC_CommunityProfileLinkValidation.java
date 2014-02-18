package ATT.Selenium_FVT.Playground;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.CommunityProfilePage;
import ATT.Selenium_FVT.Pages.ManageMyAcct;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;
import cucumber.annotation.After;

public class TC_CommunityProfileLinkValidation extends TestUtil{

	@Test
	public void communityProfileLinkValidation_test() {
		
		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		
		//method to load the URL
		apimLoginPage.openURL();
		
		//method to log into Dev Portal as an OPA
		apimLoginPage.pgLogIn();
		
		//method to click on Manage My Account Link
		ManageMyAcct manageMyAcct = apimLoginPage.clickManageMyAcctLink();
		
		//method to click community profile
		CommunityProfilePage communityProfilePage = manageMyAcct.clickCommunityProfile();
		 
				
		//method to publish Test Result
		communityProfilePage.publishTestResult();
	}
	
	@After

	public void takeScreenShot() {

	// take the screenshot at the end of every test

	File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);

	// now save the screenshot to a file some place

	try {

	FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_CommunityProfileLinkValidation.png"));

	} catch (IOException e) {

	// TODO Auto-generated catch block

	e.printStackTrace();

	}

	} 

}
