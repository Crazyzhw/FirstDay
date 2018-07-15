package cn.edu360.javase35.day11;

public class CharTest {
	public static void main(String[] args) {
		String s = "12345abcdeABCDE";
		int count1=0;
		int count2=0;
		int count3=0;
		for (int i =0;i<s.length();i++) {
			if (Character.isDigit(s.charAt(i))) {
				count1++;
			}else if (Character.isUpperCase(s.charAt(i))) {
				count2++;
			}else if (Character.isLowerCase(s.charAt(i))) {
				count3++;
			}
		}
		System.out.println("数字的个数是："+count1);
		System.out.println("大写字母的个数是:"+count2);
		System.out.println("小写字母个数是："+count3);
	}
}
