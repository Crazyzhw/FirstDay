package cn.edu360.javase35.day16;

public class TicketTest {
	public static void main(String[] args) {
		Tickets2  t1 = new Tickets2();
		Tickets2  t2 = new Tickets2();
		Tickets2  t3 = new Tickets2();
		t1.start();
		t2.start();
		t3.start();
	}
}


class Tickets2 extends Thread{
	static int tickets = 100;
	static Object o = new Object();
	public void run () {
		while(true) {
		synchronized(o) {
				if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"------"+tickets--);
			}else {
				break;
			}
		}
	}
}
}
