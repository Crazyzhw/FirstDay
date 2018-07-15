package cn.edu360.javase35.day07;

public class CodeBlock {
	static {
		System.out.println("我是静态代码块");
	}
	static int  num;
	{
		num +=1;
		System.out.println("我是构造代码块");
	}
	public void show () {
		{
			System.out.println("我是方法代码块");
		}
		
	}
	public CodeBlock() {
	}
	
	

	public CodeBlock(int num) {
		
	}
	public static void main(String[] args) {
		CodeBlock c1 = new CodeBlock();
		CodeBlock c3 = new CodeBlock();
		CodeBlock c2 = new CodeBlock(4);
		System.out.println(num);
	}
	
	
}
