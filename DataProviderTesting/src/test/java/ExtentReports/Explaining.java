package ExtentReports;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Explaining {

	public static void main(String[] args) throws Exception {
	
		
		File src=new File("./src/test/resources/Book1.xlsx");
		
		
		//     ./src/test/resourses/Book1.xlsx
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
	    String userName=sheet.getRow(10).getCell(3).getStringCellValue();
	
//	String password=sheet.getRow(1).getCell(0).getStringCellValue();
	
	  System.out.println(userName);

	}

}
