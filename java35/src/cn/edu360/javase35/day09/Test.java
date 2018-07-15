package cn.edu360.javase35.day09;

abstract class Demo{
	public abstract void show(); 
	}
interface Inner{
		Demo test();
	} 
class InnerClass{ 
//补齐代码 
	public  static Inner  show() {
		return  new Inner() {
			public Demo test() {
				return new Demo() {

					public void show() {
						System.out.println("HelloWorld");
					}
				};
			}
		};
}
}
 public  class Test {
	   public static void main(String[] args) {
			InnerClass.show().test().show();
	    
		}
	}
	    
