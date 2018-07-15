package cn.edu360.javase35.day08.jiekou;

public class InterfaceDemo {
	public static void main(String[] args) {
		A1 a = new Print();
		a.printa();
		B1 b = new Print();
		b.printA();
		char i = 'a';
		System.out.println(i);
	}
}

interface A1{
	void  printa();
}
interface B1{
	void printA();
}
class Print implements A1 ,B1{
	public void printA() {
		for(char i ='A';i<='Z';i++) {
			if(i!='Z')
				System.out.print(i+",");
			else {
				System.out.println(i);
			}
		}
	}

	public void printa() {
		for(char i ='a';i<='z';i++) {
			if(i!='z')
				System.out.print(i+",");
			else
				System.out.println(i);
		}
	}
	
}