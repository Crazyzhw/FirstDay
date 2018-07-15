package cn.edu360.javase35.day18.reflect;

public class ReflectDemo {
	public static void main(String[] args) {
		try {
//		获取Class的方式
//		|-1通过对象
		Person p  = new Person();
		Class<? extends Person> class1 = p.getClass();
//		|-2通过类名
		Class class2 = Person.class;
//		|-3通过全类名
			Class class3 = Class.forName("cn.edu360.javase35.day18.reflect.Person");
			Object o = class3.newInstance();
			System.out.println(o);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
