package ATT.Selenium_FVT.Utilities.Browser;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidParameterException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class WebPage extends PageSupport {
	
	public WebPage(WebDriver driver){
		super(driver);
	}
	
	public enum Driver{
		FIREFOX,
		SAFARI,
		IE,
		CHROME,
		FFGRID,
		HTMLUNIT;
		
	}
	
	public static WebDriver getNewDriver(Driver driverType){
		switch (driverType) {
		case FIREFOX:
			return new FirefoxDriver();
		case SAFARI:
			return new SafariDriver();
		case CHROME:
			File file = new File("C:\\Setups\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			return new ChromeDriver();
		case IE:			
			System.setProperty("webdriver.ie.driver", "C:\\Setups\\IEDriverServer.exe");
			//return new InternetExplorerDriver();
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability("ensureCleanSession", true);
			return new InternetExplorerDriver(ieCapabilities);
			
		case FFGRID:
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			try {
				return new RemoteWebDriver(new URL(""), capability);
			} catch (MalformedURLException e) {
				e.printStackTrace();
				return null;
			}
		case HTMLUNIT:
			return new HtmlUnitDriver(true);
		default:
			throw new InvalidParameterException("You must choose one of the defined driver types");
		}
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public static WebDriver getNewDriver(String Browser){
		return getNewDriver(Driver.valueOf(Browser.toUpperCase()));
	}
	
	public void refresh(){
		driver.navigate().refresh();
	}
	
	public String getCurrentURL(){
		return driver.getCurrentUrl();
	}
	
	public abstract void openURL();
	
	public void logout(){
		Hover(driver.findElement(By.cssSelector("a.logout")));
	//	driver.findElement(By.name("signOut")).click();
		driver.findElement(By.id("logOut")).click();
		implicitWait(3);
		waitForAjaxInactivity();
		validateWebElementDisplayed(driver.findElement(By.linkText("Sign In")));
	//	driver.findElement(By.id("dropdown-toggle-temp")).click();
		//driver.findElement(By.xpath("//*[@id='btn-nav-menu']/span")).click();
	 //   driver.findElement(By.xpath("//*[@id='dropown-menu-temp']/li[3]/a")).click();
	//    driver.quit();
	}
	
	public void closeBrowser(){
		driver.quit();
	}

}
