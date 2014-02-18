package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class ReqProdAccessPage extends WebPage{

	@FindBy(name = "commit")
	public WebElement reqprod;
	
	public ReqProdAccessPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub		
	}

	@Override
	public void openURL() {
		// TODO Auto-generated method stub
		
	}
	
	public AppPage clkProdAccess(){
		reqprod.click();
		waitForPageToLoad();
		implicitWait(8);
		return PageFactory.initElements(driver, AppPage.class);	
	}
	
}
