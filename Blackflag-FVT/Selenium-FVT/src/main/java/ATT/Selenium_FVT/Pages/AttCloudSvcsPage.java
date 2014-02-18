package ATT.Selenium_FVT.Pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class AttCloudSvcsPage extends WebPage{

	@FindBy(how = How.LINK_TEXT, using = "AT&T Cloud Architect" )
	public WebElement attCloudArch;
	
	@FindBy(how = How.LINK_TEXT, using = "AT&T Platform as a Service (PaaS) APIs and Tools")
	public WebElement paas ;
	
	@FindBy(how = How.LINK_TEXT, using = "OpenStack")
	public WebElement openstack;
	
	
	public AttCloudSvcsPage(WebDriver driver) {
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
	
	public void clkAttCloudArch(){
		attCloudArch.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T Cloud Architect", title);		
	}	
	public void clkOpenstack(){
		openstack.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("OpenStack", title);		
	}
	public void clkPaas(){
		paas.click();
		waitForPageToLoad();
		String title = driver.getTitle();
		Assert.assertEquals("AT&T Platform as a Service (PaaS) APIs and Tools", title);		
	}
	
	
}
