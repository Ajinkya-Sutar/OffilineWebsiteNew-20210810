package com.jbk.utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityOWFWExl {

	 FileInputStream fis;
	 Workbook wb;
	 Sheet sht;

	public  List<String> getColumeData(String filepath, String sheet_name,int cols) {

		DataFormatter df = new DataFormatter();
		try {
			fis = new FileInputStream(filepath);
			wb = WorkbookFactory.create(fis);
			sht = wb.getSheet(sheet_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<String> required_data = new ArrayList<String>();
		
			int col = sht.getLastRowNum();
			for (int j = 1; j <=col; j++) {
				Cell c = sht.getRow(j).getCell(cols-1);
				String value = df.formatCellValue(c);
				required_data.add(value);
			}
			return required_data;
		}
	
	public  List<String> getRowData(String filepath, String sheet_name,int rows) {

		DataFormatter df = new DataFormatter();
		try {
			fis = new FileInputStream(filepath);
			wb = WorkbookFactory.create(fis);
			sht = wb.getSheet(sheet_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<String> required_data = new ArrayList<String>();
		
			int row1 = sht.getRow(rows-1).getLastCellNum();
			for (int j = 0; j <row1; j++) {
				Cell c = sht.getRow(rows-1).getCell(j);
				String value = df.formatCellValue(c);
				required_data.add(value);
			}
			return required_data;
		}
	
	
}
