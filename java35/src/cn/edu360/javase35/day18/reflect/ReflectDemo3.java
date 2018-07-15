package cn.edu360.javase35.day18.reflect;

import java.lang.reflect.Field;

public class ReflectDemo3 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("cn.edu360.javase35.day18.reflect.Person");
			Object o = c.newInstance();
			Field[] f = c.getFields();//只能获得由public修饰的属性值
			System.out.println(f.length);
			for (Field field : f) {
				System.out.println(f);
			}
			Field f1 = c.getField("age");
			System.out.println(f1);
			Field f2 = c.getDeclaredField("name");
			f2.setAccessible(true);
			f2.set(o, "haha");
			f1.set(o, 888);
			System.out.println(o);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
