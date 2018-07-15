package cn.edu360.javase35.day09;

abstract  class Person {
     abstract void show ();
}
 class PersonDemo{
	 public void method (Person p) {
		 p.show();
	 }
 }
 public class PersonTest{
	 public static void main(String[] args) {
		new PersonDemo().method(new Person() {
			void show() {
				System.out.println("学好数理化，走遍天下都不怕");
			}
			
		});
	}
 }