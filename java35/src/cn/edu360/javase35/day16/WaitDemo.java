package cn.edu360.javase35.day16;

public class WaitDemo {
	public static void main(String[] args) {
		Object o =new Object();
		DemoS d = new DemoS(o);
		Demo1 d1 = new Demo1(o);
		d.start();
		d1.start();
	}
}
class DemoS extends Thread{
	Object o;

	public DemoS(Object o) {
		super();
		this.o = o;
	}
	public void run() {
		synchronized(o) {
			System.out.println("wait start");
			try {
				o.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("wait end");
		}
	}
}
class Demo1 extends Thread{
	Object o;
	
	public Demo1(Object o) {
		super();
		this.o = o;
	}
	public void run() {
		synchronized(o) {
			System.out.println("notify start");
			o.notify();
			System.out.println("notify end");
		}
	}
}