package cn.edu360.javase35.重点问题;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		 StringBuffer s1 = new StringBuffer("hello");
		 StringBuffer s2 = new StringBuffer("java");
		 test(s1,s2);
		 System.out.println(s1+"------"+s2);//hellojava     java
	}
	public static void test(StringBuffer s1,StringBuffer s2) {
		s1.append(s2);//  s1 =hellojava
		s1=s2;
	}
}
