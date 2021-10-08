package com.jbk.test;

import java.util.List;


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
import com.jbk.utility.ArrayListUtility;
import com.jbk.utility.UtilityOWFWExl;

public class UserPageTest extends TestBase {

	UserPage up = null;
	LoginPage lp = null;
	DashboardPage dp = null;
	OperatorsPage op =null;
	UtilityOWFWExl exl = new UtilityOWFWExl();
	ArrayListUtility al = new ArrayListUtility();

	@BeforeSuite
	public void setup() {
		driver = initialization();
		lp = getLoginPageDriver();
		up = getUserPageDriver();
		dp = getDashboarPageDriver();
		lp.navigate_dashboard_page();
		dp.navigateToUserPage();

	}
	
	
	
	
	

	@Test(priority = 7)
	public void verify_user_page() {
		
		Assert.assertTrue(up.verify_Title());
		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}

	
	@Test(priority = 8)
	public void validate_user_page() {
		
		Assert.assertTrue(up.verify_header());
	}

}
