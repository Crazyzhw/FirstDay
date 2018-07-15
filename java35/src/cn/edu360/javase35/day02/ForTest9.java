package cn.edu360.javase35.day02;
/**
 * 需求：打印一个数，求出其所有因子的和
 */
import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("请输入数字");
		int a = s.nextInt();
		int  sum = 0;
		for (int x = 1 ;x < a ;x++) {
			if (a % x == 0) {
				sum+=x;
			}
		}
		sum=0;
		System.out.println(sum);
		for (int x=1;x<=a; x++) {
			if (a%x==0&&x!=1&&x!=a) {
				sum++;
			}
		}
		if (sum>0) {
		System.out.println("输入的数不是质数");
		}

}
}
