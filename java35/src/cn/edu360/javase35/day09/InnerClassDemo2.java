package cn.edu360.javase35.day09;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		String b = OuterClass.Inner.b;
		System.out.println(b);
		String a = new OuterClass.Inner().a;
		System.out.println(a);
	}
}


class OuterClass{
	static class Inner {
		String a = "人生得意须尽欢";
		static String b  = "你好，小牛";
	}
	public static  void method() {
		final class Inner2{
			
		}
	}
	
	
}