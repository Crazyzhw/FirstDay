package cn.edu360.javase35.day01;

public class ForForTest {
	public static void main(String[] args) {
		for(int x =1;x<=9;x++) {
			for (int y = 1;y<=9;y++){
				System.out.print(y+"*"+x+"="+x*y);
				System.out.print("	");
			}
			System.out.println();
		}
	}
}
