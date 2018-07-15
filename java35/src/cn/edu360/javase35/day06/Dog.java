package cn.edu360.javase35.day06;

public class Dog {
	private String name ;
	private double age;
	private  String furColor ;
	private  char sex ;
	public Dog() {
	}
	public void setName (String name) {
		this.name= name ;
	}
	public String getName () {
		return name;
	}
	public double getAge () {
		return age;
	}
	public void  setAge (double age ) {
		this.age = age;
	}
	public void setFurColor (String color) {
		this.furColor=color;
	}
	public String getFurColor () {
		return furColor;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex=sex;
	}
	public Dog(String name,double age ,String furColor ,char sex) {
		this.age=age;
		this.furColor=furColor;
		this.sex=sex;
		this.name=name;
	}
	public void show () {
		System.out.println("name:"+name+",age:"+age+",furColor:"+furColor+",sex:"+sex);
	}
}
