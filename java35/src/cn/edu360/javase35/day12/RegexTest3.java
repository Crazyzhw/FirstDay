package cn.edu360.javase35.day12;

public class RegexTest3 {
	public static void main(String[] args) {
		String s  ="我我          要要要         学学学学                 习习习习";
		s=s.replaceAll(" +", "");
		System.out.println(s);
		s= s.replaceAll("(.)\\1+", "$1");
		System.out.println(s);
	}
}
