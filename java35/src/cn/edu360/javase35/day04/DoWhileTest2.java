package cn.edu360.javase35.day04;

import java.util.Scanner;

public class DoWhileTest2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String result ="爱";
	String p;
	System.out.println("你爱不爱我");
	do {
		p = sc.nextLine();
		if(!result.equals(p)) {
			System.out.println("你到底爱不爱我");
	}
	}while (!result.equals("爱"));
}
}
