package cn.edu360.javase35.day09.test;

public class Test2 {
	public static void main(String[] args) {
		OneToN a  = new Sum();
		System.out.println(a.dispose(10));
		System.out.println(new Pro().dispose(10));
	}
}

interface OneToN{
	int dispose ( int a );
}
class Sum implements OneToN{
	public int dispose(int n) {
		int sum=0;
		for (int i =1;i<=n;i++) {
			sum+=i;
		}
		return sum;	
	}
}
class Pro  implements OneToN{
	public int dispose(int n) {
		int pro=1;
		for (int i = 1;i<=n;i++) {
			pro*=i;
		}
		return pro;
	}
	
}
