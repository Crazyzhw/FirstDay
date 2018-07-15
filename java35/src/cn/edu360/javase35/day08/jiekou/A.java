package cn.edu360.javase35.day08.jiekou;

public interface A {
	int b =0 ;
	 void show();
	
}
interface B{
	static void write (String s) {
		System.out.println(s);
	};
}


class C implements A,B{

	@Override
	public void show() {
		System.out.println("我会表演");
	}
	
}