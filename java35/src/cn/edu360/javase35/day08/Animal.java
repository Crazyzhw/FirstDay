package cn.edu360.javase35.day08;

public class Animal {
		int num =10;
		static int  age = 40;
		public void eat () {
			System.out.println("动物在吃饭");
		}
		public void sleep() {
			System.out.println("动物在睡觉");
		}
		private  void  run () {
			System.out.println("动物在奔跑");
		}
}

class Cat extends Animal {
	int num = 30;
	static int age =20;
	String name = "tom";
	public void eat () {
		System.out.println("猫在吃饭");
	}
	public void sleep () {
		System.out.println("猫在睡觉");
	}
     private void run  () {
		System.out.println("猫在奔跑");
	}
	public void tomCatch () {
		System.out.println("猫在抓老鼠");
	}
	
}
