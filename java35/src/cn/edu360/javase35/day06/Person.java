package cn.edu360.javase35.day06;

public  class Person {
	static String  name = "张三";
	public void print() {
		System.out.println(name );
	}
	public void print (String name) {
		System.out.println(name );
	}
	public   void  print1(String name ) {
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Person p = new Person(); 
		p.print ();
		p.print("李四");
		p.print1("李四");
	}
}
