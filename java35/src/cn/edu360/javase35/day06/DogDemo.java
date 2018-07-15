package cn.edu360.javase35.day06;

public class DogDemo {
	public static void main(String[] args) {
		Dog d= new Dog();
		d.setAge(3);
		d.setFurColor("白色");
		d.setName("小白");
		d.setSex('公');
		d.show();
		Dog d2 =new Dog ("小黑",3,"黑色",'母');
		d2.show();
	}
}
