package ATT.Selenium_FVT.Pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ATT.Selenium_FVT.Components.ManageShortCodeTab;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;

public class AppPage extends WebPage {

	// Page Object "Edit Button"
	//	@FindBy(id="edit_app_button")
	@FindBy(css="a.myappsinfo")
	public WebElement editApp;

	@FindBys({@FindBy(css="div#content div.inner div.full header.resourceheader div.details"),@FindBy(xpath = "p[2]/span")})
	public WebElement clientID;

	@FindBy(className="icn-key")
	public WebElement key;

	@FindBy(className="icn-secret")
	public WebElement secret;

	@FindBy(className="signout")
	public WebElement sign_out;

	@FindBy(linkText="Manage Shortcodes")
	public WebElement manageShortCode;

	@FindBy(id="comma_separated_shortcodes")
	public WebElement ShortCode;

	@FindBy(id = "confirmationDeleteButton")
	public WebElement confirmdelete;

	@FindBy(xpath ="//input[@value='Request Production Access']")
	public WebElement reqprod;

	@FindBy(css ="li.production > a")
	public WebElement prodtabbutton;

    //Page Object " API Range From Date" -Hemant    
    @FindBy(xpath="//*[@id='content']/div/div[3]/section[1]/ul/li[1]/a") 
    public WebElement SandBoxAPIAnalytics;

    //Page Object " API Range From Date" -Hemant
    @FindBy(id="adv-analytics-api-form-from")
    public WebElement dtRangeFromDetail;
    
    //Page Object "API Range To Date" -Hemant
    @FindBy(id="adv-analytics-api-form-to")
    public WebElement dtRangeToDetail;
    
    //Page Object "Done button of calender object"- Hemant
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[2]/button[2]")
    public WebElement btnDoneCal;
    
    //Page Object "API Export CSV" -Hemant
    //@FindBy(xpath="//a[contains(text(),'Export CSV')]")
    @FindBy(xpath="//*[@id='app-list']/div[1]/div/form/div[1]/span[2]/div/div/span[1]/a")
    public WebElement btnExportCSV;

    //Page Object "API Update Button" -Hemant
    //@FindBy(xpath="//a[contains(text(),'Export Excel')]/../../span[3]/a")
    @FindBy(className = "update")                                           
    public WebElement btnRefreshDetail;


    //Page Object "APIs DropDown" -Hemant
    @FindBy(id="analytics-api-form-trend")
    public WebElement ddAPIs;
    
    
    //Page Object "ADV Analytics" - Hemant

    @FindBy(xpath = "//*[@id='content']/div/div[3]/section[2]/ul/li[3]/a") 
    public WebElement btnADVAnalytics;



    //Page Object "All Apps Advertising Analytics Heading" - Hemant
    @FindBy(className = "title") 
    public WebElement lblAppADVAnalytics;
    
    
    //Page Object "ADV Export Button" -Hemant
    @FindBy(className = "export")
    public WebElement btnADVExport;
                 
    
    //Page Object "View DropDown" -Hemant
    @FindBy(id="analytics-api-form-view")
    public WebElement ddView;
    
    //Page Object "By DropDown" -Hemant
    @FindBy(id="chart")
    public WebElement ddByChart;


    //Page Object "API Export Excel" -Hemant
    //@FindBy(xpath="//a[contains(text(),'Export Excel')]")
    @FindBy(xpath="//*[@id='app-list']/div[1]/div/form/div[1]/span[2]/div/div/span[2]/a")                                  
    public WebElement btnExportExcel;

    //Page Object "Request For Production Access"
    @FindBy(xpath="//*[@id='content']/div/div[3]/section[1]/ul/li[2]/div/a/input")                                  
    public WebElement reqForProdAccess;

    //Page Object "Request For Production Access"
    @FindBy(xpath="//*[@id='content']/div/div[2]/form[1]/input")                                  
    public WebElement reqForProdAccessCommit;
  
    //Page Object "Production"
    @FindBy(xpath="//*[@id='content']/div/div[3]/section[1]/ul/li[2]/a")                                  
    public WebElement production;
     
