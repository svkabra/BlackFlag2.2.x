package ATT.Selenium_FVT.DevOnboarding;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.JoinNowPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;


public class TC_JoinNowResetPasswordLink extends TestUtil{

	/* Test case to verify that the user navigated to Reset password page on clicking Reset password link on error when trying to enter existing email id on join now page*/	
	
	@Test
	public void testEmailValidation() {
		
		APIMLoginPage apilogpage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apilogpage.openURL();			 
		JoinNowPage joinNow = apilogpage.clkGetStartedFree();	
		joinNow.enterEmailID();
		joinNow.clkJoinNow();
		joinNow.resetPwdFromErrorMsg();
		
	}

	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_JoinNowResetPasswordLink.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}
