package cn.edu360.javase35.day11;

public class ThreadDemo {
	public static void main(String[] args) {
	Demo d1 = new Demo("张三");
	Demo d2 = new Demo("王武");
	d1.start();;
	d2.start();
	System.out.println(System.currentTimeMillis());
	System.out.println(System.nanoTime());
	for (int x = 1;x<11;x++) {
		System.out.println(Thread.currentThread().getName()+"......"+x);
	}
	System.out.println(System.nanoTime());
	System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
	}

}


class Demo extends Thread{
	private String name ;
	Demo(String name ){
		this.name = name ;
	}
	@Override
	public void run (){
		show();
	}
	public void show (){
		for (int i =1;i<=10;i++) {
		System.out.println(getName()+name+"......"+i);
		}
	}
	
	
}