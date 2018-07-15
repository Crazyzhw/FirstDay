package cn.edu360.javase35.day01;

public class Test2 {

	public static void main(String[] args) {
		int a2 = 10;
		System.out.println(a2++);
		System.out.println(a2);
		int x = 10;
		int a1 = x+ x++;
		System.out.println("a1 =" + a1);
		System.out.println("x =" + x);
		int b1 = x + ++x;
		System.out.println("b1 =" + b1);
		System.out.println("x =" + x);
		int c1 = x + x--;
		System.out.println("c =" + c1);
		System.out.println("x =" + x);
		int d1 = x + --x;
		System.out.println("d1 =" + d1);
		System.out.println("x =" + x);
	}

}