	public AppPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openURL() {
		// TODO Auto-generated method stub

	}

	/* method to click on Edit App page */
	public EditAppPage clickEditApp(){
		editApp.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, EditAppPage.class);		

	}


	/* method to click on Delete an App page */
	public void deleteSandboxApp(){                           
		driver.findElement(By.xpath("//a[contains(@class,'Sandbox myappsinfo') and contains(@original-title,'Trash')]")).click(); 
		waitForAjaxInactivity();
		
		driver.findElement(By.id("confirmationDeleteButton")).click();
		waitForAjaxInactivity();
		waitForPageToLoad();    
	}

	/*Method to find app exists on My app page by clicking on next button*/
	public boolean validateisAppExist(String appname){
		//	 WebElement navPath = driver.findElement(By.xpath("//*[@id='app-list']/nav"));


		do{
			System.out.println("a");

		}while(driver.findElement(By.xpath("//*[@id='app-list']/nav")).findElement(By.className("next")).findElement(By.tagName("a")).isDisplayed());

		return true;

		//	 WebElement next = null;
		//	 WebElement lnkNext = null;
		//	 if(driver.findElement(By.xpath("//*[@id='app-list']/nav")) != null){
		//		 WebElement navPath = driver.findElement(By.xpath("//*[@id='app-list']/nav"));
		//		 next = navPath.findElement(By.className("next"));
		//	 }
		//	 if(next != null ){
		//		 lnkNext = next.findElement(By.tagName("a"));
		//	 }
		//	
		//	 WebElement app = driver.findElement(By.linkText(appname));
		//	do{
		//    	if(app.isDisplayed()){
		//    	return true;	
		//    		
		//    	//System.out.println("App is not deleted");
		//    	}
		//    	else if(lnkNext !=null && lnkNext.isDisplayed()){ 
		//		 lnkNext.click();
		//		 
		//	 //   System.out.println(driver.getCurrentUrl());
		//	 //   System.out.println("********************************************");
		//    	} 
		//    	
		//	}while(lnkNext !=null && lnkNext.isDisplayed() &&
		//			 !app.isDisplayed());
		//	 return false; 
	}   	
	
	
		/*Method to validate that Added API via Edit App page is successfully displayed on App detail page */

	public void isApiEdited(String Api){
		//List<WebElement> api =	driver.findElement(By.className("details_apis")).findElement(By.className("details_services")).findElements(By.tagName("span"));
		//List<WebElement> api =	driver.findElement(By.className("app-list")).findElement(By.className("appgroup box w960")).findElements(By.tagName("span"));
		List<WebElement> api = driver.findElements(By.cssSelector("span.details_services"));
			String s= api.get(0).getText();
			if(s.contains(Api.toUpperCase())){
				storeVerificationResults(true, "API - "+Api+" Added");			
			}
			else{
				storeVerificationResults(false, "API - "+Api+" not Added");
			}
		
		//System.out.println(s);
		publishTestResult();
	}

	public void validateProdAccess(){
		if(prodtabbutton.isDisplayed()){
			prodtabbutton.click();
			waitForPageToLoad();
			if(driver.findElement(By.id("app-details")).isDisplayed()){
				
				storeVerificationResults(true, "App is promoted to Production");	
			}
			else
			{
				storeVerificationResults(false, "There was some error while Promoting app to Production");
			}
			
		}
		else{
			storeVerificationResults(false, "There was some error while Promoting app to Production");
		}
	}


	/** ====================================== Methods written by  Binny =============================================== */
	/*Method to Validate App Creation*/
	public void validateAppCreation(String appname){

		try{
			//WebElement newappname = driver.findElement(By.id("location_header")).findElement(By.xpath(strAppName));
			String name= driver.findElement(By.cssSelector("div.details_header > span.title")).getText();
			String successMsg= driver.findElement(By.cssSelector("div.alert-box.notice")).getText();
			if (successMsg.contains("Successfully created application") && name.equalsIgnoreCase(appname))
				storeVerificationResults(true, "App Successfully Created");
			else
				storeVerificationResults(false, "App is not created");		
			
		} catch(Exception e){
			e.printStackTrace();
		}

	}
	
	/*Method to Validate App Creation for Advertising */
	public void validateAppCreation_Adv(String appname){

		try{
			//WebElement newappname = driver.findElement(By.id("location_header")).findElement(By.xpath(strAppName));
			String name= driver.findElement(By.cssSelector("div.details_header > span.title")).getText();
			String successMsg= driver.findElement(By.cssSelector("div.alert-box.warning")).getText();
			if (successMsg.contains("Please note that you have selected the Advertising API, and provisioning for this API is in progress. Please check back in 10 minutes to see if API has been successfully provisioned.")
					&& name.equalsIgnoreCase(appname))
				storeVerificationResults(true, "App Successfully Created");
			else
				storeVerificationResults(false, "App is not created");		
			/*
			if (name.equalsIgnoreCase(appname))
				storeVerificationResults(true, "App Successfully Created");
			else
				storeVerificationResults(false, "App is not created");
			//	return newappname.isDisplayed();
*/		} catch(Exception e){
			e.printStackTrace();
		}

	}
	
	/*Method to validate that Added API via Edit App page is successfully displayed on App detail page */

	public void isApiAdded(String Api){
//.		List<WebElement> api =	driver.findElement(By.className("details_apis")).findElement(By.className("details_services")).findElements(By.tagName("span"));
		List<WebElement> api = driver.findElements(By.cssSelector("span.details_services"));


		//List<WebElement> api =	driver.findElement(By.className("app-list")).findElement(By.className("appgroup box w960")).findElements(By.tagName("span"));
		
		
			String s= api.get(0).getText();
			

			if(s.contains(Api.toUpperCase())){
				storeVerificationResults(true, "API - "+Api+" Added");
			}
			else
			{
			storeVerificationResults(false, "API - "+Api+" not Added");
			}
		
		//System.out.println(s);

	}

