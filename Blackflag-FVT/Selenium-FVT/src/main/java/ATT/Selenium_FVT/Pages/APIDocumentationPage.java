package ATT.Selenium_FVT.Pages;

import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class APIDocumentationPage extends WebPage{
	
	
	// Page Object "API"
	@FindBy(how = How.LINK_TEXT, using = "APIs")
	public WebElement apis;
	
	// Page Object "SpeechAPIDocumentation"
	@FindBy(how = How.XPATH, using = "//*[@id='content-sections']/section/div/div/section[3]/div/a[2]")
	public WebElement speechAPIDocumentation;
	
	//Page Object "FAQs"
	@FindBy(how = How.LINK_TEXT, using = "7. FAQs")
	public WebElement fAQs;
	
	//Page Object "Errors"
	@FindBy(how = How.LINK_TEXT, using = "8. Errors")
	public WebElement errors;
	
	//Page Object "ErrorCode"
	@FindBy(how = How.XPATH, using = "//*[@id='error-code']/div/div/div[3]/div[1]")
	public WebElement errorCode;
	
	
	public APIDocumentationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		// TODO Auto-generated method stub	
	}
		
	/* Method to Initialize APIMLoginPage */
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}
	
	/*Method to click on "FAQs" on the left Navigation Page of Documentation*/
	public void clkFAQs(){
		String mwh=driver.getWindowHandle();
		apis.click();
		waitForPageToLoad();
		speechAPIDocumentation.click();
		waitForPageToLoad();
		fAQs.click();		
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		        		Assert.assertEquals("Speech API FAQs | AT&T Developer", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
		
	}

	
	/*Method to click on "Errors" on the left Navigation Page of Documentation*/
	public void clkErrors(){
		String mwh=driver.getWindowHandle();
		apis.click();
		waitForPageToLoad();
		speechAPIDocumentation.click();
		waitForPageToLoad();
		errors.click();		
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                String text = driver.getTitle();
		        		Assert.assertEquals("Errors", text);  
		                System.out.println(text);
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
	
	/*Method to click on Error code on Errors page*/
	public void clkErrorcode(){
		String mwh=driver.getWindowHandle();
		apis.click();
		waitForPageToLoad();
		speechAPIDocumentation.click();
		waitForPageToLoad();
		errors.click();		
		waitForPageToLoad();
		Set<String> s=driver.getWindowHandles();
		//this method will you handle of all opened windows

		Iterator<String> ite=s.iterator();

		while(ite.hasNext())
		{
		    String popupHandle=ite.next().toString();
		    if(!popupHandle.contains(mwh))
		    {
		                driver.switchTo().window(popupHandle);
		                /*here you can perform operation in pop-up window**/
		                 {
		                	String mwh1=driver.getWindowHandle();
		            		errorCode.click();
		            		waitForPageToLoad();
		                	Set<String> s1=driver.getWindowHandles();
		            		//this method will you handle of all opened windows

		            		Iterator<String> ite1=s1.iterator();

		            		while(ite.hasNext())
		            		{
		            		    String popupHandle1=ite1.next().toString();
		            		    if(!popupHandle1.contains(mwh1))
		            		    {
		            		                driver.switchTo().window(popupHandle1);
		            		                /*here you can perform operation in pop-up window**/
		            		                String text = driver.getTitle();
		            		                Assert.assertEquals("HTTP/1.1: Status Code Definitions", text);  
		            		                System.out.println(text);
		            		                driver.close();
		            		                driver.switchTo().window(mwh1);
		            		    }
		            		}
		                }
		                driver.close();
		                driver.switchTo().window(mwh);
		    }
		}
	}
}
