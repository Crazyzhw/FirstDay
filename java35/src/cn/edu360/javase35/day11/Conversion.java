package cn.edu360.javase35.day11;

public class Conversion {
	public static void main(String[] args) {
		int i =200;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.parseInt("200", 20));
		System.out.println(Integer.toString(i, 2));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		}
}
