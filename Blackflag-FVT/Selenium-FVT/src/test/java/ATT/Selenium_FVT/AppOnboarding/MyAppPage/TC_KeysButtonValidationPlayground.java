package ATT.Selenium_FVT.AppOnboarding.MyAppPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Test.TestUtil;


public class TC_KeysButtonValidationPlayground extends TestUtil{

	/**  Verify that Sandbox App Key and Secret key is displayed when Playground clicks on Sandbox Key button on my apps page 
	 * Precondition : User should have atleast one app on my apps page*/	
	
	@Test
	public void testKeysBtn() {
		
		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver("FIREFOX"));
		apimLoginPage.openURL();
		apimLoginPage.pgLogIn();
		MyAppsPage myAppsPage = apimLoginPage.clickMyApps();
		/** Method to Validate Sandbox App Key and Secret key is displayed when Playground clicks on Sandbox Key button on my apps page*/
		myAppsPage.clkKeyIcon();
	}
	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshto to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_KeysButtonValidationPlayground.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
