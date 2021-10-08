package com.jbk.test;



import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;
import com.jbk.pages.LoginPage;
import com.jbk.testbase.TestBase;
import com.jbk.utility.LogsForPage;


public class LoginTest extends TestBase {

	
	WebDriver driver = null;
	
	static DashboardPage dp = null;
	
	LoginPage lp = null;
	
	LogsForPage lg =new LogsForPage();
	
	
	

	@BeforeSuite
	public void setup() {
		driver = initialization();
		lp=getLoginPageDriver();
		
	}
	

	
	@Test(priority=1)
	public void validateHeading(){
		//System.out.println(driver +" validateHeading LoginTest");
		lg.pageLogs("log4jPage.properties").info(driver + "verifyHeading LoginPage new logs");
		Assert.assertTrue(lp.verifyHeading());
		
	}
	
	@Test(priority=2)
	public void validateTitle(){
		lg.pageLogs("log4jPage.properties").info("please do it");
		Assert.assertTrue(lp.verifyTitle());
		
	}
	
	@Test(priority=3)
	public void validateTitle1(){
		Assert.assertTrue(lp.verifyTitle1());
		
	}
	
	@Test(priority=4)
	public void validateTitle2(){						
		Assert.assertTrue(lp.verifyTitle2());
		
	}
	
	
	
	/*@Test(priority=5)
	public void verifyValidLogin() {

		lp.validLogin();
		System.out.println(driver +" verifyValidLogin LoginTest");

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");

	}*/
	
	
}
