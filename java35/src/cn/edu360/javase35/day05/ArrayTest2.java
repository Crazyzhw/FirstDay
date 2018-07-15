package cn.edu360.javase35.day05;

import java.util.Random;

import cn.edu360.javase35.Util.ArrayUtil;

/**
 * 		双色球
	双色球需求：红球选六个，篮球选一个
		 红球6个：1--33
		 篮球一个；1--16
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		Random r = new Random();
		int [] number= {1,2,3,4,5,6,7,8,9,10,11,12,
				      13,14,15,16,17,18,19,20,21,22,
				      23,24,25,26,27,28, 29,30,31,32,33};
		int[] result =new int [7];
		for (int x=0;x!=6;) {
			int a= r.nextInt(number.length);
			if (number[a]!=-1) {
				result[x]=number[a];
				x++;
				number[a]=-1;
			}
		}
		result[6]=r.nextInt(17);
		ArrayUtil.printIntArr(result);
		//ArrayUtil.printIntArr(number);
	}
}
