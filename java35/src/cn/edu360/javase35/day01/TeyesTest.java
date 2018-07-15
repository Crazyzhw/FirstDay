package cn.edu360.javase35.day01;

import java.util.Scanner;

public class TeyesTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入成绩");
	int score = sc.nextInt();
	String level = score >=90? "A":score>=80?"B":score>=70?"C":score>= 60?"D":"E";
	System.out.println("您输入的成绩对应的等级是"+level);
	}

}
