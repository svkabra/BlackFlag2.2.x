package ATT.Selenium_FVT.Components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import ATT.Selenium_FVT.Utilities.Component.Component;

public class ManageShortCodeTab extends Component{
	
	WebElement me;
	
	//WebElement shortCodeNewForm = me.findElement(By.id("shortcode_form_cont")).findElement(By.id("new_shortcode"));

	public ManageShortCodeTab(WebDriver driver, WebElement manageShortCode) {
		super(driver);
		me = manageShortCode;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isDispalyed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	//method to click Add button
	public void clickAddShortCode(){
		implicitWait(2);
		me.findElement(By.className("add_shortcode")).click();
		waitForAjaxInactivity();
		
	}
	
	//method to click Edit button
	public void clickEditShortCode(){
		implicitWait(2);
		me.findElement(By.id("edit_shortcode_btn_4255")).click();
		waitForAjaxInactivity();
		
	}
	
	//method to select ShortCode Rating
	public void selectShortCodeRating(String ratingOption){
		Select rating = new Select(me.findElement(By.id("shortcode_rating")));
		rating.selectByValue(ratingOption);
		waitForAjaxInactivity();
	}
	
	//method to select ShortCode Type
	public void selectShortCodeType(String typeOption){
		Select rating = new Select(me.findElement(By.id("shortcode_shortcode_type")));
		rating.selectByValue(typeOption);
		waitForAjaxInactivity();
		}
	
	@FindBy(id="shortcode_description")
	WebElement shortCodeDescription;
	
	@FindBy(id="shortcode_sms_mobile_originated_uri")
	WebElement smsMoUri;
	
	@FindBy(id="shortcode_sms_delivery_notification_uri")
	WebElement smsDeliveryNotificationUri;
	
	@FindBy(id="shortcode_mms_mobile_originated_uri")
	WebElement mmsMoUri;
	
	@FindBy(id="shortcode_mms_delivery_notification_uri")
	WebElement mmsDeliveryNotificationUri;
	
	@FindBy(id="shortcode_shortcode")
	WebElement customShortCode;
	
	@FindBy(id="shortcode_shortcode_type")
	WebElement shortCodeType;
	
	@FindBy(id="shortcode_rating")
	WebElement shortCodeRating;
	
	@FindBy(xpath="//*[@id='gridMenuPage']/div[4]/div[1]/div/div[1]/h2")
	WebElement addShortCodeButton;
	
	@FindBy(xpath="//button[starts-with(@id, 'edit_shortcode_btn')]")
	WebElement editShortCodeButton;
	
	@FindBy(xpath="//button[starts-with(@id, 'remove_shortcode_btn")
	WebElement removeShortCodeButton;
	
	@FindBy(xpath="//*[@id='new_shortcode']/div[2]/div[4]/div[2]/span")
	WebElement SMS_MO_URI_errormsg;
	
	@FindBy(xpath="//*[@id='new_shortcode']/div[2]/div[4]/div[4]/span")
	WebElement MMS_MO_URI_errormsg;
	
	@FindBy(xpath="//*[@id='new_shortcode']/div[2]/div[4]/div[3]/span")
	WebElement SMS_DN_URI_errormsg;
	
	@FindBy(xpath="//*[@id='new_shortcode']/div[2]/div[4]/div[5]/span")
	WebElement MMS_DN_URI_errormsg;
	
	@FindBy(xpath="//*[@id='new_shortcode']/div[2]/div[4]/div[5]/span")
	WebElement CSCA_Link;
	
	
	
	//method to validate SMS MO URI field error message is displayed
	public void SMSMobileOriginatedURIErrorMsgValidation(){
			
			validateWebElementDisplayed(SMS_MO_URI_errormsg);
						
		}
	//method to validate MMS MO URI field error message is displayed
	public void MMSMobileOriginatedURIErrorMsgValidation(){
				
			validateWebElementDisplayed(MMS_MO_URI_errormsg);
							
		}
	
	//method to validate SMS Delivery Notification URI errors messages is displayed
	public void SMSDeliveryNotificationURIErrorMsgValidation(){
		
		validateWebElementDisplayed(SMS_DN_URI_errormsg);
					
	}
	
	//method to validate MMS Delivery Notification URI errors messages is displayed
	public void MMSDeliveryNotificationURIErrorMsgValidation(){
			
			validateWebElementDisplayed(MMS_DN_URI_errormsg);
						
		}
	
		
	//method to enter ShortCode Description
	public void enterShortCodeDescription(String description){
		
		driver.findElement(By.id("shortcode_rating")).sendKeys(Keys.TAB);
		implicitWait(2);
		shortCodeDescription.click();
		shortCodeDescription.sendKeys(description);
	}
	
	//method to enter Custom Shortcode
		public void enterCustomShortCode(String customShortCodes){
			
			customShortCode.sendKeys(customShortCodes);
			
		}
	
	//method to validate short code description field is displayed
	public void ShortCodeDescriptionDisplayed(){
		
		validateWebElementDisplayed(shortCodeDescription);
		
	}
	
	//method to enter SMS MO URI
	public void enterSMSMobileOriginatedURI(String originatedURI){
		
		
		smsMoUri.sendKeys(originatedURI);
		
	}
	
	//method to validate SMS MO URI field is displayed
	public void SMSMobileOriginatedURIValidation(){
		
		validateWebElementDisplayed(smsMoUri);
		
	}
	
	//method to enter SMS Delivery Notification URI
	public void enterSMSNotificationURI(String notificationURI){
		
		
		smsDeliveryNotificationUri.sendKeys(notificationURI);
	}
	
	//method to validate SMS Delivery Notification URI is displayed
	public void SMSNotificationURIDisplayed(){
		
		validateWebElementDisplayed(smsDeliveryNotificationUri);
	}
	
	//method to enter MMS MO URI
	public void enterMMSMobileOriginatedURL(String originatedURI){
		
		
		mmsMoUri.sendKeys(originatedURI);
		
	}
	
	//method to validate MMS MO URI is displayed
	public void MMSMobileOriginatedURL(){
		validateWebElementDisplayed(mmsMoUri);
		
	}
	
	//method to enter MMS Delivery Notification URI
	public void enterMMSNotificationURI(String notificationURI){
		
		driver.findElement(By.xpath("String")).sendKeys(Keys.TAB);
		mmsDeliveryNotificationUri.sendKeys(notificationURI);
	}
	
	//method to validate MMS Delivery Notification URI is displayed
	public void MMSNotificationURIDisplayed(){
		validateWebElementDisplayed(mmsDeliveryNotificationUri);
	}
	
	//method to return offline Shortcode
	public String getOfflineShortCode(){
		implicitWait(10);
		return me.findElement(By.className("shortcodetable")).findElement(By.xpath("table/tbody/tr[2]/td[4]")).getText();
		
	}
	
	//method to return online Shortcode
	public String getOnlineShortCode(){
		implicitWait(10);
		return me.findElement(By.className("shortcodetable")).findElement(By.xpath("table/tbody/tr[3]/td[4]")).getText();
	}
	
	//method to return Type of Shortcode
	public String getTypeOfShortCode(){
		implicitWait(10);
		return me.findElement(By.className("shortcodetable")).findElement(By.xpath("table/tbody/tr/td")).getText();
		
	}
	
	//method to return Type of Shortcode
	public String getRatingOfShortCode(){
		implicitWait(10);
		return me.findElement(By.className("shortcodetable")).findElement(By.xpath("table/tbody/tr/td[2]")).getText();
				
	}
	
	//method to validate the Type of ShortCode
	public void validateTypeOfShortCode(String typeGenerated, String typeActual){
		
        if (typeGenerated.equalsIgnoreCase(typeActual))
            storeVerificationResults(true, "ShortCode Type matched");
      else
            storeVerificationResults(false, "ShortCode Type not matched");

	}
	
	//method to validate the Type of ShortCode
	public void validateRatingOfShortCode(String ratingGenerated, String ratingActual){
			
	        if (ratingGenerated.equalsIgnoreCase(ratingActual))
	            storeVerificationResults(true, "ShortCode Rating matched");
	      else
	            storeVerificationResults(false, "ShortCode Rating not matched");

		}
	
	//method to validate ShortCode Added
		public void validateShortCodeAdded(String shortCode){
				
		        if (shortCode != "")
		            storeVerificationResults(true, "ShortCode Added");
		      else
		            storeVerificationResults(false, "ShortCode not Added");

			}
	
		//method to verify that only Standard Present in the Rating DropDown box
				public boolean verifyRatingStandardMmsApp(){
						try {
					            selectShortCodeRating("zero_rated");
					            storeVerificationResults(false, "zero_rated Rating Found");
					            return false;
				        } catch (org.openqa.selenium.NoSuchElementException e) {
					        selectShortCodeRating("standard");
					        storeVerificationResults(true, "zero_rated Rating not Found");
				        	return true;
					        }
					}
			

	//method to save ShortCode details
	public void clickCSCA_Link(){
		me.findElement(By.linkText("CSCA")).click();
		
			waitForAjaxInactivity();
			
			implicitWait(2);
			String titleCaptured = driver.getTitle();
			System.out.println(titleCaptured);
			String titleActual = "Common Short Codes | Get a Short Code & Grow Mobile Marketing Revenue";
			if(titleCaptured.equalsIgnoreCase(titleActual)){
			 	   
		 	    storeVerificationResults(true, "Page Title displayed");
		 	   
		 	    }else{
		 	          
		 	          storeVerificationResults(false, "Page Title not displayed");
		 	   }
		}
		
	//method to save ShortCode details
	public void saveShortCodeDetails(){
		me.findElement(By.id("submit_shortcode")).click();
		waitForAjaxInactivity();
	}
	
	//method to save ShortCode details
		public void cancelShortCodeDetails(){
			me.findElement(By.id("cancel_shortcode")).click();
			waitForAjaxInactivity();
		}

	//method to validate Edit Button
		public void validateEditButton(){
			
		//	validateWebElemetDisplayed(Edit);
		}
		
		
	//method to report test result
		public void testResult(){
			
			publishTestResult();
		}
}
