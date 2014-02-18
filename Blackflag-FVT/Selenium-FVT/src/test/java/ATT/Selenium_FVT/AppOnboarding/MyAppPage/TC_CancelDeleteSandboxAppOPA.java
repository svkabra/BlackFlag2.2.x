package ATT.Selenium_FVT.AppOnboarding.MyAppPage;

import org.junit.Test;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;


public class TC_CancelDeleteSandboxAppOPA extends TestUtil{

	/** To verify OPA can cancel deleting  a Sandbox app
	 * * Precondition : User should have atleast one app on my apps page */	
	
	@Test
	public void testCancelDeletion() {
		
		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.opaLogIn();
		MyAppsPage myAppsPage = apimLoginPage.clickMyApps();
			
		
		/** Click on delete button */
		myAppsPage.clkDeleteSandbox();
		
		/** Click and validate on OrCancel button */
		myAppsPage.clkOrCancel(Constants.CANCELDELETEAPP);;

				
	}

	

}
