package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DownloadPageRepository;
import com.jbk.utility.ArrayListUtility;
import com.jbk.utility.UtilityOWFWExl;
import com.jbk.utility.WaitUtility;

public class DownloadPage extends DownloadPageRepository {
	
	WebDriver driver;
	UtilityOWFWExl exl = new UtilityOWFWExl();
	ArrayListUtility al = new ArrayListUtility();
	WaitUtility wl = new WaitUtility();
	
	
	
	
	
	public DownloadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}





	public boolean verify_vendors(){
		
		ArrayList<String> actVendor = null;
		actVendor=al.getDataIntoArrayList(actVendor, vendor);
		//System.out.println(actVendor);
		
		
		//System.out.println("---------------");
		
		List<String> expVendor = null;
		expVendor=al.getDataIntoArrayListExlcol(expVendor, exl, "loginPageData.xls", "vendor", 1);
		//System.out.println(expVendor);
		
		
		if(actVendor.equals(expVendor)){
			
			return true;
			
		}else{
			return false;
		}
		
	
		
	}
	
	

}
