package cn.edu360.javase35.day11;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger  b1  = new BigInteger("301201202313216546546543132132132132132146513456454654897945798");
		BigInteger  b2  = new BigInteger("2465489498757498465791321321321321321455213465432857276767756798749");
		System.out.println();
		System.out.println(b1.subtract(b2));
		System.out.println(b1.add(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.multiply(b2));
		   
		BigInteger[] arr = b1.divideAndRemainder(b2);
		 System.err.println(arr[0]);
		 System.err.println(arr[1]);
	}
}
