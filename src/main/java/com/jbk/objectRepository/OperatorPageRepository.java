package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.utility.LogsForPage;

public class OperatorPageRepository extends LogsForPage {

	@FindBy(xpath = "//tr//td[2]")
	public List<WebElement> person;
	
	@FindBy(xpath = "//tr//td[3]")
	public List<WebElement> forJob;

	@FindBy(xpath = "//tr//td[4]")
	public List<WebElement> wayToConnect;
	
	@FindBy(xpath="//title[text()='JavaByKiran | Operators']")
    public WebElement titleOperatorPage;
	
	
}
