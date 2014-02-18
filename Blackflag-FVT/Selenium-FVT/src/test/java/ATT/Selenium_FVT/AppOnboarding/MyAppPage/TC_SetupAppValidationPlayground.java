package ATT.Selenium_FVT.AppOnboarding.MyAppPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Pages.NewAppPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;


public class TC_SetupAppValidationPlayground extends TestUtil{

	/**  Verify that Playground will land on New app creation page when  Setup Application button is clicked on My apps page */	
	
	@Before
	public void setupPGEnvironment(){
		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.pgLogIn();
		MyAppsPage myAppsPage = apimLoginPage.clickMyApps();
		myAppsPage.deleteSandboxAppPG();
	}
	
	@Test
	public void testSetupAppBtn() {
		
/*		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.pgLogIn();
		MyAppsPage myAppsPage = apimLoginPage.clickMyApps();*/
		MyAppsPage myAppsPage = new MyAppsPage(getDriver());
		NewAppPage newAppPage =myAppsPage.setUpNewAppAfterCleanup();
		/** Method to Validate Playground will land on New app creation page on clicking setup new app button*/
		newAppPage.validateNewAppPage();
	}
	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_SetupAppValidationPlayground.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
