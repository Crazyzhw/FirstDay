package cn.edu360.javase35.day04;

import java.util.Scanner;

public class DoWhileDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int score =-10;
		do {
			System.out.println("请输入数据1|0");
			result = sc.nextInt();
			score+=10;
		}while (result==1);
		System.out.println("score"+score);	
	}
}
