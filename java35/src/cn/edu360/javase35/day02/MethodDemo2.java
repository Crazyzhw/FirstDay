package cn.edu360.javase35.day02;

public class MethodDemo2 {
	static {
		int x =5;
	}
	static int x,y;
	public static void main (String [] args)
	{
		x=x-- + ++x ;
		myMethod(6);
		newMythod();
		System.out.println(x+y+ ++x);
		int  a=  5;
		a=a&7&7;
		System.out.println (a);
	}
	public static void myMethod(int s){
		System.out.println("s的值是"+s);
		y=x++ + ++x;//y =2,x= 2
	}
	public  static void newMythod(){
		x += ++x;// x=5
	}
		
}

