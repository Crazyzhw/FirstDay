package cn.edu360.javase35.day16;

public class InterruptDemo2 {
	public static void main(String[] args) {
		IDemo i = new IDemo(Thread.currentThread());//将主线程作为参数传入方法
		i.start();
		int s=0;
		for(int n= 0;n<10000;n++) {
			s+=n;
		}
		System.out.println(s);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			System.out.println("休眠被打断");
		}
		System.out.println("haha");

	}
}
class IDemo extends Thread{
	Thread current;
	
	public IDemo(Thread current) {
		super();
		this.current = current;
	}

	public void run() {
		current.interrupt();
	}
}