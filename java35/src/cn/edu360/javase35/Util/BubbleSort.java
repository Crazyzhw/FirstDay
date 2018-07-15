package cn.edu360.javase35.Util;


public class BubbleSort {

	public static void BubbleSort(int[]arr) {
		for(int i= 0;i<arr.length-1;i++) {
			for(int y=0;y<arr.length-1-i;y++) {
				int temp ;
				if(arr[y]>arr[y+1]) {
					temp =arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
	}
}
