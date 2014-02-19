package ATT.Selenium_FVT.Utilities.Browser;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageSupport {
	
	 protected String successMessage="";
	 protected String errorMessage="";
	private static Random random = new Random();
	
	protected WebDriver driver;
	
	public PageSupport()
	{
		
		
	}
	public PageSupport(WebDriver driver){
		this.driver = driver;
	}
	
	protected WebElement waitForElement(WebElement element, int maxTimeSeconds){
		int loops = maxTimeSeconds*4;
		for (int i=0; i<loops; i++){
			try {				
				if (element.isDisplayed()){
					return element;
				}

				try {
					Thread.sleep(500L);
				} catch (InterruptedException e) {
					// try again;
				}
			} catch (Exception e) {
				// try again
				try {
					Thread.sleep(500L);
				} catch (InterruptedException e1) {
					// try again;
				}
			}
		}
		return null;
	}
	
	protected WebElement waitForElement(WebElement element){
		return waitForElement(element, 5);
	}
	
	protected void sleep(Long milliseconds){
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected boolean elementExist(By by){
		try {
			driver.findElement(by);
			return true;
		}catch(org.openqa.selenium.NoSuchElementException Ex){
			return false;
		}
	}

	protected boolean elementExist(WebElement element){
		try {
			if (element.isDisplayed())
				return true;
			else
				return false;
		}catch(org.openqa.selenium.NoSuchElementException Ex){
			return false;
		}


	}
	
	public String getNewAppName() {
		StringBuffer appName = new StringBuffer("AppName");
	//	appName.append(Long.toString(random.nextInt()).replace("-", "")+(new Date()).getTime());
		appName.append(Long.toString(random.nextInt(10000)));
		return appName.toString();
	}
	
	protected void waitForPageToLoad(){
		
		int maxTimeOutInSeconds = 20;
		int loops = maxTimeOutInSeconds*4;
		for (int i=0; i<loops; i++){
			try {
				Object result = ((JavascriptExecutor) driver).executeScript("return document.readyState;");
				if (result.toString().equalsIgnoreCase("complete"))  break;
					try {
						Thread.sleep(250L);
					} catch (InterruptedException e) {
						// try again;
					}
				} catch (Exception e) {
					// Possible page reload. Fine
					try {
						Thread.sleep(250L);
					} catch (InterruptedException e1) {
						// try again;
					}
				}
	
			}
		}
	
	protected WebElement waitForElement(By by){
		return waitForElement(by, 5);
	}
	
	protected WebElement waitForElement(By by, int maxTimeSeconds){
		int loops = maxTimeSeconds*4;
		if (0==loops){
			loops=1;
		}
		for (int i=0; i<loops; i++){
			try {
				List<WebElement> elements = driver.findElements(by);
				for (WebElement element : elements){
					if (element.isDisplayed()){
						return element;
					}
				}
				try {
					Thread.sleep(500L);
				} catch (InterruptedException e) {
					// try again;
				}
			} catch (Exception e) {
				// try again
				try {
					Thread.sleep(500L);
				} catch (InterruptedException e1) {
					// try again;
				}
			}
		}
		return null;
	}
	
	
	protected void implicitWait(int maxTimeSeconds){
		try {
		    //thread to sleep for the specified number of milliseconds
			TimeUnit.SECONDS.sleep(maxTimeSeconds);
		} catch ( java.lang.InterruptedException ie) {
		    System.out.println(ie);
		}
	}
    public void waitForAjaxInactivity() {

        JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);

        for (int i = 0; i <= 10; i++) {
                       if ((Boolean) jsExecutor.executeScript("return jQuery.active == 0")) {
                                      break;
                       }
                       try {
                                      Thread.sleep(1000L);
                       } catch (InterruptedException e) {
                                      // Swallow
                       }

                       if (i == 30) {
                                      throw new RuntimeException("Javascript activity did not cease within 30s - aborting");
                       }
        }
}

    protected void clkFooter(WebElement element){
    	element.click();
    	waitForPageToLoad();
    	
    }

    
    protected void Hover(WebElement element){
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).perform();
    	
    	}


    protected boolean validateWebElementDisplayed(WebElement element){
 	   boolean result=false;
 	   if( element.isDisplayed()){
 	   
 	    storeVerificationResults(true, "Element is displayed");
 	   result=true;
 	    }else{
 	          
 	          storeVerificationResults(false, "Element is not displayed");
 	   }
 	   return result;
 	}
    
    protected void validateWebElementNotDisplayed(WebElement element){
  	   
  	   if( !element.isDisplayed()){
  	   
  		 storeVerificationResults(true, "Element is not displayed");	    
  	   
  	    }else{
  	    	storeVerificationResults(false, "Element is displayed");
  	          
  	   }
  	}
    
    protected void validateWebElementPresent(String identifier, String method){
    	int size=0;
    	if(method.equalsIgnoreCase("xpath")){
    		size=  driver.findElements(By.xpath(identifier)).size();
    	}
    	else if(method.equalsIgnoreCase("id")){
    		size=  driver.findElements(By.id(identifier)).size();
    	}
    	if (size==0)
    		storeVerificationResults(false, "Element is not present");
    	else
    		storeVerificationResults(true, "Element is present");

    }
    protected void validateWebElementNotPresent(String identifier, String method){
    	int size=0;
    	if(method.equalsIgnoreCase("xpath")){
    		size=  driver.findElements(By.xpath(identifier)).size();
    	}
    	else if(method.equalsIgnoreCase("id")){
    		size=  driver.findElements(By.id(identifier)).size();
    	}
    	if (size==0)
    		storeVerificationResults(true, "Element is not present");
    	else
    		storeVerificationResults(false, "Element is present");

    }
    protected void validateWebElementPresent(String xpath){
        
        int size=  driver.findElements(By.xpath(xpath)).size();
        
        if (size==0)
               storeVerificationResults(false, "Element is not present");
        else
               storeVerificationResults(true, "Element is present");
        
   }
    protected void validateWebElementNotPresent(String xpath){
        
        int size=  driver.findElements(By.xpath(xpath)).size();
        
        if (size==0)
               storeVerificationResults(true, "Element is not present");
        else
               storeVerificationResults(false, "Element is present");
        
   }
