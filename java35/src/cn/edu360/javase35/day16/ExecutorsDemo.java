package cn.edu360.javase35.day16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//线程池的创建及常用的三种方式
public class ExecutorsDemo {
	public static void main(String[] args) {
		ExecutorService  e = Executors.newCachedThreadPool();
		e.execute(new Test4());
		System.out.println("nihao");
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.execute(new Test4());
		ExecutorService pool2 = Executors.newSingleThreadExecutor();
		pool2.execute(new Test4());
	}
}

class Test4 implements Runnable{

	@Override
	public void run() {
		System.out.println("hahah");
	}
	
	
	
}
