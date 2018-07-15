package cn.edu360.javase35.day08.test;

public class Lady {
	String name ;
	Animal a ;
	Lady (String name,Animal a){
		this.name = name;
		this.a=a;
	}
	public void myPetEnjoy() {
		a.enjoy();
		System.out.println(name+"也很Happy");
	}
}


abstract class  Animal {
	String name ;
	Animal(String name){
		this.name= name;
	}
	abstract void enjoy(); 
}

class Cat extends Animal{
	String eyesColor ;
	Cat(String name ,String color){
		super(name);
		this.eyesColor=color;
	}
	void enjoy() {
		System.out.println("猫"+name+"高兴的汪汪直叫"+"眼睛颜色"+eyesColor);
	}
}

class  Dog extends Animal{
	String furColor;
	Dog (String name ,String furColor){
		super(name);
		this.furColor=furColor;
	}
	void enjoy() {
		System.out.println("狗"+name+"高兴的上蹿下跳"+"皮毛颜色"+furColor);
	}
}
