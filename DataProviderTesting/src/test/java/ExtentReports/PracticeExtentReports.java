package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class PracticeExtentReports {

	public static void main(String[] args) {
		ExtentReports extentReport=new ExtentReports();
		ExtentSparkReporter sparkReport=new ExtentSparkReporter("./ExtentReprts/Report1.html");
		
		extentReport.attachReporter(sparkReport);
		
		extentReport.createTest("This is test 1").pass("This is pass");
		
//		extentReport.createTest("This is test 1").log(Status.PASS, "This will be pass");
		
		
     String Jsondata="{\"menu\": {\r\n"
     		+ "  \"id\": \"file\",\r\n"
     		+ "  \"value\": \"File\",\r\n"
     		+ "  \"popup\": {\r\n"
     		+ "    \"menuitem\": [\r\n"
     		+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
     		+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
     		+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
     		+ "    ]\r\n"
     		+ "  }\r\n"
     		+ "}}";
		
		String XmlData="<menu id=\"file\" value=\"File\">\r\n"
				+ "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
				+ "  </popup>\r\n"
				+ "</menu>\r\n"
				+ "";
		
	
		
// for list data
		// 
		
		//extentReport.createTest("This is test 2").info(MarkupHelper.createOrderedList(arraylist or collection data));
		
		
		
		
		
		
		
		
		extentReport.createTest("This is test 2").info(MarkupHelper.createCodeBlock(XmlData,CodeLanguage.XML));
		
		extentReport.createTest("This is test 3").info(MarkupHelper.createCodeBlock(Jsondata,CodeLanguage.JSON));
		
		
		extentReport.flush();
		
	}

}
