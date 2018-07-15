package cn.edu360.javase35.day02;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入月份");
			int month = sc.nextInt();
			if (month >=3&&month <=5) {
				System.out.println("季节是春季");
			}else if(month>=6&&month<=8){
				System.out.println("季节是夏季");
			}else if (month >=9&&month <=11){
				System.out.println("季节是秋季");
			}else if (month==12||month ==1||month ==2) {
				System.out.println("季节是冬季");
			}else {
				System.out.println("你是不是傻");
			}
	}

}
