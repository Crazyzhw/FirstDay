package cn.edu360.javase35.day10;

public class StringDemo {
	public static void main(String[] args) {
		String s = new String();
		byte [] b = {63,64,65,66,124};
		String s1 = new String(b);
		String s2 = new String(b,1,2);
		char chs [] = {'你','好','全','世','界'};
		String s3 = new String (chs);
		String s4 =new String (chs,2,1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
				
				
	}
}
