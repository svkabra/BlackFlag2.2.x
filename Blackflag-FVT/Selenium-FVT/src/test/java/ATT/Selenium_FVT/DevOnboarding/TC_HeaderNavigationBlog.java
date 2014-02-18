package ATT.Selenium_FVT.DevOnboarding;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ATT.Selenium_FVT.Pages.APIMLoginPage;
import ATT.Selenium_FVT.Test.TestUtil;
import ATT.Selenium_FVT.Utilities.Component.Constants;
import ATT.Selenium_FVT.Utilities.Component.Headers;

public class TC_HeaderNavigationBlog extends TestUtil{


	/* Test case to verify that the Dev portal Page routes to correct link when clicked on Blog*/
	
	
	@Test
	public void testHeaderNavigation() {
		Headers hd=new Headers(getNewDriver(Constants.BROWSER));
		APIMLoginPage apilogpage = hd.apimLoginPage();
		apilogpage.openURL();			 
		apilogpage.devLogIn();
		hd.clkBlog();		
				
	}

	@After
    public void takeScreenShot() {
        // take the screenshot at the end of every test
        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // now save the screenshot to a file some place
        try {
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\TC_HeaderNavigationBlog.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
