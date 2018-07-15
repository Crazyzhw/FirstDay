package cn.edu360.javase35.day04;
//比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，
//两个long类型，并在main方法中进行测试
public class MethodTest2 {
	public static void main(String[] args) {
		byte a1 =4,b1 =5;
		int a2=6,b2=6;
		short a3=4,b3=5;
		long a4=4,b4=4;
	String a0 = isEqual(a1,b1);
	System.out.println(a0);
	String b0= isEqual(a2,b2);
	System.out.println(b0);
	String c0 = isEqual(a3,b3);
	System.out.println(c0);
	String d0 = isEqual(a4,b4);
	System.out.println(d0);
}
	public static String  isEqual(byte a ,byte b) {
		if (a==b) {
			return "相等";
		}else {
			return "不相等";
		}
	}
	public static String  isEqual(short a ,short b) {
		if (a==b) {
			return "相等";
		}else {
			return "不相等";
		}
	}
	public static String  isEqual(int  a ,int  b) {
		if (a==b) {
			return "相等";
		}else {
			return "不相等";
		}
	}
	public static String  isEqual(long  a ,long b) {
		if (a==b) {
			return "相等";
		}else {
			return "不相等";
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
