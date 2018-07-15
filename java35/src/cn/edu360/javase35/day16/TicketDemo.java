package cn.edu360.javase35.day16;

public class TicketDemo {
	public static void main(String[] args) {
		Tickets t = new Tickets();
		Thread t1 =new Thread(t);
		Thread t2 =new Thread(t);
		Thread t3 =new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}

class Tickets  implements Runnable{
	static int tickets =100;
	@Override
	public void run() {
		while(true) {
			synchronized (this){
			if(tickets>0) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+"----"+tickets--);
		}else {
			break;
		}
	}
	}
}
}