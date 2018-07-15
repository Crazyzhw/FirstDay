package cn.edu360.javase35.day13;

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {
	public static void main(String[] args) {
		Collection<?> c =new ArrayList<Animal>();
		Collection<?> c2 =new ArrayList<Dog>();
		Collection<?> c3 =new ArrayList<Cat>();
		Collection<? extends Animal> c4 =new ArrayList<Animal>();
		Collection<? extends Animal> c5 =new ArrayList<Cat>();
		Collection<? extends Animal> c6 =new ArrayList<Dog>();
		Collection<? super Animal> c7 =new ArrayList<Object>();
		Collection<? super Animal> c8 =new ArrayList<Animal>();
	}
	
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
