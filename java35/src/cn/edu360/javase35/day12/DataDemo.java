package cn.edu360.javase35.day12;

import java.util.Date;

public class DataDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		Date d1 = new Date(1325845845845L);
		System.out.println(d1);
		System.out.println(System.currentTimeMillis());
		d.setTime(1325845845845L);
		d.setTime(0);
		System.out.println(d);
	}
}
