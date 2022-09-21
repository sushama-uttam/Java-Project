package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;

	public ReadExcelData(String file,String sheetName) throws IOException {
		FileInputStream fis;
		try {
			fis=new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Object[][] readData(int row,String testName){
		Object[][] data=null;
		Row xssfRow = sheet.getRow(0);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCols = xssfRow.getLastCellNum();
		data = new Object[noOfRows - 1][noOfCols];
		System.out.println("Test Name:"+testName);
		int a,b;
		if(testName.equalsIgnoreCase(getStringValue(row, 0))) {
			a=0;
			for (int i = row; i < noOfRows; i++,a++) {
				b=0;
				for (int j = 0; j < noOfCols; j++,b++) {
					//xssfRow = sheet.getRow(i);
					CellType cell = sheet.getRow(i).getCell(j).getCellType();
					//data[i - 1][j] = cell.getStringCellValue();		
					switch (cell) {
					case STRING:
						data[a][b]=getStringValue(i,j);//sheet.getRow(i).getCell(j).getStringCellValue();
						break;
					case NUMERIC:               
						data[a][b]=getNumericValue(i, j);//sheet.getRow(i).getCell(j).getNumericCellValue();
						break;                              
					}
				}
			}
		}
		return data;
	}

	public String getStringValue(int i,int j) {
		String value = sheet.getRow(i).getCell(j).getStringCellValue();
		return value;
	}

	public Double getNumericValue(int i,int j) {
		Double val = sheet.getRow(i).getCell(j).getNumericCellValue();
		return val;
	}
}