protected void validateWebElementEnabled(WebElement element){
	   
	   if( element.isEnabled()){
	   
	    storeVerificationResults(true, "Element is enabled");
	   
	    }else{
	          
	          storeVerificationResults(false, "Element is not enabled");
	   }
	}
 
 protected void validateWebElementPrepopulated(WebElement element){
	   
	   if( element.getAttribute("value") != null){
	   
	    storeVerificationResults(true, "Element is prepopulated");
	   
	    }else{
	          
	          storeVerificationResults(false, "Element is not prepopulated");
	   }
	}
 
 protected void validateWebElementDisabled(WebElement element){
	   
	   if( !element.isEnabled()){
	   
	    storeVerificationResults(true, "Element is not editable");
	   
	    }else{
	          
	          storeVerificationResults(false, "Element is editable");
	   }
	}

  
    //-Hemant
    protected boolean validateWebElementPresentBy(By obj){
        
        int size=  driver.findElements(obj).size();
        
        if (size==0){
               storeVerificationResults(false, "Element is not present");
                  return false;}
        else{
               storeVerificationResults(true, "Element is present");
                  return true;}
        
    }

 
 /**
  * Store all the Page Element Verification result in the Static variable
  * Warning: This will result in issues when trying parallel execution of 
   * Tests as the stored value may get reset by another test which read the value.
  */
 
  public void storeVerificationResults(boolean b, String msg){
        if(b){
                //verificationResult.add("'Industry Name' textbox is not displayed") ;
               successMessage=successMessage+"\n"+msg;
           }
        else{
              
               errorMessage=errorMessage+"\n"+msg;
        }
        
  }
  
  
 /**
  * Return the current value of the Verification result and reset it.
  * @throws IOException 
  */
  
	public String readVerificationResults(boolean s) {
		String temp2="";
		String[] temp;
		String storedMsg;

		if(!(s)){
			storedMsg=errorMessage;
			temp=storedMsg.split("\n");
			Arrays.sort(temp);
			for(int i=0;i<temp.length;i++)
			{
				temp2=temp2+temp[i]+"\n";                     

			}

			storedMsg=temp2;
			errorMessage="";

		}


		else{
			storedMsg=successMessage;
			temp=storedMsg.split("\n");
			Arrays.sort(temp);
			for(int i=0;i<temp.length;i++)
			{
				temp2=temp2+temp[i]+"\n";

			}
			storedMsg=temp2;
			successMessage="";
		}
		return storedMsg;


  }
	  protected void validateText(WebElement element,String s){
	         String S2 = element.getText(); 
	          if( S2.equals(s)){
	           storeVerificationResults(true, "Element is displayed");
	          }
	           else{
	                 storeVerificationResults(false, "Element is not displayed");
	          }
	  }
  public void publishTestResult(){
 	 
 	 String errorMessage1 = readVerificationResults(false);
		 String successMessage1 = readVerificationResults(true);
	
		    boolean testIterationFailure = false;	    
		    
			if(errorMessage1.length()>2){
				
				   System.out.println("\nStatus: FAILED "+"\nFailure were: "+errorMessage1+"\nSuccess were: "+successMessage1);
		          
		           int num = errorMessage1.length();
		           				
					testIterationFailure=true;
		           
		     }else if(successMessage1.length()>2){
		    System.out.println("\nStatus: PASSED "+"\nSuccess were: "+successMessage1);
		    
		    		int num = successMessage1.length();
		   
		    		testIterationFailure=false;
		}
		
			if(testIterationFailure)
		          Assert.assertTrue("There were failures in test iterations. Refer logs.", false);
  }
  
  
  public Boolean validatePageTitle(String pageTitle){
	  if(pageTitle.equalsIgnoreCase(driver.getTitle()))
		  return true;
	  else
		  return false;
  } 
  public void createTestResultFile(){
		    
		/*	System.out.println("Write data to an Excel Sheet");
			try {
				FileOutputStream fos=new FileOutputStream("C:/temp/testresult.xls");
				HSSFWorkbook workBook = new HSSFWorkbook();
				HSSFSheet spreadSheet = workBook.createSheet("TestResult_Report");
				HSSFRow row;
				HSSFCell cell;
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}*/
			
//			for(int i=0;i<arr.size();i++){
//			   row = spreadSheet.createRow((short) i);
//			cell = row.createCell(i);
//			System.out.println(.get(i));
//			cell.setCellValue(temp2.get(i).toString());
//			}
//			System.out.println("Done");
//			workBook.write(fos);
//			temp2.clear();

			}
    
    
}
