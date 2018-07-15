package cn.edu360.javase35.day01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓名");
		String name = sc.nextLine();
		System.out.println("你的姓名是"+name);
	}

}
