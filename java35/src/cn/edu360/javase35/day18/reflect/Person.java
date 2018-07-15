package cn.edu360.javase35.day18.reflect;

public class Person {
	private String name ;
	public int age;
	public   char sex ;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	private Person(int age) {
		super();
		this.age = age;
	}
	public Person(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	 void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	private void setSex(char sex) {
		this.sex = sex;
	}
	
	
}
