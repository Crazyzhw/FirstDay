package cn.edu360.javase35.day10;

public class StringDemo3 {
	public static void main(String[] args) {
		String s = "abC";
		String s1 = "AbC";
		System.out.println(s.equalsIgnoreCase(s1));
		String s3 = "abCdedAbC";
		System.out.println(s3.contains(s));
		System.out.println(s3.startsWith(s));
		System.out.println(s3.endsWith(s1));
		System.out.println(s3.isEmpty());
		
	}
}

