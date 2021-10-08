package com.jbk.test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;
import com.jbk.pages.LoginPage;
import com.jbk.pages.OperatorsPage;
import com.jbk.pages.UserPage;
import com.jbk.testbase.TestBase;
import com.jbk.utility.WaitUtility;

public class OperatorTest extends TestBase {

	
	WaitUtility wl = new WaitUtility();
	
	UserPage up = null;
	LoginPage lp = null;
	DashboardPage dp = null;
	OperatorsPage op =null;
	
	@BeforeSuite
	public void setup() {
		driver = initialization();
		lp = getLoginPageDriver();
		up = getUserPageDriver();
		dp = getDashboarPageDriver();
		op = getOperatorPageDriver();
		
		lp.navigate_dashboard_page();
		dp.navigateToOperatorPage();
	}
	
	
	
	
	@Test(priority = 9)
	public void validateTitle(){
	Assert.assertTrue(op.verify_Title());
	}
	
	@Test(priority = 10)
	public void validate_person_job(){
		
		Assert.assertTrue(op.verifyPersonJob());
	}
	
	
	
	
	
	
}
