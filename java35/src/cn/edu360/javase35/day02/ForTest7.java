package cn.edu360.javase35.day02;
/**打印出到三角
		* * *  
		 * * 
		  * 

 * 
 */
import java.util.Scanner;

public class ForTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数");
		int num = sc.nextInt();
		for (int i =num;i>0;i--) {
			for (int x =i;x<=num-1;x++) {
				System.out.print(' ');
			}
			for (int y =1;y<=i;y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
