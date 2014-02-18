package ATT.Selenium_FVT.AppOnboarding.MyAppPage;

import org.junit.Test;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.MyAppsPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;


public class TC_AuthenticationMessageMyApps extends TestUtil{

	/** Verify that "Successfully authenticated from Att account. " message is displayed when the user logs in to My apps page after successful authentication
	 */
	@Test
	public void testAuthenticationMessage() {
		
		APIMLoginPage apimLoginPage= new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.pgLogIn();
		MyAppsPage myapps = apimLoginPage.clickMyApps();
		/** Method to validate Authentication message */
		myapps.validateAuthMsg();
				
	}


}
