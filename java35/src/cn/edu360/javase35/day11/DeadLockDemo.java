package cn.edu360.javase35.day11;

public class DeadLockDemo {
	public static void main(String[] args) {
		Run r1 = new Run(true);
		Run r2 = new Run(false);
		new Thread(r1).start();
		new Thread(r2).start();
	}
}


class Run implements Runnable {
	private boolean  f ;
	Run (boolean f){
		this.f = f;
	}
	public void run() {
		if (f) {
		synchronized (Lock.LOCKA) {
			System.out.println("if....locka");
			synchronized(Lock.LOCKB) {
				System.out.println("if....lockb");
			}
			
		}
		}
		else {
		 	synchronized (Lock.LOCKB) {
		 		System.out.println("else....lockb");
			synchronized(Lock.LOCKA) {
				System.out.println("else....locka");
				
		}
			
	}
	}
  }
}
class Lock{
public static final	 Object LOCKA= new Object(); 
public static final	 Object LOCKB= new Object(); 
	
	
}
	
	
	
