package ATT.Selenium_FVT.Utilities.Excel;

import java.io.File;

public class FileHandling {

	
	
	//Function check if export file already exists or not-Hemant 
	//***********************************************************************************************************************************			
		public boolean fnCheckFileExists(String filePathString){													
			try{
				File f = new File(filePathString);

				if(f.exists()){
					System.out.println("File  " + filePathString + " Exists");
					return true;
				}else{
					System.out.println("File does not Exists");
					return false;
				}
				
			}catch(Exception e){						
				e.printStackTrace();
				return false;
			}												
		}
	//***********************************************************************************************************************************
	
	//Function to rename the file - Hemant
	//***********************************************************************************************************************************	
		public boolean fnCheckFileRenamed(String sOldFilePath, String sNewFilePath){

			File oldfile =new File(sOldFilePath);
			File newfile =new File(sNewFilePath);
	 
			if(oldfile.renameTo(newfile)){
				System.out.println("Rename succesful");
				return true;
			}else{
				System.out.println("Rename failed");
				return false;
			}		
			
		}
	//***********************************************************************************************************************************		


		
		
}
