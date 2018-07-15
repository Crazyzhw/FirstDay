package cn.edu360.javase35.day07;

public class Dog {
	static String name ;
	double weight;
	String color ;
	static {
		System.out.println("我是静态代码块");
	}
	{
		System.out.println("我是构造代码块");
	}
	 public void  kanMeng () {
		 System.out.println("不是熟人就要赶走");
		 {
			 System.out.println("我是方法代码块");
		 }
	 }
	 public static void main(String[] args) {
		 ChineseIdyllicDogs c1 =new ChineseIdyllicDogs();
		 c1.kanMeng();
		 c1.maiMeng();
		 System.out.println(ChineseIdyllicDogs.name);
		 System.out.println(Dog.name);
	}
}

class ChineseIdyllicDogs  extends Dog{
	double price ;
	public void maiMeng () {
		System.out.println("嘤嘤嘤，拿小拳拳捶你胸口");
	}
	
}
