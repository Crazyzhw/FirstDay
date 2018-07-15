package cn.edu360.javase35.day10;

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat();
		Object o =c.clone();
		Cat c1 = (Cat)o;
		System.out.println(c1 instanceof Cat);
		System.out.println(c1);
		System.out.println(c);
		Person  p = new Person();
		Person p1 = (Person) p.clone();
		System.out.println(p1.name ==p.name);
		System.out.println(p1.name .hashCode());
		System.out.println(p.name.hashCode());
		System.out.println(p.name.length());
		System.out.println(p1.name.length());
	}

}


class Cat implements Cloneable{
	String name = "ss";
	int age = 10;
	public Object clone(){
		Object o =null;
		try {
			o=super.clone();
			return super.clone();
			
		} catch (CloneNotSupportedException e) {
			
			System.out.println("haha");
		}
		return o;
}
}
class Person  implements Cloneable{
	String name ="ggs";
	int age =30;
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}