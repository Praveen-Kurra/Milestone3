package com.DataProvider.InTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	@DataProvider(name="Login")
	public Object[][] DataFromExcell() throws Exception {

//		DataFormatter df = new DataFormatter();
		
		

		File excelFile = new File("./src/test/resources/Book1.xlsx");

		FileInputStream fis = new FileInputStream(excelFile);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rows = sheet.getPhysicalNumberOfRows();

		int columns = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows - 1][columns];

		for (int i = 0; i < rows - 1; i++) {

			for (int j = 0; j < columns; j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();

			}			
		}

		wb.close();
		fis.close();

		return data;
	}

	
	
	
}

