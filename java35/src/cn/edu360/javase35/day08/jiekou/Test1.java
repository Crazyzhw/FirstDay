package cn.edu360.javase35.day08.jiekou;

public class Test1 {
	public static void main(String[] args) {
		char a = 'a';
		char b = 'A';
		for (int x= 0;x<26;x++) {
			if(x!=25) {
			System.out.print((char)(a+x)+",");
			System.out.print((char)(b+x)+",");
			}
			else {
			System.out.println((char)(a+x));
			System.out.println((char)(b+x));
			}
		}
		}
}
