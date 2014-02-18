package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class SuccessStoriesPage extends WebPage{

	
	// Page Object "Stories"
	@FindBy(how = How.LINK_TEXT, using = "Stories")
	public WebElement stories;
	
	// Page Object "SuccessStories"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[2]/div/div[1]/div[1]/a[1]/img")
	public WebElement successStories;
	
	public SuccessStoriesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void openURL() {
		
	}	
	
	/* Method to Initialize APIMLoginPage */
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}

	/*Method to click on a App (Voxy) on Success Stories Page*/
	public void clkSuccessStories(){
		stories.click();
		waitForPageToLoad();
		successStories.click();
		waitForPageToLoad();
		validatePageTitle("Voxy Success Story | AT&T Developer");
	}
}
