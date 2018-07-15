package cn.edu360.javase35.day18.reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
	public static void main(String[] args) {
		  try {
			Class<?> class1 = Class.forName("cn.edu360.javase35.day18.reflect.Person");
			Constructor<?> c1 = class1.getConstructor(String.class,int.class);
			Constructor<?> c2 = class1.getDeclaredConstructor(int.class);
//			要访问私有的构造方法需要暴力破解
			c2.setAccessible(true);
			Object n = c1.newInstance("11",3);
			Object n1 = c2.newInstance(3);
			System.out.println(n);
			System.out.println(n1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
}
