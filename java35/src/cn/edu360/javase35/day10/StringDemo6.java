package cn.edu360.javase35.day10;
//字符串的逆序
import java.util.Scanner;

public class StringDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String  s= sc.next();
		char [] chs = s.toCharArray();
		for (int x =0;x<chs.length;x++) {
			System.out.print(chs[chs.length-1-x]);
		}
		System.out.println();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		String s1 = s.replace("a", "").replace("b", "");
		System.out.println(s1);
		String s2 = "    dhahdja   ";
		System.out.println(s2.trim());
		
	}
}
