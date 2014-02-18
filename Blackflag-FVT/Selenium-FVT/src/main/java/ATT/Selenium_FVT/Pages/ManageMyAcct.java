package ATT.Selenium_FVT.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import ATT.Selenium_FVT.Components.OrganizationDetails;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;


public class ManageMyAcct extends WebPage {

	
	public ManageMyAcct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void openURL() {
		//driver.get(APIM_URL);
		driver.navigate().to("APIM_HOME_URL");
		waitForPageToLoad();
		PageFactory.initElements(driver, this);
		
	}
	
		//Page Object "ManageMyAcct" link 
		@FindBy(how=How.XPATH, using="/html/body/div[5]/div/div/div[3]/form/fieldset/a")
		private WebElement ManageMyAcct;

//Page Object "Account Settings" link 
	@FindBy(how=How.LINK_TEXT, using="Account Settings")
	private WebElement AcctSettings;

//Page Object "Organization Details" link 
	@FindBy(how=How.LINK_TEXT, using="Organization Details")
	private WebElement OrgDetails;
	
//Page Object "Organization Details" link 
	@FindBy(how=How.LINK_TEXT, using="Edit Organization Details")
	private WebElement editOrgDetails;
	
//Page Object "Manage Legal Agreements" link 
	@FindBy(how = How.LINK_TEXT, using = "Manage Legal Agreements")
	private WebElement LegalAgreements;

//Page Object "Setup Merchant Account" link 
	@FindBy(how = How.LINK_TEXT, using = "Setup Merchant Account")
	private WebElement SetupMerAcct;



//Page Object "Community Profile" link 
	@FindBy(how = How.LINK_TEXT, using = "Community Profile")
	private WebElement CommunityProfile;
	
//Page Object "Manage Users" link 
	@FindBy(how = How.LINK_TEXT, using = "Manage Users")
	private WebElement ManageUsers;

//Page Object "Add Users" link 
	@FindBy(how = How.LINK_TEXT, using = "Add Users")
	private WebElement AddUsers;
	
	
	//Page Object "Add Users" link 
		@FindBy(how = How.LINK_TEXT, using = "Edit Merchant Details")
		private WebElement editMerchantDetails;
	
//Page Object "My Apps" link 
		@FindBy(how = How.LINK_TEXT, using = "My Apps")
		private WebElement MyApps;	
		
//Page Object "Subscription Details" link 
		@FindBy(how = How.LINK_TEXT, using = "Subscription Details")
		private WebElement SubscriptionDetails;	

//Page Object "Purchase Points" link 
		@FindBy(how = How.LINK_TEXT, using = "Purchase Points")
		private WebElement PurchasePoints;
		
//Page Object "Transaction Usage" link 
		@FindBy(how = How.LINK_TEXT, using = "Transaction Usage")
		private WebElement TransactionUsage;	
		
//Page Object "Manage Credit Card" link 
		@FindBy(how = How.LINK_TEXT, using = "Manage Credit Card")
		private WebElement ManageCreditCard;	

//Page Object "Cancel My Subscription" link 
		@FindBy(how = How.LINK_TEXT, using = "Cancel My Subscription")
		private WebElement CancelMySubscription;
		
//Page Object "Cancel My Subscription" link 
		@FindBy(how = How.ID, using = "cancelButton")
		private WebElement cancelButton;
		

	//Page Object "Upgrade My Subscription Now" link 
		@FindBy(how = How.XPATH, using = "//*[@id='standardBody']/div[10]/div[11]/div/button[1]")
		private WebElement updateMySubscriptionNowButton;
				
				
	//Page Object "Name" header 
			@FindBy(how=How.XPATH, using="//*[@id='edit_merchant_page']/div[2]/div/div/a")
			private WebElement upgradeToPremiumAccessButtonEditMErchantDetailsPage;
		
//To Be Deleted on Confirmation###############################
		//Page Object "Cancel My Subscription" link 
				@FindBy(how = How.LINK_TEXT, using = "Contact Us")
				private WebElement ContactUsLink;
				
		//Page Object "Tool tip"Setup Merchant Account link
				@FindBy(id="lToolTip_10600183")
				private WebElement TooltipMerAcct;	
				
								
		//Method to click on a link
				public void clickOrganizationDetails(){
				
					OrgDetails.click();
					waitForPageToLoad();
					
				}
				
