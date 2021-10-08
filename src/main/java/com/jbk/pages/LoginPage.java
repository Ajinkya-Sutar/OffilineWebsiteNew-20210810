package com.jbk.pages;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.LoginPageObjectRepository;


public class LoginPage extends LoginPageObjectRepository{

	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void navigate_dashboard_page(){
		emailId.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		butn.click();
			
	}
	
	
	
	public boolean verifyHeading(){
		
		pageLogs("log4jPage.properties").info(driver + "verifyHeading LoginPage new logs");
		String exp_heading = "Sign in to start your session";
		String act_heading = heading.getText();	
		
		if(act_heading.equals(exp_heading)){
			pageLogs("log4jPage.properties").info("Heading matched");
			return true;
		}else{
			pageLogs("log4jPage.properties").info("Heading did not matched");
			return false;
		}
		
		/*try{
			pageLogs("log4jPage.properties").info(driver + "verifyHeading LoginPage new logs"); 
			
			
		} catch(Throwable t){
			return false;
			
		}*/
		
	
	}
	
	
	public boolean verifyTitle(){
		
		String expTitle = "Java By Kiran";
		String actTitle = title.getText();
		
		if(actTitle.equals(expTitle)){
			
			return true;
		}else{
			
			return false;
		}

	}
	
    public boolean verifyTitle1(){
		
    	String expTitle1 = "JAVA | SELENIUM | PYTHON";
		String actTitle1 = title1.getText();

		
		if(actTitle1.equals(expTitle1)){
			
			return true;
		}else{
			
			return false;
		}

	}
	
        public boolean verifyTitle2(){
		
    	String expTitle2 = "Register a new membership";
		String actTitle2 = title2.getText();

		
		if(actTitle2.equals(expTitle2)){
			
			return true;
		}else{
			
			return false;
		}
    }
	
}
