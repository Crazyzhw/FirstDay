package practice;
/**
 *懒汉式单例设计模式
 *  1.加count防止通过反射获取代码
 *	2.解决多线程的安全问题
 */
public class SingleTon {
	private SingleTon() {
		if (count>1) {
			throw new RuntimeException();
		}
		count++;
	}
	private static int count=0;
	private static SingleTon s = null;
	public static SingleTon getInstance() {
		if(s==null) {
		synchronized(SingleTon.class) {
			if(s==null) {
				s= new SingleTon();
			}
		}
	}
		return s;
	}
}
