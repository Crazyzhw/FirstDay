package cn.edu360.javase35.Util;

public class ArrMaximum {
		public static int getMax(int [] arr) {
			int max =  arr[0];
			for (int x=1;x<arr.length;x++) {
				if (arr[x]>max) {
					max =arr[x];
				}
			}
			return max;
			
		}
	public static int getMin (int [] arr ) {
		int min =arr[0];
		for (int x =1;x<arr.length;x++) {
			if (arr[x]<min) {
				min =arr[x];
			}
		}
		return min;
		
	}
}
