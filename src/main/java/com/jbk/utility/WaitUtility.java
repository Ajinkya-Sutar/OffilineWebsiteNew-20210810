package com.jbk.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jbk.testbase.TestBase;

public class WaitUtility extends TestBase {
	
	
	public void Iwait(long time){
		
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	public void Ewait(WebElement element , long time){
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
