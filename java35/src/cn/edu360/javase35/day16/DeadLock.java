package cn.edu360.javase35.day16;

public class DeadLock {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Excesize(true)); 
		Thread t2 = new Thread(new Excesize(false)); 
		t1.start();
		t2.start();
	}
}
class Lock{
	static Lock LockA = new Lock();
	static Lock LockB = new Lock();
}
class  Excesize implements Runnable{
	boolean b;
	
	public Excesize(boolean b) {
		super();
		this.b = b;
	}
	@Override
	public void run() {
		if(b) {
			synchronized(Lock.LockA) {
				System.out.println(Thread.currentThread().getName()+"LockA");
				synchronized(Lock.LockB) {
					System.out.println(Thread.currentThread().getName()+"LockB");
				}
			}
		}else {
			synchronized (Lock.LockB){
				System.out.println(Thread.currentThread().getName()+"LockB");
				synchronized(Lock.LockA ){
					System.out.println(Thread.currentThread().getName()+"LockA");
				}
			}
		}
		
	}
	
}