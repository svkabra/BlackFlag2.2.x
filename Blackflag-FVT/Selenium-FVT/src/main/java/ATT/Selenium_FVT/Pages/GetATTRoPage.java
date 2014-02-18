package ATT.Selenium_FVT.Pages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class GetATTRoPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "System Requirements" )
	public WebElement sysReq;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T ARO Release Notes")
	public WebElement releaseNotes ;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T ARO User Guide")
	public WebElement userGuide;
	
	@FindBy(how = How.LINK_TEXT, using = "Build with Open Source")
	public WebElement buildWithOS;
	
	public GetATTRoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public void openURL() {
		// TODO Auto-generated method stub
		driver.get("");
		
	}
	
	public void openURL(String URL){
		implicitWait(2);
		driver.get(URL);
		waitForPageToLoad();
		waitForAjaxInactivity();
	}
	
	public void clkBuildWithOS(){
		buildWithOS.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Build with Open Source", title);		
	}	
	public void clkReleaseNotes(){
		releaseNotes.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T ARO Release Notes", title);		
	}
	public void clksysReq(){
		sysReq.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("System Requirements", title);		
	}
	public void clkUserGuide(){
		userGuide.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T ARO User Guide", title);		
	}
	
}
