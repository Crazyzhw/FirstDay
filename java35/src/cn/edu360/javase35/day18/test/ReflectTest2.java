package cn.edu360.javase35.day18.test;

import java.lang.reflect.Field;

import cn.edu360.javase35.day18.reflect.Person;;

public class ReflectTest2 {
	public static void main(String[] args) {
		Person p = new Person();
		set(p,"name","zhangsan ");
		set(p,"age",10);
		System.out.println(p);
	}
	public static void set (Object o,String name,Object value) {
		try {
		Class<? extends Object> class1 = o.getClass();
			Field f = class1.getDeclaredField(name);
			f.setAccessible(true);
			f.set(o, value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
