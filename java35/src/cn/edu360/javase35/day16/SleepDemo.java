package cn.edu360.javase35.day16;

public class SleepDemo {
	public static void main(String[] args) {
		Test t= new Test();
		t.start();
		try {
			t.sleep(2000);//sleep被哪个线程执行，哪个线程就被睡
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("haole");
	}
}

class Test extends Thread{
	int num =10;
	public void run () {
		
		while(num>0) {
			System.out.println(num--);
		}
	}
}