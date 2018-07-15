package cn.edu360.javase35.day09.test;

public class Recursive {
	public static void main(String[] args) {
		System.out.println(f(10));
		System.out.println(g(10));
	}
//	f(n)=f(n-1)+1;
	public static  int  f(int n) {
		if (n==1) {
			return 1;
		}else {
			return  n+f(--n);
		}
	}
	public static long g (int a) {
		if (a==1) {
			return 1;
		}else {
			return  a*g(--a);
		}
	}
	
}
