package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.utility.LogsForPage;

public class LoginPageObjectRepository extends LogsForPage{

	@FindBy(xpath = "//p[text()='Sign in to start your session']")
	public WebElement heading;

	@FindBy(xpath = "//b[text()='Java By Kiran']")
	public WebElement title;

	@FindBy(xpath = "//h4[text()='JAVA | SELENIUM | PYTHON']")
	public WebElement title1;

	@FindBy(xpath = "//a[text()='Register a new membership']")
	public WebElement title2;

	@FindBy(id = "email")
	public WebElement emailId;

	@FindBy(id = "password")
	public WebElement pass;

	@FindBy(xpath = "//button")
	public WebElement butn;

}
