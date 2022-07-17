package com.practise;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellll {
	

	 XSSFWorkbook workBook;

	public Excellll() {

		File src = new File("./testData/Book1.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);

			workBook = new XSSFWorkbook(fis);
		} catch (Exception e) {

			System.out.println("Unable to Read Excell File");

		}

	}

	
	
	public  String UserName() {
		
	   
				return	workBook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		
		
		
	}
	
	
	
	
	public String getstringdata(int sheetIndex, int row, int columm) {
		return workBook.getSheetAt(sheetIndex).getRow(row).getCell(columm).getStringCellValue();

	}

	public double getNumericdata(int sheetIndex, int row, int columm) {
		return workBook.getSheetAt(sheetIndex).getRow(row).getCell(columm).getNumericCellValue();

	}

	public double getNumericdata(String sheetname, int row, int columm) {
		return workBook.getSheet(sheetname).getRow(row).getCell(columm).getNumericCellValue();

	}
	
	public String getstringdata(String SheetName, int row, int columm) {

			return workBook.getSheet(SheetName).getRow(row).getCell(columm).getStringCellValue();
	

	}
	

}
