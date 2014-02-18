package ATT.Selenium_FVT.AppOnboarding.NewAppPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.AppPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Pages.NewAppPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;


public class TC_CreateAnApp_MIM_Playground extends TestUtil{

	/* Test case to verify that Playground User is able to create an application with the In App Messaging - MIM API included in scope*/	
	
	public boolean flag = false;
	
	@Test
	public void testAppCreation() {
		
		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.pgLogIn();
		MyAppsPage myAppsPage = apimLoginPage.clickMyApps();
		
		//Creating a new app
		NewAppPage newAppPage =myAppsPage.setUpNewApp();
		String appName =newAppPage.getNewAppName();
		newAppPage.enterAppName(appName);
		newAppPage.enterDescription(Constants.APP_DESCRIPTION);
		newAppPage.selectAPI(Constants.IN_APP_MESSAGING_MIM);
		
		// Enter Oauth URL
		newAppPage.setCallbackURL(Constants.OAUTH_URL);
		AppPage appPage =newAppPage.submitAppDetails();
		
		// Validate App is created Successfully	
		appPage.validateAppCreation(appName);
		
		// Validate if MIM API is added to scope  		
		appPage.isApiAdded(Constants.IN_APP_MESSAGING_MIM);
		
		// Display Test Result
		appPage.displayTestResult();	
		
		flag = true;		
	}

	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_CreateAnApp_MIM_Playground.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }	
	
	@After
	public void deleteCreatedApp(){
		if (flag){
			AppPage appPage = new AppPage(getDriver());
			appPage.deleteSandboxApp();
		}

	}

}
