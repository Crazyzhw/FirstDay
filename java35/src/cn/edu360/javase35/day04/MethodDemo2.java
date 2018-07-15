package cn.edu360.javase35.day04;

import java.util.Scanner;

public class MethodDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("请输入一个名字");
		write(sc.nextLine());
	}
	public static void write (String a ) {
		System.out.println("你好，"+a);
	}
}
