package ATT.Selenium_FVT.Pages;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ATT.Selenium_FVT.Components.CreateAnApp;
import ATT.Selenium_FVT.Utilities.Browser.WebPage;
import ATT.Selenium_FVT.Utilities.Excel.ReadXLSX;

public class MyAppsPage extends WebPage {
	
	public static final String MY_APPS_URL ="https://devpgm-f3t-apimatrix.api-dev.mars.bf.sl.attcompute.com/apps";
	
	
	//Page Object "API Analytics"
	@FindBy(id= "all_apps_analytics")
	public WebElement apiAnalytics;
	
	//Page Object "Advertising Analytics"
	@FindBy(id= "all_adv_apps_analytics")
	public WebElement advAnalytics;
	// Page Object "APIs"
	@FindBy(how = How.LINK_TEXT, using = "APIs")
	public WebElement apiLink;
	
	// Page Object "Tutorials"
	@FindBy(how = How.LINK_TEXT, using = "Tutorials")
	public WebElement tutorialsLink;
	
	// Page Object "Sample Apps"
	@FindBy(how = How.LINK_TEXT, using = "Sample Apps")
	public WebElement sampleAppsLink;
	
	// Page Object "Console"
	@FindBy(how = How.LINK_TEXT, using = "API Console")
	public WebElement consoleLink;
	
	// Page Object "Docs"
	@FindBy(how = How.LINK_TEXT, using = "Docs")
	public WebElement DocsLink;
	
	// Page Object "My Apps"
	@FindBy(how = How.LINK_TEXT, using = "My Apps")
	public WebElement myAppsLink;
	
	// Page Object "Pricing"
	@FindBy(how = How.LINK_TEXT, using = "Pricing")
	public WebElement pricingLink;
	
	// Page Object "Log A Ticket"
	@FindBy(how = How.LINK_TEXT, using = "Submit a Ticket")
	public WebElement logTicketLink;			
	
	@FindBy(css="div#link-nav div#link-nav-content div#links ul li[3] a")
	public WebElement createAnApp;
	
	// Page Object "Upgrade to full access"
	@FindBy(css="input.btn-darkblue")	
	public WebElement upgardeToFullAccess;
	
	//Page Object "Setup New Application"
	@FindBy(id= "add_an_resource")
	public WebElement setupNewApp;
	
	//Page Object "Setup New Application"
	@FindBy(how = How.LINK_TEXT, using = "Call Management")
	public WebElement AppName;


	//Page Object "API-Analytics" - Hemant
    @FindBy(id="all_apps_analytics")
    public WebElement btnAppAnalytics;
    
    //Page Object "ADV Analytics" - Hemant
    @FindBy(id = "all_adv_apps_analytics") 
    public WebElement btnADVAnalytics;
    
    //Page Object "All Apps Advertising Analytics Heading" - Hemant
    @FindBy(xpath = "//*[@id='app-list']/div[1]/div/form/div[1]/span[1]") 
    public WebElement lblAllApsADVAnalytics;
           
    
    //Page Object " API Range From Date" -Hemant
    @FindBy(id="analytics-api-form-from")
    public WebElement dtRangeFrom;
    
    //Page Object "API Range To Date" -Hemant
    @FindBy(id="analytics-api-form-to")
    public WebElement dtRangeTo;
    
    //Page Object "APIs DropDown" -Hemant
    @FindBy(id="analytics-api-form-trend")
    public WebElement ddAPIs;
    
    //Page Object "View DropDown" -Hemant
    @FindBy(id="analytics-api-form-view")
    public WebElement ddView;
    
    //Page Object "By DropDown" -Hemant
    @FindBy(id="chart")
    public WebElement ddByChart;
    
    //Page Object "API Update Button" -Hemant
    //@FindBy(xpath="//a[contains(text(),'Export Excel')]/../../span[3]/a")
    @FindBy(xpath="//*[@id='app-list']/div[1]/div/form/div[1]/span[2]/div/div/span[3]/a")    
    public WebElement btnRefresh;
           
    
    //Page Object "API Export Excel" -Hemant
    //@FindBy(xpath="//a[contains(text(),'Export Excel')]")
    @FindBy(xpath="//*[@id='app-list']/div[1]/div/form/div[1]/span[2]/div/div/span[2]/a")                                   
    public WebElement btnExportExcel;


    //Page Object "API Export CSV" -Hemant
    //@FindBy(xpath="//a[contains(text(),'Export CSV')]")
    @FindBy(xpath="//*[@id='app-list']/div[1]/div/form/div[1]/span[2]/div/div/span[1]/a")
    public WebElement btnExportCSV;


    //Page Object "Range From Date -Advertising Analytics" -Hemant
    @FindBy(id="adv-analytics-api-form-from")
    public WebElement dtADVRangeFrom;
    

    //Page Object "Range To Date -Advertising Analytics" -Hemant
    @FindBy(id="adv-analytics-api-form-to")
    public WebElement dtADVRangeTo;
    
    //Page Object "ADV Update Button" -Hemant
    @FindBy(xpath="//*[@id='app-list']/div[1]/div/form/div[1]/span[2]/div/div/span[2]/a")                           
    public WebElement btnADVRefresh;
    
    //Page Object "ADV Export Button" -Hemant
    @FindBy(xpath="//*[@id='app-list']/div[1]/div/form/div[1]/span[2]/div/div/span[1]/a")
    public WebElement btnADVExport;
    