				public APIMLoginPage apimLoginPage(){
					waitForPageToLoad();
					return PageFactory.initElements(driver, APIMLoginPage.class);
				}			
				
//*******Methods*****				
				
		
//Method to click on a link
		public ContactUsPage clickContactUsLink(){
				
			ContactUsLink.click();
			waitForPageToLoad();
			return PageFactory.initElements(driver, ContactUsPage.class);	
			
				}
			
		

//Method to click on "Account Settings"
		public AccountSettingsPage clickAccountSettings(){
			
			AcctSettings.click();
			waitForPageToLoad();

			implicitWait(2);
			String titleCaptured = driver.getTitle();
			System.out.println(titleCaptured);
			String titleActual = "Manage My Account | AT&T Developer Program";
			if(titleCaptured.equalsIgnoreCase(titleActual)){
			 	   
		 	    storeVerificationResults(true, "Page Title displayed");
		 	   
		 	    }else{
		 	          
		 	          storeVerificationResults(false, "Page Title not displayed");
		 	   }
			
			return PageFactory.initElements(driver, AccountSettingsPage.class);	
		}
		
	//Method to click on "Account Settings"
		public void clickEditMerchantDetailsLink(){
					
					editMerchantDetails.click();
					waitForPageToLoad();

					implicitWait(2);
					String titleCaptured = driver.getTitle();
					System.out.println(titleCaptured);
					String titleActual = "Edit Merchant Details";
					if(titleCaptured.equalsIgnoreCase(titleActual)){
					 	   
				 	    storeVerificationResults(true, "Page Title displayed");
				 	   
				 	    }else{
				 	          
				 	          storeVerificationResults(false, "Page Title not displayed");
				 	   }
					
					
				}
		
		
		//Method to click on "My Apps"
			public void clickMyAppsLink(){
						
						MyApps.click();
						waitForPageToLoad();

						implicitWait(2);
						String titleCaptured = driver.getTitle();
						System.out.println(titleCaptured);
						String titleActual = "API Matrix";
						if(titleCaptured.equalsIgnoreCase(titleActual)){
						 	   
					 	    storeVerificationResults(true, "Page Title displayed");
					 	   
					 	    }else{
					 	          
					 	          storeVerificationResults(false, "Page Title not displayed");
					 	   }
						
						
					}
		
		
//Method to click on "Account Settings"
		public ManageLegalAgreementPage clickManageLegalAgreements(){
					
					LegalAgreements.click();
					waitForPageToLoad();
					return PageFactory.initElements(driver, ManageLegalAgreementPage.class);	
				}
		
		
		
//Method to click on Org Details link
		public OrganizationDetailsPage clickOrgDetails(){
			
			OrgDetails.click();
			waitForPageToLoad();
			
			implicitWait(2);
			String titleCaptured = driver.getTitle();
			System.out.println(titleCaptured);
			String titleActual = "Organization Details";
			if(titleCaptured.equalsIgnoreCase(titleActual)){
			 	   
		 	    storeVerificationResults(true, "Page Title displayed");
		 	   
		 	    }else{
		 	          
		 	          storeVerificationResults(false, "Page Title not displayed");
		 	   }
			return PageFactory.initElements(driver, OrganizationDetailsPage.class);
			
		}
		
		
		//Method to click on Edit Organization Details link
		public void clickEditOrgDetails(){
					
					OrgDetails.click();
					waitForPageToLoad();
					
					implicitWait(2);
					String titleCaptured = driver.getTitle();
					System.out.println(titleCaptured);
					String titleActual = "Edit Organization Details";
					if(titleCaptured.equalsIgnoreCase(titleActual)){
					 	   
				 	    storeVerificationResults(true, "Page Title displayed");
				 	   
				 	    }else{
				 	          
				 	          storeVerificationResults(false, "Page Title not displayed");
				 	   }
					
					
				}
		
//method to click Add Users link
		public AddUsersPage clickAddUsers(){
			
			AddUsers.click();
			waitForPageToLoad();
			return PageFactory.initElements(driver, AddUsersPage.class);
		}
		
//method to click Community Profile link
		public CommunityProfilePage clickCommunityProfile(){
			
			CommunityProfile.click();
			waitForPageToLoad();
			implicitWait(2);
			String titleCaptured = driver.getTitle();
			System.out.println(titleCaptured);
			String titleActual = "Community Profile Information at AT&T Developer Program";
			if(titleCaptured.equalsIgnoreCase(titleActual)){
			 	   
		 	    storeVerificationResults(true, "Page Title displayed");
		 	   
		 	    }else{
		 	          
		 	          storeVerificationResults(false, "Page Title not displayed");
		 	   }
			
			
			return PageFactory.initElements(driver, CommunityProfilePage.class);
			
		}
			
//method to click Manage User Link
		public ManageUsersPage clickManageUsersLink(){
			
			ManageUsers.click();
			waitForPageToLoad();
			return PageFactory.initElements(driver, ManageUsersPage.class);
		}
		
//method to click Cancel My Subscription Link
		public CancelMySubscriptionPage clickCancelMySubscriptionLink(){
					
					CancelMySubscription.click();
					waitForPageToLoad();
					implicitWait(2);
					String titleCaptured = driver.getTitle();
					System.out.println(titleCaptured);
					String titleActual = "API Platform & Developer Program FAQ | AT&T Developer";
					if(titleCaptured.equalsIgnoreCase(titleActual)){
					 	   
				 	    storeVerificationResults(true, "Page Title displayed");
				 	   
				 	    }else{
				 	          
				 	          storeVerificationResults(false, "Page Title not displayed");
				 	   }
					
					
					return PageFactory.initElements(driver, CancelMySubscriptionPage.class);
				}
				

//method to click Transaction Usage Link
		public void clickTransactionUsageLink(){
							
						TransactionUsage.click();
						waitForPageToLoad();
						
						implicitWait(10);
						String titleCaptured = driver.getTitle();
						System.out.println(titleCaptured);
						String titleActual = "Transaction Usage";
						if(titleCaptured.equalsIgnoreCase(titleActual)){
						 	   
					 	    storeVerificationResults(true, "Page Title displayed");
					 	   
					 	    }else{
					 	          
					 	          storeVerificationResults(false, "Page Title not displayed");
					 	   }
						
						
						}
//method to click Transaction Usage Link
		public void clickPurchasePointsLink(){
							
						PurchasePoints.click();
						waitForPageToLoad();
						
						implicitWait(10);
						String titleCaptured = driver.getTitle();
						System.out.println(titleCaptured);
						String titleActual = "Purchase Points";
						if(titleCaptured.equalsIgnoreCase(titleActual)){
						 	   
					 	    storeVerificationResults(true, "Page Title displayed");
					 	   
					 	    }else{
					 	          
					 	          storeVerificationResults(false, "Page Title not displayed");
					 	   }
						
						
						}
//method to click Subscription Details Link
		public void clickSubscriptionDetailsLink(){
							
						SubscriptionDetails.click();
						waitForPageToLoad();
						
						implicitWait(10);
						String titleCaptured = driver.getTitle();
						System.out.println(titleCaptured);
						String titleActual = "Subscription Details";
						if(titleCaptured.equalsIgnoreCase(titleActual)){
						 	   
					 	    storeVerificationResults(true, "Page Title displayed");
					 	   
					 	    }else{
					 	          
					 	          storeVerificationResults(false, "Page Title not displayed");
					 	   }
						
						}
			
//method to click Setup Merchant Account Link
		public void clickSetupMerchantAccountLink(){
							
				SetupMerAcct.click();
				waitForPageToLoad();
						
				}
			
//method to click Setup Manage My Credit Card Link
		public void clickManageMyCreditCardLink(){
							
				ManageCreditCard.click();
				waitForPageToLoad();
				updateMySubscriptionNowButton.click();
				implicitWait(10);
				String titleCaptured = driver.getTitle();
				System.out.println(titleCaptured);
				String titleActual = "New Subscription Confirmation";
				if(titleCaptured.equalsIgnoreCase(titleActual)){
				 	   
			 	    storeVerificationResults(true, "Page Title displayed");
			 	   
			 	    }else{
			 	          
			 	          storeVerificationResults(false, "Page Title not displayed");
			 	   }
						
				}
		
		//method to validate cancel button on Update My Subscription Page
				public void validateCancelButtonUpdateMySubscriptionPage(){
									
						cancelButton.click();
						waitForPageToLoad();
												implicitWait(10);
						String titleCaptured = driver.getTitle();
						System.out.println(titleCaptured);
						String titleActual = "Manage My Account";
						if(titleCaptured.equalsIgnoreCase(titleActual)){
						 	   
					 	    storeVerificationResults(true, "Page Title displayed");
					 	   
					 	    }else{
					 	          
					 	          storeVerificationResults(false, "Page Title not displayed");
					 	   }
								
						}
				
				//method to validate "Upgrade to Premium Access" Button is displayed
				public void upgradeToPremiumAccessButtonValidation(){
					
					validateWebElementDisplayed(upgradeToPremiumAccessButtonEditMErchantDetailsPage);
				}
		
		
}