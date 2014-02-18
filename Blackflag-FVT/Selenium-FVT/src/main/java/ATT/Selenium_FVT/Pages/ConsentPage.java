package ATT.Selenium_FVT.Pages;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class ConsentPage extends WebPage {

	@FindBy(className = "mobile_number")
	public WebElement phoneNum;
	
	@FindBy(className = "consent_services_list")
	public WebElement consentServiceList;
	
	@FindBy(className = "arrow")
	public WebElement collapseBtn;
	
	public ConsentPage(WebDriver driver) {
		super(driver);
	}

	//@Override
	public void openURL() {
		Properties prop = new Properties();
		try{
			prop.load(new FileInputStream("src//test//java//configuration.properties"));
			driver.get(prop.getProperty("consentpage.url"));
			waitForPageToLoad();
			waitForAjaxInactivity();
		}
		catch(Exception e){
			System.out.println("ConsentPage:Exception occurred while loading configuration file\n");
		}
		
	}
	
	public void openURL(String URL){
		implicitWait(2);
		driver.get(URL);
		waitForPageToLoad();
		waitForAjaxInactivity();
	}
	
	public void viewApiDetails(){
		List<WebElement> allElements = consentServiceList.findElements(By.className("details"));
		for (WebElement element: allElements) {
			collapseBtn.click();
			Assert.assertTrue(element.getAttribute("style") != "display: none;");
		    
		}
	}
	/**
	 * 	Function authorizes using AT&T ID
	 * @return AuthorizationThankYou page
	 */
	public ManagePermissionsPage authorizeUsingID(String uname, String pwd){
		driver.findElement(By.cssSelector("div.icon.icon_user-id-inactive")).click();
		driver.findElement(By.name("login")).sendKeys();
		driver.findElement(By.name("password")).sendKeys("welcome1");
		driver.findElement(By.name("commit")).click();
		waitForPageToLoad();
		implicitWait(10);
		return PageFactory.initElements(driver, ManagePermissionsPage.class);
	}
}
