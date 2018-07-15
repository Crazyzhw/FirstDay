package cn.edu360.javase35.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
	public static void main(String[] args) {
		String s = "1861http.baidu.com1132889 http://v.baidu.com 20 http:...com 5000";
//		String[] split = s.split(" ");
		
//		Pattern p = Pattern.compile("(http)(\\S)+(com)");
		Pattern p = Pattern.compile("(http)(\\S)+[ ]");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group().trim());
		}
		int i=4;
	}
}
