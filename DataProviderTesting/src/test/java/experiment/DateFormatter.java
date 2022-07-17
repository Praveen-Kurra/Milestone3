package experiment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateFormatter {

	public static void main(String[] args) throws Exception {

	Date date=new Date();
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
	
	System.out.println(sdf.format(date));
	

	Calendar cal=Calendar.getInstance();
	
	System.out.println(sdf.format(cal.getTime()));
	
      System.out.println(Calendar.AM_PM);
      
      System.out.println(Calendar.WEEK_OF_YEAR);
	
	
	}
}