    //Page Object "Estimated Revenue Head" -Hemant
    @FindBy(xpath="//*[@id='app-list']/div[2]/div/form/div[2]/div[3]/div[1]")
    public WebElement lblRevnuHead;
    
    
    //Page Object "Request Legend" -Hemant
    @FindBy(xpath="//*[@id='highcharts-2']/svg/g[6]/text[1]/tspan")
    public WebElement lblRequest;
    
    //Page Object "Impressions Legend" -Hemant
    @FindBy(xpath="//*[@id='highcharts-2']/svg/g[6]/text[2]/tspan")
    public WebElement lblImpressions;
    
    
    //Page Object "Clicks Legend" -Hemant
    @FindBy(xpath="//*[@id='highcharts-2']/svg/g[6]/text[3]/tspan")
    public WebElement lblClicks;
    
    //Page Object "Application list" -Hemant
    @FindBy(id ="app-list")
    public WebElement eleAppList;
    

    //Page Object "Loading Image" -Hemant
    @FindBy(xpath ="//*[@id='content-area']/div[4]/img")
    public WebElement eleLoadingImage;
    


/** ======================================== Rohit Singh ============================================= */
    
    //Page Object "Setup New Application"
    @FindBy(how = How.LINK_TEXT, using = "004_TestShortCode")
    public WebElement testAppSandbox;

//Page Object "Setup New Application"
    @FindBy(how = How.LINK_TEXT, using = "002_TestShortCode")
    public WebElement testAppProduction;
    
//Page Object "Setup New Application"
    @FindBy(how = How.LINK_TEXT, using = "001_TestShortCode")
    public WebElement testSmsAppSandbox;
    
//Page Object "Setup New Application"
    @FindBy(how = How.LINK_TEXT, using = "005_TestShortCode")
    public WebElement testSmsAppProduction;
    
//Page Object "Setup New Application"
    @FindBy(how = How.LINK_TEXT, using = "003_TestShortCode")
    public WebElement testMmsAppSandbox;
    
    
//Page Object "Setup New Application"
    @FindBy(how = How.LINK_TEXT, using = "006_TestShortCode")
    public WebElement testMmsAppProduction;

    
    //method to click on a Test App
    public AppPage clickTestAppSandbox()
    {
           waitForElement(testAppSandbox);
           testAppSandbox.click();
           waitForPageToLoad();
           return PageFactory.initElements(driver, AppPage.class);
           
    }
    
    //method to click on a Test App
                 public AppPage clickTestSmsAppSandbox()
                 {
                        waitForElement(testAppSandbox);
                        testSmsAppSandbox.click();
                        waitForPageToLoad();
                        return PageFactory.initElements(driver, AppPage.class);
                        
                 }
    
    //method to click on a Test App
    public AppPage clickTestAppProduction()
    {
                 waitForElement(testAppProduction);
                 testAppProduction.click();
                 waitForPageToLoad();
                 return PageFactory.initElements(driver, AppPage.class);
                        
    }
    
    //method to click on a Test App
    public AppPage clickTestSmsAppProduction()
    {
                 waitForElement(testAppProduction);
                 testSmsAppProduction.click();
                 waitForPageToLoad();
                 return PageFactory.initElements(driver, AppPage.class);
                        
    }
    
    //method to click on a Test App
    public AppPage clickTestMmsAppSandbox()
    {
           waitForElement(testAppSandbox);
           testMmsAppSandbox.click();
           waitForPageToLoad();
           return PageFactory.initElements(driver, AppPage.class);
           
    }
    
    //method to click on a Test App
    public AppPage clickTestMmsAppProduction()
    {
                        waitForElement(testAppSandbox);
                        testMmsAppProduction.click();
                        waitForPageToLoad();
                        return PageFactory.initElements(driver, AppPage.class);
                        
    }


