package ExcelUtility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtils(String excelPath,String sheetName) throws IOException  {
		//		String dirPath = System.getProperty("user.dir");
		//		String filePath = dirPath+"/Data/TestDat.xlsx";
		//String filePath = "./Data/TestDat.xlsx";
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	public static Object getCellData(int rowNum, int colNum) { 
		String[][] data = null;
		XSSFRow row = sheet.getRow(0);
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCols = row.getLastCellNum();
		Cell cell;
		data = new String[noOfRows - 1][noOfCols];
		for (int i = 1; i < noOfRows; i++) {
			for (int j = 0; j < noOfCols; j++) {
				row = sheet.getRow(i);
				cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}
		}
//		DataFormatter formatter = new DataFormatter();
//		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
//		System.out.println("******"+value.toString());
		return data;
	}
}
