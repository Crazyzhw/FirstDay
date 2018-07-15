package cn.edu360.javase35.day07;
//饿汉式
public class SingleTon {
	private static SingleTon s =new SingleTon ();
	private SingleTon() {}
	public static SingleTon  getInstance() {
		    return s;
	}
}
//懒汉式
class SingleTon2{
	private static SingleTon2 s= null;
	private SingleTon2() {}
	private static SingleTon2 getInstance() {
		if (s==null) {
			s=new SingleTon2();
		}
		return  s;
	}
}