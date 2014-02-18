package ATT.Selenium_FVT.Utilities.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesToFile {
	
	
	Properties prop ;
	FileInputStream in;
	FileOutputStream out;
	String propertyFilePath;
	
	public WritePropertiesToFile(String propertyFilePath){
		this.propertyFilePath= propertyFilePath;
		prop = new Properties();
	}
	
	public void loadPropertyFile(){
		try {
			in = new FileInputStream(propertyFilePath);
			out = new FileOutputStream(propertyFilePath);
			prop.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setKeyProperty(String keyValue){
		prop.setProperty("key", keyValue);
		
	}
	
	public void setSecretProperty(String secretValue){
		prop.setProperty("secret", secretValue);
	}
	
	public void setOfflineShortCode(String offlineShortCode){
		prop.setProperty("shortcode_SMSMMSAPP", offlineShortCode);
	}
	
	public void setOnlineShortCode(String onlineShortCode){
		prop.setProperty("shortcode", onlineShortCode);
	}
	

	public void storePropertyFile(){
		try {

		prop.store(out, null);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}
	
	
	
	
}
