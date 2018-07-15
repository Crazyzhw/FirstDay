package cn.edu360.javase35.day06;

import cn.edu360.javase35.Util.ArrayUtil;

public class SelectDemo {
	public static void main(String[] args) {
		int arr[]= {1,3,8,5,1,2,6,3,6,9};
		/*for (int x=0;x<arr.length -1;x++) {
			for (int y = x+1;y<arr.length;y++) {
				if (arr[x]>arr[y]) {
					int temp=arr[x] ;
					arr[x]=arr[y];
					arr[y]=temp;
					
				}
			}
			}*/
		for (int x=0;x<arr.length;x++) {
			for (int y=0 ;y<arr.length-1-x;y++) {
				if (arr[y]<arr[y+1]) {
					int temp=arr[y] ;
					arr[y]=arr[y+1];
					arr[y+1]=temp;
					
				}
			}
		}
		
			ArrayUtil.printIntArr(arr);
		}
}
