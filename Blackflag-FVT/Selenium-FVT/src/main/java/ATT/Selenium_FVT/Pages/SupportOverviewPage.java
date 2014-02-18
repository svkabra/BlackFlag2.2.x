package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class SupportOverviewPage extends WebPage{
	
	@FindBy(how = How.LINK_TEXT ,using="Visit Forums")
	private WebElement visitForums;
	
	@FindBy(how = How.LINK_TEXT ,using="Visit FAQs Page")
	private WebElement visitFaqs;
	
	@FindBy(how = How.LINK_TEXT ,using="Chat Live")
	private WebElement chatLive;
	
	public SupportOverviewPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openURL() {
		// TODO Auto-generated method stub

	}
	public void clkVisitForums(){
		visitForums.click();
		waitForPageToLoad();
		validatePageTitle("Forums - Forums Blogs Events News | AT&T Developer Program");
	}
}
