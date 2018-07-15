package cn.edu360.javase35.day18.reflect;

import java.lang.reflect.Method;

public class MethodDemo {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("cn.edu360.javase35.day18.reflect.Person");
			Object o = c.newInstance();
			Method m = c.getMethod("setName", String.class);
			m.invoke(o, "ni8hao");
			System.out.println(o);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
