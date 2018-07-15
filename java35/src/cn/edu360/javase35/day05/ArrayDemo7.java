package cn.edu360.javase35.day05;

import cn.edu360.javase35.Util.ArrReverseOrder;
import cn.edu360.javase35.Util.ArrayUtil;

public class ArrayDemo7 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		ArrReverseOrder.arrReverseOrder(arr);
		ArrayUtil.printIntArr(arr);
		ArrReverseOrder.arrReverseOrder1(arr);
		ArrayUtil.printIntArr(arr);
		
	}
}
