package cn.edu360.javase35.day14;

public class Recursive {
	public static void main(String[] args) {
		System.out.println(fbj(10));
		System.out.println(Monkey(4));
	}
	
	public static int fbj(int n ) {
		int f;
		if (n<2) {
			f=n;
		}else {
			f=fbj(n-1)+fbj(n-2);
		}
		return f;
	}
	public static int Monkey(int day) {
		if (day==1) {
			return 1;
		}
		return (Monkey(day-1)+1)*2;
	}
}
