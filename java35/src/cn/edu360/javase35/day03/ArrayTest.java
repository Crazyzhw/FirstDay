package cn.edu360.javase35.day03;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("请输入数组长度");
		int [] arr = new int [sc.nextInt()];
		System.out.println("请输入数据");
		for(int x = 0;x<arr.length;x++) {
			arr[x]=sc.nextInt();
			if(x<arr.length-1)
			System.out.println("请继续输入");
		}
		int sum=add(arr);
		System.out.println("你输入的数据之和是："+sum);
		
	}
	public static int add (int [] arr) {
			int sum =0;
			for (int x =0;x<arr.length;x++) {
				sum+=arr[x];
			}
			return sum;
	
	}
	}

