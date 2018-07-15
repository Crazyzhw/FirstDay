package cn.edu360.javase35.day02;

import java.util.Scanner;

/**
 * 需求：打印  1
 *		1  2  1
 *   1  2  3  2 1
 * */
public class ForTest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数");
		int num = sc.nextInt();
		for (int i =0;i <num;i++) {
			
			for (int y = i;y <num-1;y++) {
				System.out.print(" ");
			}
			for(int z =1;z <= i+1 ;z++) {
				System.out.print(z);
		}
			for (int x =i;x >=1;x-- ) {
				System.out.print(x);
			}
			
		System.out.println();
	}
	}
}
