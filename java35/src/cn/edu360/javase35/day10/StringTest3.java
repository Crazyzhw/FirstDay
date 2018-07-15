package cn.edu360.javase35.day10;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String s = sc.nextLine();
		System.out.println(s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()));
}
}
