package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.utility.LogsForPage;

public class DashboardPageRepositary extends LogsForPage{
	
	
	@FindBy(xpath = "//h3")
	public  List<WebElement> courses;
	
	@FindBy(xpath="//span[text()='Users']")
    public WebElement user;
	
	@FindBy(xpath="//span[text()='Operators']")
    public WebElement operators;
	
	
	@FindBy(xpath="//title[text()='JavaByKiran | Dashboard']")
    public WebElement title;
	
	@FindBy(xpath="//span[text()='Downloads']")
    public WebElement download;
	

}
