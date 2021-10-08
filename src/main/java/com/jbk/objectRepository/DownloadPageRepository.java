package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.utility.LogsForPage;

public class DownloadPageRepository extends LogsForPage {
	
	
	
	
	@FindBy(xpath="//title")
    public WebElement title;
	
	
	@FindBy(xpath="//td[3]")
	public List<WebElement> vendor;

}
