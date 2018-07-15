package cn.edu360.javase35.day05;

import cn.edu360.javase35.Util.ArrMaximum;
import cn.edu360.javase35.Util.Search;
import cn.edu360.javase35.Util.Tracelate;

public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] arr = {-10,2,3,22,5,6,7,5,22};
		print(arr);
		int max =ArrMaximum.getMax(arr);
		int min =ArrMaximum.getMin(arr);
		System.out.println(Tracelate.toHex(max));
		System.out.println(max);
		System.out.println(min);
		int s = Search.search(arr,22);
		System.out.println(s);
	}
	public  static void  print (int arr[]) {
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
