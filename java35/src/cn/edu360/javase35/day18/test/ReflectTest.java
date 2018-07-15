package cn.edu360.javase35.day18.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest {
	public static void main(String[] args) {
		try {
		ArrayList<String> list = new ArrayList<>();
		Class<? extends ArrayList> class1 = list.getClass();
			Method m = class1.getMethod("add", Object.class);
			m.invoke(list, 8);
			m.invoke(list, "nihao");
			for (Object s : list) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
