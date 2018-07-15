package cn.edu360.javase35.day06;

public class ParamDemo {
	public static void main(String[] args) {
		int a = 10;
		int b =20;
		change (a,b);
		System.out.println(a);//基本数据类型，形参的改变不影响实参
		System.out.println(b);
		Teacher t = new Teacher ();
		t.age =20;
		change(t);
		System.out.println(t.age);//引用数据类型，形参的改变影响实参的值
		String c = "你好吗";
		change(c);
		System.out.println(c);//String和包装类除外
		}
	
	public static void change (int a, int b ) {
		a = 100;
		b = 200;
	}
	public static void change (Teacher t ) {
		t.age= 100;
		
	}
	public static void change (String c) {
		c= "你好";
	}
}
