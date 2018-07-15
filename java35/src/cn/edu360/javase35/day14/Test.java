package cn.edu360.javase35.day14;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Person p= new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = sc.nextInt();
		try {
			p.setAge(age);
		} catch (MyException e) {
			System.out.println("输入有误，请重新输入");
			age= sc.nextInt();
			p.setAge(age);
		}
		System.out.println("你的年龄是："+age+"，输入正确");
	}
}
