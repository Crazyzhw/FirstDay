package cn.edu360.javase35.day02;
import java.util.Scanner;
public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		System.out.println("请输入下一个数");
		int b = sc.nextInt();
//		输出两个数的最大值
		if (a>b) {
			System.out.println("a的值比b大");
		}else {
			System.out.println("a的值比b小");
		}
//		判断a是否为偶数
		if(a%2==0) {
			System.out.println("a是偶数");
		}else {
			System.out.println("a是奇数");
		}
		System.out.println(2|3^5);
	}

}
