package cn.edu360.javase35.day16;

public class ThreadDemo {
	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		t1.start();
		t2.start();
		int n=40;
		/*while(n>0) {
			System.out.println(Thread.currentThread().getName()+"-------"+n--);
		}*/
	}
}


class  Ticket extends  Thread {
	private int num =40;
	public void run() {
	
		while(num>0)
		System.out.println(Thread.currentThread().getName()+"-------"+num--);
	}
	
	
	
}