package cn.edu360.javase35.day04;

import java.util.Scanner;

public class MethodTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		System.out.println("请输入一个名字");
		sys(sc.nextLine());
		get(7,8);
	}
		public static double cha(double a,double b) {
			return a-b;
		}
		
		public static  void   sys(String a) {
			System.out.println("你真漂亮"+a);
		}
		public static  boolean   panDuan(int a ) {
			if (a%2==0) {
				return true;
			}else {
				return false;
			}
		}
		
		public static  void   get (int a ,int b) {
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println((double)a/b);
		}
		
}
