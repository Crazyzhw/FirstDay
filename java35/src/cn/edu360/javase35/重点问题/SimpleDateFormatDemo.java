package cn.edu360.javase35.重点问题;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println(d);
		SimpleDateFormat  s = new SimpleDateFormat("yyyy/MM/dd  HH:mm:SS");
		System.out.println(s.format(d));
		String str = "2018/24/20  12:12:12";
		try {
			System.out.println(s.parse(str));
		} catch (Exception e) {
			System.out.println("输错了 ");
		}
		for (int i = 0; i <5; i++) {
			System.out.println(i);
		}
		System.out.println(new Date().getTime());
		
	}
}
