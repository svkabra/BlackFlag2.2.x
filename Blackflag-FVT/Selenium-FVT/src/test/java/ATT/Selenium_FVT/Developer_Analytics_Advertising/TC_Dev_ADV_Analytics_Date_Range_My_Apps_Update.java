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
import ATT.Selenium_FVT.Utilities.Excel.FileHandling;

public class TC_Dev_ADV_Analytics_Date_Range_My_Apps_Update extends TestUtil{

	@Test
	public void testAnalyticsGraphFor_My_Apps_Advertising_V1_ATTr2() {		

//Step: open the URL and login for the user
		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.devLogInADVWITHAPP();
		MyAppsPage myapps = apimLoginPage.clickMyApps();

		/** Method to validate that ADV Analytics is already collapsed*/

//Step: Expand the Advertising Analytics and set the date range		
		myapps.clkADVAnalyticsAlreadyCollapsed();

		
			String sStartDate; 
			String sEndDate;
//			sStartDate="8/1/2013 00:00";  
//			sEndDate="8/31/2013 00:00";
			
			sStartDate = Constants.START_DATE;
			sEndDate = Constants.END_DATE;

			
			myapps.fnSetDateRangeInMyAppsADV(sStartDate ,sEndDate);
			
//Step:  Click the Refresh button 			
			myapps.fnClickRefreshADV();


//Step -- Check if the file has been exported successfully
			
			   
			//Click on Export Button
			String filePathString;	
			filePathString = Constants.FVTRESULTPATHADVERTISING;	
			myapps.fnExportFileADV(filePathString);
			
			//Check if file has been exported successfully			
			FileHandling file = new FileHandling();			
			boolean x = file.fnCheckFileExists(filePathString);
			
			//Get the Name of the current class
			String className = this.getClass().getSimpleName();
			
			String sOldFilePath, sNewFilePath;
			sNewFilePath = null;
			if(x){							
				sOldFilePath = filePathString;
				sNewFilePath = "C:\\Temp\\"+className+".csv";  
				file.fnCheckFileRenamed(sOldFilePath, sNewFilePath);			
			}else{
				System.out.println("File does not exists");
			}

			PageSupport oPgSupport = new PageSupport(); 
			oPgSupport.publishTestResult();

			
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
