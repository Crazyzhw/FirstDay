package cn.edu360.javase35.day04;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner sc = new   Scanner(System.in );
		String result=" ";
		String passWord="abcd1234";
		System.out.println("请输入你的八位数密码");
		do {
			result = sc.nextLine();
			if(!result.equals(passWord))
			System.out.println("密码错误，请再次输入你的八位数密码");
		}while (!result.equals(passWord));
		System.out.println("密码输入正确");
	}
}
