package cn.edu360.javase35.day10.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		Div d = new Div();
		
		int num;
		try {
			num = d.method(4, 3);
			System.out.println(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}
}

class Div{
	public int method (int a ,int b) throws Exception {
		if(b<0) {
		throw new Exception("除零了");	
		}
		return a/b;
	}
	
	
}
