package cn.edu360.javase35.day05;

import cn.edu360.javase35.Util.ArrayUtil;

public class SelectDemo {
	public static void main(String[] args) {
		int []arr= {1,3,5,7,5,2,1,5,3};
		//冒泡排序
		for(int x=0;x < arr.length-1;x++)
			for (int y =0;y<arr.length-1-x;y++) {
				if (arr[y]>arr[y+1]) {
					int temp = arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
//		select(arr);
		ArrayUtil.printIntArr(arr);
	}
//	选择排序
	public static void select (int []arr) {
		for (int x=0;x<arr.length -1;x++) {
			for(int y =x+1;y < arr.length;y++) {
				if (arr[x]>arr[y]) {
					int temp = arr[y];
					arr[y]=arr[x];
					arr[x]=temp;
				}
			}
		}
		
	}
}
