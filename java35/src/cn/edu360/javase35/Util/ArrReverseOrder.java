package cn.edu360.javase35.Util;

public class ArrReverseOrder {
	public static void arrReverseOrder(int arr[] ){
		for (int i =0;i<arr.length/2;i++) {
			int temp;
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			}
	}
	public static void arrReverseOrder1(int arr[] ){
		for (int s=0, e = arr.length-1;s<e;s++,e--) {
			int temp;
			temp =arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
		}

	}
}
