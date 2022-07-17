package com.resuable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
	public static  String getDatetimeFormat() {
		
		DateFormat cusFormat=new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
		
		Date date=new Date();
		
	return	cusFormat.format(date);
	}

}
