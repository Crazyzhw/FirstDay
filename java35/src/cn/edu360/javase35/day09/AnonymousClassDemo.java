package cn.edu360.javase35.day09;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		new Dog().run();
		new Dog() {
			public void run(){
			System.out.println("这样风就追不上");
			}
		}.run();
		new Usb() {
			public void run() {
				System.out.println("风扇 run");
			}
		}.run();
		new Animal() {
			public void breath() {
				System.out.println("呼呼呼");
			}
		}.breath();
	}
}

class  Dog {
	public  void  run () {
		System.out.println("我要跑的更快");
	}
}

interface Usb{
	void  run();
}
abstract class Animal{
	abstract public void breath ();
}