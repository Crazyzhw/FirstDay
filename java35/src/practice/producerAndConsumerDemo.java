package practice;

public class producerAndConsumerDemo {
	public static void main(String[] args) {
			Res r = new Res("面包");
			Producer pro = new Producer(r);
			Producer pro1= new Producer(r);
			Consumer con = new Consumer(r);
			Consumer con1 = new Consumer(r);
			Thread t1 = new Thread(pro);
			Thread t2 = new Thread(pro1);
			Thread t3 = new Thread(con1);
			Thread t4 = new Thread(con);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
	}
}

class Res {
	String name; 
	int count =0;
	boolean flag=false;
	public Res(String name) {
		super();
		this.name = name;
//		this.count=count;
	}
	public synchronized void set() {
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			count++;
		System.out.println(Thread.currentThread().getName()+" ，生产者"+"------"+name+count);
		flag =true;
		this.notifyAll();
		
	}
	public synchronized void get () {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" ，消费者"+"-----"+name+(count));
		flag=false;
		this.notifyAll();
	
	}
}
class Producer implements Runnable{
	Res r;
	
	public Producer(Res r) {
		super();
		this.r = r;
	}
	public void run() {
		while(true) {
			r.set();
		}
	}
	
}
class Consumer implements Runnable{
	Res r;
	public Consumer(Res r) {
		super();
		this.r = r;
	}

	public void run() {
		while(true) {
			r.get();
		}
	}
	
}