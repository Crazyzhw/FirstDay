package cn.edu360.javase35.day05;

public class Test2 {
	public static void main (String [] args){
		int [] arr = {1,2,3,5,6,7};
		int avg = avg(arr);
		System.out.print(avg);
		}
		public static int avg (int [] arr){
		int sum=0;
		int avg =0; 
		for (int x=0;x<arr.length ;x++){
		   sum+=arr[x];
		}
		 avg = sum/arr.length;
		return  avg; 
		} 
}
