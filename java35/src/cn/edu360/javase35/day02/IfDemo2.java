package cn.edu360.javase35.day02;

import java.util.Scanner;

public class IfDemo2 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入金额");
       int x = sc.nextInt();
       
       if(x==521) {
    	   System.out.println("么么哒");
       }else if (x==1314){
    	   System.out.println("明天我就嫁给你");
       }else if (x<10) {
    	   System.out.println("呵呵");
       }else 
    	   System.out.println("你是个好人");
	}
	
}
