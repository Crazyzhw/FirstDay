package cn.edu360.javase35.day10;

import java.util.Arrays;

public class StringDemo5 {
	public static void main(String[] args) {
		String  s = "dadefafe";
		byte [] b1 =s.getBytes();	
		System.out.println(Arrays.toString(b1));
		char [] c =s.toCharArray();
		System.out.println(Arrays.toString(c));
		
	}
}
