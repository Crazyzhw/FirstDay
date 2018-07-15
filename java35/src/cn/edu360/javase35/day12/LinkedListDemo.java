package cn.edu360.javase35.day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
		public static void main(String[] args) {
			List l = new LinkedList();
			l.add(new Person("张三",20,'男'));
			l.add(new Person("李四",30,'男'));
			l.add(new Person("张三",20,'男'));
			l.add(new Person("李四",20,'女'));
			List<Person> l1 =distinct(l);
			for (Person person : l1) {
				System.out.println(person);
			}
		}
		public static List<Person> distinct (List<Person> w){
			List l = new LinkedList();
			for(int i=0;i<w.size();i++) {
				if (!l.contains(w.get(i))) {
					l.add(w.get(i));
				}
			}
			return l;
		}
		
}

class Person{
	String name ;
	int age ;
	char sex;
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
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Person(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}
	
	
	
	
}
