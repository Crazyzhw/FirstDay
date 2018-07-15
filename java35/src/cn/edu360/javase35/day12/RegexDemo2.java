package cn.edu360.javase35.day12;

import java.util.Scanner;

public class RegexDemo2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入qq");
	String qq = sc.nextLine();
	System.out.println(checkQQ(qq));
	}
	public  static boolean  checkQQ(String qq) {
		String regex = "[1-9]{1,2}[0-9]{4,13}";
		return qq.matches(regex);
	}
}
