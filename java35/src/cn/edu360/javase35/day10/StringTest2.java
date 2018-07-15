package cn.edu360.javase35.day10;

import java.util.Arrays;
import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String  s = sc.nextLine();
		int count1 =0;
		int count2 =0;
		int count3 =0;
		char []  chs = new char [s.length()];
		for (int i = 0;i<s.length();i++) {
			chs[i]=s.charAt(i);
			if (s.charAt(i)>96&&s.charAt(i)<124) {
				count1++;
			}else if(s.charAt(i)>=65&&s.charAt(i)<=91) {
				count2++;
			}else if (s.charAt(i)>=48&&s.charAt(i)<=58) {
				count3++;
			}
		}
		System.out.println("小写字母："+count1);
		System.out.println("大写字母："+count2);
		System.out.println("数字："+count3);
		System.out.println(Arrays.toString(chs));
		char x = 'z'-'a';
		System.out.println(0+'0');
	}
}
