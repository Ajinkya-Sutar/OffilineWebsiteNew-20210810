package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;
import com.jbk.pages.LoginPage;
import com.jbk.pages.OperatorsPage;
import com.jbk.pages.UserPage;
import com.jbk.testbase.TestBase;
import com.jbk.utility.UtilityOWFWExl;

public class DashboardTest extends TestBase {

	DashboardPage dp = null ;
	static UserPage up = null;
	LoginPage lp = null;
	

	UtilityOWFWExl exl = new UtilityOWFWExl();

	@BeforeSuite
	public void setup() {
		
		driver = initialization();
		lp = getLoginPageDriver();
	    dp = getDashboarPageDriver();
	    lp.navigate_dashboard_page();
	    
	}
	
	

	@Test(priority = 5)
	public void verifyValidLogin() {
		pageLogs("log4jTest.properties").info("verifyingValidLogin");
		Assert.assertTrue(dp.verify_Title());

	}

	@Test(priority = 6)
	public void validateCourse() {
		pageLogs("log4jTest.properties").info("validatingCourses");
		Assert.assertTrue(dp.verify_courses());
	}

}
