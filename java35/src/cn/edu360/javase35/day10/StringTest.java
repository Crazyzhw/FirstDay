package cn.edu360.javase35.day10;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String name  ="admin";
		String key = "123456";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String name1 = sc.nextLine();
		System.out.println("请输入密码");
		String key1= sc.nextLine();
		   for (int x=1;x<3;x++) {
			   if (key.equals(key1)&&name.equals(name1)) {
				   System.out.println("登陆成功");
				   break;
			   }else {
				   System.out.println("剩余次数为"+(3-x)+"次");
				   	System.out.println("请重新输入用户名");
					 name1 = sc.nextLine();
					System.out.println("请重新输入密码");
					 key1= sc.nextLine();
			   }
			   if(x==2) {
				   System.out.println("次数已用完，请稍后重试");
			   }
		   }
		}
}
