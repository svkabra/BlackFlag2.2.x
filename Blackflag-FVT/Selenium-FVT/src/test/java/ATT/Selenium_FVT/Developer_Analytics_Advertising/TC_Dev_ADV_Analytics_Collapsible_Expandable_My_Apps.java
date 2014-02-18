package ATT.Selenium_FVT.Developer_Analytics_Advertising;

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
import ATT.Selenium_FVT.Utilities.Browser.PageSupport;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class TC_Dev_ADV_Analytics_Collapsible_Expandable_My_Apps extends TestUtil{

	@Test
	public void test_Dev_ADV_Analytics_By_Default_Collapsed_My_Apps() {		

		
try{		

		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.devLogInADVWITHAPP();
		MyAppsPage myapps = apimLoginPage.clickMyApps();

		/** Method to validate that ADV Analytics is already collapsed*/
		myapps.clkADVAnalyticsExpandedCollapsed();
		
		PageSupport oPgSupport = new PageSupport(); 
		oPgSupport.publishTestResult();
					
		} catch (Exception e) {
			e.printStackTrace();

			PageSupport oPgSupport = new PageSupport(); 
			oPgSupport.publishTestResult();
						
			
			}
		
				
	}
	
	
	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshto to a file some place
        try {
			String className = this.getClass().getSimpleName();
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\" + className + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }



}
