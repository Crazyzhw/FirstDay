
package cn.edu360.javase35.day02;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String result = "不相等"; 
		if (x==y) {
			result ="相等";
		}
		System.out.println(result);
		
}
}