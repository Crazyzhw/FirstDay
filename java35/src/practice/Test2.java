package practice;

import java.util.Scanner;

/**
 * 计算机内部用二进制来表达所有的值。一个十进制的数字，比如18，
 * 在一个32位的计算机内部被表达为00000000000000000000000000011000。
 * 可以看到，从左边数过来，在第一个1之前，有27个0。我们把这些0称作前导的零。
 * 现在，你的任务是写一个程序，输入一个整数，输出在32位二进制表达下它前导的零的个数
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字");
		int i = sc.nextInt();
		int count =32;
		while(i!=0) {
			i=i>>1;
			count--;
		}
		System.out.println(count);
	}
}
