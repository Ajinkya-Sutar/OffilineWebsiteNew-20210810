package com.jbk.utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ArrayListUtility {
	
	public ArrayList<String> getDataIntoArrayList(ArrayList<String> actual , List<WebElement> repoEle){
		actual = new ArrayList<String>();
		for (WebElement ele : repoEle) {
			String text = ele.getText();
			 actual.add(text);
		}
		return actual;
		
	}
	
	public List<String> getDataIntoArrayListExlcol(List<String> exp , UtilityOWFWExl exl , String filepath, String sheet_name , int cols){
		/*exp = new ArrayList<String>();
		exl = new UtilityOWFWExl();*/
		exp= exl.getColumeData(filepath, sheet_name, cols);
		return exp;
		
	}

}
