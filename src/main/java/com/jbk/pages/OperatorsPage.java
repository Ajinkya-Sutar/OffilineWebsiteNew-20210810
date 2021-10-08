package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.OperatorPageRepository;
import com.jbk.utility.ArrayListUtility;
import com.jbk.utility.UtilityOWFWExl;
import com.jbk.utility.WaitUtility;

public class OperatorsPage extends OperatorPageRepository {

	
	WebDriver driver =null;
	UtilityOWFWExl exl = new UtilityOWFWExl();
	ArrayListUtility al = new ArrayListUtility();
	WaitUtility wl = new WaitUtility();
	
	
	public OperatorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verify_Title(){
		//String text = driver.getTitle();
   	 if(titleOperatorPage.getText().equals("JavaByKiran | Operators")){
   		 return true; 
   	 }
		return false;
    }
	
	public boolean verifyPersonJob(){	
		ArrayList<String> actPerson = null;
		actPerson=al.getDataIntoArrayList(actPerson, person);
		System.out.println(actPerson);

		List<String> expPerson = null;
		expPerson=al.getDataIntoArrayListExlcol(expPerson, exl, "loginPageData.xls", "operator", 2);
		System.out.println(expPerson);
		ArrayList<String> actJob = null;
		actJob=al.getDataIntoArrayList(actJob, forJob);
		System.out.println(actJob);
		
		int temp=0;
		for(int i = 0 ; i< actJob.size();i++){
			
			String el = actJob.get(i);
			if(el.contains("Urgent Technical Help")){
				temp=i;
			}
		}
		
		List<String> exJob = null;
		exJob=al.getDataIntoArrayListExlcol(exJob, exl, "loginPageData.xls", "operator", 3);
		System.out.println(exJob);
		
		String actel=null;
		for(int i=0; i<actPerson.size();i++){
			  String text = actPerson.get(i);
			  if(text.equals("Neelam")){
				  actel = actJob.get(i);
			  }
		}
		
		String expel=null;
		for(int i=0; i<expPerson.size();i++){
			  String text = expPerson.get(i);
			  if(text.equals("Neelam")){
				  expel = exJob.get(i);
				  
			  }
		}
		System.out.println(expel);
			  
			  if(actel.equals(expel)){
				  
				  return true;
			  }
			return false;
		
		
			
		}

}
 