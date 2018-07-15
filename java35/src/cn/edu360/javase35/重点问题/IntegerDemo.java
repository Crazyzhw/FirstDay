package cn.edu360.javase35.重点问题;

public class IntegerDemo {
		public static void main(String[] args) {
			Integer i1 = new Integer(100);
			Integer i2 = new Integer(100);
			System.out.println(i1==i2);
			System.out.println(i1.equals(i2));
//			jdk1.5以后，如果自动装箱的int值在byte范围内，则不会再另外开辟空间
			Integer i3 =-129;
			Integer i4 =-129;
			System.out.println(i3==i4);
			System.out.println(i3.equals(i4));
			String s ="hello";
			s=s+"world";
			String s1= "hello"+"world";
			System.out.println(s==s1);
			
		}
}
