package cn.edu360.javase35.day11;

public class TicketDemo2 {
	public static void main(String[] args) {
		SaleTickets1 s1 = new SaleTickets1();
		SaleTickets1 s2 = new SaleTickets1();
		SaleTickets1 s3 = new SaleTickets1();
		SaleTickets1 s4 = new SaleTickets1();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
}


class SaleTickets1 extends  Thread {
	private  static int tickets= 100;
	Object o =new Object();
	public void run () {
		synchronized (o) {
			while(tickets>0)
		
		System.out.println(getName()+"......"+tickets--);
//		tickets -- ;
	}
		}
 	
}