package cn.edu360.javase35.day11;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {
	public static void main(String[] args) {
		Running r = new Running();
		ExecutorService pool1 = Executors.newCachedThreadPool();
		pool1.execute(r);
		ExecutorService pool2 = Executors.newFixedThreadPool(5);
		pool2.execute(r);
		ExecutorService pool3 = Executors.newSingleThreadExecutor();
		pool3.execute(r);
	}
}
class Running implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-----"+i);
		}
		
	}
	
}