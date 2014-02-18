package ATT.Selenium_FVT.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ATT.Selenium_FVT.Utilities.Browser.WebPage;


public class OrganizationDetailsPage extends WebPage {

	public OrganizationDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		
	@Override
	public void openURL() {
		//driver.get(APIM_URL);
		
		driver.manage().deleteAllCookies();

        driver.manage().window().maximize(); 

		driver.navigate().to("https://devpgm-uat-app.eng.mobilephone.net/developer/forward.jsp?passedItemId=100006");
		waitForPageToLoad();
		PageFactory.initElements(driver, this);
		
	}
	
	//Page Object "Organization Details" header 
			@FindBy(how=How.ID, using="tier2header")
			private WebElement orgDetailsheader;


	//Page Object "Org Name" text box 
			@FindBy(how=How.ID, using="org_name")
			private WebElement orgNametxtbox;
			
	//Method to validate field is pre populated and non editable
			
			
	//Page Object "Org Address1" text box 
			@FindBy(how=How.ID, using="org_address_1")
			private WebElement orgAddress_1;
			
	//Page Object "Org Address2" text box 
			@FindBy(how=How.ID, using="org_address_2")
			private WebElement orgAddress_2;
			
	//Page Object "Org City" text box 
			@FindBy(how=How.ID, using="org_city")
			private WebElement orgCity;
			
	//Page Object "Org State" text box 
			@FindBy(how=How.ID, using="state_dropdown")
			private WebElement orgState;
			
	//Page Object "Org Country" text box 
			@FindBy(how=How.ID, using="country_dropdown")
			private WebElement orgCountry;
			
	//Page Object "Org Postal Code" text box 
			@FindBy(how=How.ID, using="org_postal_code")
			private WebElement orgPostalCode;
			
	//Page Object "Org Phone" text box 
			@FindBy(how=How.ID, using="org_phone")
			private WebElement orgPhone;
			
	//Page Object "Org Mobile Number" text box 
			@FindBy(how=How.ID, using="org_mobile_number")
			private WebElement orgMobileNumber;
			
	//Page Object "Org Business Email" text box 
			@FindBy(how=How.ID, using="org_business_email")
			private WebElement orgEmail;
			
	//Page Object "Org Website" text box 
			@FindBy(how=How.ID, using="org_website")
			private WebElement orgWebsite;
			
	//Page Object "Org Industry" text box 
			@FindBy(how=How.ID, using="industry_dropdown")
			private WebElement orgIndustry;
			
	//Page Object "Org Business Description" text box 
			@FindBy(how=How.ID, using="org_business_description")
			private WebElement orgDescription;
			
	//Page Object "Org Employee number" text box 
			@FindBy(how=How.ID, using="org_employee_number_dropdown")
			private WebElement orgEmpNumber;
			
	//Page Object "Org Duns Number" text box 
			@FindBy(how=How.ID, using="org_duns_dropdown")
			private WebElement orgDunsNumber;
			
	//Page Object "Org Revenue" text box 
			@FindBy(how=How.NAME, using="org_revenue_dropdown")
			private WebElement orgRevenue;
			
	//Page Object "Org Name" text box 
			@FindBy(how=How.ID, using="updateButton")
			private WebElement updateButton;
			
			
	//***********************************************Rohit******************************************
			
			//Page Object "Org Name" text box 
			@FindBy(how=How.XPATH, using="//*[@id='serverMessage']/div/div")
			private WebElement savedChangesMessage;
			
			
			//method to validate the saved changes
			public void validateSavedChangesMessage(){
				
				validateWebElementDisplayed(savedChangesMessage);
			}
			
			//method to validate Annual Revenue field requires valid input
			public void annualRevenue_validate(){
				
				String messageCaptured = driver.findElement(By.xpath("//*[@id='manage_organization_form']/div/div[2]/div[5]/div/div[7]/label[2]")).getText();
				
				String messageActual = "[Organization.revenue.Null.message]";		
				
				if(messageActual==messageCaptured){
				 	   
			 	    storeVerificationResults(true, "Error Message is displayed");
			 	   
			 	    }else{
			 	          
			 	          storeVerificationResults(false, "Error Message is not displayed");
			 	   }
				
				
			}
			

