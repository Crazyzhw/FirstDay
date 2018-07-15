package cn.edu360.javase35.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
	public static void main(String[] args) {
		String str = "what are you doing? How are you ";
		Pattern p= Pattern.compile("\\b[a-zA-Z]{3}\\b");
		Matcher matcher = p.matcher(str);
			while(matcher.find()) {
				
				System.out.println(matcher.group());
			}
		
	}

}
