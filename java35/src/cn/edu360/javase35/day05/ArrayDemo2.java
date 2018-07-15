package cn.edu360.javase35.day05;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字");
		int x = sc.nextInt();
		System.out.println(toHex(x));
		System.out.println(toBin(x));
		System.out.println(toOctal(x));
		}
	
	public static String  trace(int a ,int x ,int y) {
		String [] chs= {"0","1","2","3","4","5",
							"6","7","8","9","a",
							"b","c","d","e","f"};
		String t ="";
		while(a!=0){	
		int temp = a & x;
			 t= chs[temp]+t;
			a=a>>>y;
		}
		return  t;
	}
	public static String toHex (int a) {
		return "0x"+trace(a,15,4); 
	}
	public static String toOctal (int a) {
		return "0"+trace(a,7,3); 
	}
	public static String toBin (int a) {
		return "0b"+trace(a,1,1); 
	}
	
}

