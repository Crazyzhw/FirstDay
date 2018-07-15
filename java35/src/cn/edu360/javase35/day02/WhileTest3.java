package cn.edu360.javase35.day02;

import java.util.Scanner;

/**贪吃蛇：在键盘上输入一个数，如果是1，代表蛇吃到食物，得分加10，并继续输入，
 * 		如果输入的是一个非1的数字，停止程序，输出得分
 * 	循环
 * 		判断条件语句： 输入的是1，继续执行
 * 		循环体： 得分加10
 * 		控制条件语句：并继续输入，修改原来的输入值
 */
public class WhileTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		int score=0;
		while(x==1) {
			score+=10;
		x=sc.nextInt();	
		}
		System.out.println(score);
	}

}
