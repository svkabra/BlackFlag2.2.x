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


public class TC_CreateAnApp_AllApi_OPA extends TestUtil{

	/* Test case to verify that OPA is able to create application with all APIs in scope*/	
	
	public boolean flag = false;
	
	@Test
	public void testAppCreation() {
		
		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.opaLogIn();
		MyAppsPage myAppsPage = apimLoginPage.clickMyApps();
		
		//Creating a new app
		NewAppPage newAppPage =myAppsPage.setUpNewApp();
		String appName =newAppPage.getNewAppName();
		newAppPage.enterAppName(appName);
		newAppPage.enterDescription(Constants.APP_DESCRIPTION);
		newAppPage.selectAPI(Constants.IN_APP_MESSAGING_MIM);
		newAppPage.selectAPI(Constants.TERMINAL_LOCATION);
		newAppPage.selectAPI(Constants.MMS);
		newAppPage.selectAPI(Constants.DEVICE_CAPABILITIES);
		newAppPage.selectAPI(Constants.IN_APP_MESSAGING_IMMN);
		newAppPage.selectAPI(Constants.SPEECH_TO_TEXT_CUSTOM);
		newAppPage.selectAPI(Constants.TEXT_TO_SPEECH);
		newAppPage.selectAPI(Constants.PAYMENT);
		newAppPage.selectAPI(Constants.SPEECH_TO_TEXT);
		newAppPage.selectAPI(Constants.ADVERTISING);
		newAppPage.selectAPI(Constants.SMS);
		newAppPage.setCallbackURL(Constants.OAUTH_URL);
		AppPage appPage =newAppPage.submitAppDetails();
		
		// Validate App is created Successfully	
		appPage.validateAppCreation_Adv(appName);
		
		// Validate if DC API is added to scope  		
		appPage.isApiAdded(Constants.IN_APP_MESSAGING_MIM);
		appPage.isApiAdded(Constants.TERMINAL_LOCATION);
		appPage.isApiAdded(Constants.MMS);
		appPage.isApiAdded(Constants.DEVICE_CAPABILITIES);
		appPage.isApiAdded(Constants.IN_APP_MESSAGING_IMMN);
		appPage.isApiAdded(Constants.SPEECH_TO_TEXT_CUSTOM);
		appPage.isApiAdded(Constants.TEXT_TO_SPEECH);
		appPage.isApiAdded(Constants.PAYMENT);
		appPage.isApiAdded(Constants.SPEECH_TO_TEXT);
		appPage.isApiAdded(Constants.ADVERTISING);
		appPage.isApiAdded(Constants.SMS);
		
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
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_CreateAnApp_AllApi_OPA.png"));
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
