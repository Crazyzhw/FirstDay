package cn.edu360.javase35.day11;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal  b1 = new BigDecimal("-2.5555");
		BigDecimal  b2 = new BigDecimal(1);
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.divide(b2, 2, BigDecimal.ROUND_HALF_DOWN));
		System.out.println(b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP));
	}
}
