package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import AddPlace.UserInfo;
import static io.restassured.RestAssured.given;
import ExcelUtility.ExcelUtils;
import POJO.Place_API;
import io.restassured.response.Response;

public class ReadExcelData {
	
	@DataProvider(name="Read")
	public Object[][] readData(){
		String filePath = "./Data/TestData.xlsx";
		String sheetName = "User Details";
		//ExcelUtils excelUtils = new ExcelUtils(filePath,sheetName);
		Object[][] data=null;
		//data=excelUtils.getCellData(1, "post");
		return data;
	}
	private static Response response;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	@Test
	public void display() throws IOException  {
		
		JSONObject request = new JSONObject();
//		request.put("name", excelUtils.getCellData(1,0));
//		request.put("job", excelUtils.getCellData(1,1));
		response = given().header("Content-type", "application/json").and().body(request).
				when().post(" https://reqres.in/api/users").then().extract().response();
		String stringToParse = response.getBody().asString();
		ObjectMapper objectMapper = new ObjectMapper();
		UserInfo userInfo = objectMapper.readValue(stringToParse, UserInfo.class);        
		writeResponse(userInfo);
	}
	private void writeResponse(UserInfo userInfo) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("Sheet1");
		Object[][] respData = {
				{"location", "accuray", "name","phone_number","address","types","website","language"},
				//{Place_API.(),Place_API.getA  }
		};
		int rowCount = 0;
		for (Object[] rData : respData) {
			Row row = sheet.createRow(++rowCount);
			int columnCount = 0;
			for (Object field : rData) {
				Cell cell = row.createCell(++columnCount);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}

		FileOutputStream outputStream = new FileOutputStream("./data/Response.xlsx");
		try {
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
