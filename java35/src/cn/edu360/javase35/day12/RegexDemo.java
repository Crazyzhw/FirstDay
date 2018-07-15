package cn.edu360.javase35.day12;

import java.util.Arrays;

public class RegexDemo {
	public static void main(String[] args) {
		String str = "19 89 76 3 65";
		String  [] arr= str.split(" ");
		int [] arr1 = new int [arr.length] ;
		for (int i=0;i<arr.length;i++) {
			arr1[i]=Integer.valueOf(arr[i]);
	   }
		for (int i=0;i<arr1.length-1;i++) {
			for (int j =i+1;j<arr1.length;j++) {
				if (arr1[i]>arr1[j]) {
					int temp= arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr1.length;i++) {
			sb.append(arr1[i]).append(" " );
		}
		System.out.println(sb.toString().trim());
		for (int i=0;i<arr1.length;i++) {
			if (i==0) {
				System.out.print("["+arr1[i]);
			}else if (i==arr1.length-1) {
				System.out.print(" "+arr1[i]+"]");
			}else {
				System.out.print(" "+arr1[i]);
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		String s = "ii jj zz";
		String []  s1= s.split("j");
		System.out.println(s1.length);
		
 	}
}
