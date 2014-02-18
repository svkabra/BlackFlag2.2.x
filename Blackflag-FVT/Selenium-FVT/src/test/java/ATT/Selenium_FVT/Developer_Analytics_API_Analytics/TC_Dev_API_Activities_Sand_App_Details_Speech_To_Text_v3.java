package ATT.Selenium_FVT.Developer_Analytics_API_Analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.ApiMatrixHomePage;
import ATT.Selenium_FVT.Pages.AppPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Excel.FileHandling;

public class TC_Dev_API_Activities_Sand_App_Details_Speech_To_Text_v3 extends TestUtil{

	@Test
	public void testAnalyticsGraphFor_Sand_App_Speech_To_Text_v1() {		
		
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

//Step 2--Search for the application
			
			String sAppName;
			//sAppName = "000000test";
			sAppName = prop.getProperty("APPLICATION.NAME");
			AppPage appPage = myapps.fnSearchNClickAnAppinMyApps(sAppName);
			
//Step 3 -- Click on Sandbox Tab or Production Tab based on selection
			
			String sTabName;
			sTabName = "Sandbox";			
			appPage.fnSelectSandboxProdTabAppDetails(sTabName);			

//Step 3 -- Click on Check and click on API Analytics tab
			appPage.fnClickOnSandAPIAnalytics();
			
			

//Temporary Step- Set the calender range
			String sStartDate; 
			String sEndDate;
			sStartDate="8/1/2013 00:00";  
			sEndDate="8/15/2013 00:00";
//			appPage.fnSetDateRangeInMyApps(sStartDate, sEndDate);

//Step 4 -- Click on Refresh button 			
			//Get the data for 1 week
			//Click on refresh and wait till the data gets loaded in analytics
			appPage.fnClickRefresh();

//Step 5 --Set the API			
			//Set the API in the APIs dropdown box
			String sAPI;			
			sAPI = "Speech To Text_v3";
			appPage.fnSetAPI(sAPI);

//Step 6 -- Click on Refresh button			
			//Get the data for 1 week
			//Click on refresh and wait till the data gets loaded in analytics
			appPage.fnClickRefresh();
			

//Step 7 -- Check if the file has been exported successfully
			
			//Click on Export Button
			String filePathString;	
			filePathString = "C:\\Temp\\export.xlsx";	
			appPage.fnExportFile(filePathString);
			
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

//Step 8 -- Validate the exported file
			myapps.fnVerifyExportedExcelAPISpecificMyApps(sNewFilePath, sAPI);
			
		} catch (IOException e) {
			e.printStackTrace();
			}
		
				
	}	
}
