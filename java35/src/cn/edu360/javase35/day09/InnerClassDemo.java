package cn.edu360.javase35.day09;

public class InnerClassDemo {
	public static void main(String[] args) {
		
		/*new Outer().show();
		new Outer.Inner().show();*/
		Outer.method();
	}
	
}

class Outer {
	static String name = "10";
	public void show () {
//	System.out.println( new Inner().super.name);
	}
	static class Inner  extends Hello{
		String name = "20";
		public void show (){
			String name = "30";
			super.show1();
			System.out.println(super.name);
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outer.name);
		}
	}
	public  static void method () {
		
		class Inner1 extends  Inner{
			int a = 10;
			public void show() {
				System.out.println("hello");
				super.show1();
			}
		}
		Hello a = new Inner1();
		System.out.println(a.name);
		a.show1();
		new Inner().show();
	}
}

class Hello{
	String name = "40";
	public void show1 () {
		System.out.println(name);
	}
	
}






