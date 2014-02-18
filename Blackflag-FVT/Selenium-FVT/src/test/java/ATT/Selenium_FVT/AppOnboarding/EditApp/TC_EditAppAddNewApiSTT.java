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


public class TC_EditAppAddNewApiSTT extends TestUtil{

	/* Verify that user can  Add STT api to existing  sandbox Application */	

	public boolean flag = false;
	
	@Test
	public void testEditApp() {
		
		APIMLoginPage apimLoginPage=new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.devLogIn();
		MyAppsPage myapps = apimLoginPage.clickMyApps();

		//Creating a new app
		NewAppPage newAppPage =myapps.setUpNewApp();
		String appname =newAppPage.getNewAppName();
		newAppPage.enterAppName(appname);
		newAppPage.enterDescription(Constants.APP_DESCRIPTION);
		newAppPage.selectAPI(Constants.IN_APP_MESSAGING_MIM);
		newAppPage.setCallbackURL(Constants.OAUTH_URL);
		AppPage appPage =newAppPage.submitAppDetails();


		//Adding new APIs to created app
		EditAppPage edit = appPage.clickEditApp();		
		
		//Select STT api
		edit.selectAPI(Constants.SPEECH);
		edit.submitAppDetails();
		
		// Validate if STT API is added to scope  		
		appPage.isApiEdited(Constants.SPEECH);	
		
		flag = true;
	}
	
	@After	
    public void takeScreenShot() {
				
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_EditAppAddNewApiSTT.png"));
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
