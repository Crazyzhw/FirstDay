package cn.edu360.javase35.day18.reflectApp;

import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {
		try {

		Properties p = new Properties();
			p.load(Test.class.getClassLoader().getResourceAsStream("config.properties"));
			String value = p.getProperty("Teachable");
			System.out.println(value);
			Class class1 = Class.forName(value);
			Object instance = class1.newInstance();
			Teachable t = (Teachable)instance;
			t.teach();;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
