package cn.edu360.javase35.day13;

public class Person {
	String name ;
	int age;
	char sex;
	public Person(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
