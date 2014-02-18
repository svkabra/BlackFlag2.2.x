package ATT.Selenium_FVT.Developer_Analytics_Advertising;

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
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Browser.PageSupport;
import ATT.Selenium_FVT.Utilities.Component.Constants;
import ATT.Selenium_FVT.Utilities.Excel.FileHandling;

public class TC_OPA_ADV_Analytics_Production_Update_Date_Range extends TestUtil{

	@Test
	public void testAnalyticsGraphFor_My_Apps_Advertising_V1_ATTr2() {		

//Step: open the URL and login for the user
		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.opaLogInADVWITAPP();
		MyAppsPage myapps = apimLoginPage.clickMyApps();
		/** Click on the already existing application with Advertising Analytics*/
		
		//Step 2--Search for the application		
		String sAppName;
		sAppName = Constants.OPAAPPNAMEWITHADSINPROD;
		//AppPage appPage = myapps.fnSearchNClickAnAppinMyApps(sAppName);
		
		AppPage appPage = myapps.click_AppLink(sAppName);
		
				
		//Step 3 -- Click on Sandbox Tab or Production Tab based on selection		
//		String sTabName;
//		sTabName = "Sandbox";			
//		appPage.fnSelectSandboxProdTabAppDetails(sTabName);		
		
		
		appPage.clkADVAnalyticsAlreadyCollapsed();

		String sStartDate; 
		String sEndDate;

		sStartDate = Constants.START_DATE;
		sEndDate = Constants.END_DATE;

		appPage.fnSetDateRangeInMyApps(sStartDate ,sEndDate );
		
		appPage.fnClickRefresh();
		
		

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