/* Method to Publish test result*/
	
	public void displayTestResult(){
		publishTestResult();
	}
	
	
	/** ====================================== Methods written by  Binny =============================================== */	

	public ReqProdAccessPage clkReqToProd(){
		reqprod.click();
		waitForPageToLoad();	
		return PageFactory.initElements(driver, ReqProdAccessPage.class);	
	}

	public void clkProdTab(){
		prodtabbutton.click();
		waitForPageToLoad();
		implicitWait(5);
	}
	public boolean isEditAppButtonDisplayed(){
		return waitForElement(editApp).isDisplayed();
	}

	public String getClientID(){
		return waitForElement(clientID).getText();
	}

	public String getAppSecret(){
		return waitForElement(secret).getText();
	}

	public boolean isClientIdDisplayed(){
		return clientID.isDisplayed();
	}

	public boolean isSecretDisplayed(){
		return secret.isDisplayed();
	}

	public void isSIPAddressDisplayed(){

		validateWebElementDisplayed(driver.findElement(By.xpath("//div[@id='content']/div/div[2]/section[2]/div/header/div/table/tbody/tr[4]/td/strong")));

	}

	public String getAppKey(){
		return waitForElement(key).getText();

	}

	public void getSIPAddress(){
		WebElement element = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/section[2]/div/header/div/table/tbody/tr[4]/td/strong"));

		validateText(element, "N/A");		
	}

	/*public void getSIPAddress(){
		String address = waitForElement(driver.findElement(By.xpath("//div[@id='content']/div/div[2]/section[2]/div/header/div/table/tbody/tr[4]/td/strong"))).getText();
		if (address.equals("NA"))
			System.out.println("Test Case Pass - NA is displayed in SIP Address field ");
		else
			System.out.println("Test Case Fail - NA is not displayed in SIP Address field ");
	}*/

	public void requestForProductionAccess(){
		reqForProdAccess.click();
		waitForPageToLoad();
		reqForProdAccessCommit.click();
		waitForPageToLoad();
		production.click();
		waitForPageToLoad();		
	}
	
	public ManageShortCodeTab selectManageShortCodeTab(){
		manageShortCode.click();
		implicitWait(5);
		return new ManageShortCodeTab(driver, driver.findElement(By.cssSelector("div.tabscontent.manageshortcodes")));
	}


	public void printResult(){
		publishTestResult();

	}


	//Procedure to wait for specified milliseconds
	public void wait(int ms){
		try {					
			Thread.sleep(ms);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

    //Function to Click on Sandbox Tab or Production Tab based on selection- Heamnt 
    //***********************************************************************************************************************************                     
    public boolean fnSelectSandboxProdTabAppDetails(String sTabName){
                  
           if(driver.findElement(By.linkText(sTabName)).isDisplayed()){
                  driver.findElement(By.linkText(sTabName)).click();                   
                  waitForPageToLoad(); 
                  System.out.println("The tab  "+ sTabName + " has been selected");
                  storeVerificationResults(true, "The tab  "+ sTabName + " has been selected");
                  return true;
           }else{
                  System.out.println("The tab  "+ sTabName + "does not exists");
                  storeVerificationResults(false, "The tab  "+ sTabName + "does not exists");
                  return false;
           }
           }
           
    //Function to Click on any link - Hemant
    //***********************************************************************************************************************************                     
    public boolean fnClickOnSpecifiedLink(String sLinkName){
                  
           if(driver.findElements(By.linkText(sLinkName)).size()>1 && driver.findElement(By.linkText(sLinkName)).isDisplayed()){
                  driver.findElement(By.linkText(sLinkName)).click();                  
                  waitForPageToLoad(); 
                  System.out.println("The tab  "+ sLinkName + " has been selected");
                  return true;
           }else{
                  System.out.println("The tab  "+ sLinkName + "does not exists");
                  return false;
           }
    

    }
    
    
    
    
    //Function to Export the export.csv to Temp folder-Hemant 
    //***********************************************************************************************************************************                     
    public void fnExportcsv(String filePathString)
    {
           btnExportCSV.click();
                                      
           //wait for the file to get created
           File f = new File(filePathString);
           f = new File(filePathString);
           int iw;
           iw = 0;
           while(!f.exists() && iw <10){
                  System.out.println("waiting ");
                  wait(2000);
                  iw = iw + 1;
           }
           
           if(f.exists()){                   
                  System.out.println("file is created");
           }else{               
                  System.out.println("file not exists");
           }

    }
    //***********************************************************************************************************************************
    
    
//Function to Click Sandbox API Analytics- Hemant
//***********************************************************************************************************************************                     
    public boolean fnClickOnSandAPIAnalytics(){
                  
           if(SandBoxAPIAnalytics.isDisplayed()){
                  SandBoxAPIAnalytics.click();
                  wait(5000);
                  System.out.println("Sanbox API Analytics has been clicked");
                  return true;
           }else{
                  System.out.println("The Sandbox Analytics tab does not exists");
                  return false;
           }      
    }
//***********************************************************************************************************************************



//Function to select From Date from Range -Hemant 
//***********************************************************************************************************************************                     
    public void fnSetFROMDateAppDetail(String sDate){      
    	
    	try{
            dtRangeFromDetail.clear();
            dtRangeFromDetail.sendKeys(sDate);
            
            if(btnDoneCal.isDisplayed()){
                   btnDoneCal.click();
            }                                 
            wait(2000);
            System.out.println("From date has been selected");
            storeVerificationResults(true, "From date has been selected");
    		
    	}catch(Exception e){
    		e.printStackTrace();
    		storeVerificationResults(false, "Error selecting from date");
    	}
    }      
//***********************************************************************************************************************************


    //Function to select To Date from Range -Hemant 
    //***********************************************************************************************************************************                     
    public void fnSetTODateAppDetail(String sDate){ 
    	
    	try{
            dtRangeToDetail.clear();
            dtRangeToDetail.sendKeys(sDate);
            
            if(btnDoneCal.isDisplayed()){
                   btnDoneCal.click();
            }                                             
            wait(2000);
            System.out.println("To date has been selected");
            storeVerificationResults(true, "To date has been selected");    		
    	}catch(Exception e){
            storeVerificationResults(false, "Error selecting To date");
    	}

    }      
    //***********************************************************************************************************************************

    //Function to Set the start and end date API-Hemant 
    //***********************************************************************************************************************************                     
           public boolean fnSetDateRangeInMyApps(String sStartDate ,String sEndDate){                                                                                    
                  try{
                        //Set the From Date in API Analytics filter
                        
                        //sDate = "8/1/2013 00:00";
                        fnSetFROMDateAppDetail(sStartDate);
                                                                  
                        //Set the To Date in API Analytics filter
                        //sDate = "9/1/2013 00:00";
                        fnSetTODateAppDetail(sEndDate);                                      
                        
                        return true;
                  }catch(Exception e){                                   
                        e.printStackTrace();
                        storeVerificationResults(false, "Date Range set error");
                        return false;
                  }                                        
           }
    //***********************************************************************************************************************************

           //Function to Click on Refresh/Update -Hemant 
           //***********************************************************************************************************************************                     
           public void fnClickRefresh(){   
        	   
        	   try{
                   //Click on Refresh Button
                   btnRefreshDetail.click();                                        
                   int i;
                   i=0;
                   while(i<5){
                         //System.out.println("Wait for trend");
                         wait(2000);
                         i=i+1;
                         storeVerificationResults(true, "Successfully clicked on Refresh");
                   }                    
        		   
        	   }catch(Exception e){
        		   e.printStackTrace();
                   storeVerificationResults(false, "Error on click Refresh");
        	   }
           }      
           //***********************************************************************************************************************************

           
    
           
           
           //Function to select API from API dropdown-Hemant 
           //***********************************************************************************************************************************                     
           public void fnSetAPI(String sAPI){       
                  
                  try{
                        
                        Select s = new Select(ddAPIs);
                        s.selectByValue(sAPI);
                         
                        ddAPIs.sendKeys(sAPI);
                        
                  }catch(Exception e){
                        
                        e.printStackTrace();
                        System.exit(0);
                  }
                  
                  
           }      
           //***********************************************************************************************************************************
           
           
           //Function to select Duration from View dropdown-Hemant 
           //***********************************************************************************************************************************                     
           public void fnSetView(String sView){            
                  Select s = new Select(ddView);
                  s.selectByValue(sView);
           }      
           //***********************************************************************************************************************************
           
           
           //Function to select Daily, hourly from By dropdown-Hemant 
           //***********************************************************************************************************************************                     
           public void fnSetBy(String sBy){         
                  Select s = new Select(ddByChart);
                  s.selectByValue(sBy);
           }      
           //***********************************************************************************************************************************



           

           
           //Function to click on ADV_Analytics link on App Details page and verify before and after clicking -Hemant- 
           //***********************************************************************************************************************************                     
           public void clkADVAnalyticsAlreadyCollapsed(){

                  //Verify Analytics is collapsed
                  
                  boolean flagPresent =validateWebElementPresentBy(By.className("title"));
                       if (flagPresent){
                                             
	                               boolean x =  lblAppADVAnalytics.isDisplayed();	                               
	                               if (!x){
	                                      System.out.println("Pass - ADV-Analytics is collapsed");
	                                      storeVerificationResults(false, "ADV-Analytics is collapsed");	                                      
	                               }else{
	                                      System.out.println("Fail - ADV-Analytics is not collapsed");
	                                      storeVerificationResults(false, "ADV-Analytics is not collapsed");
	                               }                                                      
                        }else{
                        	storeVerificationResults(false, "Advertising Analytics Title is not visible");
                        }
                        
                  //Click on ADV Analytics

                        btnADVAnalytics.click();
                  
                  //wait till data not displayed
                  int i;
                  i=0;
                  while(i<5){
                        //System.out.println("Wait for trend");
                        wait(2000);
                        i=i+1;
                  }             
                  
                  //Verify Analytics is expanded
                  flagPresent = validateWebElementPresentBy(By.className("title"));
                  if(flagPresent ){
                        boolean y =  lblAppADVAnalytics.isDisplayed();
                        if (y){
                               System.out.println("Pass - ADV-Analytics is expanded");
                               storeVerificationResults(true, "ADV-Analytics is expanded");
                        }else{
                               System.out.println("Fail - ADV-Analytics is not expanded");
                               storeVerificationResults(false, "ADV-Analytics is not expanded");
                        }
                  }                    
           }
           //***********************************************************************************************************************************       

           

   		//Function to check ADV_Analytics link is NOT displayed-Hemant- 
   		//***********************************************************************************************************************************			
   		public void clkADVAnalyticsLinkNotDisplayed(){
   			    int size=  driver.findElements(By.xpath("//*[@id='content']/div/div[3]/section[2]/ul/li[3]/a")).size();
   			    
   			    if (size==1){
   			    	
   			    	if(driver.findElement(By.xpath("//*[@id='content']/div/div[3]/section[2]/ul/li[3]/a")).isDisplayed()){
   			    	    storeVerificationResults(false, "Advertising Analytics Link is visible");
   			    	}else{
   			    		storeVerificationResults(true, "Advertising Analytics Link is NOT visible");		    		
   			    	}
   			    	
   			    }else{
   			    	storeVerificationResults(true, "Advertising Analytics Link is NOT visible");
   			    }		
   		}
   		//***********************************************************************************************************************************	

   		//Function to check ADV_Analytics link is displayed-Hemant- 
   		//***********************************************************************************************************************************			
   		public void clkADVAnalyticsLinkDisplayed(){
   					    
   			    int size=  driver.findElements(By.xpath("//*[@id='content']/div/div[3]/section[2]/ul/li[3]/a")).size();
   			    
   			    if (size==1){
   			    	
   			    	if(driver.findElement(By.xpath("//*[@id='content']/div/div[3]/section[2]/ul/li[3]/a")).isDisplayed()){
   			    		storeVerificationResults(true, "Advertising Analytics Link is visible");
   			    	}else{			    		
   			    	    storeVerificationResults(false, "Advertising Analytics Link is NOT visible");
   			    	}
   			    	
   			    }else{
   			    	storeVerificationResults(false, "Advertising Analytics Link is NOT visible");
   			    }		
   		}
   		//***********************************************************************************************************************************	
   		
           
           
           
           
           
           
           //Function to Export the export.xlsx to Temp folder for Advertising-Hemant 
           //***********************************************************************************************************************************                     
           public void fnExportFileADV(String filePathString)
           {
                  btnADVExport.click();
                  
                               
                  //wait for the file to get created
                  File f = new File(filePathString);
                  f = new File(filePathString);
                  int iw;
                  iw = 0;
                  while(!f.exists() && iw <10){
                        System.out.println("waiting ");
                        wait(2000);
                        iw = iw + 1;
                  }
                  
                  if(f.exists()){                   
                        System.out.println("file is created");
                  }else{               
                        System.out.println("file not exists");
                  }

           }
           //***********************************************************************************************************************************


           //Function to Export the export.xlsx to Temp folder-Hemant 
           //***********************************************************************************************************************************                     
           public void fnExportFile(String filePathString)
           {
                  
                  //Delete the existing export.xlsx file from Temp Folder
                  //String filePathString ;
                  //filePathString = "C:\\Temp\\export.xlsx";
                  //DeleteFile(filePathString);

                  
                  btnExportExcel.click();
                  
                               
                  //wait for the file to get created
                  File f = new File(filePathString);
                  f = new File(filePathString);
                  int iw;
                  iw = 0;
                  while(!f.exists() && iw <10){
                        System.out.println("waiting ");
                        wait(2000);
                        iw = iw + 1;
                  }
                  
                  if(f.exists()){                   
                        System.out.println("file is created");
                  }else{               
                        System.out.println("file not exists");
                  }

           }
           //***********************************************************************************************************************************

           
           
           
}