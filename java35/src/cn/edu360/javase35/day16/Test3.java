package cn.edu360.javase35.day16;

public class Test3 {
	public static void main(String[] args) {
		Demo3 d1=new Demo3(true);
		Demo3 d2=new Demo3(false);
		d1.start();
		d2.start();
	}
}


class Demo3 extends Thread{
	boolean b;

	public Demo3(boolean b) {
		super();
		this.b = b;
	}
	public void run() {
		if(b) {
		for(char i='a';i<='z';i++) {
		System.out.println(Thread.currentThread().getName()+"----"+i);}
		}else {
			for(char i='A';i<='Z';i++) {
				System.out.println(Thread.currentThread().getName()+"----"+i);}	
		}
	}
	
	
	
}