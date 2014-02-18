package ATT.Selenium_FVT.OrgOnBoarding;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.annotation.After;
import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.ManageMyAcct;
import ATT.Selenium_FVT.Pages.OrganizationDetailsPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class TC_CreateAnOrgWithEmployeesGreaterThan100 extends TestUtil{

	@Test
	public void createAnOrgWithEmployeesGreaterThan100_test() {
		
APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		
		//method to load the URL
		apimLoginPage.openURL();
		
		//method to log into Dev Portal as an OPA
		apimLoginPage.opaLogIn();
		
		//method to click on Manage My Account Link
		ManageMyAcct manageMyAcct = apimLoginPage.clickManageMyAcctLink();
		
		
		//method to click on Organization Details link
		OrganizationDetailsPage organizationDetailsPage = manageMyAcct.clickOrgDetails();
				
		
		//validate fields displayed
		organizationDetailsPage.field_Displayed();
		
		//method to select no. of employees from the drop down
		organizationDetailsPage.numbrofemployees_dropdown(4);
		
		//method to click on Update button
		organizationDetailsPage.clickUpdate();		
		
		//method to validate error message
		organizationDetailsPage.DUNS_validate();
		
	}

	@After

	public void takeScreenShot() {

	// take the screenshot at the end of every test

	File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);

	// now save the screenshot to a file some place

	try {

	FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_CreateAnOrgWithEmployeesGreaterThan100.png"));

	} catch (IOException e) {

	// TODO Auto-generated catch block

	e.printStackTrace();

	}

	} 

}
