package com.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utilities.ExcellDataProvider;

public class ExcellTest {

	public static void main(String[] args) throws Exception {
		
//		File src = new File("./testData/Book1.xlsx");
//		
//		FileInputStream fis = new FileInputStream(src);
//
//		 XSSFWorkbook workBook= new XSSFWorkbook(fis);
		 
		 
	   Excellll ecel=new Excellll();
	   
	   ExcellDataProvider ep=new ExcellDataProvider();
	   
	  String a=  ecel.UserName();
	  
	  String b=ecel.getstringdata(0, 1, 1);
	  
	  String c=ep.getstringdata(0, 1, 0);
	
	   //  System.out.println(a);
	     System.out.println(b);
	    System.out.println(c);
	
	}

}
