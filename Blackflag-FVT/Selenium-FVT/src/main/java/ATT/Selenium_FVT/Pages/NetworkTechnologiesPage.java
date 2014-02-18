package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class NetworkTechnologiesPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "Authentication and Encryption" )
	public WebElement authEncrypt;
	
	@FindBy(how = How.LINK_TEXT, using = "Enterprise Network Considerations")
	public WebElement enNetCon ;
	
	@FindBy(how = How.LINK_TEXT, using = "Fixed-End Connections")
	public WebElement feConn;
	
	@FindBy(how = How.LINK_TEXT, using = "Fixed Mobile Convergence (FMC)")
	public WebElement fmConv;
	
	@FindBy(how = How.LINK_TEXT, using = "IP networking")
	public WebElement ipNet;
	
	@FindBy(how = How.LINK_TEXT, using = "Network Security")
	public WebElement netSec;
	
	@FindBy(how = How.LINK_TEXT, using = "Networking Considerations for Roaming")
	public WebElement netConRoam ;
	
	@FindBy(how = How.LINK_TEXT, using = "Packet Data Protocol Contexts")
	public WebElement packData ;
	
	@FindBy(how = How.LINK_TEXT, using = "Technology Comparison")
	public WebElement techComp ;
	
	@FindBy(how = How.LINK_TEXT, using = "Time Expiration Values")
	public WebElement timeExp ;
	
	@FindBy(how = How.LINK_TEXT, using = "Wi-Fi")
	public WebElement wifi ;
	
	@FindBy(how = How.LINK_TEXT, using = "Wireline")
	public WebElement wireline ;
	
	public NetworkTechnologiesPage(WebDriver driver) {
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
	
	public void clkAuthEncrypt(){
		authEncrypt.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Authentication and Encryption", title);		
	}	
	public void clkEnNetCon(){
		enNetCon.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Enterprise Network Considerations", title);		
	}
	public void clkFeConn(){
		feConn.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Fixed-End Connections", title);		
	}
	public void clkFmConv(){
		fmConv.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Fixed Mobile Convergence (FMC)", title);		
	}
	public void clkIPNet(){
		ipNet.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("IP networking", title);		
	}
	public void clkNetSecurity(){
		netSec.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Network Security", title);		
	}
	
	public void clkNetConRoam(){
		netConRoam.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Networking Considerations for Roaming", title);		
	}	
	public void clkPackData(){
		packData.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Packet Data Protocol Contexts Definition from AT&T Developer Program", title);		
	}
	public void clkTechComp(){
		techComp.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Technology Comparison", title);		
	}
	public void clkTimeExp(){
		timeExp.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Time Expiration Values", title);		
	}
	public void clkWifi(){
		wifi.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Wi-Fi", title);		
	}
	public void clkWireline(){
		wireline.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Wireline", title);		
	}
	public MyAppsPage clickMyApps(){
//		waitForElement(btnMyApps).click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, MyAppsPage.class);
	}
	
	
}
