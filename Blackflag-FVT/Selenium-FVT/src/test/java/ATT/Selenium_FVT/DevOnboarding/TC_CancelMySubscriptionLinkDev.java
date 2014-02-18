package ATT.Selenium_FVT.DevOnboarding;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.annotation.After;
import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Pages.ManageMyAcct;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;

public class TC_CancelMySubscriptionLinkDev extends TestUtil {

	@Test
	public void cancelMySubscriptionTest() {

		APIMLoginPage apimLoginPage = new APIMLoginPage(getNewDriver(Constants.BROWSER));
		apimLoginPage.openURL();
		apimLoginPage.devLogIn();
		ManageMyAcct manageMyAcct = apimLoginPage.clickManageMyAcctLink();
		manageMyAcct.clickCancelMySubscriptionLink();
		manageMyAcct.publishTestResult();
	}

	@After
	public void takeScreenShot() {
		File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_CancelMySubscriptionLinkDev.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	} 


}
