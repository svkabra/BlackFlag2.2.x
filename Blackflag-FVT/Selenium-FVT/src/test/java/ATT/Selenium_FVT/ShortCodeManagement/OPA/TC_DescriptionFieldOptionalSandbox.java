package ATT.Selenium_FVT.ShortCodeManagement.OPA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.annotation.After;
import ATT.Selenium_FVT.Components.ManageShortCodeTab;
import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.AppPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Pages.NewAppPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class TC_DescriptionFieldOptionalSandbox extends TestUtil {

	public boolean flag=false;
	@Test
	public void descriptionFieldOptionalSandbox_test() {
		
		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver("FIREFOX"));
		
		//method to load the URL
		apimLoginPage.openURL();
		
				
		//method to log into Dev Portal as an OPA
		apimLoginPage.opaLogIn();
				
		//method to open My Apps page
		MyAppsPage myAppPage = apimLoginPage.clickMyApps();
		
		//method to select the App
		//AppPage appPage = myAppPage.clickTestAppSandbox();
			
		//Creating a new app
		NewAppPage newAppPage =myAppPage.setUpNewApp();
		String appName =newAppPage.getNewAppName();
		newAppPage.enterAppName(appName);
		newAppPage.enterDescription(Constants.APP_DESCRIPTION);
		newAppPage.selectAPI(Constants.SMS);
		newAppPage.selectAPI(Constants.MMS);
		AppPage appPage =newAppPage.submitAppDetails();
		
		// Validate App is created Successfully	
		appPage.validateAppCreation(appName);
		
		// Validate if TL API is added to scope  		
		appPage.isApiAdded(Constants.SMS);
		appPage.isApiAdded(Constants.MMS);
	
		//select Manage ShortCode tab
		ManageShortCodeTab mngShortCode =appPage.selectManageShortCodeTab();
		
		//click on Add ShortCode
		mngShortCode.clickAddShortCode();
		
		//method to save the ShortCode
		mngShortCode.saveShortCodeDetails();
		
		//method to validate the added shortcode provided standard online
		String shortCode = mngShortCode.getOfflineShortCode();
		mngShortCode.validateShortCodeAdded(shortCode);
				
		//method to publish Test Result
		mngShortCode.publishTestResult();
		
		flag=true;
	}
	
	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_DescriptionFieldOptionalSandbox.png"));
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
