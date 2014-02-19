package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Components.CreateAnApp;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class TutorialPage extends WebPage {
	
	
	// Page Object "APIs"
	@FindBy(how = How.LINK_TEXT, using = "Go to My Apps")
	public WebElement goToMyAppLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Video Tutorials")
	public WebElement videoTutorials;
	
	public TutorialPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void clkGoToMyApp(){
		
		goToMyAppLink.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("API Matrix", title);		
	}
	public void clkVideoTutorial(){
		
		videoTutorials.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("Video Tutorials", title);		
	}

		
}
