package com.jbk.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LogsForPage {
	FileInputStream fis = null;
	Properties prop = null;
	
	public Logger pageLogs(String fileName){
		
		 Logger logs = Logger.getLogger(LogsForPage.class);
		
		
		//String path = "D:\\Personal\\java\\workspace\\OfflineWebsiteFW\\src\\main\\resources\\log4jPage.properties";
		
		String userDirectory = FileSystems.getDefault().getPath("").toAbsolutePath().toString()+"\\src\\main\\resources\\"+fileName;
        //System.out.println(userDirectory);
		
		
		//System.out.println(path1);
		
		PropertyConfigurator.configure(userDirectory);
		
		/*try {

			fis = new FileInputStream(
					
			prop.load(fis);
		}catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}*/
		
		
		return logs;
		
		
	}
	
	/*public static void main(String[] args) {
		
		LogsForPage lg =new LogsForPage();
		
		lg.pageLogs();
		
	}*/

}
