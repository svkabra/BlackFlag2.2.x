package ATT.Selenium_FVT.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class Results {

	String testScript = null;
	Boolean toBeExecuted = null;
	FileOutputStream out = null;
	FileInputStream inputFile = null;
	Integer inputRowCount = 1;
	Integer resultRowCount = 0;
	Result result = null;

	@Before 
	public void openExcel(){
		try {
			inputFile = new FileInputStream(new File("C:\\files\\Input.xls"));
			out = new FileOutputStream(new File("C:\\files\\Result.xls"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	@Test
	public void getResults() {
		try
		{
			//Create Workbook instance holding reference to .xls file
			HSSFWorkbook workbook = new HSSFWorkbook(inputFile);
			HSSFWorkbook resultWorkbook = new HSSFWorkbook(); 
			System.out.println("Result file is created");
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				resultRowCount = 0;
				inputRowCount = 1;
				HSSFSheet inputSheet = workbook.getSheetAt(i);    

				//Create a blank Sheet
				HSSFSheet resultSheet = resultWorkbook.createSheet(workbook.getSheetName(i));
				System.out.println(workbook.getSheetName(i) + " sheet is created");
				//Iterate through each rows one by one
				Iterator<Row> rowIterator = inputSheet.iterator();

				

				while (rowIterator.hasNext()) 
				{

					Row row = rowIterator.next();
					//For each row, iterate through all the columns
					Iterator<Cell> cellIterator = row.cellIterator();

					while (cellIterator.hasNext()) 
					{
						Cell cell = cellIterator.next();
						//Check the cell type and format accordingly
						switch (cell.getCellType()) 
						{
						case Cell.CELL_TYPE_STRING:
							testScript = cell.getStringCellValue();
							break;
						case Cell.CELL_TYPE_BOOLEAN:
							toBeExecuted = cell.getBooleanCellValue();
							break;
						}
					}

					if(toBeExecuted && !(testScript.contains(" "))){
				
						if(workbook.getSheetName(i).equalsIgnoreCase("Dev Documentation"))
						{
							if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.DevDocumentation."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						} 
						else if(workbook.getSheetName(i).equalsIgnoreCase("Shortcodes and VTN Mgmt Dev"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.ShortCodeManagement.Developer."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("Shortcodes and VTN Mgmt OPA"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.ShortCodeManagement.OPA."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("Dev Onboarding"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.DevOnboarding."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						} 
						if(workbook.getSheetName(i).equalsIgnoreCase("Playground"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.Playground."+testScript));
							System.out.println(testScript +" - ");
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("Org Onboarding"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.OrgOnBoarding."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("App OnBoarding - App Detail"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.AppOnboarding.AppDetailPage."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("App OnBoarding - Edit app"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.AppOnboarding.EditApp."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("App OnBoarding - New app"))
						{	if(testScript != null)	
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.AppOnboarding.NewAppPage."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("App OnBoarding - My app"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.AppOnboarding.MyAppPage."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("Dev Analytics - Adv"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.Developer_Analytics_Advertising."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else if(workbook.getSheetName(i).equalsIgnoreCase("Dev Analytics - Api"))
						{	if(testScript != null)
							result = JUnitCore.runClasses(Class.forName("ATT.Selenium_FVT.Developer_Analytics_API_Analytics."+testScript));
							System.out.println(testScript +" - "+ result.toString());
						}
						else
						{
							continue;
						}
						//This data needs to be written (Object[])
						Map<String, Object[]> data = new TreeMap<String, Object[]>();
						if(result.wasSuccessful()){
							data.put(resultRowCount.toString(), new Object[] {++resultRowCount, testScript, "Pass"});
						}
						else{
							data.put(resultRowCount.toString(), new Object[] {++resultRowCount, testScript, "Fail"});
						}

					
						int cellnum = 0;
						Set<String> keyset = data.keySet();
						for (String key : keyset)
						{
							Row resultRow = resultSheet.createRow(resultRowCount);
							Object [] objArr = data.get(key);
							for (Object obj : objArr)
							{
								Cell resultCell = resultRow.createCell(cellnum++);
								if(obj instanceof String)
									resultCell.setCellValue((String)obj);
								else if(obj instanceof Integer)
									resultCell.setCellValue((Integer)obj);
								else if(obj instanceof Boolean)
									resultCell.setCellValue((Boolean)obj);
							}
						}
					}

				}


			}  
			//Write the workbook in file system
			resultWorkbook.write(out);
			System.out.println("Result file written successfully on disk.");


		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@After
	public void closeConnections(){
		try {
			out.close();
			inputFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}