package ATT.Selenium_FVT.Developer_Analytics_API_Analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.ApiMatrixHomePage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Excel.FileHandling;

public class TC_Dev_API_Activities_My_Apps_SMS_V2_ATTr2 extends TestUtil{

	@Test
	public void testAnalyticsGraphFor_My_Apps_SMS_V2_ATTr2() {		
		
		Properties prop = new Properties();
		ApiMatrixHomePage apimpage = null;
		try {
			prop.load(new FileInputStream("src//test//java//configuration.properties"));				
			apimpage = new ApiMatrixHomePage(getNewDriver(prop.get("browser").toString()));

			APIMLoginPage api= 	apimpage.apimLoginPage();

//Step1 -- Login to APIM as Developer and click on My Apps link			
			api.openURL();
			api.enterUserName(prop.getProperty("DEVELOPER.USERNAME"));
			api.enterPasword(prop.getProperty("DEVELOPER.PASSWORD"));
			MyAppsPage myapps = api.login();

			
//Step2 -- Click on API Analytics button			
			//Verify Analytics collapsed before and expanded after and click on ADV Analytics	
			myapps.clkAPIAnalyticsBtn();
			

//Temporary Step- Set the calender range
			String sStartDate; 
			String sEndDate;
			sStartDate="8/1/2013 00:00";  
			sEndDate="8/31/2013 00:00";
			myapps.fnSetDateRangeInMyApps(sStartDate ,sEndDate);

//Step3 -- Click on Refresh button 			
			//Get the data for 1 week
			//Click on refresh and wait till the data gets loaded in analytics
			myapps.fnClickRefresh();

//Step4 --Set the API			
			//Set the API in the APIs dropdown box
			String sAPI;			
			sAPI = "SMS_V2_ATTr2";
			myapps.fnSetAPI(sAPI);

//Step5 -- Click on Refresh button			
			//Get the data for 1 week
			//Click on refresh and wait till the data gets loaded in analytics
			myapps.fnClickRefresh();
			

//Step 6 -- Check if the file has been exported successfully
			
			//Click on Export Button
			String filePathString;	
			filePathString = "C:\\Temp\\export.xlsx";	
			myapps.fnExportFile(filePathString);
			
			//Check if file has been exported successfully			
			FileHandling file = new FileHandling();			
			boolean x = file.fnCheckFileExists(filePathString);
			
			//Get the Name of the current class
			String className = this.getClass().getSimpleName();
			
			String sOldFilePath, sNewFilePath;
			sNewFilePath = null;
			if(x){							
				sOldFilePath = filePathString;
				sNewFilePath = "C:\\Temp\\"+className+".xlsx";  
				file.fnCheckFileRenamed(sOldFilePath, sNewFilePath);			
			}else{
				System.out.println("File does not exists");
			}

//Step 7 -- Validate the exported file
			myapps.fnVerifyExportedExcelAPISpecificMyApps(sNewFilePath, sAPI);
					
		} catch (IOException e) {
			e.printStackTrace();
			}
		
				
	}	
}
