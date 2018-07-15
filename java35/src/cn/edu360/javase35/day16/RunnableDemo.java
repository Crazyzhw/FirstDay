package cn.edu360.javase35.day16;

public class RunnableDemo {
	public static void main(String[] args) {
		Demo2 d =new Demo2(false);
		Demo2 d1 =new Demo2(true);
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d1);
		t1.start();
		t2.start();
	}
}


class  Demo2 implements Runnable{
		boolean b;
		public Demo2(boolean b) {
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