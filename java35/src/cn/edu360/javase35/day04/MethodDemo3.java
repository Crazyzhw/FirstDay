package cn.edu360.javase35.day04;

public class MethodDemo3 {

	public static void main(String[] args) {
		 int sum = sum(9,10);
		 String a = equal(111,111);
		 System.out.println(sum);
		 System.out.println(a);
	}
	public static int sum (int a ,int b ) {
		 int sum = a+b;
		 return sum;
	}
	public static String equal(long a ,long b ) {
		String s = "不相等";
		if (a==b) {
			s="相等";
		}
		return s;
	}
}
