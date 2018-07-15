package cn.edu360.javase35.day02;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr = new int [4];
		System.out.println(arr[2]);
		int [] xxx= {1,3,5};
		arr= xxx;
		System.out.println(arr[2]);
		int [] bb = new int [] {33,22,11}; 
		int a =2;
		int b= 3*(a++)+a;
		System.out.println(b);
	}

}
