package ATT.Selenium_FVT.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class TestUtil {
	
	private WebDriver driver ;
	
	public WebDriver getNewDriver(String Browser){
	//	Driver driverType = Driver.FIREFOX;
		driver  = WebPage.getNewDriver(Browser);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	public WebDriver getDriver(){
			return driver;
		}
	@After
	public void teardown() throws IOException{
		try {
				driver.quit();
			} catch (Exception e){
				//swallow
			}
	}
	
	
	@cucumber.annotation.After
	public void closeBrowser() throws IOException{
		try {
			  driver.quit();
		} catch (Exception e){
			//swallow
		}
}
}
