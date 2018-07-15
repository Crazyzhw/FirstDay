package cn.edu360.javase35.Util;

public class ArrayUtil {
	public  static void  printIntArr (int arr[]) {
		for (int i =0;i<arr.length;i++) {
		if (arr.length==1) {
			System.out.println("["+arr[0]+"]");
			}else if (i==0) {
				System.out.print("["+arr[i]);
			}else if(i==arr.length-1) {
				System.out.println(","+arr[i]+"]");
			}else {
				System.out.print(","+arr[i]);
			}
			
		}
}
}
