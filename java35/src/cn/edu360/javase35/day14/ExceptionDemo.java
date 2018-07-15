package cn.edu360.javase35.day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
	public static void main(String[] args) {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");
		Date d1=null;
		String format=null;
		try {
			d1=d.parse("2015-12-12,12:12:12");
			 format = d.format(d1);
		} catch (ParseException e) {
			d1=new Date();
		}
		System.out.println(d1);
		System.out.println(format);
	}
}
