package cn.edu360.javase35.Util;

import java.util.Arrays;

public class ArraySort {
		public static void  sort(int []arr,boolean  isAsc) {
			for (int i =0;i<arr.length-1;i++) {
				for (int j=i+1;j<arr.length;j++) {
			  if (isAsc) {
					 if (arr[i]>arr[j]) {
						 int temp = arr[i];
						 arr[i]=arr[j];
						 arr[j]=temp;
				 }
			}else {
				if(arr[i]<arr[j]) {
					 int temp = arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
			}
			}
		}
		
	}
			System.out.println(Arrays.toString(arr));
}
}
