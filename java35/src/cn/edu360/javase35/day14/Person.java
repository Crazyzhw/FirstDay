package cn.edu360.javase35.day14;

public class Person {
	String name;
	int age ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>99||age<1) {
			throw new MyException("你是不是傻");
		}
		this.age = age;
	}
	
}
