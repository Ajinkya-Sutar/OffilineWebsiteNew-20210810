package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.DashboardPage;
import com.jbk.pages.DownloadPage;
import com.jbk.pages.LoginPage;
import com.jbk.pages.OperatorsPage;
import com.jbk.pages.UserPage;
import com.jbk.testbase.TestBase;

public class DownloadTest extends TestBase{
	UserPage up = null;
	LoginPage lp = null;
	DashboardPage dp = null;
	OperatorsPage op =null;
	DownloadPage dlp;

	@BeforeSuite
	public void setup() {
		driver = initialization();
		lp = getLoginPageDriver();
		up = getUserPageDriver();
		dp = getDashboarPageDriver();
		op = getOperatorPageDriver();
		dlp=getDownloadPageDriver();
		lp.navigate_dashboard_page();
		dp.navigateToDownloadPage();
	}
	
	
	
	
	@Test(priority = 11)
	public void validate_vendor(){
		lp.navigate_dashboard_page();
		dp.navigateToDownloadPage();
		Assert.assertTrue(dlp.verify_vendors());
	}

}
