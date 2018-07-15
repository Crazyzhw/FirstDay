package cn.edu360.javase35.day11;

public class WrapperClassDemo {
	public static void main(String[] args) {
//		装箱
		int i =100;
		Integer a = new Integer(i);
//		拆箱
		int i1 = a.intValue();
//		1.5后，可以自动拆装箱
		int i3 =new Integer(20);
		Integer b = 200;
//		String 和int之间的转换
		String c = i+"";
		String d = String.valueOf(i);
		
		int i4 = Integer.valueOf(c);
		i4 = Integer.parseInt(c);
		i4   = new Integer (c);
		
		
	}
}
