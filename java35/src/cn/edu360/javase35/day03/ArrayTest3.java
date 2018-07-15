package cn.edu360.javase35.day03;

import java.util.Scanner;

/**	需求：获取数组中的最大值
 *
 */
public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组行数");
		int num = sc.nextInt();
		int [] arr = new int[num];
		for (int x =0;x<num;x++) {
			if (x<=num-1) {
				System.out.println("请输入一个数字");
			}
			arr[x]=sc.nextInt();
		}
		int max =max1(arr);
		System.out.println(max);
		int max2= max1(arr);
		System.out.println(max2);
		/*char b = 99;
		System.out.println("hello"+b);*/
	}
//	求最值方法一
	/*static int max (int []arr) {
		int max = 0;
		if (arr.length==1)
			return arr[0];
		for (int x=1;x<arr.length;x++) {
			if (arr[x]>arr[x-1]) {
				max =arr[x];
			}else {
				max =arr[x-1];}
		}
		return max;
	}
	这种求的结果是最后两个元素的最大值，应该找个变量记录出每次比较的较大的数*/
//	求最值方法二
		static int max1(int [] arr) {
			int  max = arr[0];
			for (int x=0;x<arr.length;x++) {
				if (arr[x]>max ) {
				max= arr[x];
			}
			}
		  return max ;
		}
		static int max2 (int []arr) {
			int max =0;
			for (int x =0; x<arr.length ;x++) {
				if (arr[x]>arr[max])
				{ max=x;
			}
		}
			return arr[max];
		
		
}
}
