package ATT.Selenium_FVT.ShortCodeManagement.Developer;

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

public class TC_DefaultMmsShortCodeProduction extends TestUtil {

	public boolean flag=false;
	@Test
	public void defaultMmsShortCodeProduction_test() {
		
		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		
		//method to load the URL
		apimLoginPage.openURL();
		
				
		//method to log into Dev Portal as an OPA
		apimLoginPage.devLogIn();
				
		//method to open My Apps page
		MyAppsPage myAppPage = apimLoginPage.clickMyApps();
		
		//method to select the App
		//AppPage appPage = myAppPage.clickTestMmsAppProduction();
		
		//Creating a new app
		NewAppPage newAppPage =myAppPage.setUpNewApp();
		String appName =newAppPage.getNewAppName();
		newAppPage.enterAppName(appName);
		newAppPage.enterDescription(Constants.APP_DESCRIPTION);
		newAppPage.selectAPI(Constants.MMS);
		AppPage appPage =newAppPage.submitAppDetails();
		
		// Validate App is created Successfully	
		appPage.validateAppCreation(appName);
		
		// Validate if TL API is added to scope  		
		appPage.isApiAdded(Constants.MMS);
		
		//Promoting the app to production
		appPage.requestForProductionAccess();
		
		//select Manage ShortCode tab
		ManageShortCodeTab mngShortCode =appPage.selectManageShortCodeTab();
		
		//method to validate the Type and Rating for the ShortCode
		String type = mngShortCode.getTypeOfShortCode();
		mngShortCode.validateTypeOfShortCode(type, "Provided");
		
		//method to validate the Type and Rating for the ShortCode
		String rating = mngShortCode.getRatingOfShortCode();
		mngShortCode.validateRatingOfShortCode(rating, "Standard");
		
		//method to publish Test Result
		mngShortCode.testResult();
		
		flag=true;
	}
	
	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_DefaultMmsShortCodeProduction.png"));
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
