package cn.edu360.javase35.day03;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的名字");
		String name  = sc.nextLine();
		String [] arr1= {"在家里","在网吧","在学校","在厕所","在床上"};
		String [] arr2= {"玩游戏","打豆豆","看病","吃饭","上班","睡觉"};
		int  a = (int)(Math.random()*5);
		
		int  b = (int)(Math.random()*6);
		System.out.println(name+arr1[a]+arr2[b]);
	}

}

