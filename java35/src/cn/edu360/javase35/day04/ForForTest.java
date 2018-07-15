package cn.edu360.javase35.day04;

public class ForForTest {
	public static void main(String[] args) {
		for (int i=1;i<10;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	     int x=	MethodDemo.getMin(10, 9);
	     System.out.println(x);
	     cn.edu360.javase35.day02.MethodDemo.draw(6, 7);
	}
}

