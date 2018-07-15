package cn.edu360.javase35.day09.test;

public class Test {
		static int a =3;
		int b =4;
		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(new Test().b);
			Demo d = new Demo ();
			System.out.println(d);
			System.out.println(d.hashCode());
		}
}
class Demo{
	
}