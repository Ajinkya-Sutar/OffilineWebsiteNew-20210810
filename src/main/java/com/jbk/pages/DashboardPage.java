package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;


import com.jbk.objectRepository.DashboardPageRepositary;

import com.jbk.utility.UtilityOWFWExl;

public class DashboardPage extends DashboardPageRepositary {

	WebDriver driver =null;
	UtilityOWFWExl exl = new UtilityOWFWExl();

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
     public void navigateToUserPage(){
		user.click();
	}
     
     public void navigateToOperatorPage(){
 		operators.click();
 	}
     
     public void navigateToDownloadPage(){
  		download.click();
  	}
     
    /* public boolean verify_userpage_title(){
    	 
    	 
    	 
    	 
		return false;
    	 
    	 
     }*/
     public boolean verify_Title(){
    	 String title = driver.getTitle();
    	 System.out.println(title);
    	 
    	 
    	 if(title.equals("JavaByKiran | Dashboard")){
    		 return true;
    		 
    	 }else{
    		 return false;
    		 
    	 }
    	 
		
    	 
    	 
     }
     
     
     
     
	public boolean verify_courses() {
		System.out.println(driver + " dashboardPage");
		ArrayList<String> actCourses = new ArrayList<String>();
		for (WebElement el : courses) {
			String eachcourse = el.getText();
			actCourses.add(eachcourse);
		}

		System.out.println(actCourses);

		List<String> expCourses = new ArrayList<String>();
		expCourses = exl.getRowData("loginPageData.xls", "courses", 1);

		System.out.println(expCourses);

		if (actCourses.equals(expCourses)) {

			return true;
		} else {

			return false;
		}

	}

	
}
