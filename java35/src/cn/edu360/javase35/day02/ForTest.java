package cn.edu360.javase35.day02;

public class ForTest {

	public static void main(String[] args) {
			for (int i=1;i<=9;i=i+2) {
				System.out.print(i+"\t");
			}
			System.out.println();
			
			for (int i =1;i<=10;i++) {
				if (i==6)
					System.out.println();
				System.out.print(i+"\t");
			}
			System.out.println();
			for (int i=10;i>=1;i--) {
				if(i==5)
					System.out.println();
				System.out.print(i+"\t");
			}
	}

}
