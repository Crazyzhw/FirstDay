package cn.edu360.javase35.day05;

public class ArrayDemo6 {
	public static void main(String[] args) {
		int []	arr = {1,2};
		System.out.print(arr[0]);
		System.out.println(arr[1]);
		swap(arr,0,1);
		System.out.print(arr[0]);
		System.out.println(arr[1]);
		//用第三方
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.print(arr[0]);
		System.out.println(arr[1]);
		//用和
		arr[0]=arr[1]+arr[0];
		arr[1]=arr[0]-arr[1];
		arr[0]=arr[0]-arr[1];
		System.out.print(arr[0]);
		System.out.println(arr[1]);
		//用异或
		arr[0]=arr[0]^arr[1];
		arr[1]=arr[0]^arr[1];
		arr[0]=arr[0]^arr[1];
		System.out.print(arr[0]);
		System.out.println(arr[1]);
	}
	public  static  void swap(int [] arr,int x ,int y) {
		int temp=arr[x];
		arr[x]=arr[1];
		arr[y]=temp;}
		}

