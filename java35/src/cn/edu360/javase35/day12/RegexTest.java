package cn.edu360.javase35.day12;

import java.util.Arrays;

public class RegexTest {
	public static void main(String[] args) {
		String str= "haello    world   sjksfj sfs";
		String  str1 = "abcddsadsdseewwe  wewewew";
		String []  s = str.split(" +");
		String [] s1 = str1.split("(.)\\1+");
		for (int i = 0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		for (int i = 0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
	}

}
