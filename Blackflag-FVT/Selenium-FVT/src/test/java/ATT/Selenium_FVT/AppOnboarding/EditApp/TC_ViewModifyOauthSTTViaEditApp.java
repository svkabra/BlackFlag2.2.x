package ATT.Selenium_FVT.AppOnboarding.EditApp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.AppPage;
import ATT.Selenium_FVT.Pages.EditAppPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Pages.NewAppPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;


public class TC_ViewModifyOauthSTTViaEditApp extends TestUtil{

	/* Verify that Developer is able to view OAuth Redirect URL when STT  is selected on the Edit App Page */	
	
	@Test
	public void testAppCreation() {
		
		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.devLogIn();
		MyAppsPage myAppsPage = apimLoginPage.clickMyApps();
		
		//Creating a new app
		NewAppPage newAppPage =myAppsPage.setUpNewApp();
		String appname =newAppPage.getNewAppName();
		newAppPage.enterAppName(appname);
		newAppPage.enterAppName(appname);
		newAppPage.enterDescription(Constants.APP_DESCRIPTION);
		newAppPage.selectAPI(Constants.SMS);
		AppPage appPage =newAppPage.submitAppDetails();
		
		//Navigate to edit app page and add IVEE API
		EditAppPage editAppPage = appPage.clickEditApp();	
		editAppPage.selectAPI(Constants.SPEECH);
		
		
		//Validate if Developer is able to view OAuth Redirect URL when STT  is selected on the Edit App Page  
		editAppPage.isOauthNotDisplayed();
				
	}
	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshto to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\ViewModify_Oauth_STT_ViaEditApp.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
