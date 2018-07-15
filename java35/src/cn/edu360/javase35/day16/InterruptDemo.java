package cn.edu360.javase35.day16;

public class InterruptDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
		d.interrupt();
		
}
}

class Demo extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("休眠被中断");
		}
		for (int i = 0; i <10; i++) {
			System.out.println(i);
		}
		
		
	}
}