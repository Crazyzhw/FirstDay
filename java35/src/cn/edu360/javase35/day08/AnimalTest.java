package cn.edu360.javase35.day08;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new  Cat ();
		a.eat();
		a.sleep();
		System.out.println(a.num);//10
		System.out.println(a.age);//40
		Cat p = (Cat)a;
		a.sleep();
	}
	
	
}
