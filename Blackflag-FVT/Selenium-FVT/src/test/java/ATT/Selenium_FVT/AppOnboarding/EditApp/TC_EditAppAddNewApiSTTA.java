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


public class TC_EditAppAddNewApiSTTA extends TestUtil{

	/* Verify that user can  Add STTA api to existing  sandbox Application */	
	
	public boolean flag = false;
	
	@Test
	public void testEditApp() {
		
		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.devLogIn();
		MyAppsPage myapps = apimLoginPage.clickMyApps();

		//Creating a new app
		NewAppPage newApp =myapps.setUpNewApp();
		String appname =newApp.getNewAppName();
		newApp.enterAppName(appname);
		newApp.enterDescription(Constants.APP_DESCRIPTION);
		newApp.selectAPI(Constants.IN_APP_MESSAGING_MIM);
		newApp.setCallbackURL(Constants.OAUTH_URL);
		AppPage appPage =newApp.submitAppDetails();


		//Adding new APIs to created app
		EditAppPage edit = appPage.clickEditApp();		
		
		//Select STTA api
		edit.selectAPI("Speech - STTA");
		edit.submitAppDetails();
		
		// Validate if STTA API is added to scope  		
		appPage.isApiEdited("Speech - STTA");
		
		flag = true;
	}
	
	@After	
    public void takeScreenShot() {
				
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_EditAppAddNewApiSTTA.png"));
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
