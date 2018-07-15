package cn.edu360.javase35.day07;

public class ExtendsTest {
	public static void main(String[] args) {
		
		Father f = new Father ();
		Father s1=new Son1("小王八");
		System.out.println(s1.name);
		System.out.println(f.name);
		f.call();
		s1.call();
		s1.laugh();
	}
}

class Father{
	String name = "老王";
	public Father (){}
	public  Father(String name) {
		this.name = name;
	}
	public void call() {
		System.out.println("我住隔壁我姓王");
	}
		public static void  laugh() {
			System.out.println("haha");
		}
}


class Son1 extends Father{
	String name = "小王";
	public Son1(String name){
		super(name);
		System.out.println(super.name);
	}
	public void call() {
		super.call();
		System.out.println("我住隔壁我也姓王");
	}
}


class Son2 extends Father {
	public Son2(){
		super();
	}
	public Son2 (String name){
		this();
	}
	public Son2 (int age) {
		super();
	}
	String name = "小张";
	public void call() {
		System.out.println("我住这里我姓张");
	}
	
	
}