			//method to validate DUNS field is mandatory
			public void DUNS_validate(){
				
				String messageCaptured = driver.findElement(By.xpath("//*[@id='manage_organization_form']/div/div[2]/div[5]/div/div[6]/label[2]")).getText();
				
				String messageActual = "Please enter a DUNS Number.";					
				

				if(messageCaptured.equalsIgnoreCase(messageActual)){
				 	   
			 	    storeVerificationResults(true, "Error Message is displayed");
			 	   
			 	    }else{
			 	          
			 	          storeVerificationResults(false, "Error Message is not displayed");
			 	   }
			}
			
			
			
			
	//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$----------------------------------$$$$$$$$$$$$$$$$$$$$$$$$$$$		
			
			
			public ManageMyAcct managemyacct(){
				waitForPageToLoad();
				return PageFactory.initElements(driver, ManageMyAcct.class);
			}
			
	//method to select value from dropdown
			public void numbrofemployees_dropdown( int a){
				
				WebElement select = driver.findElement(By.id("org_employee_number_dropdown"));								
				Select s1 = new Select(select);
			    s1.selectByIndex(a);			    		    
			    implicitWait(2);  			
							
			    
		}
			
			public APIMLoginPage apimLoginPage(){
				waitForPageToLoad();
				return PageFactory.initElements(driver, APIMLoginPage.class);
			}
			
	//method to click on Update Button
			public void clickUpdate(){
				
				updateButton.click();
				waitForPageToLoad();
			}
				
	
	//method to select value from dropdown
			public void annualRevenue_dropdown( int a){
				waitForElement(orgRevenue);
				
				WebElement select = orgRevenue;	
				
				Select s1 = new Select(select);
				
			    s1.selectByIndex(a);
			    			    		    
			    implicitWait(2);  									
			    
		}
			
	//method to validate Number of Employees Field is displayed
			public void field_Displayed(){
				
				validateWebElementDisplayed(orgEmpNumber);
				
				validateWebElementDisplayed(updateButton);
				
				//String errorMessage1 = readVerificationResults(false);
			   // String successMessage1 = readVerificationResults(true);
			    
			    //boolean testIterationFailure = false;
				//if(errorMessage1.length()>2){
			         //  System.out.println("\nStatus: FAILED "+"\nFailure were: "+errorMessage1+"\nSuccess were: "+successMessage1);
			         //  testIterationFailure=true;
			    // }else if(successMessage1.length()>2){
			   // System.out.println("\nStatus: PASSED "+"\nSuccess were: "+successMessage1);
			    //testIterationFailure=false;
			//}     
				
				//if(testIterationFailure)
	                //  Assert.assertTrue("There were failures in test iterations. Refer logs.", false);
				
				
			}
			
public void field_Enabled(){
				
				
				validateWebElementEnabled(orgEmpNumber);
				
				validateWebElementEnabled(orgRevenue);										
				
				//String errorMessage1 = readVerificationResults(false);
			    //String successMessage1 = readVerificationResults(true);
			    
			    //boolean testIterationFailure = false;
				//if(errorMessage1.length()>2){
			         //  System.out.println("\nStatus: FAILED "+"\nFailure were: "+errorMessage1+"\nSuccess were: "+successMessage1);
			          // testIterationFailure=true;
			    // }else if(successMessage1.length()>2){
			    //System.out.println("\nStatus: PASSED "+"\nSuccess were: "+successMessage1);
			  //  testIterationFailure=false;
			//}     
				
				//if(testIterationFailure)
	                 // Assert.assertTrue("There were failures in test iterations. Refer logs.", false);
				
				
			}
				
public void field_Prepopulated(){
	
	validateWebElementPrepopulated(orgNametxtbox);
	
	validateWebElementPrepopulated(orgAddress_1);
	
	//validateWebElementEnabled(OrgAddress_2);
	
	validateWebElementPrepopulated(orgCity);
	
	validateWebElementPrepopulated(orgState);
	
	validateWebElementPrepopulated(orgCountry);
	
	validateWebElementPrepopulated(orgPostalCode);
	
	validateWebElementPrepopulated(orgPhone);
	
	//validateWebElementEnabled(OrgMobileNumber);
	
	validateWebElementPrepopulated(orgEmail);
	
	validateWebElementPrepopulated(orgWebsite);
	
	validateWebElementPrepopulated(orgIndustry);
	
	
	
}
				
			
						
			
			
}
