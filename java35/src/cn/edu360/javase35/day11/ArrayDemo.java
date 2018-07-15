package cn.edu360.javase35.day11;

import java.util.Arrays;

import cn.edu360.javase35.Util.ArraySort;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] arr = {1,3,2,5,0,2};
		//选择排序
		for (int i =0;i<arr.length-1;i++) {
		 for (int j=i+1;j<arr.length;j++) {
			 if (arr[i]>arr[j]) {
				 int temp = arr[i];
				 arr[i]=arr[j];
				 arr[j]=arr[i];
		 }
	}
}
//		冒泡排序
		for (int x =0;x<arr.length;x++) {
			for(int y=0;y<arr.length-1-x;y++ ) {
				if (arr[y]>arr[y+1]) {
					int temp = arr[y];
					 arr[y]=arr[y+1];
					 arr[y+1]=temp;
				}
			}
		}
//		System.out.println(Arrays.toString(arr));
		ArraySort.sort(arr, true);
	}
}

