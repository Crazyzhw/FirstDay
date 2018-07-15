package cn.edu360.javase35.day08.test;

public class Test1{
	public static void main(String[] args) {
		 InterA  a = new C();
		System.out.println(a.a);
		System.out.println(InterA.a);
		System.out.println(InterB.a);
		C  c = (C)a;
		c.print();
	}
}
	

 class C implements InterB {
		public void show() {
			System.out.println("我来自接口A");
		}
		public void print() {
			System.out.println("我来自接口B");
		}
}
interface  InterA{
	int a =10;
	void show();
}


interface InterB extends InterA{
	int b =20;
	void  print();
}
    

