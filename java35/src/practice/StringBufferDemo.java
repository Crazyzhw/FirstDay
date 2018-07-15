package practice;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("java");
		change(s1,s2);
		System.out.println(s1+"-----"+s2);
		StringBuffer s3 = new StringBuffer("hello");
		StringBuffer s4 = new StringBuffer("java");
		change(s3,s4);
		System.out.println(s3+"------"+s4);
	}
//对对象数值的修改起作用，对对象的赋值不起作用
	private static void change(StringBuffer s3, StringBuffer s4) {
		 s3.append("java");
		 s4=s3.append('a');
		
	}
//String和基本数据类型一样，形参的改变不影响实参的值
	public  static void change(String s1, String s2) {
			s2.replace("a", "o");
			s1=s2;
	}
}
