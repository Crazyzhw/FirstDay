package cn.edu360.javase35.day11;

public class NotifyAllDemo {
	public static void main(String[] args) {
		Object o = new Object();
		Test2 t1 = new Test2(o);
		Test2 t2 = new Test2(o);
		Test2 t3 = new Test2(o);
		Test3 t4 = new Test3(o);
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
	}
}

class Test extends Thread{
	Object o;
	public Test(Object o) {
		super();
		this.o = o;
	}
	public void show() {
		synchronized(Test.class) {
			System.out.println(Thread.currentThread().getName()+",wait-----start");
			try {
				Test.class.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+",wait-----end");
		}
	}
}
class Test2 extends Thread{
	Object o;

	public Test2(Object o) {
		super();
		this.o = o;
	}
	public void run() {
		new Test(o).show();
	}
}
class Test3 extends Thread{
	Object o;

	public Test3(Object o) {
		super();
		this.o = o;
	}
	public void run () {
	synchronized(Test.class) {
		System.out.println(Thread.currentThread().getName()+",notifyAll--start");
		Test.class.notifyAll();
	}
}
}
