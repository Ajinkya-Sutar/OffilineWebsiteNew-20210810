package com.jbk.objectRepository;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jbk.utility.LogsForPage;

public class UserPageRepository extends LogsForPage{

	 @FindBy(xpath = "//th")
	  protected List<WebElement> headers;
	 
	 @FindBy(xpath="//title")
	    public WebElement titleUserPage;
	 
	 

}
