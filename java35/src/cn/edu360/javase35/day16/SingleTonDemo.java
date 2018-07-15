package cn.edu360.javase35.day16;

public class SingleTonDemo {
	
}

//懒汉式的并发问题及效率问题解决
class SingleTon{
	private static SingleTon s=null;
	private SingleTon() {}
	public static SingleTon  getInstance() {
	if(s==null) {
		synchronized (SingleTon.class){
		if(s==null) {
			s=new SingleTon();
		}
		}
	}
	return s;
}
}