           /** ======================================== Rohit Singh ============================================= */

	
	
//---------------------------------------------------------------------------------------------------------------------------------------------------
	public MyAppsPage(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void openURL() {
		driver.get(MY_APPS_URL);
		PageFactory.initElements(driver, this);
	}
	

	public CreateAnApp clickCreateAnApp(){
		createAnApp.click();
		WebElement createAppForm = driver.findElement(By.id("new_app"));
		return new CreateAnApp(driver, createAppForm);
		
	}
	
	public NewAppPage setUpNewApp(){
		setupNewApp.click();
		waitForPageToLoad();
		implicitWait(3);
		return PageFactory.initElements(driver, NewAppPage.class);
	}
	
	/*method to click on Setup App Button after deleting all the apps for a playground user */
	
	public NewAppPage setUpNewAppAfterCleanup(){
		driver.findElement(By.id("add_an_resource")).click();
		waitForPageToLoad();
		implicitWait(3);
		return PageFactory.initElements(driver, NewAppPage.class);
	}
	
	
	/*method to click on edit button*/
	public EditAppPage editApp(){
		AppName.click();
		waitForPageToLoad();
		return PageFactory.initElements(driver, EditAppPage.class);	
	}
	
	
	/* Method to Initialize APIMLoginPage */
	public APIMLoginPage apimLoginPage(){
		waitForPageToLoad();
		return PageFactory.initElements(driver, APIMLoginPage.class);
	}	
	
	/* Method to click on API tab on My Apps page */
	
	public APIPage clkAPI(){			
		apiLink.click();		
		waitForPageToLoad();
		String text = driver.getTitle();
		Assert.assertEquals("AT&T APIs - Find Developer APIs from AT&T", text);
		return PageFactory.initElements(driver, APIPage.class);
	}	

	/* Method to click on Tutorials tab on My Apps page */
	public TutorialPage clkTutorials(){	
		tutorialsLink.click();		
		waitForPageToLoad();
		String text = driver.getTitle();
		Assert.assertEquals("Tutorials", text);
		return PageFactory.initElements(driver, TutorialPage.class);
	}	
	
	/* Method to click on Sample Apps tab on My Apps page */
	public SampleAppPage clkSampleApp(){	
		sampleAppsLink.click();		
		waitForPageToLoad();
		String text = driver.getTitle();
		Assert.assertEquals("Sample Apps", text);
		return PageFactory.initElements(driver, SampleAppPage.class);
	}	
	
	/* Method to click on Console tab on My Apps page */
	public ConsolePage clkConsole(){	
		consoleLink.click();		
		waitForPageToLoad();
		String text = driver.getTitle();
		Assert.assertEquals("AT&T API Console", text);
		return PageFactory.initElements(driver, ConsolePage.class);
	}	

	/* Method to click on Docs tab on My Apps page */
	public DocPage clkDocs(){	
		DocsLink.click();		
		waitForPageToLoad();
		String text = driver.getTitle();
		Assert.assertEquals("AT&T API Documentation - API Sample Code, Methods & Callbacks", text);
		return PageFactory.initElements(driver, DocPage.class);
	}	
	
	/* Method to click on Pricing tab on My Apps page */
	public PricingPage clkPricing(){	
		pricingLink.click();		
		waitForPageToLoad();
		String text = driver.getTitle();
		Assert.assertEquals("Pricing", text);
		return PageFactory.initElements(driver, PricingPage.class);
	}	

	
    //***************************************Methods Created by Binny*******************************************************************	
	/** Method to verify that Api analytics tab is not displayed (for playground user) */ 
	public void isApiAnalyticsNotDisplayed(){
		validateWebElementPresent("//*[id = 'all_apps_analytics']");

		publishTestResult();
	}
	
	/** Method to verify that Advertising analytics tab is not displayed (for playground user) */ 
	public void isAdvAnalyticsNotDisplayed(){
		waitForPageToLoad();
		validateWebElementPresent("//*[id = 'all_adv_apps_analytics']");
		publishTestResult();
	}
	
	
	/** Method to verify that Advertising analytics tab is displayed (for Dev, OPA user) */ 
	public void isAdvAnalyticsDisplayed(){
			
		validateWebElementDisplayed(advAnalytics);
		publishTestResult();
	}
	
	
	/** Method to verify that API analytics tab is displayed (for Dev, OPA user) */ 
	public void isApiAnalyticsDisplayed(){
		validateWebElementDisplayed(apiAnalytics);
		publishTestResult();
	}
	
	/** Method to Validate Sandbox App Key and Secret key is displayed when Dev clicks on Sandbox Key button on my apps page*/
	public void clkKeyIcon(){
		WebElement keyicon;
		
		// If the App Key and Secret Key section is already expanded 
		if(driver.findElement(By.cssSelector("span.futuristic_key.button_depressed > a.myappsinfo")) != null){
			keyicon = driver.findElement(By.cssSelector("span.futuristic_key.button_depressed > a.myappsinfo"));
			}
		// If the App Key and Secret Key section is not expanded, click on the Key Icon
		else{
			keyicon = driver.findElement(By.cssSelector("span.futuristic_key > a.myappsinfo"));	
			keyicon.click();
			waitForAjaxInactivity();	
		}
			
		WebElement AppKey  = driver.findElement(By.cssSelector("span.appkey_label"));
		WebElement AppSecret  = driver.findElement(By.cssSelector("span.appsecret_label"));
		
		validateWebElementDisplayed(AppKey);
		validateWebElementDisplayed(AppSecret);
		publishTestResult();
	}
	
	
	/**  Method to verify that user can view sandbox app detail page by clicking on Manage Sandbox button */
	public void clkManageSandbox(){
		
		WebElement sandboxbtn = driver.findElement(By.cssSelector("a.myappsinfo.sandboxstatus-active"));	
		sandboxbtn.click();
		waitForPageToLoad();	
		WebElement apptitle  = driver.findElement(By.className("title"));
		validateWebElementDisplayed(apptitle);
		publishTestResult();
	}
	
	/** Method to click on delete button below a particular sandbox app */
	public void clkDeleteSandbox(){
	/*	appName = "/apps/"+appName;
		String path = "//a[contains(@href,'" + appName + "') and contains(@original-title,'Trash')]"; 
		//and contains(@class,'Sandbox.myappsinfo') 
		WebElement deleteBtn = driver.findElement(By.xpath(path));*/
		WebElement deleteBtn = driver.findElement(By.cssSelector("a.Sandbox.myappsinfo"));	
		deleteBtn.click();
		waitForAjaxInactivity();	
	}
	
	
	/** Method to click on delete button below a particular production app */
	public void clkDeleteProduction(){
		
		WebElement deletebtn = driver.findElement(By.cssSelector("a.Production.myappsinfo"));	
		deletebtn.click();
		waitForAjaxInactivity();	
	}
	
	/** Method to click on Orcancel delete button */
	public void clkOrCancel(String appName){
		
		WebElement orcancelbtn = driver.findElement(By.id("confirmationCancelButton"));	
		orcancelbtn.click();
		waitForAjaxInactivity();	
		WebElement title = driver.findElement(By.id("location_header")).findElement(By.tagName("h1"));
		validateText(title, "My Apps");
		
		if(driver.findElement(By.linkText(appName)).isDisplayed())
			storeVerificationResults(true, "App is not Deleted");
		else{
	    storeVerificationResults(false, "App is Deleted");
		}	
		publishTestResult();
	}
	public AppPage click_AppLink(String appname){

		//a= a.toLowerCase();

		//String abc = "//a[contains(@href,'" + a + "') and contains(@class,'myappsinfo') and contains(@original-title,'Edit')]"; 

		try{

			driver.findElement(By.linkText(appname)).click(); 
			storeVerificationResults(false, "Application link is clicked");
			return PageFactory.initElements(driver, AppPage.class); 

		}catch(Exception e){
			e.printStackTrace();
			storeVerificationResults(false, "Application link not clicked");
			return PageFactory.initElements(driver, AppPage.class);
		}

		} 


	/** Menthod to verify that usre can view sandbox app detail page by clicking on Manage Sandbox button */
	public void clkEditBtn(){
		
		WebElement editbtn = driver.findElement(By.cssSelector("span.futuristic_edit > a.myappsinfo"));	
		editbtn.click();
		waitForPageToLoad();	
		WebElement apptitle  = driver.findElement(By.className("title"));
		validateWebElementDisplayed(apptitle);
	//	WebElement edittext = driver.findElement(By.xpath("//div[@id='location_header']/h1/span[2]"));	
	//	validateText(edittext, "- Edit");
		publishTestResult();
	}
	
	public void validateAuthMsg(){
		WebElement msg = driver.findElement(By.cssSelector("div.alert-box.notice"));
		String s1 = "Successfully authenticated from Att account.";
		String s2 = msg.getText().toString();
		if (s2.contains(s1)) {
			storeVerificationResults(true, "Authentication message is displayed");
		}
		else{
		    storeVerificationResults(false, "Authentication message is not displayed");
		}
		//validateText(msg, s);
		msg.getText();
		publishTestResult();
	}
	

	public void deleteSandboxAppPG(){
		
		while(driver.findElements(By.xpath("//a[contains(@class,'Sandbox myappsinfo') and contains(@original-title,'Trash')]")).size()>0)
		{
			driver.findElement(By.xpath("//a[contains(@class,'Sandbox myappsinfo') and contains(@original-title,'Trash')]")).click(); 
			waitForAjaxInactivity();
			
			driver.findElement(By.id("confirmationDeleteButton")).click();
			waitForAjaxInactivity();
			waitForPageToLoad();  
			
		}
	
	
	}
	
	
	
	
    //***************************************Methods Created by Binny*******************************************************************
	
    //Function to click on API_Analytics button and verify before and after clicking -Hemant- 
    //***********************************************************************************************************************************                     
    public void clkAPIAnalyticsBtn(){

           //Verify Analytics is collapsed
           boolean x = driver.findElement(By.id("app-list")).findElement(By.className("analyticsHeading")).isDisplayed();
           if (!x){
                  System.out.println("Pass - API-Analytics is collapsed");
           }else{
                  System.out.println("Fail - API-Analytics is not collapsed");
           }
           
           //Click on API Analytics
           btnAppAnalytics.click();
           
           //wait till data not displayed
           int i;
           i=0;
           while(driver.findElement(By.xpath("//html/body/div[2]/img")).isDisplayed() && i<20){
                  //System.out.println("Wait for trend");
                  wait(2000);
                  i=i+1;
           }
           
           
           //Verify Analytics is expanded
           x = driver.findElement(By.id("app-list")).findElement(By.className("analyticsHeading")).isDisplayed();
           if (x){
                  System.out.println("Pass - API-Analytics is expanded");
           }else{
                  System.out.println("Fail - API-Analytics is not expanded");
           }
                                      
    }
    //***********************************************************************************************************************************       

    
    //Function to check if API anlytics is collapsed-Hemant- 
    //***********************************************************************************************************************************                     
    public void fnCheckAPIAnlyticsIsCollapsed(){

           //Verify Analytics is collapsed
           boolean x = driver.findElement(By.id("app-list")).findElements(By.className("analyticsHeading")).isEmpty();
           
           if(!x){                    
                  boolean y = driver.findElement(By.id("app-list")).findElement(By.className("analyticsHeading")).isDisplayed();

                               if (!y){
                                      System.out.println("Pass - API-Analytics is collapsed");
                               }else{
                                      System.out.println("Fail - API-Analytics is not collapsed");
                               }
           }else{
                  
                  System.out.println("Pass - API-Analytics is collapsed");
           }
    }
    //***********************************************************************************************************************************       

    
    
           
    
    //Function to click on ADV_Analytics button and verify before and after clicking -Hemant- 
    //***********************************************************************************************************************************                     
    public void clkADVAnalyticsAlreadyCollapsed(){

           //Verify Analytics is collapsed
           String xyz = "//*[@id='app-list']/div[1]/div/form/div[1]/span[1]";
           boolean flagPresent =validateWebElementPresentBy(By.xpath(xyz));
            if (flagPresent){
	            boolean x =  lblAllApsADVAnalytics.isDisplayed();
	            if (!x){
	                   System.out.println("Pass - ADV-Analytics is collapsed");
	                   storeVerificationResults(true, "Pass - ADV-Analytics is collapsed");
	            }else{
	                   System.out.println("Fail - ADV-Analytics is not collapsed");
	                   storeVerificationResults(false, "Element is not present");
	            }                                                      
          }else{
        	  storeVerificationResults(false, "Element is not present");
          }
                  
           //Click on ADV Analytics
           flagPresent = validateWebElementPresentBy(By.id("all_adv_apps_analytics"));
           if (flagPresent){
                  btnADVAnalytics.click();
           }else{
        	   storeVerificationResults(false, "Element is not present");
           }
           
           //wait till data not displayed
           int i;
           i=0;
           //driver.findElements(By.xpath("//html/body/div[2]/img")).isEmpty() && 
           while(i<5){
                  //System.out.println("Wait for trend");
                  wait(2000);
                  i=i+1;
           }             
           
           //Verify Analytics is expanded
           //flagPresent = (!driver.findElements(By.xpath(xyz)).isEmpty());
           flagPresent = validateWebElementPresentBy(By.xpath(xyz));
           if(flagPresent ){
                  boolean y =  lblAllApsADVAnalytics.isDisplayed();
                  if (y){
                        System.out.println("Pass - ADV-Analytics is expanded");
                        storeVerificationResults(true, "ADV-Analytics is expanded");
                  }else{
                        System.out.println("Fail - ADV-Analytics is not expanded");
                        storeVerificationResults(false, "ADV-Analytics is not expanded");
                  }
           }else{
        	   storeVerificationResults(false, "Element is not present");
           }
    }
    //***********************************************************************************************************************************       



	//Function to check ADV_Analytics link is not displayed-Hemant- 
	//***********************************************************************************************************************************			
	public void clkADVAnalyticsLinkNotDisplayed(){
 
		    int size=  driver.findElements(By.id("all_adv_apps_analytics")).size();
		    
		    if (size==1){		    	
		    	if(driver.findElement(By.id("all_adv_apps_analytics")).isDisplayed()){
		    	    storeVerificationResults(false, "Advertising Analytics Link is visible");
		    	}else{
		    		storeVerificationResults(true, "Advertising Analytics Link is NOT visible");		    		
		    	}		    	
		    }else{
		    	storeVerificationResults(false, "Advertising Analytics Link is NOT visible");
		    }		
	}		
	//***********************************************************************************************************************************	


    //Function to check if ADV analytics is collapsed-Hemant 
    //***********************************************************************************************************************************                     
    public void fnCheckADVAnlyticsIsCollapsed(){

           //Verify Analytics is collapsed
           boolean x = driver.findElement(By.id("app-list")).findElements(By.className("adv-analyticsHeading")).isEmpty();
           
           if(!x){                    
                  boolean y = driver.findElement(By.id("app-list")).findElement(By.className("adv-analyticsHeading")).isDisplayed();

                               if (!y){
                                      System.out.println("Pass - ADV-Analytics is collapsed");
                               }else{
                                      System.out.println("Fail - ADV-Analytics is not collapsed");
                               }
           }else{
                  
                  System.out.println("Pass - ADV-Analytics is collapsed");
           }
    }
    //***********************************************************************************************************************************       

    
    
    //Function to click on ADV_Analytics button and verify before and after clicking -Hemant- 
    //***********************************************************************************************************************************                     
    public void clkADVAnalyticsExpandedCollapsed(){

           //Verify Analytics is collapsed
           String xyz = "//*[@id='app-list']/div[1]/div/form/div[1]/span[1]";
           boolean flagPresent =validateWebElementPresentBy(By.xpath(xyz));
            if (flagPresent){
	            boolean x =  lblAllApsADVAnalytics.isDisplayed();
	            if (!x){
	                   System.out.println("Pass - ADV-Analytics is collapsed");
	            }else{
	                   System.out.println("Fail - ADV-Analytics is not collapsed");
	                   storeVerificationResults(false, "Element is not present");
	            }                                                      
          }else{
        	  storeVerificationResults(false, "Element is not present");
          }
                  
           //Click on ADV Analytics
           flagPresent = validateWebElementPresentBy(By.id("all_adv_apps_analytics"));
           if (flagPresent){
                  btnADVAnalytics.click();
           }else{
        	   storeVerificationResults(false, "Element is not present");
           }
           
           //wait till data not displayed
           int i;
           i=0;
           //driver.findElements(By.xpath("//html/body/div[2]/img")).isEmpty() && 
           while(i<5){
                  //System.out.println("Wait for trend");
                  wait(2000);
                  i=i+1;
           }             
           
           //Verify Analytics is expanded
           //flagPresent = (!driver.findElements(By.xpath(xyz)).isEmpty());
           flagPresent = validateWebElementPresentBy(By.xpath(xyz));
           if(flagPresent ){
                  boolean y =  lblAllApsADVAnalytics.isDisplayed();
                  if (y){
                        System.out.println("Pass - ADV-Analytics is expanded");
                  }else{
                        System.out.println("Fail - ADV-Analytics is not expanded");
                  }
           }else{
        	   storeVerificationResults(false, "Element is not present");
           }
           
           //Click on ADV Analytics
           flagPresent = validateWebElementPresentBy(By.id("all_adv_apps_analytics"));
           if (flagPresent){
                  btnADVAnalytics.click();
           }else{
        	   storeVerificationResults(false, "Element is not present");
           }
           
           //wait till data not displayed

           i=0;
           //driver.findElements(By.xpath("//html/body/div[2]/img")).isEmpty() && 
           while(i<3){
                  //System.out.println("Wait for trend");
                  wait(2000);
                  i=i+1;
           }             

           //Verify Analytics is collapsed
           xyz = "//*[@id='app-list']/div[1]/div/form/div[1]/span[1]";
           flagPresent =validateWebElementPresentBy(By.xpath(xyz));
            if (flagPresent){
	            boolean x =  lblAllApsADVAnalytics.isDisplayed();
	            if (!x){
	                   System.out.println("Pass - ADV-Analytics is collapsed");
	            }else{
	                   System.out.println("Fail - ADV-Analytics is not collapsed");
	                   storeVerificationResults(false, "Element is not present");
	            }                                                      
          }else{
        	  storeVerificationResults(false, "Element is not present");
          }
   
    
    
    }
    //***********************************************************************************************************************************       

      
    
    //Function to select From Date from Range -Hemant 
    //***********************************************************************************************************************************                     
    public void fnSetFROMDateAPI(String sDate){            
           dtRangeFrom.clear();
           dtRangeFrom.sendKeys(sDate);
           driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/button[2]")).click();          
    }      
    //***********************************************************************************************************************************
    
    //Function to select To Date from Range -Hemant 
    //***********************************************************************************************************************************                     
    public void fnSetTODateAPI(String sDate){              
           dtRangeTo.clear();
           dtRangeTo.sendKeys(sDate);
           driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/button[2]")).click();          
    }      
    //***********************************************************************************************************************************

    
    
    //Function to select From Date from Range ADV-Hemant 
    //***********************************************************************************************************************************                     
    public void fnSetFROMDateAPIADV(String sDate){         
      
    	try{
    	
    		dtADVRangeFrom.clear();
           dtADVRangeFrom.sendKeys(sDate);
           driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/button[2]")).click();
    	}catch(Exception e){
    		storeVerificationResults(false, "From Date Range set failure");
    	}
    	
    }      
    //***********************************************************************************************************************************
    
    //Function to select To Date from Range -Hemant 
    //***********************************************************************************************************************************                     
    public void fnSetTODateAPIADV(String sDate){           
    	try{
            dtADVRangeTo.clear();
            dtADVRangeTo.sendKeys(sDate);
            driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/button[2]")).click();              		
    	}catch(Exception e){
    		storeVerificationResults(false, "To Date Range set failure");
    	}
    }      
    //***********************************************************************************************************************************

    
    
    //Function to Click on Refresh/Update -Hemant 
    //***********************************************************************************************************************************                     
    public void fnClickRefresh(){            
           
           //Click on Refresh Button
           btnRefresh.click();

           //wait till data not displayed
           int i;
           i=0;
           while(driver.findElement(By.xpath("//html/body/div[2]/img")).isDisplayed() && i<20){
                  //System.out.println("Wait for trend");
                  wait(2000);
                  i=i+1;
           }                    
    }      
    //***********************************************************************************************************************************

    //Function to Click on Refresh/Update -Hemant 
    //***********************************************************************************************************************************                     
    public void fnClickRefreshADV(){         
           
    	try{
    		
    	
           //Click on Refresh Button
           wait(2000);
           btnADVRefresh.click();

           //wait till data not displayed
           int i;
           i=0;
           //eleLoadingImage.isDisplayed()
           while(i<5){
                  //System.out.println("Wait for trend");
                  wait(2000);
                  i=i+1;
           }
           
    	}catch(Exception e){
    		storeVerificationResults(false, "Element is not present");
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

    //Procedure to wait for specified milliseconds
    public static void wait(int ms){
           try {                             
                  Thread.sleep(ms);
           } catch (InterruptedException e) {

                  e.printStackTrace();
           }
    }

    
    //Function to Delete the existing export.xlsx from the Temp folder-Hemant 
    //***********************************************************************************************************************************                     
    public void DeleteFile(String filepath)
    {
           try{
                  File file = new File(filepath);
                  if(file.delete()){
                         System.out.println(file.getName() + " is deleted!");
                         //return true;
                  }else{
                         System.out.println("Delete operation is failed.");
                         //return false;
                  }
           }catch(Exception e){
                  e.printStackTrace();
                  //return false;
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

    //Function to Export the export.xlsx to Temp folder for Advertising-Hemant 
    //***********************************************************************************************************************************                     
    public void fnExportFileADV(String filePathString)
    {
           btnADVExport.click();
           
           //Code to create the folder
           int in  = filePathString.lastIndexOf("\\");            
           String folderPathString =  filePathString.substring(0, in);
                       
           System.out.println(folderPathString );
           
              File dir=new File(folderPathString );
              if(dir.exists()){
                  System.out.println("A folder with name" + folderPathString + "is already exist in the path");
              }else{
                  dir.mkdir();
              }
 
                        
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
                  storeVerificationResults(false, "file is created");
           }else{               
                  System.out.println("file not exists");
                  storeVerificationResults(false, "file does not exists");
           }

    }
    //***********************************************************************************************************************************
    
    
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

    
    
    
    //Function to verify dtADVRangeFrom-Hemant 
    //***********************************************************************************************************************************                     
           public boolean fnVerifydtADVRangeFrom(){
                  
                  if(dtADVRangeFrom.isDisplayed()){
                        System.out.println("Adv From Date is Visible");
                  }else{
                        System.out.println("Adv From Date is Not Visible");
                        return false;
                  }
                                      
                  if(!dtADVRangeFrom.getAttribute("value").isEmpty()){
                        System.out.println("From Date is past 7 days");
                        return true;
                  }else{
                        System.out.println("From Date is Null");
                        return false;
                  }                          
           }
    //***********************************************************************************************************************************
           

           //Function to verify dtADVRangeTo-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifydtADVRangeTo(){                        
                        if(dtADVRangeTo.isDisplayed()){
                               System.out.println("Adv To Date is Visible");
                        }else{
                               System.out.println("Adv To Date is Not Visible");
                               return false;
                        }
                                             
                        if(!dtADVRangeTo.getAttribute("value").isEmpty()){
                               System.out.println("From To is past 7 days");
                               return true;
                        }else{
                               System.out.println("From To is Null");
                               return false;
                        }                          
                  }
           //***********************************************************************************************************************************

           //Function to verify btnADVRefresh-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifybtnADVRefresh(){                       
                        if(btnADVRefresh.isDisplayed()){
                               System.out.println("Refresh is Visible");
                               return true;
                        }else{
                               System.out.println("Refresh is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************

           //Function to verify fnVerifybtnADVExport-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifybtnADVExport(){                        
                        if(btnADVExport.isDisplayed()){
                               System.out.println("Pass - Export button is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - Export button is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************

           //Function to verify fnVerifylblRevnuHead-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifylblRevnuHead(){                        
                        if(lblRevnuHead.isDisplayed()){
                               System.out.println("Pass - Revenue heading is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - Revenue heading is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************

           //Function to verify dtRangeFrom API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifydtRangeFrom(){                         
                        if(dtRangeFrom.isDisplayed()){
                               System.out.println("Pass - From Date text box is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - From Date text box is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************

           //Function to verify dtRangeTo API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifydtRangeTo(){                           
                        if(dtRangeTo.isDisplayed()){
                               System.out.println("Pass - To Date text box is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - To Date text box is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************
                  
           //Function to verify ddAPIs API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifyddAPIs(){                       
                        if(ddAPIs.isDisplayed()){
                               System.out.println("Pass - API dropdown box is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - API dropdown box is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************

           //Function to verify ddView API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifyddView(){                       
                        if(ddView.isDisplayed()){
                               System.out.println("Pass - View box is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - View box is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************
                  
           //Function to verify ddByChart API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifyddByChart(){                           
                        if(ddByChart.isDisplayed()){
                               System.out.println("Pass - By box is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - By box is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************

                  
           //Function to verify  btnRefresh API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifybtnRefresh(){                          
                        if( btnRefresh.isDisplayed()){
                               System.out.println("Pass - Refresh button is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - Refresh button is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************
                  
                  
           //Function to verify  btnExportCSV API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifybtnExportCSV(){                        
                        if( btnExportCSV.isDisplayed()){
                               System.out.println("Pass - Export button is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - Export  button is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************
                  
                  
                  
           
           //Function to verify  btnExportCSV API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnVerifyAPIGraphIsDisplayed(){                        
                        if(driver.findElements(By.xpath("//*[@id='highcharts-7']/svg/g[10]/g/path")).size()>1){
                               System.out.println("Pass - Graph is Visible");
                               return true;
                        }else{
                               System.out.println("Fail - Graph is Not Visible");
                               return false;
                        }
                  }
           //***********************************************************************************************************************************
                        

           //Function to Set the start and end date API-Hemant 
           //***********************************************************************************************************************************                     
                  public boolean fnSetDateRangeInMyApps(String sStartDate ,String sEndDate){                                                                                   
                        try{
                               //Set the From Date in API Analytics filter
                               
                               //sDate = "8/1/2013 00:00";
                               fnSetFROMDateAPI(sStartDate);
                                                                        
                               //Set the To Date in API Analytics filter
                               //sDate = "9/1/2013 00:00";
                               fnSetTODateAPI(sEndDate);                                     
                               
                               return true;
                        }catch(Exception e){                                   
                               e.printStackTrace();
                               return false;
                        }
                        
                        
                  }
           //***********************************************************************************************************************************


                  //Function to Set the start and end date ADV Analytics-Hemant 
                  //***********************************************************************************************************************************                     
                        public boolean fnSetDateRangeInMyAppsADV(String sStartDate ,String sEndDate){                                                                                         
                               try{
                                      //Set the From Date in API Analytics filter
                                      
                                      //sDate = "8/1/2013 00:00";
                                      fnSetFROMDateAPIADV(sStartDate);
                                                                               
                                      //Set the To Date in API Analytics filter
                                      //sDate = "9/1/2013 00:00";
                                      fnSetTODateAPIADV(sEndDate);                                         
                                      
                                      return true;
                               }catch(Exception e){                                   
                                      e.printStackTrace();
                                      storeVerificationResults(false, "Date Range set failed");
                                      return false;
                               }
                               
                               
                        }
                  //***********************************************************************************************************************************

                  
                  
                  
                  //Function to Set the View dropdown-Hemant 
                  //***********************************************************************************************************************************                     
                        public boolean fnSetView(String sStartDate ,String sEndDate){                                                                                   
                               try{
                                      //Set the From Date in API Analytics filter
                                      
                                      //sDate = "8/1/2013 00:00";
                                      fnSetFROMDateAPI(sStartDate);
                                                                               
                                      //Set the To Date in API Analytics filter
                                      //sDate = "9/1/2013 00:00";
                                      fnSetTODateAPI(sEndDate);                                     
                                      
                                      return true;
                               }catch(Exception e){                                   
                                      e.printStackTrace();
                                      return false;
                               }
                               
                               
                        }
                  //***********************************************************************************************************************************

                  
           //Function to validate API specific details exists in the exported excel -Hemant 
           //***********************************************************************************************************************************                     

           public void fnVerifyExportedExcelAPISpecificMyApps(String sNewFilePath, String sAPI){
                               
                        ReadXLSX xl = new ReadXLSX();                   
                        String[][] cellValue = xl.readExcel(sNewFilePath);            
                        
                        //Validate the column names and API name in the Excel                
                        
                        //validate API  name
                        if(cellValue[2][1].equalsIgnoreCase(sAPI)){
                               System.out.println("pass - API name is correct " + sAPI);
                        }else{
                               System.out.println("fail - API name is in-correct " + "Excel Value : " + cellValue[2][1].toString() + "  Screen Value  " + sAPI);
                        }
                        
                        //validate API Usage Totals
                        if(cellValue[4][1].equalsIgnoreCase("API Usage Totals")){
                               System.out.println("pass - API Usage Totals column exists");
                        }else{
                               System.out.println("fail - API Usage Totals column does not exists");
                        }
                        
                        //validate Error Request Total
                        if(cellValue[4][2].equalsIgnoreCase("Error Request Total")){
                               System.out.println("pass - Error Request Total Exists");
                        }else{
                               System.out.println("fail - Error Request Total does not Exists");
                        }
                        
                        //validate Response Time
                        if(cellValue[4][3].equalsIgnoreCase("Response Time")){
                               System.out.println("pass - Response Time exists " );
                        }else{
                               System.out.println("fail -  Response Time does not exists ");
                        }
                        
                        
           }      
           //***********************************************************************************************************************************
           
           
           //Function to Search the app in MyApps-Hemant 
           //***********************************************************************************************************************************                     
                  public AppPage fnSearchNClickAnAppinMyApps(String sAppName){                                                                                    
                        //Set the From Date in API Analytics filter

                               if(fnFindAppInCurrentpage(sAppName)){
                               driver.findElement(By.linkText(sAppName)).click();
                               waitForPageToLoad();
                               System.out.println("The app  "+ sAppName + " has been selected");
                               return PageFactory.initElements(driver, AppPage.class);
                               
                               }

                               return PageFactory.initElements(driver, AppPage.class);
//                      do{
//                      
//                             if(fnFindAppInCurrentpage(sAppName)){
//                                    driver.findElement(By.linkText(sAppName)).click();
//                                    waitForPageToLoad();
//                                    System.out.println("The app  "+ sAppName + " has been selected");
//                                    return PageFactory.initElements(driver, AppPage.class);
//                             }
//                             
//                             if(driver.findElement(By.xpath("//*[@id='app-list']/nav/span[7]/a")).isDisplayed()){
//                                    driver.findElement(By.xpath("//*[@id='app-list']/nav/span[7]/a")).click();
//                             }
//                      }while(driver.findElement(By.xpath("//*[@id='app-list']/nav/span[7]/a")).isDisplayed());
                        
//                             return PageFactory.initElements(driver, AppPage.class);
                               
                        
                  }
           //***********************************************************************************************************************************


           //Function to Search the app on the current page-Hemant 
           //***********************************************************************************************************************************                     
           public boolean fnFindAppInCurrentpage(String sAppName){
                  int iNoOfApps;                    
                  iNoOfApps = driver.findElements(By.linkText(sAppName)).size();                           
                  if(iNoOfApps==1){
                        if(driver.findElement(By.linkText(sAppName)).isDisplayed()){                                    
                               //driver.findElement(By.linkText(sAppName)).click();
                               return true;
                        }                                        
                  }
                  return false;
           }
           //***********************************************************************************************************************************                     

           
           //Function to Verify, Request, Impresstions and Clicks, and Estimated Revenue Heading does displyed on ADv Analytics - Hemant
           //***********************************************************************************************************************************                            
                  public void fnVerifyADVAnalyticsGraph(){
                  
                  if(lblRevnuHead.isDisplayed()){
                        System.out.println("Pass - Revenue heading is Visible");                          
                  }else{
                        System.out.println("Fail - Revenue heading is Not Visible");                      
                  }
                  
//                if(lblRequest.isDisplayed()){
//                      System.out.println("Pass - Revenue heading is Visible");                          
//                }else{
//                      System.out.println("Fail - Revenue heading is Not Visible");                      
//                }
//                
//                if(lblImpressions.isDisplayed()){
//                      System.out.println("Pass - Revenue heading is Visible");                          
//                }else{
//                      System.out.println("Fail - Revenue heading is Not Visible");                      
//                }
//                
//                
//                if(lblClicks.isDisplayed()){
//                      System.out.println("Pass - Revenue heading is Visible");                          
//                }else{
//                      System.out.println("Fail - Revenue heading is Not Visible");                      
//                }                    
           }
           
           //***********************************************************************************************************************************                     
		
	
}		
