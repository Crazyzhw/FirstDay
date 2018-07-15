package cn.edu360.javase35.day11;

public class TicketDemo {
	public static void main(String[] args) {
		SaleTickets t  = new SaleTickets();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


class SaleTickets implements Runnable{
	private int tickets=100; 
	@Override
	public void run(){
		while(tickets >0) {
			System.out.println(Thread.currentThread().getName()+"....."+tickets--);
//			 tickets--;
		}
	}
	
	
	
}
