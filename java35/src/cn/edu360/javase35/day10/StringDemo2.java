package cn.edu360.javase35.day10;

public class StringDemo2 {

	public static void main(String[] args) {
		String s = "3.14";
		String s1 = new String ("3.14");
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode()==s1.hashCode());
		System.out.println(s==s1);
		s=s1;
		System.out.println(s1==s);
//		String s2 = new String ();
		String s2="3.14";
		System.out.println(s2==s1);
		
	}

}

