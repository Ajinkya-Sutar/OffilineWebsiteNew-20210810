package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.UserPageRepository;
import com.jbk.utility.UtilityOWFWExl;

public class UserPage extends UserPageRepository {

	WebDriver driver = null;
	UtilityOWFWExl exl = new UtilityOWFWExl();

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public boolean verify_Title(){
		
		String text =driver.getTitle();
	   	 if(text.equals("JavaByKiran | User")){
	   		 return true; 
	   	 }
			return false;
	    }

	public boolean verify_header() {
		ArrayList<String> actHeader = new ArrayList<String>();
		for (WebElement el : headers) {
			String eachHeader = el.getText();
			actHeader.add(eachHeader);
		}
		
		List<String> expHeader = new ArrayList<String>();
		expHeader = exl.getRowData("loginPageData.xls", "header", 1);
		
		
		if (actHeader.equals(expHeader)) {

			return true;
		} else {

			return false;
		}

	}

}
