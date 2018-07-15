package cn.edu360.javase35.day10;

public class StringDemo4 {
	public static void main(String[] args) {
		String s = "国破山河在，城春草木深。感时花溅泪，恨别鸟惊心"	;
		String s1 ="here with you a";
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("城"));
		System.out.println(s1.indexOf(97));
		System.out.println(s1.indexOf("wi"));
		System.out.println(s1.indexOf("wi",5));
		System.out.println(s1.substring(3,5));
		}
}
