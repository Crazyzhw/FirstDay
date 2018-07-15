package cn.edu360.javase35.day02;
/**打印出字母三角
 *   A
 	BBB
   CCCCC

 */
import java.util.Scanner;

public class ForTest5 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("请输入行数");
	int num = sc.nextInt();
	int ch = 65;
	int z=1;
	for (int i =1;i<=num;i++) {
		for (int e =i;e<=num-1;e++) {
			System.out.print(" ");
		}
		for (int y=1;y<=z;y++) {
			System.out.print((char)ch);
		}
		z+=2;
		ch+=1;
		System.out.println();
	}
}
}
