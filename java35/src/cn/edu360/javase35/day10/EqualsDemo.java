package cn.edu360.javase35.day10;

public class EqualsDemo {

	public static void main(String[] args) {
			Dog d = new Dog();
			Dog d1= new Dog();
			System.out.println(d1.equals(d));
			String name = "abc";
			String name1= "abc";
			System.out.println(name==name1);
			System.out.println(name.equals(name1));
	}

}

class Dog{
	String name = "小花";
	int age  = 3;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}