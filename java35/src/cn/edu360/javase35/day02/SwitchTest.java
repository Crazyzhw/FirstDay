package cn.edu360.javase35.day02;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("请输入一个符号");
       String s= sc.nextLine();
       System.out.println("请输入一个数字");
       int a = sc.nextInt();
       System.out.println("请在输入一个数字");
       int b = sc.nextInt();
       
       switch (s) {
       case "+":
       System.out.println(a+"+"+b+"="+(a+b));
       break;
       case "-":
    	   System.out.println(a+"-"+b+"="+(a-b));
    	   break;
       case "*":
    	   System.out.println(a+"*"+b+"="+(a*b));
    	   break;
       case "/":
    	   System.out.println(a+"/"+b+"="+(a/b));
    	   break;
      default :
    	  System.out.println("输入有误");
    	  break;
       }
	}

	
}
